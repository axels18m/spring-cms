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
	
	public User(int id, String name, String lname, String email, String pass, int group)
	{
		this.id_user = id;
		this.name_user = name;
		this.lname_user = lname;
		this.email_user = email;
		this.pass_user = pass;
		this.group_user = group;
	}
	
	public User() {}

	public int getId_User() 
	{
		return id_user;
	}

	public void setId_User(int id_user) 
	{
		this.id_user = id_user;
	}

	public String getName_User() 
	{
		return name_user;
	}

	public void setName_User(String name_user) 
	{
		this.name_user = name_user;
	}

	public String getLname_User() 
	{
		return lname_user;
	}

	public void setLname_User(String lname_user) 
	{
		this.lname_user = lname_user;
	}

	public String getEmail_User() 
	{
		return email_user;
	}

	public void setEmail_User(String email_user) 
	{
		this.email_user = email_user;
	}

	public String getPass_User() 
	{
		return pass_user;
	}

	public void setPass_User(String pass_user) 
	{
		this.pass_user = pass_user;
	}

	public int getGroup_User() 
	{
		return group_user;
	}

	public void setGroup_User(int group_user) 
	{
		this.group_user = group_user;
	}

	@Override
	public String toString() {
		return "User [id_user=" + id_user + ", name_user=" + name_user + ", lname_user=" + lname_user + ", email_user="
				+ email_user + ", pass_user=" + pass_user + ", group_user=" + group_user + "]";
	}
}


