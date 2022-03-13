DROP SCHEMA IF EXISTS contact;
CREATE SCHEMA IF NOT EXISTS contact;
USE contact;

-- -----------------------------------------------------
-- Se crea la tabla Contact
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS contact (
  cont_id INT NOT NULL AUTO_INCREMENT,
  cont_name VARCHAR(45) NULL,
  cont_phone VARCHAR(15) NULL,
  cont_email VARCHAR(256) NULL,
  cont_date_birth DATE NULL,
  PRIMARY KEY (cont_id),
  UNIQUE INDEX cont_email_UNIQUE (cont_email ASC, cont_name ASC) VISIBLE)
ENGINE = InnoDB;

INSERT INTO contact (cont_name, cont_phone, cont_email, cont_date_birth)
VALUES ('Andrea Lorena Castro Manzano', '3222117101', 'lcastro0398@gmail.com', '1998-03-24');

INSERT INTO contact (cont_name, cont_phone, cont_email, cont_date_birth)
VALUES ('Juan Alejandro Fernandez Gomez', '3203145678', 'jualfego@gmail.com', '1990-01-14');

INSERT INTO contact (cont_name, cont_phone, cont_email, cont_date_birth)
VALUES ('Lidia María Gonzalez Meza', '3133145623', 'limagome@gmail.com', '1999-12-25');
