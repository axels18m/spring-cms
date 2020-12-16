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
	private int idUser;
	
	private String nameUser;
	private String lnameUser;
	private String emailUser;
	private String passUser;
	private int groupUser;
	
	public User(int id, String name, String lname, String email, String pass, int group)
	{
		this.idUser = id;
		this.nameUser = name;
		this.lnameUser = lname;
		this.emailUser = email;
		this.passUser = pass;
		this.groupUser = group;
	}
	
	public User() {}

	public int getIdUser() 
	{
		return idUser;
	}

	public void setIdUser(int idUser) 
	{
		this.idUser = idUser;
	}

	public String getNameUser() 
	{
		return nameUser;
	}

	public void setNameUser(String nameUser) 
	{
		this.nameUser = nameUser;
	}

	public String getLnameUser() 
	{
		return lnameUser;
	}

	public void setLnameUser(String lnameUser) 
	{
		this.lnameUser = lnameUser;
	}

	public String getEmailUser() 
	{
		return emailUser;
	}

	public void setEmailUser(String emailUser) 
	{
		this.emailUser = emailUser;
	}

	public String getPassUser() 
	{
		return passUser;
	}

	public void setPassUser(String passUser) 
	{
		this.passUser = passUser;
	}

	public int getGroupUser() 
	{
		return groupUser;
	}

	public void setGroupUser(int groupUser) 
	{
		this.groupUser = groupUser;
	}

	@Override
	public String toString()
	{
		return "User [idUser=" + idUser + ", nameUser=" + nameUser + ", lnameUser=" + lnameUser + ", emailUser="
				+ emailUser + ", passUser=" + passUser + ", groupUser=" + groupUser + "]";
	}
	
	

}


