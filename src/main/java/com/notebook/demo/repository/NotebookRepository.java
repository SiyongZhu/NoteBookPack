package com.notebook.demo.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.notebook.demo.models.Notebook;

public interface NotebookRepository extends CrudRepository<Notebook, UUID> {
	

}
