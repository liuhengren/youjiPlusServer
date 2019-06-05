package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Dynamic;
import com.dao.DynamicDao;
import com.service.DynamciService;
@Service
public class DynamicServiceImpl implements DynamciService{
@Autowired
private DynamicDao dynamicDao;
	@Override
	public List<Dynamic> queryDynamicList(int userId) {
		// TODO Auto-generated method stub
		return dynamicDao.queryDynamicList(userId);
	}

	@Override
	public int addDynamic(Dynamic dynamic) {
		// TODO Auto-generated method stub
		return dynamicDao.addDynamic(dynamic);
	}

	@Override
	public List<Dynamic> queryList() {
		// TODO Auto-generated method stub
		return dynamicDao.queryList();
	}

	@Override
	public Dynamic queryById(int dynamicId) {
		// TODO Auto-generated method stub
		return dynamicDao.queryById(dynamicId);
	}

	@Override
	public int queryDynamicCount(int userId) {
		// TODO Auto-generated method stub
		return dynamicDao.queryDynamicCount(userId);
	}

}
