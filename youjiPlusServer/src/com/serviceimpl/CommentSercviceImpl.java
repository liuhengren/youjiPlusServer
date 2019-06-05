package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Commnet;
import com.dao.CommentDao;
import com.service.CommnetService;
@Service
public class CommentSercviceImpl implements CommnetService{
@Autowired
private CommentDao commnetDao;
	@Override
	public int addCommnet(Commnet commnet) {
		// TODO Auto-generated method stub
		return commnetDao.addCommnet(commnet);
	}

	@Override
	public List<Commnet> queryWhoComMyDy(int dynamicId) {
		// TODO Auto-generated method stub
		return commnetDao.queryWhoComMyDy(dynamicId);
	}

	@Override
	public int getCommnetCount(int dynamicId) {
		// TODO Auto-generated method stub
		return commnetDao.getCommnetCount(dynamicId);
	}

}
