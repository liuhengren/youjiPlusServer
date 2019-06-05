package com.dao;

import java.util.List;

import com.bean.DyLike;

public interface DyLikeDao {
	int isLike(DyLike dyLike);
	int likeDy(DyLike dyLike);
	int deleteDyLike(DyLike dyLike);
	//List<DyLike> queryDyLike(int dynamicId);
}
