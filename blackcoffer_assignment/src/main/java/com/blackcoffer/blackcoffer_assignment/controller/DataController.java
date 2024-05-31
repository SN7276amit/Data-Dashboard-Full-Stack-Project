package com.blackcoffer.blackcoffer_assignment.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackcoffer.blackcoffer_assignment.dto.Data;
import com.blackcoffer.blackcoffer_assignment.service.DataService;
import com.blackcoffer.blackcoffer_assignment.util.ResponseStructure;

@RestController
public class DataController {
	@Autowired
	private DataService service;

	@GetMapping("/find/all")
	public ResponseEntity<ResponseStructure<List<Data>>> findAll(){
		return service.findAll();
	}

	
	
	
	
	

}
