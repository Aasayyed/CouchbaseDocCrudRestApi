package com.docservice.docservicedemo.dao;

import com.docservice.docservicedemo.model.DocumentModel;

public interface DocumentDAO {

	public DocumentModel saveDocument(DocumentModel dm);
		
	public DocumentModel findById(int id);
	
	public void deleteById(int id);
}
