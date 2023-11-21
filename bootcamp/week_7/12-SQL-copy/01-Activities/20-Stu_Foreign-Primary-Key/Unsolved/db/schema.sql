-- Write your Schema Here -- 
DROP DATABASE IF EXISTS orders_db;

CREATE DATABASE orders_db;

USE orders_db;

CREATE TABLE customers(
    customer_id INT AUTO_INCREMENT,
    first_name VARCHAR(200),
    last_name VARCHAR(200),
    PRIMARY KEY (customer_id)
);

CREATE TABLE customer_orders(
    order_id INT AUTO_INCREMENT,
    customer_id INT,
    order_details TEXT,
    PRIMARY KEY (order_id),
    FOREIGN KEY (customer_id)
        REFERENCES customers (customer_id)
        ON DELETE SET NULL
);

INSERT INTO customers (first_name, last_name) VALUES ('Paul', 'Cwik');

INSERT INTO customer_orders (customer_id, order_details) VALUES (1, 'Tablet - 13 Inch');

SELECT * FROM customers;
SELECT * FROM customer_orders;