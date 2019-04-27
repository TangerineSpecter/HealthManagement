package com.tangerineSpecter.healthManagement.mapper;

import com.tangerineSpecter.healthManagement.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 根据ID获取用户信息
     * @param id
     * @return
     */
    User getById(Long id);

    /**
     * 获取所有用户
     * @return
     */
    List<User> getAll();

    /**
     * 创建用户
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 根据ID更新用户
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int delete(Long id);
}
