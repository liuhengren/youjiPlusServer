package com.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.bean.ComLike;
import com.bean.DyLike;
import com.dao.ComLikeDao;
@Repository
public class ComLikeDaoImpl extends BaseDao implements ComLikeDao{

	@Override
	public int isLikeCom(int commentId, int userId) {
		// TODO Auto-generated method stub
		String hql="from ComLike cl where cl.user.id = ? and cl.comment.id = ? ";
		Session session = getSession();
		List list = session.createQuery(hql)
		.setParameter(0, userId)
		.setParameter(1, commentId).list();
		return list.size();
	}

	@Override
	public int addLikeCom(ComLike comLike) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(comLike);
		transaction.commit();
		session.close();
		return comLike.getId();
	}

	@Override
	public int deleteLikeCom(int commentId, int userId) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		String hql = "from ComLike cl where cl.user.id = ? and cl.comment.id = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, userId);
		query.setParameter(1, commentId);
		List<ComLike> list = query.list();
		ComLike object = list.get(0);
		System.out.println(object.getId());
		session.delete(object);
		transaction.commit();
		session.close();
		return 1;
	}

}
