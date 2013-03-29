package org.maven.test.domain.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.maven.test.domain.UserBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import junit.framework.TestCase;

public class DBConnectionTest extends TestCase{

	@Test
	public void testDBCon(){
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcTestConfiguration.class);
		DriverManagerDataSource dds = (DriverManagerDataSource)context.getBean("dataSource");
		SessionFactory sf = (SessionFactory)context.getBean("sf");
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		UserBean ub = new UserBean();
		ub.setAccount("test");
		ub.setName("cloud");
		ub.setPassword("123");
		session.save(ub);
		session.getTransaction().commit();
	}

}
