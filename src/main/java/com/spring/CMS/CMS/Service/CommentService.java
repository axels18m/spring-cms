package com.spring.CMS.CMS.Service;

import java.util.Date;
import java.util.List;

import com.spring.CMS.CMS.Entity.Comment;

public interface CommentService 
{
	public List<Comment> getAll();
	public List<Comment> getByPost(int post);
	public List<Comment> getByUser(int user);
	public Comment getById(int id);
	public List<Comment> getByDate(Date date);
	public void save(Comment comment);
	public void update(Comment comment);
	public void delete(Comment comment);
}