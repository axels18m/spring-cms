package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class License 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_license;
	
	private String name_license;
	
	public License(int id, String name)
	{
		this.id_license = id;
		this.name_license = name;
	}
	
	public License() {}

	public int getId_License() 
	{
		return id_license;
	}

	public void setId_License(int id_license) 
	{
		this.id_license = id_license;
	}

	public String getName_License() 
	{
		return name_license;
	}

	public void setName_License(String name_license) 
	{
		this.name_license = name_license;
	}
	
	
}
