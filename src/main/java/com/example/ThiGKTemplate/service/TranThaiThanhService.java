package com.example.ThiGKTemplate.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.ThiGKTemplate.entity.TranThaiThanhEntity;

@Service
public class TranThaiThanhService {
	private final String url = "http://localhost:8080/server";
	@Autowired
	RestTemplate rest;

	public String addOne(TranThaiThanhEntity thaithanhEntity) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		return rest.postForEntity(url, thaithanhEntity, String.class).getBody();
	}
	public TranThaiThanhEntity getOne(String id) {
		return rest.getForEntity(url+"/"+id, TranThaiThanhEntity.class).getBody();
	}
}
