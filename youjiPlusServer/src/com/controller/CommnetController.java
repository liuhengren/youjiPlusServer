package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Commnet;
import com.google.gson.Gson;
import com.service.CommnetService;

@Controller
@RequestMapping(value="/comment",produces = "text/html;charset=UTF-8")
public class CommnetController {
	@Autowired
	private CommnetService commnetService;
	
	@ResponseBody
	@RequestMapping("/add")
	public String addCommnet() {
		//接收JSON传并解析
		Gson gson = new Gson();
		
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/query")
	public String queryCommnet(int dynamicId ) {
		Gson gson = new Gson();
		List<Commnet> list = commnetService.queryWhoComMyDy(dynamicId);
		String json = gson.toJson(list);
		return json;
	}
	
	@ResponseBody
	@RequestMapping("/querycount")
	public String queryCount(int dynamicId) {
		int count = commnetService.getCommnetCount(dynamicId);
		return count+"";
	}
	
}
