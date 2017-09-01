package com.github.randolph.shiro.chapter17.service;

public interface IOAuthService {

    /**
     * 
     * 添加 auth code
     * 
     * @param authCode
     * @param username
     * @author randolph
     * @date 2017年8月31日
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
     * @date 2017年8月31日
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
     * @date 2017年8月31日
     *
     */
    boolean checkAuthCode(String authCode);

    // 验证access token是否有效
    /**
     * 
     * 验证access token是否有效
     * 
     * @param accessToken
     * @return
     * @author randolph
     * @date 2017年8月31日
     *
     */
    boolean checkAccessToken(String accessToken);

    String getUsernameByAuthCode(String authCode);

    String getUsernameByAccessToken(String accessToken);

    /**
     * 
     * auth code / access token 过期时间
     * 
     * @return
     * @author randolph
     * @date 2017年8月31日 下午9:13:44
     *
     */
    long getExpireIn();

    boolean checkClientId(String clientId);

    boolean checkClientSecret(String clientSecret);

}
