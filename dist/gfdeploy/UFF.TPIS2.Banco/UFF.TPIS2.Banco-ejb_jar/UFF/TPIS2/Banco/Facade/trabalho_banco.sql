-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema trabalho_banco
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema trabalho_banco
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `trabalho_banco` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `trabalho_banco` ;

-- -----------------------------------------------------
-- Table `trabalho_banco`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `trabalho_banco`.`cliente` (
  `id` INT NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `data_nascimento` DATE NULL,
  `senha` VARCHAR(45) NOT NULL,
  `data_criacao` DATETIME NULL,
  `cpf` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `trabalho_banco`.`conta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `trabalho_banco`.`conta` (
  `id` INT NOT NULL,
  `id_cliente` INT NOT NULL,
  `tipo` CHAR(4) NULL,
  `saldo` DECIMAL NULL,
  `data_criacao` DATETIME NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_conta_cliente_idx` (`id_cliente` ASC),
  CONSTRAINT `fk_conta_cliente`
    FOREIGN KEY (`id_cliente`)
    REFERENCES `trabalho_banco`.`cliente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `trabalho_banco`.`transacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `trabalho_banco`.`transacao` (
  `id` INT NOT NULL,
  `id_conta_destino` INT NOT NULL,
  `id_conta_origem` INT NULL,
  `data` DATETIME NOT NULL,
  `tipo_movimentacao` CHAR(4) NOT NULL,
  `tipo_destino` CHAR(4) NULL,
  `valor` DECIMAL NOT NULL,
  `Vencimento` CHAR(10) NULL,
  `cod_boleto` VARCHAR(100) NULL,
  `cod_invest` CHAR(4) NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_extrato_conta1_idx` (`id_conta_destino` ASC),
  INDEX `fk_extrato_conta2_idx` (`id_conta_origem` ASC),
  CONSTRAINT `fk_extrato_conta1`
    FOREIGN KEY (`id_conta_destino`)
    REFERENCES `trabalho_banco`.`conta` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_extrato_conta2`
    FOREIGN KEY (`id_conta_origem`)
    REFERENCES `trabalho_banco`.`conta` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `trabalho_banco`.`tipo_movimentacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `trabalho_banco`.`tipo_movimentacao` (
  `idtipo_movimentacao` INT NOT NULL,
  PRIMARY KEY (`idtipo_movimentacao`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `trabalho_banco`.`investimento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `trabalho_banco`.`investimento` (
  `id` INT NOT NULL,
  `tipo_investimento` CHAR(4) NULL,
  `saldo` DECIMAL NOT NULL,
  `rendimento` DECIMAL NOT NULL,
  `data_criacao` DATE NULL,
  `id_conta` INT NOT NULL,
  `transacao_id` INT NOT NULL,
  `conta_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_investimento_transacao1_idx` (`transacao_id` ASC),
  INDEX `fk_investimento_conta1_idx` (`conta_id` ASC),
  CONSTRAINT `fk_investimento_transacao1`
    FOREIGN KEY (`transacao_id`)
    REFERENCES `trabalho_banco`.`transacao` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_investimento_conta1`
    FOREIGN KEY (`conta_id`)
    REFERENCES `trabalho_banco`.`conta` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `trabalho_banco`.`investimento`
-- -----------------------------------------------------


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

