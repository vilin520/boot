package com.moon.system.controller;

import com.moon.common.utils.JSONResult;
import com.moon.system.pojo.EMap;
import com.moon.system.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/demo")
public class TestController {

    @Autowired
    private MapService mapService;

    @RequestMapping(value = "/index")
    public Object index(){
        return "hello how are you !!!";
    }

    @RequestMapping(value = "/index0")
    public JSONResult index0(Integer page){
        Integer pageSize=3;
        EMap eMap=new EMap();
        List<EMap> eMaps=mapService.getAll(eMap,page,pageSize);
        return JSONResult.ok(eMaps);
    }
}
