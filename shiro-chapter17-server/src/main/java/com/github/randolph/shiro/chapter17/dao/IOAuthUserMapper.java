package com.github.randolph.shiro.chapter17.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.randolph.shiro.chapter17.entity.OAuthUserDO;
import com.github.randolph.shiro.chapter17.query.OAuthUserDOQuery;

public interface IOAuthUserMapper {
    long countByExample(OAuthUserDOQuery example);

    int deleteByExample(OAuthUserDOQuery example);

    int deleteByPrimaryKey(String keyid);

    int insert(OAuthUserDO record);

    int insertSelective(OAuthUserDO record);

    List<OAuthUserDO> selectByExample(OAuthUserDOQuery example);

    OAuthUserDO selectByPrimaryKey(String keyid);

    int updateByExampleSelective(@Param("record") OAuthUserDO record, @Param("example") OAuthUserDOQuery example);

    int updateByExample(@Param("record") OAuthUserDO record, @Param("example") OAuthUserDOQuery example);

    int updateByPrimaryKeySelective(OAuthUserDO record);

    int updateByPrimaryKey(OAuthUserDO record);
}