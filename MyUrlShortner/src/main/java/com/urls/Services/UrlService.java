package com.urls.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urls.Controller.Repository.UrlRepository;
import com.urls.Controller.model.LongShortUrl;

@Service
public class UrlService {
	
	@Autowired
	public UrlRepository repo;

	public String makeShortUrl(String longurl) {
		
		
		
		String shorturl="Helllo";
		LongShortUrl data=new LongShortUrl(longurl, shorturl);
		
		repo.save(data);
		
		return longurl;
	}

}
