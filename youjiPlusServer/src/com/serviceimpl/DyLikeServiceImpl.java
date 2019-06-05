package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.DyLike;
import com.bean.Dynamic;
import com.bean.User;
import com.dao.DyLikeDao;
import com.dao.DynamicDao;
import com.dao.UserDao;
import com.service.DyLikeService;
@Service
public class DyLikeServiceImpl implements DyLikeService{
@Autowired
private DyLikeDao dyLikeDao;
@Autowired
private UserDao userDao;
@Autowired
private DynamicDao dynamicDao;
	@Override
	public int isLike(int dynamicId,int userId) {
		// TODO Auto-generated method stub
		return dyLikeDao.isLike(dynamicId,userId);
	}

	@Override
	public int likeDy(int dynamicId,int userId) {
		// TODO Auto-generated method stub
		DyLike dyLike = new DyLike();
		User user = userDao.queryUserById(userId);
		Dynamic dynamic = dynamicDao.queryById(dynamicId);
		dyLike.setUser(user);
		dyLike.setDynamic(dynamic);
		return dyLikeDao.likeDy(dyLike);
	}

	@Override
	public int deleteDyLike(int dynamicId,int userId) {
		// TODO Auto-generated method stub
		return dyLikeDao.deleteDyLike(dynamicId,userId);
	}

}
