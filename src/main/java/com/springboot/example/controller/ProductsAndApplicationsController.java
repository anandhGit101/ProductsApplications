/**
 * 
 */
package com.springboot.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.example.domain.Applications;
import com.springboot.example.domain.Products;
import com.springboot.example.service.ApplicationsService;
import com.springboot.example.service.ProductsService;

/**
 * @author M1006601
 *
 */
@Controller
public class ProductsAndApplicationsController {

	@Autowired
	private ProductsService prodsService;
	
	@Autowired
	private ApplicationsService appsService;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		Products prods = new Products();
		Applications applns = new Applications();
		model.addAttribute("applications", applns);
		model.addAttribute("products", prods);
		return "index";
	}
	
	@RequestMapping("/products")
	public String viewProductsPage(Model model) {
		List<Products> listProducts = prodsService.listAllProducts();
		model.addAttribute("listProducts", listProducts);
		return "products";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		Products products = new Products();
		model.addAttribute("product", products);
		return "new_product";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Products product) {
		prodsService.save(product);
		return "redirect:/products";
	}
	
	@RequestMapping("/edit/{productId}")
	public ModelAndView showEditProductPage(@PathVariable(name = "productId") int productId) {
		ModelAndView mav = new ModelAndView("edit_product");
		Products product = prodsService.get(productId);
		mav.addObject("product", product);
		return mav;
	}
	
	@RequestMapping("/delete/{productId}")
	public String deleteProduct(@PathVariable(name = "productId") int productId) {
		prodsService.delete(productId);
		return "redirect:/products";		
	}
	
	@RequestMapping("/applications")
	public String viewApplicationsPage(Model model) {
		List<Applications> listApplications = appsService.listAllApplications();
		model.addAttribute("listApplications", listApplications);
		return "applications";
	}
	
	@RequestMapping("/newApp")
	public String showNewApplicationsPage(Model model) {
		Applications apps = new Applications();
		model.addAttribute("application", apps);
		return "new_application";
	}
	
	@RequestMapping(value = "/saveApp", method = RequestMethod.POST)
	public String saveApplication(@ModelAttribute("applications") Applications apps) {
		appsService.save(apps);
		return "redirect:/applications";
	}
	
	@RequestMapping("/editApps/{applicationId}")
	public ModelAndView showEditApplicationPage(@PathVariable(name = "applicationId") int applicationId) {
		ModelAndView mav = new ModelAndView("edit_application");
		Applications apps = appsService.get(applicationId);
		mav.addObject("application", apps);
		return mav;
	}
	
	@RequestMapping("/deleteApps/{applicationId}")
	public String deleteApplication(@PathVariable(name = "applicationId") int applicationId) {
		appsService.delete(applicationId);
		return "redirect:/applications";		
	}
}