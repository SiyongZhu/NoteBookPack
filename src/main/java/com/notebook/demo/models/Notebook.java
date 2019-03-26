package com.notebook.demo.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Notebook {

	private UUID id;
	private String Name;

	private List<Note> notes;
	
	public Notebook() {
		this.id = UUID.randomUUID();
		this.notes = new ArrayList<Note>();
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public UUID getId() {
		return id;
	}
	
	
}
