-- Write your schema here --
CREATE DATABASE inventory_db;

USE inventory_db;

CREATE TABLE products(
    product_id INT AUTO_INCREMENT,
    product_name VARCHAR(30),
    category_name VARCHAR(100),
    price INT,
    in_stock BOOLEAN,
    PRIMARY KEY (product_id)
);

INSERT INTO products (product_name, category_name, price, in_stock) VALUES ('Organic Eggs', 'Dairy', 7, true);

CREATE TABLE category(
    category_id INT AUTO_INCREMENT,
    category_name VARCHAR(30),
    PRIMARY KEY (category_id)
);

SELECT * FROM category;
SELECT * FROM products;