package com.dao;

import java.util.List;

import com.bean.Commnet;

public interface CommentDao {
	int addCommnet(Commnet commnet);
	List<Commnet> queryWhoComMyDy(int dynamicId);
	int getCommnetCount(int dynamicId);
}
