# CouchbaseDocCrudRestApi
Couchbase CRUD operations Rest Api

Couchbase document service rest API

Update the name and password for the couchbase bucket in the application.properties and run the application.

POST request: localhost:8080/storage/document/ Sample JSON Body for the post request (id stands for document id): { "id": 10, "size": 10, "fileName": "abc.txt", "content": "hello world" }

GET request: localhost:8080/storage/document/10 DELETE request: localhost:8080/storage/document/10 PUT request: localhost:8080/storage/document/10
