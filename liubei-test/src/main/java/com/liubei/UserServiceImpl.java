package com.liubei;

/**
 * TODO
 *
 * @Author ltb
 * @Date 2021/1/11 1:36 上午
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {

	@Override
	public User getUserById(int id) {

		return new User(12,"liubei");
	}
}
