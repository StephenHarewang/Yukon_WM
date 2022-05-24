package com.yukon_wm.controller;

import com.google.gson.JsonObject;
import com.yukon_wm.dto.OneStoreInfo;
import com.yukon_wm.dto.UserAllOrder;
import com.yukon_wm.entity.Store;
import com.yukon_wm.entity.User;
import com.yukon_wm.exception.Result;
import com.yukon_wm.exception.ResultCode;
import com.yukon_wm.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/personalInfo",method = RequestMethod.GET)
    public Result personalInfo(String id){
        if(id != null)
        {
            User user = userService.personalInfo(id);
            if(user != null)
                return Result.ok().data(user);
            else
                return Result.no();
        }
        return Result.state(ResultCode.NULLPOINTER);
    }

    @RequestMapping(value = "getAllStore",method = RequestMethod.GET)
    public Result getAllStore(){
        List<Store> allStore = userService.getAllStore();
        if(allStore != null) return Result.ok().data(allStore);
        else return Result.no();
    }

    @RequestMapping(value = "/storeInfo",method = RequestMethod.GET)
    public Result storeInfo(String id){
        if(id != null)
        {
            OneStoreInfo oneStoreInfo = userService.getOneStoreInfo(id);
            //System.out.println(oneStoreInfo);
            if(oneStoreInfo != null)
                return Result.ok().data(oneStoreInfo);
            else
                return Result.no();
        }
        return Result.state(ResultCode.NULLPOINTER);
    }

    @RequestMapping(value = "/getAllOrder",method = RequestMethod.GET)
    public Result getAllOrder(String uid){
        if(uid != null)
        {
            ArrayList<UserAllOrder> userAllOrders = userService.queryAllUserOrder(uid);
            return Result.ok().data(userAllOrders);
        }
        return Result.state(ResultCode.NULLPOINTER);
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Result register(@RequestBody String jsonObject){
        if (jsonObject != null) {
            return Result.ok().data(userService.register(jsonObject));
        }
        return Result.state(ResultCode.NULLPOINTER);
    }


}
