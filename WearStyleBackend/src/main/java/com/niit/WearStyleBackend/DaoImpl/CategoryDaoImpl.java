package com.niit.WearStyleBackend.DaoImpl;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.WearStyleBackend.DAO.CategoryDao;
import com.niit.WearStyleBackend.model.Category;


@Repository
public class CategoryDaoImpl implements CategoryDao
{
	@Autowired
	private SessionFactory sessionF;
	
	
	public CategoryDaoImpl(SessionFactory sessionF) {
		super();
		this.sessionF = sessionF;
	}

	
	public CategoryDaoImpl() {
		super();
	}


	public void saveCategory(Category u) 
	{
	
		Session s=sessionF.openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
		s.close();
		
	}


	public void updateCategory(Category u)
	{
		
		Session s=sessionF.openSession();
		s.beginTransaction();
		s.update(u);
		s.getTransaction().commit();
		s.close();
	}


	public void deleteCategory(Category u)
	{
		Session s=sessionF.openSession();
		s.beginTransaction();
		s.delete(u);
		s.getTransaction().commit();
		s.close();
		
	}


	public List<Category> getCategorys() 
	{
		Session s=sessionF.openSession();
		List<Category> clist=s.createQuery("from Category").list();
		
		return clist;
	}


	public Category getCategory(int cid) {
		Session s=sessionF.openSession();
		Category c=(Category)s.get(Category.class, cid);
		return c;
	}

	
}
