package com.notebook.demo.models;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;


public class Note {
	
	private UUID id; 
	
	private String text;
	private String title;
	private Date LastModifiedOn;
	
	public static Calendar cal = Calendar.getInstance();
	
	protected Note() {
		this.id = UUID.randomUUID();
	}
	
	
	public Note(String text, String title) {
		super();
		this.text = text;
		this.title = title;
		this.LastModifiedOn = cal.getTime();
	}


	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
