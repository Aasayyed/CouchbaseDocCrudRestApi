package com.docservice.docservicedemo.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.docservice.docservicedemo.model.DocumentModel;
import com.docservice.docservicedemo.repository.DocumentRepository;

@Repository
public class DocumentDAOImpl implements DocumentDAO{


	@Autowired
	DocumentRepository repository;
	
	@Override
	public DocumentModel saveDocument(DocumentModel dm) {

		DocumentModel DBdm = repository.save(dm);
		dm.setId(DBdm.getId());
		return DBdm;
	}

	@Override
	public DocumentModel findById(int id) {
		
		Optional<DocumentModel> optional = repository.findById(id);

		if(optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	@Override
	public void deleteById(int id) {

		repository.deleteById(id);
	}


}
