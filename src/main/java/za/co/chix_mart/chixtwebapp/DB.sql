CREATE DATABASE QUOTATIONDB;

CREATE TABLE ADMIN (
         id INT PRIMARY KEY,
      username VARCHAR(50) NOT NULL,
     password VARCHAR(100) NOT NULL,
         email VARCHAR(100)
 );
CREATE TABLE products (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          description TEXT,
                          price DECIMAL(10, 2) NOT NULL,
                          category VARCHAR(100),
                          created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);