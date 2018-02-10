DROP TABLE IF EXISTS stock;

CREATE TABLE stock (
  stock_id     INT,
  company_name VARCHAR(50),
  symbol       VARCHAR(10),
  price        DECIMAL(10, 2)
);

INSERT INTO stock VALUES (1, 'VMWare', 'VMW', 56.05);
INSERT INTO stock VALUES (2, 'AT&T', 'T', 38.75);
INSERT INTO stock VALUES (3, 'Facebook', 'FB', 118.25);
