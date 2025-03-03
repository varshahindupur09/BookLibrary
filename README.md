curl -X POST "http://localhost:8080/api/book" \
     -H "Content-Type: application/json" \
     -d '{
           "bookName": "Mastering Spring Boot",
           "price": 45.99,
           "description": "Comprehensive guide to Spring Boot",
           "publicationDate": "2024-02-20",
           "author": "John Doe"
         }'

curl -X GET "http://localhost:8080/api/book/1" \
     -H "Accept: application/json"

docker build -t javaspringbootimage .
docker run -p 8080:8080 javaspringbootimage
