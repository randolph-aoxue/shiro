package com.github.randolph.shiro.chapter17.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.randolph.shiro.chapter17.entity.OAuthClientDO;
import com.github.randolph.shiro.chapter17.query.OAuthClientQuery;

public interface IOAuthClientMapper {
    long countByExample(OAuthClientQuery example);

    int deleteByExample(OAuthClientQuery example);

    int deleteByPrimaryKey(String keyid);

    int insert(OAuthClientDO record);

    int insertSelective(OAuthClientDO record);

    List<OAuthClientDO> selectByExample(OAuthClientQuery example);

    OAuthClientDO selectByPrimaryKey(String keyid);

    int updateByExampleSelective(@Param("record") OAuthClientDO record, @Param("example") OAuthClientQuery example);

    int updateByExample(@Param("record") OAuthClientDO record, @Param("example") OAuthClientQuery example);

    int updateByPrimaryKeySelective(OAuthClientDO record);

    int updateByPrimaryKey(OAuthClientDO record);
}