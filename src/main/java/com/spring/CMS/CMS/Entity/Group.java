package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Group 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_group;
	
	private String name_group;
	
	public Group(int id, String name)
	{
		this.id_group = id;
		this.name_group = name;
	}
	
	public Group() {}

	public int getId_Group() 
	{
		return id_group;
	}

	public void setId_Group(int id_group) 
	{
		this.id_group = id_group;
	}

	public String getName_Group() 
	{
		return name_group;
	}

	public void setName_Group(String name_group) 
	{
		this.name_group = name_group;
	}
}
