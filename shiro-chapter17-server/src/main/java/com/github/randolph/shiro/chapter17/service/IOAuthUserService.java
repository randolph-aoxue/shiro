package com.github.randolph.shiro.chapter17.service;

import java.util.List;

import com.github.randolph.shiro.chapter17.entity.OAuthUserDO;

public interface IOAuthUserService {
    /**
     * 创建用户
     * 
     * @param user
     */
    OAuthUserDO createUser(OAuthUserDO user);

    OAuthUserDO updateUser(OAuthUserDO user);

    void deleteUser(String userId);

    /**
     * 修改密码
     * 
     * @param userId
     * @param newPassword
     */
    void changePassword(String userId, String newPassword);

    OAuthUserDO findOne(String userId);

    List<OAuthUserDO> findAll();

    /**
     * 根据用户名查找用户
     * 
     * @param username
     * @return
     */
    OAuthUserDO findByUsername(String username);

}
