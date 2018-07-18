package com.moon.system.service.impl;

import com.moon.system.mapper.MUserinfoMapperCustom;
import com.moon.system.pojo.MUserinfo;
import org.springframework.stereotype.Service;


import com.github.pagehelper.PageHelper;
import com.moon.system.mapper.EMapMapper;
import com.moon.system.pojo.EMap;
import com.moon.system.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class MapServiceImpl implements MapService {

    @Autowired
    private EMapMapper eMapMapper;

    @Autowired
    private MUserinfoMapperCustom mUserinfoMapperCustom;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<EMap> getAll(EMap eMap, Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
//        Example example=new Example(EMap.class);
//        Example.Criteria criteria=example.createCriteria();
        List<EMap> eMaps=eMapMapper.selectAll();
        return eMaps;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<MUserinfo> getAll() {
        List<MUserinfo> mUserinfos=mUserinfoMapperCustom.getAll();
        return mUserinfos;
    }
}
