package com.tangerineSpecter.healthManagement.service.impl;

import com.tangerineSpecter.healthManagement.domain.UserIndex;
import com.tangerineSpecter.healthManagement.mapper.UserIndexMapper;
import com.tangerineSpecter.healthManagement.service.UserIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserIndexServiceImpl implements UserIndexService {

    // 自动注入mapper
    @Autowired
    private UserIndexMapper userIndexMapper;

    @Override
    public List<UserIndex> getUserIndexById(UserIndex userIndex) {
        List<UserIndex> userIndexs = userIndexMapper.getById(userIndex);
        return userIndexs;
    }

    @Override
    public int insertUserIndex(UserIndex userIndex) {
        // 设置创建时间
        userIndex.setCollectDate(new java.sql.Date(new Date().getTime()));
        int modifyId = userIndexMapper.insert(userIndex);
        return modifyId;
    }

    @Override
    public int updateUserIndex(UserIndex userIndex) {
        int modifyId = userIndexMapper.update(userIndex);
        return modifyId;
    }

    @Override
    public int deleteUserIndex(Long userIndexId) {
        int modifyId = userIndexMapper.delete(userIndexId);
        return modifyId;
    }
}
