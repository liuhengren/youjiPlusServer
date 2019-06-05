package com.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.bean.Fun;
import com.dao.FunDao;
@Repository
public class FunDaoImpl extends BaseDao implements FunDao{

	@Override
	public List<Fun> queryMyFuns(int userId) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		String hql="from Fun f where user.id = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, userId);
		List<Fun> list = query.list();
		transaction.commit();
		session.close();
		return list;
	}

	@Override
	public int isFun(int userId,int funId) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		String hql="from fun where user.id = ? and funUser.id = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, userId);
		query.setParameter(1, funId);
		Fun result = (Fun) query.uniqueResult();
		transaction.commit();
		session.close();
		if(result!=null) {
			return 1;
		}else
			return 0;
	}

	@Override
	public int follow(Fun fun) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(fun);
		transaction.commit();
		session.close();
		return fun.getId();
	}

	@Override
	public int deleteFun(Fun fun) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.delete(fun);
		transaction.commit();
		session.close();
		return 1;
	}

}
