package com.yukon_wm.controller;

import com.yukon_wm.entity.Store;
import com.yukon_wm.exception.Result;
import com.yukon_wm.exception.ResultCode;
import com.yukon_wm.service.StoreService;
import org.apache.ibatis.executor.ResultExtractor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/store")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @RequestMapping(value = "/personalInfo",method = RequestMethod.GET)
    public Result personalInfo(String id){
        if (id != null)
        {
            Store store = storeService.personalInfo(id);
            if(store != null)
                return Result.ok().data(store);
            else
                return Result.no();
        }
        return Result.state(ResultCode.NULLPOINTER);
    }
}
