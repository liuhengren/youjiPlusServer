package com.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bean.Commnet;
import com.dao.CommentDao;
@Repository
public class CommentDaoImpl extends BaseDao implements CommentDao{

	@Override
	public int addCommnet(Commnet commnet) {
		// TODO Auto-generated method stub
		getSession().save(commnet);
		int id = commnet.getId();
		return id;
	}

	@Override
	public List<Commnet> queryWhoComMyDy(int dynamicId) {
		// TODO Auto-generated method stub
		String hql="from Commnet c where c.dynamic.id = ?";
		List<Commnet> list = getSession().createQuery(hql).setParameter(0, dynamicId).list();
		return list;
	}

	@Override
	public int getCommnetCount(int dynamicId) {
		// TODO Auto-generated method stub
		String hql="from Commnet c where c.dynamic.id = ?";
		List<Commnet> list = getSession().createQuery(hql).setParameter(0, dynamicId).list();
		return list.size();
	}

	@Override
	public Commnet queryById(int commentId) {
		// TODO Auto-generated method stub
		return (Commnet) getSession().get(Commnet.class, commentId);
	}

}
