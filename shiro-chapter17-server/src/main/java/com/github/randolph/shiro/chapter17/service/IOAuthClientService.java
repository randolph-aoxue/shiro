package com.github.randolph.shiro.chapter17.service;

import java.util.List;

import com.github.randolph.shiro.chapter17.entity.OAuthClientDO;

public interface IOAuthClientService {

    /**
     * 创建客户端
     * 
     * @param client
     * @return
     * @author randolph
     *
     */
    OAuthClientDO createClient(OAuthClientDO client);

    /**
     * 更新客户端
     * 
     * @param client
     * @return
     * @author randolph
     *
     */
    OAuthClientDO updateClient(OAuthClientDO client);

    /**
     * 删除客户端
     * 
     * @param clientId
     * @author randolph
     *
     */
    void deleteClient(String clientId);

    /**
     * 
     * 根据id查找客户端
     * 
     * @param clientId
     * @return
     * @author randolph
     *
     */
    OAuthClientDO findOne(String clientId);

    /**
     * 查找所有
     * 
     * @return
     * @author randolph
     *
     */
    List<OAuthClientDO> findAll();

    /**
     * 根据客户端id查找客户端
     * 
     * @param clientKeyId
     * @return
     * @author randolph
     *
     */
    OAuthClientDO findByClientId(String clientKeyId);

    /**
     * 根据客户端安全KEY查找客户端
     * 
     * @param clientSecret
     * @return
     * @author randolph
     *
     */
    OAuthClientDO findByClientSecret(String clientSecret);

}
