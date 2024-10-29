This project is a **microservices-based application** designed for managing a library of books. It consists of four main components:<br>

1 - API Gateway<br>
2 - Command Service<br>
3 - Query Service<br>
4 - Front-end Service<br>
<br>
The architecture follows a RESTful approach, allowing users to perform CRUD (Create, Read, Update, Delete) operations on book records through a web interface.
<br>
   API Gateway<br>
The API Gateway acts as a reverse proxy, routing requests to the appropriate service based on the requested operation. It simplifies client interactions by providing a single entry point.<br>
   Command Service<br>
The Command Service is responsible for handling requests that modify the state of the book records. It manages the creation, updating, and deletion of books.<br>
   Query Service<br>
The Query Service handles read operations. It retrieves book records and can search for specific books based on various criteria.<br>
   Front-end Service<br>
The Front-end Service provides a user interface for interacting with the application. Users can create, read, update, and delete book records through this service.
