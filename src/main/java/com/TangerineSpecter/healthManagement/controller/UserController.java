package com.tangerineSpecter.healthManagement.controller;

import com.tangerineSpecter.healthManagement.domain.PaginationObject;
import com.tangerineSpecter.healthManagement.domain.ResultObject;
import com.tangerineSpecter.healthManagement.domain.User;
import com.tangerineSpecter.healthManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 创建用户
     *
     * @param user
     * @return
     */
    @PostMapping("add")
    public ResultObject insertUser(@RequestBody User user) {
        int modifyId = userService.insertUser(user);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "", map);
        return resultObject;
    }

    /**
     * 查询用户
     *
     * @param id
     * @return
     */
    @GetMapping("get")
    public ResultObject getUserById(@RequestParam Long id) {
        User user = userService.getUserById(id);
        ResultObject resultObject = new ResultObject(0, "", user);
        return resultObject;
    }

    /**
     * 分页查询用户
     *
     * @param pageNum, pageSize
     * @return
     */
    @GetMapping("list")
    public ResultObject getAllUser(@RequestParam int pageNum, @RequestParam int pageSize) {
        PaginationObject paginationObj = userService.getAllUser(pageNum, pageSize);
        ResultObject resultObject = new ResultObject(0, "", paginationObj);
        return resultObject;
    }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    @DeleteMapping("delete")
    public ResultObject deleteUser(@RequestParam Long id) {
        int modifyId = userService.deleteUser(id);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "", map);
        return resultObject;
    }

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    @PutMapping("edit")
    public ResultObject updateUser(@RequestBody User user) {
        int modifyId = userService.updateUser(user);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "", map);
        return resultObject;
    }
}
