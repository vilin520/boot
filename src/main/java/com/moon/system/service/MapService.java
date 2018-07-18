package com.moon.system.service;

import com.moon.system.pojo.EMap;
import com.moon.system.pojo.MUserinfo;

import java.util.List;

public interface MapService {
    public List<EMap> getAll(EMap eMap,Integer page,Integer pageSize);

    public List<MUserinfo> getAll();
}
