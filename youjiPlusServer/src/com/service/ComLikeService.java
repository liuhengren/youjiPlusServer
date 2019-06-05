package com.service;


public interface ComLikeService {
	int isLikeCom(int commentId,int userId);
	int addLikeCom(int commentId,int userId);
	int deleteLikeCom(int commentId,int userId);
}
