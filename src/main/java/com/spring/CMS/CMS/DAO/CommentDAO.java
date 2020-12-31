package com.spring.CMS.CMS.DAO;

import java.util.Date;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.Comment;
import com.spring.CMS.CMS.Mapper.BaseRep;

public interface CommentDAO extends BaseRep<Comment>
{
	public List<Comment> getAll(Pageable pageable);
	public Comment getById(int id);
	public List<Comment> getByDate(Date date);
	public Comment save(Comment comment);
	public Comment update(Comment comment);
	public void delete(Comment comment);
	
	public List<Comment> getByPost(int post);
	public List<Comment> getByUser(int user);
}
