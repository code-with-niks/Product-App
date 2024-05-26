package com.productapp.Controller;

import java.net.http.HttpRequest;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productapp.dao.ProductDAO;
import productapp.model.Product;

@Controller
@ComponentScan(basePackages = {"productapp.dao"})
public class MainController 
{
	@Autowired
	private ProductDAO productDao;
	
	@RequestMapping("/")
	public String home(Model m)
	{
			List<Product> products=productDao.getProducts();
		m.addAttribute("products",products);	
		return "index";
	}
	
	@RequestMapping("/add-product")
	public String addProduct(Model m)
	{
		m.addAttribute("title","AddProduct");
		return "add_product_form";
	}
	
	//handle at product form
	@RequestMapping(value="/handle-product",method=RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest request)
	{
		System.out.println(product);
		productDao.createProduct(product);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
}
