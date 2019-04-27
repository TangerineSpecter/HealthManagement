package com.tangerineSpecter.healthManagement.mapper;

import com.tangerineSpecter.healthManagement.domain.UserIndex;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserIndexMapper {

    /**
     * 通过用户id和指标类型获取用户的所有指标
     * @param userIndex
     * @return
     */
    List<UserIndex> getById(UserIndex userIndex);

    /**
     * 创建用户生理指标数据
     * @param userIndex
     * @return
     */
    int insert(UserIndex userIndex);

    /**
     * 更新用户生理指标数据
     * @param userIndex
     * @return
     */
    int update(UserIndex userIndex);

    /**
     * 删除用户生理指标数据
     * @param userIndexId
     * @return
     */
    int delete(Long userIndexId);

}
