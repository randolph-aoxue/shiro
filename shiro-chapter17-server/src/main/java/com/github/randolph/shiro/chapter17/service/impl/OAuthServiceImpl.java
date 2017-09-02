package com.github.randolph.shiro.chapter17.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import com.github.randolph.shiro.chapter17.service.IOAuthClientService;
import com.github.randolph.shiro.chapter17.service.IOAuthService;

@Service("oAuthServiceImpl")
public class OAuthServiceImpl implements IOAuthService {

    private Cache cache;

    @Autowired
    private IOAuthClientService oAuthClientService;

    @Autowired
    public OAuthServiceImpl(CacheManager cacheManager) {
        this.cache = cacheManager.getCache("code-cache");
    }

    @Override
    public void addAuthCode(String authCode, String username) {
        cache.put(authCode, username);
    }

    @Override
    public void addAccessToken(String accessToken, String username) {
        cache.put(accessToken, username);
    }

    @Override
    public boolean checkAuthCode(String authCode) {
        return cache.get(authCode) != null;
    }

    @Override
    public boolean checkAccessToken(String accessToken) {
        return cache.get(accessToken) != null;
    }

    @Override
    public String getUsernameByAuthCode(String authCode) {
        return (String) cache.get(authCode).get();
    }

    @Override
    public String getUsernameByAccessToken(String accessToken) {
        return (String) cache.get(accessToken).get();
    }

    @Override
    public long getExpireIn() {
        return 3600L;
    }

    @Override
    public boolean checkClientId(String clientId) {
        return oAuthClientService.findByClientId(clientId) != null;
    }

    @Override
    public boolean checkClientSecret(String clientSecret) {
        return oAuthClientService.findByClientSecret(clientSecret) != null;
    }
}
