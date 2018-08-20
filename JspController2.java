package com.capgemini.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.model.Customer;
import com.capgemini.model.Product;



@Controller
public class JspController2 {

	@ModelAttribute("user")
	public  Customer getCustomer() {
	return new Customer();
	}
	/*@RequestMapping("/")
	ModelAndView loadIndex() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}*/
	
	/*@RequestMapping("/sign-in-as-customer")
	ModelAndView signInAsCustomer(HttpServletRequest request) {
		
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		System.out.println(email+" "+pwd);
		ModelAndView modelAndView = new ModelAndView("customer-homepage");
		return modelAndView;
	}
	
	@RequestMapping("/sign-in-as-merchant")
	ModelAndView signInAsMerchant(HttpServletRequest request) {
		
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		System.out.println(email+" "+pwd);
		ModelAndView modelAndView = new ModelAndView("merchant-homepage");
		return modelAndView;
	}
	
	@RequestMapping("/sign-in-as-admin")
	ModelAndView signInAsAdmin(HttpServletRequest request) {
		
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		System.out.println(email+" "+pwd);
		ModelAndView modelAndView = new ModelAndView("admin-homepage");
		return modelAndView;
	}
	@RequestMapping("/sign-up-mer")
	ModelAndView signUpMer(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String password= request.getParameter("password");
		String ques = request.getParameter("ques");
		String ans = request.getParameter("ans");
		
		System.out.println(ques);
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	
	@RequestMapping("/sign-up-cust")
	ModelAndView signUpCust(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String password= request.getParameter("password");
		String ques = request.getParameter("ques");
		String ans = request.getParameter("ans");
		System.out.println(ques);
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}*/
			
	
	@RequestMapping("/first")
	String loadCustomerHomepage(ModelMap model) {
		System.out.println("customer");
		RestTemplate restTemplate = new RestTemplate();
		
		Product[] productMen = restTemplate.getForObject("http://localhost:9899/newArrivalsMens.json", Product[].class);
		List<Product> mensList = Arrays.asList(productMen);
		
		Product[] productWomen = restTemplate.getForObject("http://localhost:9899/newArrivalsWomens.json", Product[].class);
		List<Product> womensList = Arrays.asList(productWomen);
		
		Product[] productKids = restTemplate.getForObject("http://localhost:9899/newArrivalsKids.json", Product[].class);
		List<Product> kidsList = Arrays.asList(productKids);
		
		Product[] productElectronics = restTemplate.getForObject("http://localhost:9899/newArrivalsElectronics.json", Product[].class);
		List<Product> electronicsList = Arrays.asList(productElectronics);
		
		System.out.println(mensList);
		System.out.println(womensList);
		System.out.println(kidsList);
		System.out.println(electronicsList);
		
		model.put("mensList",mensList);
		model.put("womensList", womensList);
		model.put("kidsList", kidsList);
		model.put("electronicsList", electronicsList);
		return "index";
	}
	
	/*@RequestMapping("/customer-homepage")
	String loadCustomerHomepage(ModelMap model) {
		System.out.println("customer");
		RestTemplate restTemplate = new RestTemplate();
		
		Product[] productMen = restTemplate.getForObject("http://localhost:9899/men.json", Product[].class);
		List<Product> mensList = Arrays.asList(productMen);
		
		model.put("mensList", mensList);
		
		return "customer-homepage";
	}
	*/
	@RequestMapping("/mens")
	String loadMenspage(ModelMap model) {
		//System.out.println("customer");
		RestTemplate restTemplate = new RestTemplate();
		
		Product[] productMen = restTemplate.getForObject("http://localhost:9899/newArrivalsMens.json", Product[].class);
		List<Product> mensList = Arrays.asList(productMen);
		
		/*Product[] productWomen = restTemplate.getForObject("http://localhost:9899/newArrivalsWomens.json", Product[].class);
		List<Product> womensList = Arrays.asList(productWomen);
		
		Product[] productKids = restTemplate.getForObject("http://localhost:9899/newArrivalsMens.json", Product[].class);
		List<Product> kidsList = Arrays.asList(productKids);*/
		
		/*Product[] productElectronics = restTemplate.getForObject("http://localhost:9899/newArrivalsElectronics.json", Product[].class);
		List<Product> electronicsList = Arrays.asList(productElectronics);
		*/
		System.out.println(mensList);
		//System.out.println(womensList);
		//System.out.println(kidsList);
		/*System.out.println(electronicsList);*/
		
		model.put("mensList",mensList);
		//model.put("womensList", womensList);
		//model.put("kidsList", kidsList);
		/*model.put("electronicsList", electronicsList);*/
		return "mens";
	}
	
