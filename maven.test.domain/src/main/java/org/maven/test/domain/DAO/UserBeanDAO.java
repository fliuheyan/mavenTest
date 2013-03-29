package org.maven.test.domain.DAO;

import org.maven.test.domain.UserBean;

public interface UserBeanDAO {
	public UserBean retrieveUserBeanByName(String name);
}
