package com.yukon_wm.service.impl;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.yukon_wm.dao.MyDto;
import com.yukon_wm.dao.StoreDao;
import com.yukon_wm.dao.UserDao;
import com.yukon_wm.dto.OneStoreInfo;
import com.yukon_wm.dto.UserAllOrder;
import com.yukon_wm.entity.Store;
import com.yukon_wm.entity.User;
import com.yukon_wm.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;
    private final StoreDao storeDao;
    private final MyDto myDto;

    public UserServiceImpl(UserDao userDao, StoreDao storeDao, MyDto myDto) {
        this.userDao = userDao;
        this.storeDao = storeDao;
        this.myDto = myDto;
    }

    @Override
    public User personalInfo(String id) {
        User user = userDao.queryById(id);
        return user;
    }

    @Override
    public List<Store> getAllStore() {
        try{
            return storeDao.queryAll();
        }catch (RuntimeException e){
            return null;
        }
    }

    @Override
    public OneStoreInfo getOneStoreInfo(String id) {
        try{
            OneStoreInfo oneStoreInfo = myDto.getOneStoreInfo(id);
            return oneStoreInfo;
        }catch (RuntimeException e){
            return null;
        }

    }

    @Override
    public Integer register(String jsonObject) {
        System.out.println(jsonObject);
        Gson gson = new Gson();
        User user = gson.fromJson(jsonObject, User.class);
        System.out.println(user);
        return userDao.insert(user);
    }

    @Override
    public ArrayList<UserAllOrder> queryAllUserOrder(String uid) {
        ArrayList<UserAllOrder> userAllOrders = myDto.queryUserOrder(uid);
        return userAllOrders;
    }
}
