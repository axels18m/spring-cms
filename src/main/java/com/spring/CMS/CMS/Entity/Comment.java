package com.spring.CMS.CMS.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "comment")
public class Comment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_commt;
	
	private String comment_cmmt;
	private int id_post_cmmt;
	private int id_user_cmmt;
	private Date date_cmmt;
	private String answer_cmmt;
	
	public Comment(int idCommt, String comment_cmmt, int id_post_cmmt, int id_user_cmmt, Date date_cmmt,
			String answer_cmmt) 
	{
		this.id_commt = idCommt;
		this.comment_cmmt = comment_cmmt;
		this.id_post_cmmt = id_post_cmmt;
		this.id_user_cmmt = id_user_cmmt;
		this.date_cmmt = date_cmmt;
		this.answer_cmmt = answer_cmmt;
	}

	public Comment() {}

	public int getId_commt() 
	{
		return id_commt;
	}

	public void setId_commt(int id_commt) 
	{
		this.id_commt = id_commt;
	}

	public String getComment_cmmt() 
	{
		return comment_cmmt;
	}

	public void setComment_cmmt(String comment_cmmt) 
	{
		this.comment_cmmt = comment_cmmt;
	}

	public int getId_post_cmmt() 
	{
		return id_post_cmmt;
	}

	public void setId_post_cmmt(int id_post_cmmt) 
	{
		this.id_post_cmmt = id_post_cmmt;
	}

	public int getId_user_cmmt() 
	{
		return id_user_cmmt;
	}

	public void setId_user_cmmt(int id_user_cmmt) 
	{
		this.id_user_cmmt = id_user_cmmt;
	}

	public Date getDate_cmmt() 
	{
		return date_cmmt;
	}

	public void setDate_cmmt(Date date_cmmt) 
	{
		this.date_cmmt = date_cmmt;
	}

	public String getAnswer_cmmt() 
	{
		return answer_cmmt;
	}

	public void setAnswer_cmmt(String answer_cmmt) 
	{
		this.answer_cmmt = answer_cmmt;
	}

	@Override
	public String toString() 
	{
		return "Comment [id_commt=" + id_commt + ", comment_cmmt=" + comment_cmmt + ", id_post_cmmt=" + id_post_cmmt
				+ ", id_user_cmmt=" + id_user_cmmt + ", date_cmmt=" + date_cmmt + ", answer_cmmt=" + answer_cmmt + "]";
	}
}
