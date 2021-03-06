SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
SET GLOBAL time_zone = '-6:00';

/*DROP SCHEMA IF EXISTS `toursBD` ;*/

CREATE SCHEMA IF NOT EXISTS `toursBD` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci ;
USE `toursBD` ;

/*DROP TABLE IF EXISTS `toursBD`.`users` ;*/

CREATE TABLE IF NOT EXISTS `toursBD`.`users` (
  `email` VARCHAR(25) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `name` VARCHAR(16) NOT NULL,
  `lastName` VARCHAR(40) NOT NULL,
  `address` VARCHAR(40) NOT NULL,
  `rol` INT NOT NULL DEFAULT 0,
  -- 1 para usuario, 0 para admin
  
  PRIMARY KEY (`email`))
ENGINE = InnoDB;

/*DROP TABLE IF EXISTS `toursBD`.`tours` ;*/
CREATE TABLE IF NOT EXISTS `toursBD`.`tours` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(16) NOT NULL,
  `description` VARCHAR(300) NOT NULL,
  `duration` DOUBLE NOT NULL,
  `price` DOUBLE NOT NULL,
  `destination` VARCHAR(16) NOT NULL,
  `dateGone` DATE NOT NULL,
  `dateReturn` DATE NOT NULL,
  `qualification` DOUBLE NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

/*insert into tours (id, name, description, duration, price, destination, dateGone, dateReturn, qualification)
 values (0,'Tour a Naranjo','gran tour a naranjo, podrá ver vacas y cafetales',24,15000,'Naranjo','2021-04-20','2021-04-20',5);
*/
select * from tours;
select * from users;
CREATE TABLE IF NOT EXISTS `toursBD`.`qualifications` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_email` VARCHAR(16) NOT NULL,
  `tour_id` INT NOT NULL,
  `description` VARCHAR(300) NOT NULL,
  `qualification` DOUBLE NOT NULL,
  
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_user` FOREIGN KEY (`user_email`) REFERENCES `toursBD`.`users` (`email`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
  CONSTRAINT `fk_tour` FOREIGN KEY (`tour_id`) REFERENCES `toursBD`.`tours` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO `toursBD`.`qualifications`(`user_email`,`tour_id`,`description`,`qualification`) VALUES ('user@gmail.com',3,'malo',1);


SELECT * from qualifications;