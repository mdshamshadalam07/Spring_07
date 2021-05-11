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
		
		@RequestMapping("/welcome.htm")
		public String showHome() {
			return "home";  // logical view name	
		}	
		
	/*	@RequestMapping("/wish.htm")
		public ModelAndView getMessage() {
			String msg = service.generateWishMessage();
			ModelAndView mav = new ModelAndView();
			mav.addObject("wMsg", msg);
			mav.addObject("sysDate", new Date());
			mav.setViewName("result");
			return mav;
		}*/
		
	/*	@RequestMapping("/wish.htm")
		public String getMessage(ModelMap map) {
			String msg = service.generateWishMessage();
			System.out.println(map.getClass());
			map.addAttribute("sysDate", new Date());
			map.addAttribute("wMsg", msg);		
			return "result";*/
		
	/*	@RequestMapping("/wish.htm")
		    public String getMessage(Map<String,Object> map) {
			String msg = service.generateWishMessage();
			System.out.println(map.getClass());
			map.put("sysDate", new Date());
			map.put("wMsg", msg);		
			return "result";
			} */
		
		/*	@RequestMapping("/wish.htm")
		public void getMessage(Map<String,Object> map) {
			String msg = service.generateWishMessage();
			System.out.println(map.getClass());
			map.put("sysDate", new Date());
			map.put("wMsg", msg);		
		}*/
		
		/*@RequestMapping("/wish.htm")
		public Model getMessage() {
		String msg = service.generateWishMessage();
		Model model = new BindingAwareModelMap();
		model.addAttribute("sysDate", new Date());
		model.addAttribute("wMsg", msg);		
		return model;
		}*/
		
		@RequestMapping("/wish.htm")
		public Map<String,Object> getMessage() {
			String msg = service.generateWishMessage();
			Map map = new HashMap();
			map.put("sysDate", new Date());
			map.put("wMsg", msg);
			return map;		
		}
}