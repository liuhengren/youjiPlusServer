package com.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.bean.DyLike;
import com.dao.DyLikeDao;
@Repository
public class DyLikeDaoImpl extends BaseDao implements DyLikeDao{

	@Override
	public int isLike(int dynamicId,int userId) {
		// TODO Auto-generated method stub
		String hql = "from DyLike dl where dl.user.id = ? and dl.dynamic.id = ?";
		Query query = getSession().createQuery(hql);
		query.setParameter(0, userId);
		query.setParameter(1, dynamicId);
		List list = query.list();
		return list.size();
	}

	@Override
	public int likeDy(DyLike dyLike) {
		// TODO Auto-generated method stub
		getSession().save(dyLike);
		return dyLike.getId();
	}

	@Override
	public int deleteDyLike(int dynamicId,int userId) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		String hql = "from DyLike dl where dl.user.id = ? and dl.dynamic.id = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, userId);
		query.setParameter(1, dynamicId);
		List<DyLike> list = query.list();
		DyLike object = list.get(0);
		System.out.println(object.getId());
		session.delete(object);
		transaction.commit();
		session.close();
		return 1;
	}

}
