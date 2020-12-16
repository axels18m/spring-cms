package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "post_metadata")
public class Post_Metadata 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_postmet;
	
	private int id_post_postmet;
	private String key_postmet;
	private String value_postmet;
	private String type_postmet;
	
	public Post_Metadata(int id_postmet, int id_post_postmet, String key_postmet, String value_postmet,
			String type_postmet) 
	{
		this.id_postmet = id_postmet;
		this.id_post_postmet = id_post_postmet;
		this.key_postmet = key_postmet;
		this.value_postmet = value_postmet;
		this.type_postmet = type_postmet;
	}

	public Post_Metadata() {}

	public int getId_postmet() 
	{
		return id_postmet;
	}

	public void setId_postmet(int id_postmet) 
	{
		this.id_postmet = id_postmet;
	}

	public int getId_post_postmet() 
	{
		return id_post_postmet;
	}

	public void setId_post_postmet(int id_post_postmet) 
	{
		this.id_post_postmet = id_post_postmet;
	}

	public String getKey_postmet() 
	{
		return key_postmet;
	}

	public void setKey_postmet(String key_postmet) 
	{
		this.key_postmet = key_postmet;
	}

	public String getValue_postmet() 
	{
		return value_postmet;
	}

	public void setValue_postmet(String value_postmet) 
	{
		this.value_postmet = value_postmet;
	}

	public String getType_postmet() 
	{
		return type_postmet;
	}

	public void setType_postmet(String type_postmet) 
	{
		this.type_postmet = type_postmet;
	}

	@Override
	public String toString() 
	{
		return "Post_Metadata [id_postmet=" + id_postmet + ", id_post_postmet=" + id_post_postmet + ", key_postmet="
				+ key_postmet + ", value_postmet=" + value_postmet + ", type_postmet=" + type_postmet + "]";
	}
	
}
