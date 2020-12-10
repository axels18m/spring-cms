package com.spring.CMS.CMS.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_post;
	private int idUser_post;
	private int category_post;
	private int type_post;
	private String image_post;
	private String title_post;
	private String description_post;
	private String slug_post;
	private Date startedDate_post;
	private Date endDay_post;

	public Post(int post, int user, int category, int type, String image, String title, String description, String slug, Date start, Date end)
	{
		this.id_post = post;
		this.idUser_post = user;
		this.category_post = category;
		this.type_post = type;
		this.image_post = image;
		this.title_post = title;
		this.description_post = description;
		this.slug_post = slug;
		this.startedDate_post = start;
		this.endDay_post = end;
	}

	public Post() {}
	
	public int getId_Post() 
	{
		return id_post;
	}

	public void setId_Post(int id_post) 
	{
		this.id_post = id_post;
	}

	public int getIdUser_Post() 
	{
		return idUser_post;
	}

	public void setIdUser_Post(int idUser_post) 
	{
		this.idUser_post = idUser_post;
	}

	public int getCategory_Post() 
	{
		return category_post;
	}

	public void setCategory_Post(int category_post) 
	{
		this.category_post = category_post;
	}

	public int getType_Post() 
	{
		return type_post;
	}

	public void setType_Post(int type_post) 
	{
		this.type_post = type_post;
	}

	public String getImage_Post() 
	{
		return image_post;
	}

	public void setImage_Post(String image_post) 
	{
		this.image_post = image_post;
	}

	public String getTitle_Post() 
	{
		return title_post;
	}

	public void setTitle_Post(String title_post) 
	{
		this.title_post = title_post;
	}

	public String getDescription_Post() 
	{
		return description_post;
	}

	public void setDescription_Post(String description_post) 
	{
		this.description_post = description_post;
	}

	public String getSlug_Post() 
	{
		return slug_post;
	}

	public void setSlug_Post(String slug_post) 
	{
		this.slug_post = slug_post;
	}

	public Date getStartedDate_Post() 
	{
		return startedDate_post;
	}

	public void setStartedDate_Post(Date startedDate_post) 
	{
		this.startedDate_post = startedDate_post;
	}

	public Date getEndDay_Post() 
	{
		return endDay_post;
	}

	public void setEndDay_Post(Date endDay_post)
	{
		this.endDay_post = endDay_post;
	}
	
}
