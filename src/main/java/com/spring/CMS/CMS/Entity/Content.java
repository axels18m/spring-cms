package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "content")
public class Content 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_content;
	
	private String type_content;
	private String description_content;
	private int id_post_content;
	
	public Content(int id_content, String type_content, String description_content, int id_post_content) 
	{
		this.id_content = id_content;
		this.type_content = type_content;
		this.description_content = description_content;
		this.id_post_content = id_post_content;
	}

	public Content() {}

	public int getId_content() 
	{
		return id_content;
	}

	public void setId_content(int id_content) 
	{
		this.id_content = id_content;
	}

	public String getType_content() 
	{
		return type_content;
	}

	public void setType_content(String type_content) 
	{
		this.type_content = type_content;
	}

	public String getDescription_content() 
	{
		return description_content;
	}

	public void setDescription_content(String description_content) 
	{
		this.description_content = description_content;
	}

	public int getId_post_content() 
	{
		return id_post_content;
	}

	public void setId_post_content(int id_post_content) 
	{
		this.id_post_content = id_post_content;
	}

	@Override
	public String toString() 
	{
		return "Content [id_content=" + id_content + ", type_content=" + type_content + ", description_content="
				+ description_content + ", id_post_content=" + id_post_content + "]";
	}

}
