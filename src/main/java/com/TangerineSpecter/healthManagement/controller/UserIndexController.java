package com.tangerineSpecter.healthManagement.controller;

import com.tangerineSpecter.healthManagement.domain.ResultObject;
import com.tangerineSpecter.healthManagement.domain.UserIndex;
import com.tangerineSpecter.healthManagement.service.UserIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/userIndex")
public class UserIndexController {

    // 自动注入service
    @Autowired
    private UserIndexService userIndexService;

    /**
     * 创建用户生理指标数据
     * @param userIndex
     * @return
     */
    @PostMapping("add")
    public ResultObject insertUserIndex(@RequestBody UserIndex userIndex) {
        int modifyId = userIndexService.insertUserIndex(userIndex);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "", map);
        return resultObject;
    }

    /**
     * 通过userID、类型查询用户生理指标数据
     * @param userIndex
     * @return
     */
    @GetMapping("get")
    public ResultObject getUserIndexById(@RequestBody UserIndex userIndex) {
        List<UserIndex> userIndexIndexs = userIndexService.getUserIndexById(userIndex);
        ResultObject resultObject = new ResultObject(200, "", userIndexIndexs);
        return resultObject;
    }

    /**
     * 删除用户生理指标数据
     * @param id
     * @return
     */
    @DeleteMapping("delete")
    public ResultObject deleteUserIndex(@RequestParam Long id) {
        int modifyId = userIndexService.deleteUserIndex(id);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "", map);
        return resultObject;
    }

    /**
     * 修改用户生理指标数据
     * @param userIndex
     * @return
     */
    @PutMapping("edit")
    public ResultObject updateUserIndex(@RequestBody UserIndex userIndex) {
        int modifyId = userIndexService.updateUserIndex(userIndex);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "", map);
        return resultObject;
    }
}
