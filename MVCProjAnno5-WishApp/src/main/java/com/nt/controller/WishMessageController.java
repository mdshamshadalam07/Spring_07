package com.nt.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareConcurrentModel;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.IWishMessageService;

@Controller
public class WishMessageController {
//	public static void main(String[] args) {
	@Autowired
	 private IWishMessageService service;
		
		@RequestMapping("/welcome")
		public String showHome() {
			return "home";  // logical view name	
		}	
			
		/*    @RequestMapping("/wish")
			    public String getMessage(Map<String,Object> map) {
				String msg = service.generateWishMessage();
				System.out.println(map.getClass());
				map.put("sysDate", new Date());
				map.put("wMsg", msg);		
				return "result";
			}*/
		
		   @RequestMapping("/wish")
		    public void getMessage(ModelAndView mav) {
			String msg = service.generateWishMessage();
			mav.addObject("sysDate", new Date());
			mav.addObject("wMsg", msg);		
			mav.setViewName("result");
		}
}