package com.spring.CMS.CMS.DAO;

import java.util.Date;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.Comment;
import com.spring.CMS.CMS.Mapper.BaseRep;

public interface CommentDAO extends BaseRep<Comment>
{
	public List<Comment> getAll(Pageable pageable);
	public List<Comment> getByPost(int post);
	public List<Comment> getByUser(int user);
	public Comment getById(int id);
	public List<Comment> getByDate(Date date);
	public void save(Comment comment);
	public void update(Comment comment);
	public void delete(Comment comment);
}
