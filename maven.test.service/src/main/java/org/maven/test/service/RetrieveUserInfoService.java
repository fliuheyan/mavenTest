package org.maven.test.service;

import java.util.List;

import org.maven.test.dto.UserInfo;

public interface RetrieveUserInfoService {
	public List<UserInfo> batchRetrieveUserInfo(List<String> list);
}
