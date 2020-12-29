package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user_metadata")
public class User_Metadata 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_metadata;
	
	private int id_user_metadata;
	private String key_metadata;
	private String value_metadata;
	private String type_metadata;
	
	public User_Metadata(int id_metadata, int id_user_metadata, String key_metadata, String value_metadata,
			String type_metadata) 
	{
		this.id_metadata = id_metadata;
		this.id_user_metadata = id_user_metadata;
		this.key_metadata = key_metadata;
		this.value_metadata = value_metadata;
		this.type_metadata = type_metadata;
	}

	public User_Metadata() {}

	public int getId_metadata() 
	{
		return id_metadata;
	}

	public void setId_metadata(int id_metadata) 
	{
		this.id_metadata = id_metadata;
	}

	public int getId_user_metadata() 
	{
		return id_user_metadata;
	}

	public void setId_user_metadata(int id_user_metadata) 
	{
		this.id_user_metadata = id_user_metadata;
	}

	public String getKey_metadata() 
	{
		return key_metadata;
	}

	public void setKey_metadata(String key_metadata) 
	{
		this.key_metadata = key_metadata;
	}

	public String getValue_metadata() 
	{
		return value_metadata;
	}

	public void setValue_metadata(String value_metadata) 
	{
		this.value_metadata = value_metadata;
	}

	public String getType_metadata() 
	{
		return type_metadata;
	}

	public void setType_metadata(String type_metadata) 
	{
		this.type_metadata = type_metadata;
	}

	@Override
	public String toString() 
	{
		return "User_Metadata [id_metadata=" + id_metadata + ", id_user_metadata=" + id_user_metadata
				+ ", key_metadata=" + key_metadata + ", value_metadata=" + value_metadata + ", type_metadata=" + type_metadata
				+ "]";
	}
	
}
