package com.shop.dao;


import java.util.List;

import com.shop.bean.Orders;
import com.shop.bean.User;

public interface IUserMapper {

	public User login(User user) throws Exception;
	
	public boolean add(User user) throws Exception;
	
	public User findUserByUsername(User user);
	
	public List<Orders> findOrderByUid(User user);
	
	
}
