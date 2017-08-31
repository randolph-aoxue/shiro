package com.github.randolph.shiro.chapter17.service;

import java.util.List;

import com.github.randolph.shiro.chapter17.entity.OAuthClientDO;

public interface IOAuthClientService {

    OAuthClientDO createClient(OAuthClientDO client);

    OAuthClientDO updateClient(OAuthClientDO client);

    void deleteClient(String clientId);

    OAuthClientDO findOne(String clientId);

    List<OAuthClientDO> findAll();

    OAuthClientDO findByClientId(String clientId);

    OAuthClientDO findByClientSecret(String clientSecret);

}
