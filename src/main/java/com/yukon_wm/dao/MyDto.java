package com.yukon_wm.dao;

import com.yukon_wm.dto.OneStoreInfo;
import com.yukon_wm.dto.UserAllOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface MyDto {

    OneStoreInfo getOneStoreInfo(String id);

    ArrayList<UserAllOrder> queryUserOrder(String uid);
}
