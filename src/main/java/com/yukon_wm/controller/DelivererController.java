package com.yukon_wm.controller;

import com.yukon_wm.entity.Deliverer;
import com.yukon_wm.exception.Result;
import com.yukon_wm.exception.ResultCode;
import com.yukon_wm.service.DelivererService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/deliverer")
public class DelivererController {

    private final DelivererService delivererService;

    public DelivererController(DelivererService delivererService) {
        this.delivererService = delivererService;
    }

    @RequestMapping(value = "/personalInfo",method = RequestMethod.GET)
    public Result personalInfo(String id){
        if(id != null)
        {
            Deliverer deliverer = delivererService.personalInfo(id);
            if(deliverer != null)
                return Result.ok().data(deliverer);
            else
                return Result.no();
        }
        return Result.state(ResultCode.NULLPOINTER);
    }
}
