DROP TABLE IF EXISTS CUSTOMER;
DROP TABLE IF EXISTS INSURANCE;

CREATE TABLE CUSTOMER (
  customer_id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  mobile_number VARCHAR(13) NOT NULL,
  email_id VARCHAR(100) NOT NULL,
  created_date DATE DEFAULT NULL
);

CREATE TABLE INSURANCE (
  customer_id INT NOT NULL,
  insurance_number INT AUTO_INCREMENT PRIMARY KEY,
  insurance_type VARCHAR(50) NOT NULL,
  insurance_amount INT NOT NULL,
  insurance_end_date DATE DEFAULT CURDATE() + 1 DAY
);



INSERT INTO CUSTOMER (customer_id, name, mobile_number, email_id, created_date)
VALUES ('1', 'sourav', '9876543210', 'sourav@test.com', CURDATE());





INSERT INTO INSURANCE ( customer_id, insurance_type, insurance_amount, insurance_end_date)
VALUES ( '1', 'VEHICLE LOAN', '99000', CURDATE()+1000);

INSERT INTO INSURANCE ( customer_id, insurance_type, insurance_amount, insurance_end_date)
VALUES ( '1', 'HOME LOAN', '557000', CURDATE()+100);

INSERT INTO INSURANCE ( customer_id, insurance_type, insurance_amount, insurance_end_date)
VALUES ( '2', 'TERM LOAN', '458000', CURDATE()+5000);

INSERT INTO INSURANCE ( customer_id, insurance_type, insurance_amount, insurance_end_date)
VALUES ( '2', 'TRAVEL LOAN', '359888', CURDATE()+10);
