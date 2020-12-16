package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_user;
	
	private String name_user;
	private String lname_user;
	private String email_user;
	private String pass_user;
	private int group_user;
	
	public User(int id_user, String name_user, String lname_user, String email_user, String pass_user, int group_user) 
	{
		this.id_user = id_user;
		this.name_user = name_user;
		this.lname_user = lname_user;
		this.email_user = email_user;
		this.pass_user = pass_user;
		this.group_user = group_user;
	}

	public User() {}

	public int getId_user() 
	{
		return id_user;
	}

	public void setId_user(int id_user) 
	{
		this.id_user = id_user;
	}

	public String getName_user()
	{
		return name_user;
	}

	public void setName_user(String name_user) 
	{
		this.name_user = name_user;
	}

	public String getLname_user() 
	{
		return lname_user;
	}

	public void setLname_user(String lname_user) 
	{
		this.lname_user = lname_user;
	}

	public String getEmail_user() 
	{
		return email_user;
	}

	public void setEmail_user(String email_user) 
	{
		this.email_user = email_user;
	}

	public String getPass_user() 
	{
		return pass_user;
	}

	public void setPass_user(String pass_user) 
	{
		this.pass_user = pass_user;
	}

	public int getGroup_user() 
	{
		return group_user;
	}

	public void setGroup_user(int group_user) 
	{
		this.group_user = group_user;
	}

	@Override
	public String toString() 
	{
		return "User [id_user=" + id_user + ", name_user=" + name_user + ", lname_user=" + lname_user + ", email_user="
				+ email_user + ", pass_user=" + pass_user + ", group_user=" + group_user + "]";
	}
	
}


