package com.moon.system.mapper;

import com.moon.common.utils.MyMapper;
import com.moon.system.pojo.MUserinfo;

import java.util.List;

public interface MUserinfoMapperCustom extends MyMapper<MUserinfo> {
    public List<MUserinfo> getAll();
}