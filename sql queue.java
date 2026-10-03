-- Create Students table
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    roll_no INT,
    name VARCHAR(50) UNIQUE,
    age INT,
    date_of_birth DATE,
    email_id VARCHAR(100) UNIQUE,
    phone_number VARCHAR(15) NOT NULL,
    address VARCHAR(100)
);

-- Insert three records
INSERT INTO students
(student_id, roll_no, name, age, date_of_birth, email_id, phone_number, address)
VALUES
(1, 101, 'Rahul', 20, '2006-05-15', 'rahul@gmail.com', '9876543210', 'Bangalore');

INSERT INTO students
(student_id, roll_no, name, age, date_of_birth, email_id, phone_number, address)
VALUES
(2, 102, 'Priya', 19, '2007-08-20', 'priya@gmail.com', '9876543211', 'Chennai');

INSERT INTO students
(student_id, roll_no, name, age, date_of_birth, email_id, phone_number, address)
VALUES
(3, 103, 'Arun', 21, '2005-03-10', 'arun@gmail.com', '9876543212', 'Hyderabad');

-- Display the records
SELECT * FROM students;
