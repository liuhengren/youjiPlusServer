package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.ComLikeService;

@Controller
@RequestMapping(value="/comlike",produces = "text/html;charset=UTF-8")
public class ComLikeController {
@Autowired
private ComLikeService comLikeService;
	
	@ResponseBody
	@RequestMapping("/is")
	public String isLike(int commentId,int userId) {
		int i = comLikeService.isLikeCom(commentId, userId);
		if(i==0) {
			return "false";
		}else {
			return "true";
		}
	}
	
	@ResponseBody
	@RequestMapping("/add")
	public String addLike(int commentId,int userId) {
		int i = comLikeService.addLikeCom(commentId, userId);
		if(i==0) {
			return "false";
		}else {
			return "true";
		}
	}
	@ResponseBody
	@RequestMapping("/delete")
	public String delete(int commentId,int userId) {
		int i = comLikeService.deleteLikeCom(commentId, userId);
		if(i==0) {
			return "false";
		}else {
			return "true";
		}
	}
}
