package com.docservice.docservicedemo.repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.docservice.docservicedemo.model.DocumentModel;

@Repository
public interface DocumentRepository extends CouchbaseRepository<DocumentModel, Integer> {

}
