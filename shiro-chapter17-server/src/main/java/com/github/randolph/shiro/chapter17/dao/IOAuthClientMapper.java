package com.github.randolph.shiro.chapter17.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.randolph.shiro.chapter17.entity.OAuthClientDO;
import com.github.randolph.shiro.chapter17.query.OAuthClientDOQuery;

public interface IOAuthClientMapper {
    long countByExample(OAuthClientDOQuery example);

    int deleteByExample(OAuthClientDOQuery example);

    int deleteByPrimaryKey(String keyid);

    int insert(OAuthClientDO record);

    int insertSelective(OAuthClientDO record);

    List<OAuthClientDO> selectByExample(OAuthClientDOQuery example);

    OAuthClientDO selectByPrimaryKey(String keyid);

    int updateByExampleSelective(@Param("record") OAuthClientDO record, @Param("example") OAuthClientDOQuery example);

    int updateByExample(@Param("record") OAuthClientDO record, @Param("example") OAuthClientDOQuery example);

    int updateByPrimaryKeySelective(OAuthClientDO record);

    int updateByPrimaryKey(OAuthClientDO record);
}