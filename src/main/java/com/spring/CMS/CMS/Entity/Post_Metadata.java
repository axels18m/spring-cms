package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post_Metadata 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_postmet;
	
	private int idPost_postmet;
	private String key_postmet;
	private String value_postmet;
	private String type_postmet;
	
	public Post_Metadata(int metadata, int post, String key, String value, String type)
	{
		this.id_postmet = metadata;
		this.idPost_postmet = post;
		this.key_postmet = key;
		this.value_postmet = value;
		this.type_postmet = value;
	}
	
	public Post_Metadata() {}

	public int getId_Postmet() 
	{
		return id_postmet;
	}

	public void setId_Postmet(int id_postmet) 
	{
		this.id_postmet = id_postmet;
	}

	public int getIdPost_Postmet() 
	{
		return idPost_postmet;
	}

	public void setIdPost_Postmet(int idPost_postmet) 
	{
		this.idPost_postmet = idPost_postmet;
	}

	public String getKey_Postmet() 
	{
		return key_postmet;
	}

	public void setKey_Postmet(String key_postmet) 
	{
		this.key_postmet = key_postmet;
	}

	public String getValue_Postmet() 
	{
		return value_postmet;
	}

	public void setValue_Postmet(String value_postmet) 
	{
		this.value_postmet = value_postmet;
	}

	public String getType_Postmet() 
	{
		return type_postmet;
	}

	public void setType_Postmet(String type_postmet) 
	{
		this.type_postmet = type_postmet;
	}
	
}
