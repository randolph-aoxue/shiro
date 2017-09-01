package com.github.randolph.shiro.chapter18.oauth2;

import org.apache.shiro.authc.AuthenticationToken;

public class OAuth2Token implements AuthenticationToken {

    private static final long serialVersionUID = 1L;

    // 安全码
    private String authCode;

    // 用户信息
    private String principal;

    public OAuth2Token(String authCode) {
        this.authCode = authCode;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    @Override
    public Object getCredentials() {
        return authCode;
    }
}
