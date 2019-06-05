package com.dao;

import java.util.List;

import com.bean.ComLike;

public interface ComLikeDao {
	int isLikeCom(ComLike comLike);
	int addLikeCom(ComLike comLike);
	int deleteLikeCom(ComLike comLike);
	//List<ComLike> queryWhoLikeMyCom(int commentId);
}
