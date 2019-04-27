package com.tangerineSpecter.healthManagement.service;

import com.tangerineSpecter.healthManagement.domain.UserIndex;

import java.util.List;

public interface UserIndexService {

    /**
     * 通过userID、类型查询用户生理指标数据
     *
     * @param userIndex
     * @return
     */
    List<UserIndex> getUserIndexById(UserIndex userIndex);

    /**
     * 创建用户生理指标数据
     *
     * @param userIndex
     * @return
     */
    int insertUserIndex(UserIndex userIndex);

    /**
     * 更新用户生理指标数据
     *
     * @param userIndex
     * @return
     */
    int updateUserIndex(UserIndex userIndex);

    /**
     * 删除用户生理指标数据
     *
     * @param userIndexId
     * @return
     */
    int deleteUserIndex(Long userIndexId);
}
