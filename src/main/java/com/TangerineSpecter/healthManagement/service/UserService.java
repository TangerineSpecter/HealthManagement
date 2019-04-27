package com.tangerineSpecter.healthManagement.service;

import com.tangerineSpecter.healthManagement.domain.PaginationObject;
import com.tangerineSpecter.healthManagement.domain.User;

public interface UserService {

    /**
     * 创建用户
     *
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 通过id查询用户
     *
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 分页查询用户
     *
     * @param pageNum 第几页，pageSize 每页几个
     * @return
     */
    PaginationObject getAllUser(int pageNum, int pageSize);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    int deleteUser(Long id);
}
