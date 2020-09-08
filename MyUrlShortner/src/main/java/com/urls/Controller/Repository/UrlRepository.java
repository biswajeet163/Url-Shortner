package com.urls.Controller.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.urls.Controller.model.LongShortUrl;

@Repository
public interface UrlRepository extends CrudRepository<LongShortUrl, Long>  {


}
