package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.DyLikeService;

@Controller
@RequestMapping(value="/dylike",produces = "text/html;charset=UTF-8")
public class DyLikeController {
	@Autowired
	private DyLikeService dyLikeService;
	
	@ResponseBody
	@RequestMapping("/is")
	public String isLike(int dynamicId,int userId) {
		int i = dyLikeService.isLike(dynamicId, userId);
		if(i==0) {
			return "false";
		}else {
			return "true";
		}
	}
	
	@ResponseBody
	@RequestMapping("/like")
	public String likeDy(int dynamicId,int userId) {
		int i = dyLikeService.likeDy(dynamicId, userId);
		if(i==0) {
			return "false";
		}else {
			return "true";
		}
	}
	@ResponseBody
	@RequestMapping("/cancel")
	public String cancelLike(int dynamicId,int userId) {
		int i = dyLikeService.deleteDyLike(dynamicId, userId);
		if(i==0) {
			return "false";
		}else {
			return "true";
		}
	}
}
