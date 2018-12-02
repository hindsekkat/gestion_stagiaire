-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 07 Août 2018 à 13:13
-- Version du serveur :  10.1.19-MariaDB
-- Version de PHP :  5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestion_stagiaire`
--

-- --------------------------------------------------------

--
-- Structure de la table `stagiaire`
--

CREATE TABLE `stagiaire` (
  `Num_dossier` int(11) NOT NULL,
  `Nom` varchar(50) DEFAULT NULL,
  `Prenom` varchar(50) DEFAULT NULL,
  `Telephone` varchar(20) DEFAULT NULL,
  `Adresse` varchar(200) DEFAULT NULL,
  `CIN` varchar(15) DEFAULT NULL,
  `Sexe` varchar(15) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Etablissement` varchar(50) DEFAULT NULL,
  `Ville` varchar(50) DEFAULT NULL,
  `Profil` varchar(50) DEFAULT NULL,
  `Specialite` varchar(50) DEFAULT NULL,
  `Direction` varchar(200) DEFAULT NULL,
  `Division` varchar(200) DEFAULT NULL,
  `Encadrant` varchar(100) DEFAULT NULL,
  `Type_stage` varchar(100) DEFAULT NULL,
  `Theme_stage` varchar(500) DEFAULT NULL,
  `Debut_stage` varchar(200) DEFAULT NULL,
  `Fin_stage` varchar(200) DEFAULT NULL,
  `Duree_stage` varchar(200) DEFAULT NULL,
  `Fichier` longblob,
  `Statut` varchar(100) DEFAULT NULL,
  `Justif` varchar(100) DEFAULT NULL,
  `DateHeure_saisi` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Validation` tinyint(1) NOT NULL DEFAULT '0',
  `Rejet` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `id_user` int(11) NOT NULL,
  `Login` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id_user`, `Login`, `Password`, `role`) VALUES
(1, 'admin', 'root', 'administrateur'),
(2, 'assist1', 'DRPTM2', 'assistante'),
(3, 'assist2', 'DF', 'assistante'),
(4, 'assist3', 'DA', 'assistante'),
(5, 'assist4', 'DDS', 'assistante'),
(6, 'assist5', 'DPO', 'assistante'),
(7, 'assist6', 'DAIO', 'assistante'),
(8, 'assist7', 'DRH', 'assistante'),
(9, 'assist8', 'DSI', 'assistante'),
(10, 'assist9', 'DAJ', 'assistante');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `stagiaire`
--
ALTER TABLE `stagiaire`
  ADD PRIMARY KEY (`Num_dossier`);

--
-- Index pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `stagiaire`
--
ALTER TABLE `stagiaire`
  MODIFY `Num_dossier` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;
--
-- AUTO_INCREMENT pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
