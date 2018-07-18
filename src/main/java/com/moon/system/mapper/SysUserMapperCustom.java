package com.moon.system.mapper;

import java.util.List;

import com.moon.common.utils.MyMapper;
import com.moon.system.pojo.MUserinfo;
import com.moon.system.pojo.SysUser;

public interface SysUserMapperCustom extends MyMapper<MUserinfo> {
	
	List<SysUser> queryUserSimplyInfoById(String id);
}