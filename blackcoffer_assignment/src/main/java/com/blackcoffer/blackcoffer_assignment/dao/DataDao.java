package com.blackcoffer.blackcoffer_assignment.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blackcoffer.blackcoffer_assignment.dto.Data;
import com.blackcoffer.blackcoffer_assignment.repo.DataRepo;
@Repository
public class DataDao {
	@Autowired
	private DataRepo repo;

	public List<Data> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
