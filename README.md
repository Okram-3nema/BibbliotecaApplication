# BibbliotecaApplication_REST_API
**HOW TO TEST :**

Run Program ==> src/main/java/BibbliotecaApplication.java
Download Postaman for test. 

**EXAMPLE**

**ADD BOOK:**

To make a POST request to add a book, you can use an HTTP client like Postman or cURL. Here's an example of a POST request to add a book using Postman:

1. **URL**: `http://localhost:8080/api/libri` (make sure to adapt the URL based on your local configuration).

2. **Method**: `POST`

3. **Headers**: Make sure to include the `Content-Type` header with the value `application/json`.

4. **Body**: Select the `raw` format and enter the book details in the request body in JSON format. Here's an example of the request body:

```json
{
    "title": "The Lord of the Rings",
    "publicationYear": 1954,
    "authorId": 1,
    "publisherId": 1
}
```

Make sure to adapt the book details (title, publicationYear, authorId, publisherId) according to your needs.

5. Press the "Send" button to send the POST request and add the book.


**ADD AUTHOR:**

**URL**: `http://localhost:8080/api/autori`

 **Method**: `POST`
 
**Headers**: `Content-Type`: `application/json`

**Body**: (`raw` JSON):

```json
{
    "name": "Author Name",
    "surname": "Author Surname"
}

```
Send the request to add a new author.


**ADD EDITOR:**

**URL**: `http://localhost:8080/api/editori`

**Method**: `POST`

**Headers**: `Content-Type`: `application/json`

**Body**: (`raw` JSON):

```json
{
    "name": "Editor Name"
}
```
Send the request to add a new editor.
