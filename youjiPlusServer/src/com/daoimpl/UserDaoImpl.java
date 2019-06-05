package com.daoimpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.bean.User;
import com.dao.UserDao;
@Repository
public class UserDaoImpl extends BaseDao implements UserDao{

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(user);
		transaction.commit();
		session.close();
		return user.getId();
	}

	@Override
	public int queryUser(String phone, String psssword) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		String hql="from User u where u.phone = ? and u.password = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, phone);
		query.setParameter(1, psssword);
		Object result = query.uniqueResult();
		transaction.commit();
		session.close();
		if(result==null) {
			return 0;
		}else {
			return 1;
		}
		
	}

	@Override
	public int modifyUser(List<Object> params, String hql) {
		// TODO Auto-generated method stub
		Query query=getSession().createQuery(hql);
		if (params!=null && params.size()>0) {
			for(int i=0;i<params.size();i++){
				query.setParameter(i, params.get(i));
			}
		}
		System.out.println(query.getQueryString());
		return query.executeUpdate();
	}

	@Override
	public User queryUserById(int userId) {
		// TODO Auto-generated method stub
		return (User)getSession().get(User.class, userId);
	}

	@Override
	public List<User> queryAllUser() {
		// TODO Auto-generated method stub
		String hql="from User";
		Session session = getSession();
		Query query = session.createQuery(hql);
		List<User> list = query.list();
		for(int i=0;i<list.size();i++) {
			list.get(i).setPassword("");
		}
		return list;
	}


}
