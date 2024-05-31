package com.blackcoffer.blackcoffer_assignment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.blackcoffer.blackcoffer_assignment.dao.DataDao;
import com.blackcoffer.blackcoffer_assignment.dto.Data;
import com.blackcoffer.blackcoffer_assignment.exception.DataNotFoundException;
import com.blackcoffer.blackcoffer_assignment.util.ResponseStructure;

@Service
public class DataService {
	@Autowired
	private DataDao dao;

	public ResponseEntity<ResponseStructure<List<Data>>> findAll() {
		// TODO Auto-generated method stub
		List<Data>list=dao.findAll();
		if (list.isEmpty()) {
			throw new DataNotFoundException("No Data Found");
		} else {
			ResponseStructure<List<Data>>structure=new ResponseStructure<List<Data>>();
			structure.setMessage("Data Found Succesfully");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(list);
			return new ResponseEntity<ResponseStructure<List<Data>>>(structure,HttpStatus.OK);
		}
	}

	
	

}
