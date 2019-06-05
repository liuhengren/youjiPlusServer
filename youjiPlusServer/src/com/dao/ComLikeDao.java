package com.dao;

import com.bean.ComLike;

public interface ComLikeDao {
	int isLikeCom(int commentId,int userId);
	int addLikeCom(ComLike comLike);
	int deleteLikeCom(int commentId,int userId);
	//List<ComLike> queryWhoLikeMyCom(int commentId);
}
