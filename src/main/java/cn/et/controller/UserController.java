package cn.et.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.mapper.UserMapper;

@RestController
public class UserController {
	
	@Autowired
	private UserMapper userMapper;

	// http://localhost:8888/validUser?userName=zyx&password=123456 --- 1成功
	// http://localhost:8889/validUser?userName=zyx&password=1234567 --- 0失败，密码错了
	@RequestMapping("/validUser")
	public String validUser(String userName,String password) {
		
		//根据用户名获取用户
		Map map = userMapper.queryUser(userName);
		
		if(map == null || map.get("password") == null) {
			return "0";
		}
		
		//通过用户获取密码
		String pass = map.get("password").toString();
		
		//判断密码是否相同
		if(password.equals(pass)) {
			return "1"; //成功
		}else {
			return "0"; //失败
		}
		
	}
}
