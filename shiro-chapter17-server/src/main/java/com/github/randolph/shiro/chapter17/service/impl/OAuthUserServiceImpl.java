package com.github.randolph.shiro.chapter17.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.randolph.shiro.chapter17.entity.OAuthUserDO;
import com.github.randolph.shiro.chapter17.service.IOAuthUserService;

@Service("clientServiceImpl")
public class OAuthUserServiceImpl implements IOAuthUserService {

    @Override
    public OAuthUserDO createUser(OAuthUserDO user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public OAuthUserDO updateUser(OAuthUserDO user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteUser(Long userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void changePassword(Long userId, String newPassword) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public OAuthUserDO findOne(Long userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<OAuthUserDO> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public OAuthUserDO findByUsername(String username) {
        // TODO Auto-generated method stub
        return null;
    }
}
