package com.ch.jobdamoa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ch.jobdamoa.dao.CompanyDao;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	private CompanyDao cd;
}