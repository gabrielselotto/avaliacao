DROP TABLE stock IF EXISTS;

CREATE TABLE stock
(
  id VARCHAR(150) PRIMARY KEY,
  description VARCHAR(250) NULL,
  stockvalue INTEGER (50) NOT NULL,
  stockdate DATE NOT NULL
);

INSERT INTO stock (id, description, stockvalue, stockdate) VALUES
  ('PETR3', 'Industry Stock', '35', '2019-01-01'),
  ('VALE5', 'Vale Brasileira Stock', '40', '2019-01-01');

