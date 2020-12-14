package com.spring.CMS.CMS.Service;

import java.util.Date;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.Post;

public interface PostService 
{
	public List<Post> getAll(Pageable pageable);
	public Post getById(int post);
	public List<Post> getByUser(int user);
	public List<Post> getByCategory(int category);
	public List<Post> getByStartedDate(Date start);
	public List<Post> getByEndDate(Date end);
	public void save(Post post);
	public void update(Post post);
	public void delete(Post post);
}
