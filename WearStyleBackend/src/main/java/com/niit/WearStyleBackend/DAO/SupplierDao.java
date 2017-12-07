package com.niit.WearStyleBackend.DAO;

import java.util.List;
import java.util.Locale.Category;

import com.niit.WearStyleBackend.model.Supplier;

public interface SupplierDao 
{
	void saveSupplier(Supplier u);
	void updateSupplier(Supplier u);
	void deleteSupplier(Supplier u);
	List<Supplier> getSuppliers();
	Supplier getSupplier(int sid);
}
