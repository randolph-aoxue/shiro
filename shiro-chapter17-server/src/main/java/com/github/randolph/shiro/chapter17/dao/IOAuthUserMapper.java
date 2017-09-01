package com.github.randolph.shiro.chapter17.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.randolph.shiro.chapter17.entity.OAuthUserDO;
import com.github.randolph.shiro.chapter17.query.OAuthUserQuery;

public interface IOAuthUserMapper {
    long countByExample(OAuthUserQuery example);

    int deleteByExample(OAuthUserQuery example);

    int deleteByPrimaryKey(String keyid);

    int insert(OAuthUserDO record);

    int insertSelective(OAuthUserDO record);

    List<OAuthUserDO> selectByExample(OAuthUserQuery example);

    OAuthUserDO selectByPrimaryKey(String keyid);

    int updateByExampleSelective(@Param("record") OAuthUserDO record, @Param("example") OAuthUserQuery example);

    int updateByExample(@Param("record") OAuthUserDO record, @Param("example") OAuthUserQuery example);

    int updateByPrimaryKeySelective(OAuthUserDO record);

    int updateByPrimaryKey(OAuthUserDO record);
}