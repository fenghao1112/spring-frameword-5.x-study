package com.fh.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@RequestMapping("/user")
	@ResponseBody // 不加这个，使用后置处理器会去找对应的jsp页面
	public void getUser(){
		System.out.println("获取用户信息");
	}
}
