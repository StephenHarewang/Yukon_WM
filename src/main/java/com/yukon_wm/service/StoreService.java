package com.yukon_wm.service;

import com.yukon_wm.entity.Store;
import org.springframework.stereotype.Service;

@Service
public interface StoreService {

    Store personalInfo(String id);

}
