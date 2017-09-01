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

    /**
     * 
     * 更新用户
     * 
     * @param user
     * @return
     * @author randolph
     *
     */
    OAuthUserDO updateUser(OAuthUserDO user);

    /**
     * 
     * 删除用户
     * 
     * @param userId
     * @author randolph
     *
     */
    void deleteUser(String userId);

    /**
     * 修改密码
     * 
     * @param userId
     * @param newPassword
     */
    void changePassword(String userId, String newPassword);

    /**
     * 
     * 根据id 查找用户
     * 
     * @param userId
     * @return
     * @author randolph
     *
     */
    OAuthUserDO findOne(String userId);

    /**
     * 
     * 查询所有用户
     * 
     * @return
     * @author randolph
     *
     */
    List<OAuthUserDO> findAll();

    /**
     * 根据用户名查找用户
     * 
     * @param username
     * @return
     */
    OAuthUserDO findByUsername(String username);

}
