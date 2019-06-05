package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Dynamic;
import com.google.gson.Gson;
import com.service.DynamciService;

@Controller
@RequestMapping("/dynamic")
public class DynamicController {
@Autowired
private DynamciService dynamciService;
	
	@ResponseBody
	@RequestMapping("/all")
	public String queryAll() {
		
		List<Dynamic> list = dynamciService.queryList();
		Gson gson =new Gson();
		String json = gson.toJson(list);
		return json;
	}
	
	@ResponseBody
	@RequestMapping("/byId")
	public String qureyById(int dynamicId) {
		Dynamic dynamic = dynamciService.queryById(dynamicId);
		Gson gson = new Gson();
		String json = gson.toJson(dynamic);
		return json;
	}
	
	@ResponseBody
	@RequestMapping("/byUserId")
	public String qureyByUserId(int userId) {
		List<Dynamic> dynamic = dynamciService.queryDynamicList(userId);
		Gson gson = new Gson();
		String json = gson.toJson(dynamic);
		return json;
	}
	/**
	 * 待实现
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/add")
	public String addDynamic(HttpServletRequest request) {
		
		
		return null;
	}
	
}
