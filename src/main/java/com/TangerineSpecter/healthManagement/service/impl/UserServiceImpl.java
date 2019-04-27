package com.tangerineSpecter.healthManagement.service.impl;

import com.tangerineSpecter.healthManagement.domain.PaginationObject;
import com.tangerineSpecter.healthManagement.domain.User;
import com.tangerineSpecter.healthManagement.mapper.UserMapper;
import com.tangerineSpecter.healthManagement.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        user.setCreateTime(new java.sql.Date(new Date().getTime()));
        int modifyId = userMapper.insert(user);
        return modifyId;
    }

    @Override
    public User getUserById(Long id) {
        User user = userMapper.getById(id);
        return user;
    }

    @Override
    public PaginationObject getAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.getAll();
        PageInfo<User> appsPageInfo = new PageInfo<User>(users);
        long total = appsPageInfo.getTotal();
        PaginationObject paginationObject = new PaginationObject(users, pageNum, pageSize, total);
        return paginationObject;
    }

    @Override
    public int updateUser(User user) {
        int modifyId = userMapper.update(user);
        return modifyId;
    }

    @Override
    public int deleteUser(Long id) {
        int modifyId = userMapper.delete(id);
        return modifyId;
    }
}
