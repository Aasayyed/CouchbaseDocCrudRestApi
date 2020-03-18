package com.docservice.docservicedemo.model;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Id;

@Document
public class DocumentModel {

	@Id
	private int id;
	
	private int size;
	
	private String fileName;
	
	private String content;

	public DocumentModel() {
		
	}

	public DocumentModel(int id, int size, String fileName, String content) {
		super();
		this.id = id;
		this.size = size;
		this.fileName = fileName;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
