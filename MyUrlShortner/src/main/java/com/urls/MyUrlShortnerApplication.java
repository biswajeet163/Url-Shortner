package com.urls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.urls.Services.UrlService;

@SpringBootApplication
public class MyUrlShortnerApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyUrlShortnerApplication.class, args);
		// ApplicationContext context =
		// SpringApplication.run(Springjpa1Application.class, args);

		UrlService service = context.getBean(UrlService.class);
		// service.makeShortUrl(longurl);
	}

}
