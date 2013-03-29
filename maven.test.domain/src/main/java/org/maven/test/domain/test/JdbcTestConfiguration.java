package org.maven.test.domain.test;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;

@Configuration
public class JdbcTestConfiguration {
	@Value("jdbc:mysql://localhost/;DatabaseName=cloud")
	private String jdbcUrl;
	@Value("root")
	private String account;
	@Value("123456")
	private String password;

	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		return new DriverManagerDataSource(jdbcUrl, account, password);
	}

	@Bean(name = "sf")
	public SessionFactory getSF() {
		AnnotationSessionFactoryBean asfb = new AnnotationSessionFactoryBean();
		asfb.setDataSource(getDataSource());
		return asfb.getObject();
	}
}
