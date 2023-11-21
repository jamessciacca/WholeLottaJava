-- DROP DATABASE IF EXISTS inventory_db;
-- -- Creates the "inventory_db" database --
-- CREATE DATABASE inventory_db;

-- -- Makes it so all of the following code will affect inventory_db --
-- USE inventory_db;

-- -- Creates the table "produce" within inventory_db --
-- CREATE TABLE produce (
--   -- Creates a numeric column called "id" which will automatically increment its default value as we create new rows --
--   id INT NOT NULL,
--   -- Makes a string column called "name" which cannot contain null --
--   name VARCHAR(100) NOT NULL
-- );

USE turtle_db;

DROP TABLE IF EXISTS turtles;

CREATE TABLE turtles(
  id INT AUTO_INCREMENT,
  shell_color VARCHAR(250),
  PRIMARY KEY(id)
);

INSERT INTO turtles (shell_color) VALUES ('brown');

SELECT * FROM turtles;
