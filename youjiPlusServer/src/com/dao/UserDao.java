package com.dao;

import java.util.List;

import com.bean.User;

public interface UserDao {
	int addUser(User user);
	int queryUser(String phone,String psssword);
	int modifyUser(List<Object> params,String hql);
	User queryUserById(int userId);
	List<User> queryAllUser();
}
