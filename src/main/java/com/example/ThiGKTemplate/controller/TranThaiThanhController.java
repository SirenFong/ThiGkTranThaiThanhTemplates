package com.example.ThiGKTemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ThiGKTemplate.entity.TranThaiThanhEntity;
import com.example.ThiGKTemplate.service.TranThaiThanhService;

@RequestMapping("/client")
@RestController
public class TranThaiThanhController {
@Autowired
TranThaiThanhService service;

@PostMapping
String addPost(@RequestBody TranThaiThanhEntity entity) {

	return service.addOne(entity);

}
@GetMapping("/{id}")
TranThaiThanhEntity getEntity(@PathVariable String id ) {
	
	return service.getOne(id);
}

	
}
