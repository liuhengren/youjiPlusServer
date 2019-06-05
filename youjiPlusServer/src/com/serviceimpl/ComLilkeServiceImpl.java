package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.ComLike;
import com.bean.Commnet;
import com.bean.User;
import com.dao.ComLikeDao;
import com.dao.CommentDao;
import com.dao.UserDao;
import com.service.ComLikeService;
@Service
public class ComLilkeServiceImpl implements ComLikeService{
@Autowired
private ComLikeDao comLikeDao;
@Autowired
private UserDao userDao;
@Autowired
private CommentDao commentDao;
	@Override
	public int isLikeCom(int commentId, int userId) {
		// TODO Auto-generated method stub
		return comLikeDao.isLikeCom(commentId, userId);
	}

	@Override
	public int addLikeCom(int commentId, int userId) {
		// TODO Auto-generated method stub
		ComLike comLike = new ComLike();
		User user = userDao.queryUserById(userId);
		Commnet commnet = commentDao.queryById(commentId);
		comLike.setUser(user);
		comLike.setComment(commnet);
		int i = comLikeDao.addLikeCom(comLike);
		return i;
	}

	@Override
	public int deleteLikeCom(int commentId, int userId) {
		// TODO Auto-generated method stub
		return comLikeDao.deleteLikeCom(commentId, userId);
	}

}
