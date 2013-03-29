package org.maven.test.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.maven.test.dto.UserInfo;
import org.maven.test.service.RetrieveUserInfoService;
import org.springframework.stereotype.Service;

@Service("userInfoService")
public class RetrieveUserInfoServiceImpl implements RetrieveUserInfoService{

	public List<UserInfo> batchRetrieveUserInfo(List<String> list) {
		// TODO Auto-generated method stub
		List<UserInfo> userInfoList = new ArrayList<UserInfo>();
		UserInfo ui = new UserInfo();
		ui.setUserId("1");
		ui.setUserName("abc");
		userInfoList.add(ui);
		return userInfoList;
	}
	
}
