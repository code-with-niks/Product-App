package productapp.dao;

import javax.transaction.Transactional;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import productapp.model.Product;

@Repository
public class ProductDAO 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	//create
	@Transactional
	public void createProduct(Product product)
	{
		this.hibernateTemplate.save(product);
	}
	//get all the records
	
	@Transactional
	public List<Product> getProducts()
	{
		List<Product> products=	this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	//delete record
	@Transactional
	public void deleteProducts(int pid)
	{
		Product p=this.hibernateTemplate.load(Product.class,pid);
	}
}
