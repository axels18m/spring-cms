package com.spring.CMS.CMS.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Content 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_content;
	
	private String type_content;
	private String description_content;
	private int idPost_content;
	
	public Content(int content, String type, String description, int post)
	{
		this.id_content = content;
		this.type_content = type;
		this.description_content = description;
		this.idPost_content = post;
	}
	
	public Content() {}

	public int getId_Content() 
	{
		return id_content;
	}

	public void setId_Content(int id_content) 
	{
		this.id_content = id_content;
	}

	public String getType_Content() 
	{
		return type_content;
	}

	public void setType_Content(String type_content) 
	{
		this.type_content = type_content;
	}

	public String getDescription_Content() 
	{
		return description_content;
	}

	public void setDescription_Content(String description_content) 
	{
		this.description_content = description_content;
	}

	public int getIdPost_Content() 
	{
		return idPost_content;
	}

	public void setIdPost_Content(int idPost_content) 
	{
		this.idPost_content = idPost_content;
	}
	
}
