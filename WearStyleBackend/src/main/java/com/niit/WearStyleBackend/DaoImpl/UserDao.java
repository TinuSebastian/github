package com.niit.WearStyleBackend.DaoImpl;

import com.niit.WearStyleBackend.model.User;

public interface UserDao 
{
	void saveUser(User u);
	User getUser(String mailid);

}
