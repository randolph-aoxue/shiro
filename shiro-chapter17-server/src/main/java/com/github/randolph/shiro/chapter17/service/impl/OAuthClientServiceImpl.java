package com.github.randolph.shiro.chapter17.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.randolph.shiro.chapter17.dao.IOAuthClientMapper;
import com.github.randolph.shiro.chapter17.entity.OAuthClientDO;
import com.github.randolph.shiro.chapter17.query.OAuthClientQuery;
import com.github.randolph.shiro.chapter17.service.IOAuthClientService;

@Service("oAuthClientServiceImpl")
public class OAuthClientServiceImpl implements IOAuthClientService {

    @Autowired
    private IOAuthClientMapper oAuthClientMapper;
    
    @Override
    public OAuthClientDO createClient(OAuthClientDO client) {
        client.setKeyid(UUID.randomUUID().toString());
        client.setClientkeyid(UUID.randomUUID().toString());
        client.setClientsecret(UUID.randomUUID().toString());
        Date date = new Date();
        client.setCreatetime(date);
        client.setUpdatetime(date);
        client.setIsdelete(false);
        oAuthClientMapper.insert(client);
        return client;
    }

    @Override
    public OAuthClientDO updateClient(OAuthClientDO client) {
        oAuthClientMapper.updateByPrimaryKeySelective(client);
        return client;
    }

    @Override
    public void deleteClient(String clientKeyId) {
        OAuthClientQuery query = new OAuthClientQuery();
        query.createCriteria().andClientkeyidEqualTo(clientKeyId);
        oAuthClientMapper.deleteByExample(query);
    }

    @Override
    public OAuthClientDO findOne(String keyId) {
        return oAuthClientMapper.selectByPrimaryKey(keyId);
    }

    @Override
    public List<OAuthClientDO> findAll() {
        return oAuthClientMapper.selectByExample(null);
    }

    @Override
    public OAuthClientDO findByClientId(String clientId) {
        OAuthClientQuery query = new OAuthClientQuery();
        query.createCriteria().andClientkeyidEqualTo(clientId);
        List<OAuthClientDO> OAuthClientList = oAuthClientMapper.selectByExample(query);
        return OAuthClientList.get(0);
    }

    @Override
    public OAuthClientDO findByClientSecret(String clientSecret) {
        OAuthClientQuery query = new OAuthClientQuery();
        query.createCriteria().andClientsecretEqualTo(clientSecret);
        List<OAuthClientDO> OAuthClientList = oAuthClientMapper.selectByExample(query);
        return OAuthClientList.get(0);
    }

}
