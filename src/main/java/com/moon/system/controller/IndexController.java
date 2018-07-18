package com.moon.system.controller;

import com.moon.common.utils.JSONResult;
import com.moon.system.pojo.MUserinfo;
import com.moon.system.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/index")
public class IndexController {

    @Autowired
    private MapService mapService;

    @RequestMapping(value = "demo0")
    public ModelAndView demo0(ModelAndView mav){
        List<MUserinfo> userinfoList=mapService.getAll();
        mav.addObject("userinfoList",userinfoList);
        mav.setViewName("thymeleaf/user/index");
        return mav;
    }

    @RequestMapping(value = "demo1")
    @ResponseBody
    public JSONResult demo1(){
        List<MUserinfo> userinfoList=mapService.getAll();
        return JSONResult.ok(userinfoList);
    }
}
