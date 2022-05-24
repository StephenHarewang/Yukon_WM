package com.yukon_wm.service.impl;

import com.yukon_wm.dao.StoreDao;
import com.yukon_wm.entity.Store;
import com.yukon_wm.service.StoreService;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

    private final StoreDao storeDao;

    public StoreServiceImpl(StoreDao storeDao) {
        this.storeDao = storeDao;
    }


    @Override
    public Store personalInfo(String id) {
        return storeDao.queryById(id);
    }
}
