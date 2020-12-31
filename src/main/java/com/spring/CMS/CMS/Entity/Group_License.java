package com.spring.CMS.CMS.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "group_license")
public class Group_License
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_gpolic;
	
	private int id_license_gpolic;
	private int id_group_gpolic;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_gpolic;
	
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

	public int getId_license_gpolic()
	{
		return id_license_gpolic;
	}

	public void setId_license_gpolic(int id_license_gpolic) 
	{
		this.id_license_gpolic = id_license_gpolic;
	}

	public int getId_group_gpolic() 
	{
		return id_group_gpolic;
	}

	public void setId_group_gpolic(int id_group_gpolic) 
	{
		this.id_group_gpolic = id_group_gpolic;
	}

	public Date getDate_gpolic() 
	{
		return date_gpolic;
	}

	public void setDate_gpolic(Date date_gpolic) 
	{
		this.date_gpolic = date_gpolic;
	}

	@Override
	public String toString() 
	{
		return "Group_License [id_gpolic=" + id_gpolic + ", id_license_gpolic=" + id_license_gpolic
				+ ", id_group_gpolic=" + id_group_gpolic + ", date_gpolic=" + date_gpolic + "]";
	}
	
}
