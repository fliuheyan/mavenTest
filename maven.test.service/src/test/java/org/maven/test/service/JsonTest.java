package org.maven.test.service;

import org.junit.Test;

import junit.framework.TestCase;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonTest extends TestCase{
	@Test
	public void testJsonLib(){
		JSONArray jsonArray = new JSONArray();
		JSONObject jsonObj = new JSONObject();
		UserDto ud = new UserDto();
		ud.setAcc("123");
		ud.setName("cloud");
		jsonObj = JSONObject.fromObject(ud);
		jsonArray = JSONArray.fromObject(ud);
		System.out.println(jsonObj.toString());
		System.out.println(jsonArray.toString());
	}

}
