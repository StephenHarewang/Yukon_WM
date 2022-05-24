package com.yukon_wm.service;

import com.yukon_wm.entity.Deliverer;
import org.springframework.stereotype.Service;

@Service
public interface DelivererService {

    Deliverer personalInfo(String id);

}
