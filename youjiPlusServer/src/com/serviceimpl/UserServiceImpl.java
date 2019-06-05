package com.serviceimpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.dao.UserDao;
import com.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public int queryUser(String phone, String password) {
		// TODO Auto-generated method stub
		return userDao.queryUser(phone, password);
	}

	@Override
	public int updateUser(Map<String, Object> map) {
		// TODO Auto-generated method stub
		StringBuffer hql=new StringBuffer("update User u set ");
		List<Object> params=new LinkedList<Object>();
		if (map.get("nickName")!=null) {
			hql.append(" u.nickName = ?,");
			params.add(map.get("nickName"));
		}
		if (map.get("avatar")!=null) {
			hql.append("u.avatar = ? , ");
			params.add(map.get("avatar"));
		}
		if (map.get("address")!=null) {
			hql.append("u.address = ? , ");
			params.add(map.get("address"));
		}
		if (map.get("description")!=null) {
			hql.append("u.description = ? , ");
			params.add(map.get("description"));
		}
		hql.append(" u.id = "+map.get("id")+" where u.id = "+map.get("id"));
		return userDao.modifyUser(params, hql.toString());
	}

	@Override
	public User queryUserById(int userId) {
		// TODO Auto-generated method stub
		return userDao.queryUserById(userId);
	}

	@Override
	public List<User> queryAllUser() {
		// TODO Auto-generated method stub
		return userDao.queryAllUser();
	}

}
