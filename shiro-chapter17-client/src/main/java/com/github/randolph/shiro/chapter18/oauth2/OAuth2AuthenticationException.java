package com.github.randolph.shiro.chapter18.oauth2;

import org.apache.shiro.authc.AuthenticationException;

public class OAuth2AuthenticationException extends AuthenticationException {

    private static final long serialVersionUID = 1L;

    public OAuth2AuthenticationException(Throwable cause) {
        super(cause);
    }
}
