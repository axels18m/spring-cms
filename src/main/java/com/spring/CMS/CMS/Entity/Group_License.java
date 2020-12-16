package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "group_license")
public class Group_License
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_gpolic;
	
	private int id_license_gpolic;
	
	public Group_License(int id_gpolic, int id_license_gpolic) 
	{
		this.id_gpolic = id_gpolic;
		this.id_license_gpolic = id_license_gpolic;
	}

	public Group_License() {}

	public int getId_gpolic() 
	{
		return id_gpolic;
	}

	public void setId_gpolic(int id_gpolic) 
	{
		this.id_gpolic = id_gpolic;
	}

	public int getId_License_gpolic()
	{
		return id_license_gpolic;
	}

	public void setId_license_gpolic(int id_license_gpolic) 
	{
		this.id_license_gpolic = id_license_gpolic;
	}
	
	
}
