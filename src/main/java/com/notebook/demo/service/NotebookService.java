package com.notebook.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notebook.demo.repository.NotebookRepository;

@Service
public class NotebookService {

	@Autowired
	private NotebookRepository notebookRepository;
	
	
	
}
