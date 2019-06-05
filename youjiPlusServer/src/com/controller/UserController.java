package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.User;
import com.google.gson.Gson;
import com.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	/**
	 * 需要手机号+密码
	 * @return 注册是否成功标志(true/false)
	 */
	@ResponseBody
	@RequestMapping("/logup")
	public String logup(String phone,String password) {
		User user = new User();
		user.setPassword(password);
		user.setPhone(phone);
		user.setAvatar("avatar.png");
		user.setAddress("地球人");
		user.setDescription("介绍一下自己吧");
		user.setNickName(phone);
		int i = userService.addUser(user);
		Gson gson = new Gson();
		String json = gson.toJson(user);
		if(i==0) {
			return null;
		}else {
			return json;
		}
		
	}
	
	/**
	 * 需要手机号+密码
	 * 返回登录是否成功标志(true/false)
	 */
	@ResponseBody
	@RequestMapping("/login")
	public String login(String phone,String password) {
		int i = userService.queryUser(phone, password);
		if(i==0) {
			return "false";
		}else {
			return "true";
		}
	}
	/**
	 * 
	 * 需要一个完整用户对象,以Map<String, Object>形式
	 * @return 修改是否成功标志(true/false)
	 */
	@ResponseBody
	@RequestMapping("/updatewithoutavatar")
	public String updateNoAvatar() {
		Map<String, Object> map = new HashMap();
		
		return null;
	}
	
	/**
	 * 
	 * 需要一个完整用户对象,以Map<String, Object>形式
	 * @return 修改是否成功标志(true/false)
	 */
	@ResponseBody
	@RequestMapping("/updatewithavatar")
	public String updateAvatar() {
		Map<String, Object> map = new HashMap();
		
		return null;
	}
}
