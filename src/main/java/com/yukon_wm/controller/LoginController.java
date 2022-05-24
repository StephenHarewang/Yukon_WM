package com.yukon_wm.controller;

import com.yukon_wm.exception.Result;
import com.yukon_wm.exception.ResultCode;
import com.yukon_wm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public Result login(String username,String position,String password)
    {
        if(username != null && position != null && password != null)
        {
            String login = loginService.login(position, username, password);
            if("用户不存在".equals(login)) return Result.state(ResultCode.NULLUSERNAME);
            if("密码不正确".equals(login)) return Result.state(ResultCode.ERROR_PWD);
            if("身份不匹配".equals(login)) return Result.state(ResultCode.PARAM_ERROR);
            return Result.ok().data(login);
        }
        else
            return Result.state(ResultCode.NULLPOINTER);
    }
}
