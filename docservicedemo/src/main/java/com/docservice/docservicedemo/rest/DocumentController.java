package com.docservice.docservicedemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docservice.docservicedemo.dao.DocumentDAO;
import com.docservice.docservicedemo.model.DocumentModel;

@RestController
@RequestMapping("/storage")
public class DocumentController {

	@Autowired
	DocumentDAO documentDAO;
	
	@PostMapping("/document")
	public ResponseEntity<DocumentModel> saveDocument(@RequestBody DocumentModel dm) {

		DocumentModel model = documentDAO.saveDocument(dm);
		return new ResponseEntity<DocumentModel>(model, HttpStatus.CREATED);
	}
	
	@GetMapping("/document/{id}")
	public ResponseEntity<DocumentModel> getDocument(@PathVariable Integer id) {
		DocumentModel model = documentDAO.findById(id);
		
		if(model == null) {
			return new ResponseEntity<DocumentModel>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<DocumentModel>(model, HttpStatus.OK);
		}
	}
	
	@PutMapping("/document/{id}")
	public ResponseEntity<Void> updateDocument(@PathVariable Integer id, 
			@RequestBody DocumentModel dm) {
		
		DocumentModel model = documentDAO.findById(id);
		
		if(model == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
		documentDAO.saveDocument(dm);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/document/{id}")
	public ResponseEntity <Void>deleteDocument(@PathVariable Integer id) {
		
		DocumentModel model = documentDAO.findById(id);
		
		if(model == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
		documentDAO.deleteById(id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}







