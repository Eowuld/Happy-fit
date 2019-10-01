-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mar. 01 oct. 2019 à 09:02
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `happyfit`
--

-- --------------------------------------------------------

--
-- Structure de la table `objectif`
--

DROP TABLE IF EXISTS `objectif`;
CREATE TABLE IF NOT EXISTS `objectif` (
  `poids` decimal(5,2) DEFAULT NULL,
  `objPoids` decimal(5,2) DEFAULT NULL,
  `objDistance` decimal(5,2) DEFAULT NULL,
  `objTemps` time DEFAULT NULL,
  `date` datetime NOT NULL,
  `User_idUser` int(11) NOT NULL,
  PRIMARY KEY (`User_idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `Login` varchar(45) NOT NULL,
  `mdp` varchar(45) NOT NULL,
  `taille` int(11) DEFAULT NULL,
  `poids` decimal(5,2) DEFAULT NULL,
  `sexe` varchar(45) DEFAULT NULL,
  `mail` varchar(45) NOT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`idUser`),
  UNIQUE KEY `idUser_UNIQUE` (`idUser`),
  UNIQUE KEY `Login_UNIQUE` (`Login`),
  UNIQUE KEY `mail_UNIQUE` (`mail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `objectif`
--
ALTER TABLE `objectif`
  ADD CONSTRAINT `fk_User` FOREIGN KEY (`User_idUser`) REFERENCES `user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
