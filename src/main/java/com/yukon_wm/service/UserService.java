package com.yukon_wm.service;


import com.google.gson.JsonObject;
import com.yukon_wm.dto.OneStoreInfo;
import com.yukon_wm.dto.UserAllOrder;
import com.yukon_wm.entity.Store;
import com.yukon_wm.entity.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {

    User personalInfo(String id);

    List<Store> getAllStore();

    OneStoreInfo getOneStoreInfo(String id);

    Integer register(String jsonObject);

    ArrayList<UserAllOrder> queryAllUserOrder(String uid);
}
