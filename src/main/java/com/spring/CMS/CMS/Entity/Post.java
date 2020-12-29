package com.spring.CMS.CMS.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "post")
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
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date started_date_post;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date end_day_post;
	
	public Post(int id_post, int idUser_post, int category_post, int type_post, String image_post, String title_post,
			String description_post, String slug_post, Date started_date_post, Date end_day_post) 
	{
		this.id_post = id_post;
		this.idUser_post = idUser_post;
		this.category_post = category_post;
		this.type_post = type_post;
		this.image_post = image_post;
		this.title_post = title_post;
		this.description_post = description_post;
		this.slug_post = slug_post;
		this.started_date_post = started_date_post;
		this.end_day_post = end_day_post;
	}

	public Post() {}

	public int getId_post() 
	{
		return id_post;
	}

	public void setId_post(int id_post) 
	{
		this.id_post = id_post;
	}

	public int getIdUser_post() 
	{
		return idUser_post;
	}

	public void setIdUser_post(int idUser_post) 
	{
		this.idUser_post = idUser_post;
	}

	public int getCategory_post() 
	{
		return category_post;
	}

	public void setCategory_post(int category_post) 
	{
		this.category_post = category_post;
	}

	public int getType_post() 
	{
		return type_post;
	}

	public void setType_post(int type_post) 
	{
		this.type_post = type_post;
	}

	public String getImage_post() 
	{
		return image_post;
	}

	public void setImage_post(String image_post) 
	{
		this.image_post = image_post;
	}

	public String getTitle_post() 
	{
		return title_post;
	}

	public void setTitle_post(String title_post) 
	{
		this.title_post = title_post;
	}

	public String getDescription_post() 
	{
		return description_post;
	}

	public void setDescription_post(String description_post) 
	{
		this.description_post = description_post;
	}

	public String getSlug_post() 
	{
		return slug_post;
	}

	public void setSlug_post(String slug_post) 
	{
		this.slug_post = slug_post;
	}

	public Date getStarted_date_post() 
	{
		return started_date_post;
	}

	public void setStarted_date_post(Date started_date_post) 
	{
		this.started_date_post = started_date_post;
	}

	public Date getEnd_day_post() 
	{
		return end_day_post;
	}

	public void setEnd_day_post(Date end_day_post) 
	{
		this.end_day_post = end_day_post;
	}

	@Override
	public String toString() 
	{
		return "Post [id_post=" + id_post + ", idUser_post=" + idUser_post + ", category_post=" + category_post
				+ ", type_post=" + type_post + ", image_post=" + image_post + ", title_post=" + title_post
				+ ", description_post=" + description_post + ", slug_post=" + slug_post + ", started_date_post="
				+ started_date_post + ", end_day_post=" + end_day_post + "]";
	}
	
}
