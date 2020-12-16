package com.spring.CMS.CMS.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "post")
public class Post 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPost;
	private int idUserPost;
	private int categoryPost;
	private int typePost;
	private String imagePost;
	private String titlePost;
	private String descriptionPost;
	private String slugPost;
	private Date startedDatePost;
	private Date endDayPost;

	public Post(int post, int user, int category, int type, String image, String title, String description, String slug, Date start, Date end)
	{
		this.idPost = post;
		this.idUserPost = user;
		this.categoryPost = category;
		this.typePost = type;
		this.imagePost = image;
		this.titlePost = title;
		this.descriptionPost = description;
		this.slugPost = slug;
		this.startedDatePost = start;
		this.endDayPost = end;
	}

	public Post() {}

	public int getIdPost() 
	{
		return idPost;
	}

	public void setIdPost(int idPost) 
	{
		this.idPost = idPost;
	}

	public int getIdUserPost() 
	{
		return idUserPost;
	}

	public void setIdUserPost(int idUserPost) 
	{
		this.idUserPost = idUserPost;
	}

	public int getCategoryPost() 
	{
		return categoryPost;
	}

	public void setCategoryPost(int categoryPost) 
	{
		this.categoryPost = categoryPost;
	}

	public int getTypePost() 
	{
		return typePost;
	}

	public void setTypePost(int typePost) 
	{
		this.typePost = typePost;
	}

	public String getImagePost() 
	{
		return imagePost;
	}

	public void setImagePost(String imagePost) 
	{
		this.imagePost = imagePost;
	}

	public String getTitlePost() 
	{
		return titlePost;
	}

	public void setTitlePost(String titlePost) 
	{
		this.titlePost = titlePost;
	}

	public String getDescriptionPost() 
	{
		return descriptionPost;
	}

	public void setDescriptionPost(String descriptionPost) 
	{
		this.descriptionPost = descriptionPost;
	}

	public String getSlugPost() 
	{
		return slugPost;
	}

	public void setSlugPost(String slugPost) 
	{
		this.slugPost = slugPost;
	}

	public Date getStartedDatePost() 
	{
		return startedDatePost;
	}

	public void setStartedDatePost(Date startedDatePost) 
	{
		this.startedDatePost = startedDatePost;
	}

	public Date getEndDayPost() 
	{
		return endDayPost;
	}

	public void setEndDayPost(Date endDayPost) 
	{
		this.endDayPost = endDayPost;
	}

	@Override
	public String toString() 
	{
		return "Post [idPost=" + idPost + ", idUserPost=" + idUserPost + ", categoryPost=" + categoryPost
				+ ", typePost=" + typePost + ", imagePost=" + imagePost + ", titlePost=" + titlePost
				+ ", descriptionPost=" + descriptionPost + ", slugPost=" + slugPost + ", startedDatePost="
				+ startedDatePost + ", endDayPost=" + endDayPost + "]";
	}

}
