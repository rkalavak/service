package com.kalavakuri.service;

import com.kalavakuri.dao.TestServletDao;

public class TestServletService {
	
	public void print1() {
		TestServletDao dao = new TestServletDao();
		dao.print1();
	}
	
	public void print2() {
		TestServletDao dao = new TestServletDao();
		dao.print2();
	}
}
