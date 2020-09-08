package com.urls.Controller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "urltables")
public class LongShortUrl {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	public Long id;
	
	@Column(name="longurl")
	public String Long_url;
	
	@Column(name="shorturl")
	public String Short_url;

	public LongShortUrl() {

	}

	public LongShortUrl(String long_url, String short_url) {
		Long_url = long_url;
		Short_url = short_url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLong_url() {
		return Long_url;
	}

	public void setLong_url(String long_url) {
		Long_url = long_url;
	}

	public String getShort_url() {
		return Short_url;
	}

	public void setShort_url(String short_url) {
		Short_url = short_url;
	}

}
