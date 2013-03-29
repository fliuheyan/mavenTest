package org.maven.test.domain.DAOImpl;

import org.maven.test.domain.UserBean;
import org.maven.test.domain.DAO.UserBeanDAO;
import org.springframework.stereotype.Repository;

@Repository("userBeanDAO")
public class UserBeanDAOImpl implements UserBeanDAO{

	public UserBean retrieveUserBeanByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
