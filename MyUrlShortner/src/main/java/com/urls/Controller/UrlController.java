package com.urls.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.urls.Services.UrlService;

@Controller
public class UrlController {
	
	public UrlService service;
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getMainPage() {
		return "index.html";
	}
	
	@RequestMapping(value="/data", method=RequestMethod.POST)
	public String getMainPageData(@ModelAttribute("longurl") String longurl, Model map) {
		
		service.makeShortUrl(longurl);
		
		
		map.addAttribute("shorturl", "Hello");
		map.addAttribute("ss", longurl);
		return "index.html";
	}
	

}
