package com.service;

import java.util.List;
import java.util.Map;

import com.bean.User;

public interface UserService {
	int addUser(User user);
	int queryUser(String phone,String password);
	public int updateUser(Map<String, Object> map);
	User queryUserById(int userId);
	List<User> queryAllUser();
}
