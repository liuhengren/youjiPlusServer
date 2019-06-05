package com.service;

import com.bean.DyLike;

public interface DyLikeService {
	int isLike(int dynamicId,int userId);
	int likeDy(int dynamicId,int userId);
	int deleteDyLike(int dynamicId,int userId);
}
