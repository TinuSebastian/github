package com.niit.WearStyleBackend.DAO;

import com.niit.WearStyleBackend.model.User;

public interface UserDao 
{
	void saveUser(User u);
	User getUser(String mailid);

}
