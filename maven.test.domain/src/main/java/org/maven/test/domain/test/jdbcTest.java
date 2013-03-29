package org.maven.test.domain.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.maven.test.domain.Category;
import org.maven.test.domain.Stock;
import org.maven.test.domain.UserBean;

public class jdbcTest extends TestCase{
	private Session session;
	
	@Before
	public void setUp(){
		Configuration config = new Configuration().configure("/resource/hibernate.cfg.xml");
		config.addAnnotatedClass(UserBean.class);
		config.addAnnotatedClass(Stock.class);
		config.addAnnotatedClass(Category.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		session = sessionFactory.openSession();
	}
	
	@Test
	public void testConnect(){
		try{
			Configuration config = new Configuration().configure("/resource/hibernate.cfg.xml");
			config.addAnnotatedClass(UserBean.class);
			//config.addClass(UserBean.class);
			SessionFactory sessionFactory = config.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			UserBean user1 = new UserBean();
			user1.setName("cloud");
			user1.setAccount("test");
			user1.setPassword("test");		
			session.save(user1);
			tx.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void testHQL(){
		Configuration config = new Configuration().configure("/resource/hibernate.cfg.xml");
		config.addAnnotatedClass(UserBean.class);
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		List<UserBean> userList = session.createQuery("from UserBean as ub where ub.id < ?").setInteger(0, 5).list();
		System.out.println(userList.isEmpty());
		for(UserBean ub : userList){
			System.out.println(ub.getName());
		}
		List<String> userNameList = session.createQuery("select ub.name from UserBean as ub where ub.id < ?").setInteger(0, 5).list();
		for(String s : userNameList){
			System.out.println(s);
		}
		List<String> userNameList2 = session.createQuery("select ub.name from UserBean as ub where ub.id = :id").setInteger("id",1).list();
		for(String s : userNameList2){
			System.out.println(s);
		}
	}
	
	@Test
	public void testManyToMany(){
		Transaction tx = session.beginTransaction();
		Stock stock = new Stock();
		stock.setName("abc");
		stock.setCode("a01");
		Category cy1= new Category();
		Category cy2 = new Category();
		cy1.setDesc("good");
		cy1.setName("aa");
		cy2.setDesc("very good");
		cy2.setName("bb");
		List<Category> categoryList = new ArrayList<Category>();
		categoryList.add(cy1);
		categoryList.add(cy2);
		stock.setCategoryList(categoryList);
		session.save(stock);
		tx.commit();
		
	}
	
	
	@Test
	public void testJDBCConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://localhost/cloud?user=root&password=admin";
			Connection conn = DriverManager.getConnection(url); 
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
