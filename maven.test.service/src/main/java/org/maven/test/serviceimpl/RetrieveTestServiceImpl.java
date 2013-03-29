package org.maven.test.serviceimpl;

import org.springframework.stereotype.Service;

@Service("test")
public class RetrieveTestServiceImpl implements RetrieveTestService {

	public String retrieveName(String name) {
		// TODO Auto-generated method stub
		return "hello" + name;
	}

}
