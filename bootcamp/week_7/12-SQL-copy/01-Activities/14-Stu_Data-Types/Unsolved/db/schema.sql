DROP DATABASE IF EXISTS customer_db;
CREATE DATABASE customer_db;

USE customer_db;

CREATE TABLE customers (
  id INT,
  -- var for limited string
  first_name VARCHAR(250),
  -- var for unlimited string
  bio TEXT,
  is_member BOOLEAN
);
