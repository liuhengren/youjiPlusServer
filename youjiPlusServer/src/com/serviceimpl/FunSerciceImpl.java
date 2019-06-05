package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Fun;
import com.bean.User;
import com.dao.FunDao;
import com.dao.UserDao;
import com.service.FunService;
@Service
public class FunSerciceImpl implements FunService{
@Autowired
private FunDao funDao;
@Autowired
private UserDao userDao;
	@Override
	public List<Fun> queryMyFuns(int userId) {
		// TODO Auto-generated method stub
		return funDao.queryMyFuns(userId);
	}

	@Override
	public int isFun(int userId, int funId) {
		// TODO Auto-generated method stub
		return funDao.isFun(userId, funId);
	}

	@Override
	public int follow(int userId, int funId) {
		// TODO Auto-generated method stub
		User user = userDao.queryUserById(userId);
		User funUser = userDao.queryUserById(funId);
		Fun fun = new Fun();
		fun.setUser(user);
		fun.setFunUser(funUser);
		return funDao.follow(fun);
	}

	@Override
	public int deleteFun(int userId, int funId) {
		// TODO Auto-generated method stub
		User user = userDao.queryUserById(userId);
		User funUser = userDao.queryUserById(funId);
		Fun fun = new Fun();
		fun.setUser(user);
		fun.setFunUser(funUser);
		return funDao.deleteFun(fun);
	}



}
