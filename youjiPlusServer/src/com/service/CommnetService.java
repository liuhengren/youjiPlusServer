package com.service;

import java.util.List;

import com.bean.Commnet;

public interface CommnetService {
	int addCommnet(Commnet commnet);
	List<Commnet> queryWhoComMyDy(int dynamicId);
	int getCommnetCount(int dynamicId);
}
