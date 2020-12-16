package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "group")
public class Group 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGroup;
	
	private String nameGroup;
	
	public Group(int id, String name)
	{
		this.idGroup = id;
		this.nameGroup = name;
	}
	
	public Group() {}

	public int getIdGroup() 
	{
		return idGroup;
	}

	public void setIdGroup(int idGroup) 
	{
		this.idGroup = idGroup;
	}

	public String getNameGroup() 
	{
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) 
	{
		this.nameGroup = nameGroup;
	}

	@Override
	public String toString() 
	{
		return "Group [idGroup=" + idGroup + ", nameGroup=" + nameGroup + "]";
	}
	
}