	@RequestMapping("/womens")
	String loadWomenspage(ModelMap model) {
		//System.out.println("customer");
		RestTemplate restTemplate = new RestTemplate();
		
		Product[] productMen = restTemplate.getForObject("http://localhost:9899/newArrivalsMens.json", Product[].class);
		List<Product> mensList = Arrays.asList(productMen);
		
		/*Product[] productWomen = restTemplate.getForObject("http://localhost:9899/newArrivalsWomens.json", Product[].class);
		List<Product> womensList = Arrays.asList(productWomen);
		
		Product[] productKids = restTemplate.getForObject("http://localhost:9899/newArrivalsMens.json", Product[].class);
		List<Product> kidsList = Arrays.asList(productKids);*/
		
		/*Product[] productElectronics = restTemplate.getForObject("http://localhost:9899/newArrivalsElectronics.json", Product[].class);
		List<Product> electronicsList = Arrays.asList(productElectronics);
		*/
		System.out.println(mensList);
		//System.out.println(womensList);
		//System.out.println(kidsList);
		/*System.out.println(electronicsList);*/
		
		model.put("mensList",mensList);
		//model.put("womensList", womensList);
		//model.put("kidsList", kidsList);
		/*model.put("electronicsList", electronicsList);*/
		return "womens";
	} 	
	@RequestMapping("/kids")
	String loadKidspage(ModelMap model) {
		//System.out.println("customer");
		RestTemplate restTemplate = new RestTemplate();
		
		Product[] productMen = restTemplate.getForObject("http://localhost:9899/newArrivalsMens.json", Product[].class);
		List<Product> mensList = Arrays.asList(productMen);
		
		/*Product[] productWomen = restTemplate.getForObject("http://localhost:9899/newArrivalsWomens.json", Product[].class);
		List<Product> womensList = Arrays.asList(productWomen);
		
		Product[] productKids = restTemplate.getForObject("http://localhost:9899/newArrivalsMens.json", Product[].class);
		List<Product> kidsList = Arrays.asList(productKids);*/
		
		/*Product[] productElectronics = restTemplate.getForObject("http://localhost:9899/newArrivalsElectronics.json", Product[].class);
		List<Product> electronicsList = Arrays.asList(productElectronics);
		*/
		System.out.println(mensList);
		//System.out.println(womensList);
		//System.out.println(kidsList);
		/*System.out.println(electronicsList);*/
		
		model.put("mensList",mensList);
		//model.put("womensList", womensList);
		//model.put("kidsList", kidsList);
		/*model.put("electronicsList", electronicsList);*/
		return "kids";
	}
	
	@RequestMapping("/electronics")
	String loadElectronicspage(ModelMap model) {
		//System.out.println("customer");
		RestTemplate restTemplate = new RestTemplate();
		
		Product[] productMen = restTemplate.getForObject("http://localhost:9899/newArrivalsMens.json", Product[].class);
		List<Product> mensList = Arrays.asList(productMen);
		
		/*Product[] productWomen = restTemplate.getForObject("http://localhost:9899/newArrivalsWomens.json", Product[].class);
		List<Product> womensList = Arrays.asList(productWomen);
		
		Product[] productKids = restTemplate.getForObject("http://localhost:9899/newArrivalsMens.json", Product[].class);
		List<Product> kidsList = Arrays.asList(productKids);*/
		
		/*Product[] productElectronics = restTemplate.getForObject("http://localhost:9899/newArrivalsElectronics.json", Product[].class);
		List<Product> electronicsList = Arrays.asList(productElectronics);
		*/
		System.out.println(mensList);
		//System.out.println(womensList);
		//System.out.println(kidsList);
		/*System.out.println(electronicsList);*/
		
		model.put("mensList",mensList);
		//model.put("womensList", womensList);
		//model.put("kidsList", kidsList);
		/*model.put("electronicsList", electronicsList);*/
		return "electronics";
	}
	
	@RequestMapping("/single")
	ModelAndView loadSingle() {
		ModelAndView modelAndView = new ModelAndView("single");
		return modelAndView;
	}
	
	@RequestMapping("/cart")
	ModelAndView loadCart() {
		ModelAndView modelAndView = new ModelAndView("cart");
		return modelAndView;
	}
	
	@RequestMapping("/wishlist")
	ModelAndView loadWishlist() {
		ModelAndView modelAndView = new ModelAndView("wishlist");
		return modelAndView;
	}
	
	@RequestMapping("/shipping")
	ModelAndView loadShippingDetails() {
		ModelAndView modelAndView = new ModelAndView("shippingDetails");
		return modelAndView;
	}
	
	@RequestMapping("/coupons")
	ModelAndView loadCoupons() {
		ModelAndView modelAndView = new ModelAndView("coupons");
		return modelAndView;
	}
	@RequestMapping("/forget-pwd-email")
	ModelAndView loadForgetPassword_email() {
		ModelAndView modelAndView = new ModelAndView("forget-pwd-email");
		return modelAndView;
	}
	
	/*@RequestMapping("/forget-pwd-email")
	String signUpCust(HttpServletRequest request, ModelMap model) {

		String email = request.getParameter("email");
				
		Customer c = new Customer();
		
		
		c.setEmail(email);
		
		
		RestTemplate restTemplate = new RestTemplate();
		String str=restTemplate.postForObject("http://localhost:9899/forget-pwd-email.json", c, String.class);
		if(str==null) {
			model.put("response", "true");
			str="You are successfully registered";
			model.put("msg", str);
			System.out.println("str:"+str);
		}
		else {
			model.put("response", "true");
			model.put("msg", "You are successfully registered");
			System.out.println("str:"+str);
		}
		return "forget-pwd-ques";
		}
	*/

	
	@RequestMapping("/forget-pwd-ques")
	ModelAndView loadForgetPassword_ques() {
		ModelAndView modelAndView = new ModelAndView("forget-pwd-ques");
		return modelAndView;
	}
	
	@RequestMapping("/forget-pwd")
	ModelAndView loadForgetPassword() {
		ModelAndView modelAndView = new ModelAndView("forget-pwd");
		return modelAndView;
	}
	
	@RequestMapping("/my-orders")
	ModelAndView loadMyOrders() {
		ModelAndView modelAndView = new ModelAndView("my-orders");
		return modelAndView;
	}
	@RequestMapping("/invoice")
	ModelAndView invoice() {
		ModelAndView modelAndView = new ModelAndView("invoice");
		return modelAndView;
	}
	
}