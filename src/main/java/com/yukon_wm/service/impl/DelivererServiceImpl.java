package com.yukon_wm.service.impl;

import com.yukon_wm.dao.DelivererDao;
import com.yukon_wm.entity.Deliverer;
import com.yukon_wm.service.DelivererService;
import org.springframework.stereotype.Service;

@Service
public class DelivererServiceImpl implements DelivererService {

    private final DelivererDao delivererDao;

    public DelivererServiceImpl(DelivererDao delivererDao) {
        this.delivererDao = delivererDao;
    }

    @Override
    public Deliverer personalInfo(String id) {
        return delivererDao.queryById(id);
    }
}
