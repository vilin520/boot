package com.moon.system.controller;

import java.util.Date;

import com.moon.common.utils.JSONResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moon.system.pojo.User;

//@Controller
@RestController		// @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserContoller {

	@RequestMapping("/getUser")
//	@ResponseBody
	public User getUser() {
		
		User u = new User();
		u.setName("imooc2");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc2");
		u.setDesc("hello imooc2~~");
		
		return u;
	}
	
	@RequestMapping("/getUserJson")
//	@ResponseBody
	public JSONResult getUserJson() {
		
		User u = new User();
		u.setName("imooc");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc");
		u.setDesc("hello imooc~~hello imooc~~");
		
		return JSONResult.ok(u);
	}
}
