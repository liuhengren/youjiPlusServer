package com.dao;

import java.util.List;

import com.bean.DyLike;

public interface DyLikeDao {
	int isLike(int dynamicId,int userId);
	int likeDy(DyLike dyLike);
	int deleteDyLike(int dynamicId,int userId);
	//List<DyLike> queryDyLike(int dynamicId);
	
}
