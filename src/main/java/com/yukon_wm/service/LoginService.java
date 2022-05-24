package com.yukon_wm.service;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {

    String login(String position,String username,String password);

}
