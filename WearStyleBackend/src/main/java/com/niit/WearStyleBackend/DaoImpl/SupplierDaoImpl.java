package com.niit.WearStyleBackend.DaoImpl;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.WearStyleBackend.DAO.SupplierDao;
import com.niit.WearStyleBackend.model.Supplier;

@Repository
public class SupplierDaoImpl implements SupplierDao
{
	@Autowired
	private SessionFactory sessionF;

	public SupplierDaoImpl(SessionFactory sessionF) {
		super();
		this.sessionF = sessionF;
	}

	public SupplierDaoImpl() {
		super();
	}

	public void saveSupplier(Supplier u) 
	{
		Session s=sessionF.openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
		s.close();
	}	
	public void updateSupplier(Supplier u)
	{
		Session s=sessionF.openSession();
		s.beginTransaction();
		s.update(u);
		s.getTransaction().commit();
		s.close();
		
	}

	public void deleteSupplier(Supplier u) {Session s=sessionF.openSession();
	s.beginTransaction();
	s.delete(u);
	s.getTransaction().commit();
	s.close();
	
		
		// TODO Auto-generated method stub
		
	}

	public List<Supplier> getSuppliers() {
		// TODO Auto-generated method stub
		return null;
	}

	public Supplier getSupplier(int sid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
