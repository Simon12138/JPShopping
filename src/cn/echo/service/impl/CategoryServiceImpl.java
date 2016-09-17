package cn.echo.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.echo.hibernate.HibernateSessionFactory;
import cn.echo.model.Category;
import cn.echo.service.CategoryService;

@Service(value="CategoryService")
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private SessionFactory factory;
	
	protected Session getSession() {
		return factory.getCurrentSession();
	}

	@Override
	public void save(Category category) {
		getSession().update(category);
	}

}
