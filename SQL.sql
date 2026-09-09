-- Get all fields and records from customer --
SELECT * FROM customer;

-- Get all fields from customer, but only if they are from Arizona --
SELECT * FROM customer WHERE state = 'Arizona';

-- Get all invoices older than 6 months --
SELECT invoice FROM customer WHERE invoice_date < DATEADD(month, -6, GETDATE());

-- Update all customer phone numbers to NULL if they don't follow this format: '+ 1 555 555 5555'; --
UPDATE customer SET phone_number  = NULL WHERE phone_number NOT LIKE '+ 1 [0-9][0-9][0-9] [0-9][0-9][0-9] [0-9][0-9][0-9][0-9]';

-- Get all tracks that are longer than 180000 miliseconds --
SELECT * FROM tracks WHERE time > 180000;

-- Update all customers not in USA so that their country =USA and address, city, state are NULL --
UPDATE customer SET country = 'USA', address = NULL, city = NULL, state = NULL WHERE country != 'USA';

-- Given a customer_id, return their total spending across all invoces using a function --
CREATE FUNCTION GetTotalSpending(customer_id INT)
BEGIN
    SELECT SUM(invoice_total) FROM invoce WHERE customer_id = customer_id;
END;

-- Given a employee_id + new_manager_id, create a stored procedure to update an Employee's ReportsTo field --
-- Prevent an employee from reporting to themselves reporting to a non-existence employee, or creating a circular management relationship --

CREATE PROCEDURE UpdateEmployeeManager(employee_id INT, new_manager_id INT)
BEGIN
    IF new_manager_id IS NULL OR new_manager_id = employee_id THEN SET
    @error_message = 'Invalid manager ID'; RETURN; END IF;

    IF NOT EXISTS (SELECT 1 FROM employee WHERE employee_id = new_manager_id) THEN
        SET @error_message = 'Manager does not exist'; RETURN; END IF;
    
    IF EXISTS (SELECT 1 FROM employee WHERE employee_id = new_manager_id AND ReportsTo = employee_id)
        THEN SET @error_message = 'You cannot report to yourself'; RETURN; END IF;
    
    UPDATE employee SET ReportsTo = new_manager_id WHERE employee_id = employee_id;
END;

-- Create a new schema: pets -- 
-- Create two related tables: Customer + Pets --
-- Demonstrate populating records into these tables --

CREATE SCHEMA IF NOT EXISTS pets;
CREATE TABLE IF NOT EXISTS pets.pets (
    pet_id INT PRIMARY KEY,
    Owner_id INT,
    pet_name VARCHAR(50)
);
CREATE TABLE IF NOT EXISTS pets.customer (
    customer_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    pet_id INT, FOREIGN KEY(pet_id) REFERENCES pets.pets(pet_id)
);