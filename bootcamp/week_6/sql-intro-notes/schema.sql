DROP DATABASE IF EXISTS books_db;
-- Creates the "books_db" database --
CREATE DATABASE books_db;
USE books_db;


-- Add biography table --
CREATE TABLE biography(
  id INT AUTO_INCREMENT,
  name VARCHAR(100),
  author VARCHAR(250),
  PRIMARY KEY (id)
);

INSERT INTO biography (name, author) VALUES ('sql tutorial', 'James'),
('example', 'James');

-- INSERT INTO biography (name) VALUES ('Best');
-- INSERT INTO biography (name) VALUES ('Programmer');

-- this line uses the WHERE tool to chage the value 
-- id 1 is refering top the whole row not just 'James'
UPDATE biography SET author = 'BOB' WHERE id = 1;

-- this means to select all elements from biography table so when we run this the table is created and then all elements are selected, you can change this to only select fewer or more percise data
-- ex 1
-- SELECT * FROM biography;
-- ex 2
SELECT * FROM biography WHERE name = 'sql tutorial';