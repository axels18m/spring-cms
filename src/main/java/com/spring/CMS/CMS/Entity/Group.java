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
	private int id_group;
	
	private String name_group;
	
	public Group(int id_group, String name_group) 
	{
		this.id_group = id_group;
		this.name_group = name_group;
	}

	public Group() {}

	public int getId_group() 
	{
		return id_group;
	}

	public void setId_group(int id_group) 
	{
		this.id_group = id_group;
	}

	public String getName_group() 
	{
		return name_group;
	}

	public void setName_group(String name_group) 
	{
		this.name_group = name_group;
	}

	@Override
	public String toString() 
	{
		return "Group [id_group=" + id_group + ", name_group=" + name_group + "]";
	}
	
}
