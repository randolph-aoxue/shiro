package com.github.randolph.shiro.chapter17.service;

public interface IOAuthService {

    /**
     * 
     * 添加 auth code
     * 
     * @param authCode
     * @param username
     * @author randolph
     *
     */
    void addAuthCode(String authCode, String username);

    /**
     * 
     * 添加 access token
     * 
     * @param accessToken
     * @param username
     * @author randolph
     *
     */
    void addAccessToken(String accessToken, String username);

    /**
     * 
     * 验证auth code是否有效
     * 
     * @param authCode
     * @return
     * @author randolph
     *
     */
    boolean checkAuthCode(String authCode);

    /**
     * 
     * 验证access token是否有效
     * 
     * @param accessToken
     * @return
     * @author randolph
     *
     */
    boolean checkAccessToken(String accessToken);

    /**
     * 根据auth code获取用户名
     * 
     * @param authCode
     * @return
     * @author randolph
     *
     */
    String getUsernameByAuthCode(String authCode);

    /**
     * 根据access token获取用户名
     * 
     * @param accessToken
     * @return
     * @author randolph
     *
     */
    String getUsernameByAccessToken(String accessToken);

    /**
     * 
     * auth code / access token 过期时间
     * 
     * @return
     * @author randolph
     *
     */
    long getExpireIn();

    /**
     * 检查客户端id是否存在
     * 
     * @param clientId
     * @return
     * @author randolph
     *
     */
    boolean checkClientId(String clientId);

    /**
     * 检查客户端安全KEY是否存在
     * 
     * @param clientSecret
     * @return
     * @author randolph
     *
     */
    boolean checkClientSecret(String clientSecret);

}
