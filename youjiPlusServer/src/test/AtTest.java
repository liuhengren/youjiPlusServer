package test;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.Commnet;
import com.bean.Dynamic;
import com.bean.Fun;
import com.bean.User;
import com.dao.DynamicDao;
import com.daoimpl.BaseDao;
import com.google.gson.Gson;
import com.service.CommnetService;
import com.service.DyLikeService;
import com.service.FunService;
import com.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AtTest {
	@Autowired
	CommnetService test;
	@Autowired
	UserService userService;
	@Test
	public void test() {
//		User user = new User();
//		user.setPhone("1234");
//		user.setPassword("123");
//		int addUser = userService.addUser(user);
//		System.out.println(addUser);
//		int i = userService.queryUser("1234", "123");
//		System.out.println(i);
//		int j = userService.queryUser("12312", "123");
//		System.out.println(j);
//		HashMap<String, Object> map = new HashMap<>();
//		map.put("nickName", "5555");
//		map.put("address", "6666");
//		map.put("id",5);
//		int i = userService.updateUser(map);
//		System.out.println(i);
//		User queryUserById = userService.queryUserById(5);
//		System.out.println(queryUserById.toString());
//		List<Fun> funs = userService.queryMyFuns(5);
//		List<User> funUsers =new ArrayList<>();
//		for(int i=0;i<funs.size();i++) {
//			User user = new User();
//			user=funs.get(i).getFunUser();
//			user.setPassword("");
//			funUsers.add(user);
//		}
//		System.out.println(funUsers.toString());
//		Dynamic dynamic = new Dynamic();
//		User user = userService.queryUserById(5);
//		dynamic.setUser(user);
//		dynamic.setContent("1231321");
//		dynamic.setImage("5135135000");
//		dynamic.setTime(new Timestamp(new Date().getTime()));
//		Set<Commnet> set =new HashSet<>();
//		dynamic.setCommnets(set);
//		int i = test.addDynamic(dynamic);
//		System.out.println(i);
//		List<Dynamic> queryById = test.queryDynamicList(5);
//		System.out.println(queryById.toString());
		//List<Dynamic> list = test.queryList();
//		Dynamic dynamic = test.queryById(6);
//		Gson gson =new Gson();
//		String json = gson.toJson(dynamic);
//		System.out.println(json);
//		int i = test.queryDynamicCount(5);
//		System.out.println(i);
//		int i = test.deleteDyLike(2, 6);
//		System.out.println(i);
//		test.likeDy(2, 6);
//		List<Commnet> list = test.queryWhoComMyDy(2);
//		System.out.println(list.size());
		
	}

}
