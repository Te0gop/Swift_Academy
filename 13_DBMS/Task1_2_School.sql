-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema school
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema school
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `school` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `school` ;

-- -----------------------------------------------------
-- Table `school`.`students`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`students` (
  `students_id` INT NOT NULL,
  `students_name` VARCHAR(256) NULL DEFAULT NULL,
  `students_enrollment_date` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`students_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `school`.`teachers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`teachers` (
  `teachers_id` INT NOT NULL,
  `teachers_name` VARCHAR(256) NULL DEFAULT NULL,
  `teachers_email` VARCHAR(256) NULL DEFAULT NULL,
  `teachers_salary` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`teachers_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `school`.`addresses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`addresses` (
  `addresses_id` INT NOT NULL,
  `addresses_country` VARCHAR(256) NULL DEFAULT NULL,
  `addresses_city` VARCHAR(256) NULL DEFAULT NULL,
  `addresses_street` VARCHAR(256) NULL DEFAULT NULL,
  `addresses_number` VARCHAR(256) NULL DEFAULT NULL,
  `students_floor` INT NULL DEFAULT NULL,
  `students_apartment_no` INT NULL DEFAULT NULL,
  PRIMARY KEY (`addresses_id`),
  CONSTRAINT `addresses_ibfk_1`
    FOREIGN KEY (`addresses_id`)
    REFERENCES `school`.`students` (`students_id`),
  CONSTRAINT `addresses_ibfk_2`
    FOREIGN KEY (`addresses_id`)
    REFERENCES `school`.`teachers` (`teachers_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `school`.`disciplines`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`disciplines` (
  `disciplines_id` INT NOT NULL,
  `disciplines_name` VARCHAR(256) NULL DEFAULT NULL,
  PRIMARY KEY (`disciplines_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `school`.`disciplines_studied`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`disciplines_studied` (
  `disciplines_id` INT NOT NULL,
  `students_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`disciplines_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `school`.`disciplines_taught`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`disciplines_taught` (
  `disciplines_id` INT NOT NULL,
  `teachers_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`disciplines_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
