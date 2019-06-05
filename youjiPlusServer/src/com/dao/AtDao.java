package com.dao;

import java.util.List;

import com.bean.At;

public interface AtDao {
	List<At> queryWhereAtMe(int userId);
}
