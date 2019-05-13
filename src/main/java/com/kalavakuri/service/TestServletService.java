package com.kalavakuri.service;

import com.kalavakuri.dao.TestServletDao;

public class TestServletService {
	
	public void print() {
		TestServletDao dao = new TestServletDao();
		dao.print();
	}
}
