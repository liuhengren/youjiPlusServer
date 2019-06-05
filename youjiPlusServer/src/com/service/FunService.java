package com.service;

import java.util.List;

import com.bean.Fun;

public interface FunService {
	List<Fun> queryMyFuns(int userId);
	int isFun(int userId,int funId);
	int follow(int userId,int funId);
	int deleteFun(int userId,int funId);
}
