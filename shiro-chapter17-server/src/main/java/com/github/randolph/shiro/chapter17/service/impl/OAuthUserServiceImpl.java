package com.github.randolph.shiro.chapter17.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.randolph.shiro.chapter17.dao.IOAuthUserMapper;
import com.github.randolph.shiro.chapter17.entity.OAuthUserDO;
import com.github.randolph.shiro.chapter17.query.OAuthUserQuery;
import com.github.randolph.shiro.chapter17.service.IOAuthUserService;

@Service("oAuthUserServiceImpl")
public class OAuthUserServiceImpl implements IOAuthUserService {

    @Autowired
    private IOAuthUserMapper oAuthUserMapper;
    
    @Autowired
    private PasswordHelper passwordHelper;
    
    @Override
    public OAuthUserDO createUser(OAuthUserDO user) {
        user.setKeyid(UUID.randomUUID().toString());
        Date date = new Date();
        user.setCreatetime(date);
        user.setUpdatetime(date);
        user.setIsdelete(false);
        passwordHelper.encryptPassword(user);
        oAuthUserMapper.insert(user);
        return user;
    }

    @Override
    public OAuthUserDO updateUser(OAuthUserDO user) {
        oAuthUserMapper.updateByPrimaryKeySelective(user);
        return user;
    }

    @Override
    public void deleteUser(String userId) {
        oAuthUserMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public void changePassword(String userId, String newPassword) {
        OAuthUserDO user = oAuthUserMapper.selectByPrimaryKey(userId);
        user.setPassword(newPassword);
        passwordHelper.encryptPassword(user);
        oAuthUserMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public OAuthUserDO findOne(String userId) {
        return oAuthUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<OAuthUserDO> findAll() {
        return oAuthUserMapper.selectByExample(null);
    }

    @Override
    public OAuthUserDO findByUsername(String username) {
        OAuthUserQuery query = new OAuthUserQuery();
        query.createCriteria().andUsernameEqualTo(username);
        List<OAuthUserDO> userList = oAuthUserMapper.selectByExample(query);
        if (CollectionUtils.isNotEmpty(userList)) {
            return userList.get(0);
        }
        return null;
    }
}
