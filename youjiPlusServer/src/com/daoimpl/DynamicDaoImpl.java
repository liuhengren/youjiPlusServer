package com.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bean.Dynamic;
import com.dao.DynamicDao;
@Repository
public class DynamicDaoImpl extends BaseDao implements DynamicDao{

	@Override
	public List<Dynamic> queryDynamicList(int userId) {
		// TODO Auto-generated method stub
		String hql="from Dynamic where user.id = ?";
		List<Dynamic> list = getSession().createQuery(hql).setParameter(0, userId).list();
		return list;
	}

	@Override
	public int addDynamic(Dynamic dynamic) {
		// TODO Auto-generated method stub
		getSession().save(dynamic);
		return dynamic.getId();
	}

	@Override
	public List<Dynamic> queryList() {
		// TODO Auto-generated method stub
		String hql="from Dynamic";
		List<Dynamic> list = getSession().createQuery(hql).list();
		return list;
	}

	@Override
	public Dynamic queryById(int dynamicId) {
		// TODO Auto-generated method stub
		return (Dynamic) getSession().get(Dynamic.class, dynamicId);
	}

	@Override
	public int queryDynamicCount(int userId) {
		// TODO Auto-generated method stub
		String hql = "from Dynamic d where d.user.id = ?";
		List<Dynamic> list = getSession().createQuery(hql).setParameter(0, userId).list();
		return list.size();
	}



}
