package com.spring.CMS.CMS.DAO;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.Content;
import com.spring.CMS.CMS.Mapper.BaseRep;

public interface ContentDAO extends BaseRep<Content>
{
	public List<Content> getAll(Pageable pageable);
	public Content getById(int id);
	public List<Content> getByPost(int post);
	public Content save(Content content);
	public Content update(Content content);
	public void delete(Content content);
}
