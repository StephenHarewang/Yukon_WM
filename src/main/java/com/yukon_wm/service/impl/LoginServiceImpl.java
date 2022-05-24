package com.yukon_wm.service.impl;

import com.yukon_wm.dao.DelivererDao;
import com.yukon_wm.dao.StoreDao;
import com.yukon_wm.dao.UserDao;
import com.yukon_wm.entity.Deliverer;
import com.yukon_wm.entity.Store;
import com.yukon_wm.entity.User;
import com.yukon_wm.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private final UserDao userDao;

    private final StoreDao storeDao;

    private final DelivererDao delivererDao;

    public LoginServiceImpl(UserDao userDao, StoreDao storeDao, DelivererDao delivererDao) {
        this.userDao = userDao;
        this.storeDao = storeDao;
        this.delivererDao = delivererDao;
    }


    @Override
    public String login(String position, String username, String password) {
        if("用户".equals(position))
        {
            User user = userDao.queryByUsername(username);
            if(user == null)
                return "用户不存在";
            else
                if(password.equals(user.getPassword()))
                    return user.getId();
                else
                    return "密码不正确";
        }
        else if("商家".equals(position))
        {
            Store store = storeDao.queryByUsername(username);
            if(store == null)
                return "用户不存在";
            else
                if(password.equals(store.getPassword()))
                    return store.getId();
                else
                    return "密码不正确";
        }
        else if("骑手".equals(position))
        {
            Deliverer deliverer = delivererDao.queryByUsername(username);
            if (deliverer == null)
                return "用户不存在";
            else
                if(password.equals(deliverer.getPassword()))
                    return deliverer.getId();
                else
                    return "密码不正确";
        }
        else
            return "身份不匹配";
    }
}
