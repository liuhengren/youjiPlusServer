package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Fun;
import com.bean.User;
import com.service.FunService;

@Controller
@RequestMapping(value="/fun",produces = "text/html;charset=UTF-8")
public class FunController {
	@Autowired
	private FunService funService;
	
	@ResponseBody
	@RequestMapping("myFun")
	public String queryMyFun(int userId) {
		List<Fun> funs = funService.queryMyFuns(userId);
		List<User> funUsers =new ArrayList<>();
		for(int i=0;i<funs.size();i++) {
			User user = new User();
			user=funs.get(i).getFunUser();
			user.setPassword("");
			funUsers.add(user);
		}
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/isFun")
	public String ifFun(int userId,int funId) {
		int i = funService.isFun(userId, funId);
		if(i==0) {
			return "false";
		}else {
			return "true";
		}
	}
	
	@ResponseBody
	@RequestMapping("/follow")
	public String follow(int userId,int funId) {
		int i = funService.follow(userId, funId);;
		if(i==0) {
			return "false";
		}else {
			return "true";
		}
	}
	
	@ResponseBody
	@RequestMapping
	public String delete(int userId, int funId) {
		int i = funService.deleteFun(userId, funId);
		if(i==0) {
			return "false";
		}else {
			return "true";
		}
	}
}
