package com.service;

import java.util.List;

import com.bean.Dynamic;

public interface DynamciService {
	List<Dynamic> queryDynamicList(int userId);
	int addDynamic(Dynamic dynamic);
	List<Dynamic> queryList();
	Dynamic queryById(int dynamicId);
	int queryDynamicCount(int userId);
}
