package com.dao;

import java.util.List;

import com.bean.Fun;

public interface FunDao {
	List<Fun> queryMyFuns(int userId);
	int isFun(int userId,int funId);
	int follow(Fun fun);
	int deleteFun(Fun fun);
}
