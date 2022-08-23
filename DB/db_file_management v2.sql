-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 09, 2017 at 04:15 PM
-- Server version: 10.1.24-MariaDB
-- PHP Version: 7.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_file_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_file`
--

CREATE TABLE `tbl_file` (
  `File_ID` int(11) NOT NULL,
  `File_Name` varchar(40) NOT NULL,
  `File` mediumblob NOT NULL,
  `Folder_Parent` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL,
  `DateCreated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_folder`
--

CREATE TABLE `tbl_folder` (
  `Folder_ID` int(11) NOT NULL,
  `Folder_Name` varchar(40) NOT NULL,
  `Folder_Parent` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL,
  `DateCreated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_folder`
--

INSERT INTO `tbl_folder` (`Folder_ID`, `Folder_Name`, `Folder_Parent`, `User_ID`, `DateCreated`) VALUES
(172, 'Tesda', 0, 0, '2017-11-06 20:54:42'),
(175, 'Internal - Outgoing', 172, 0, '2017-11-06 22:40:32'),
(176, 'Internal - Incoming', 172, 0, '2017-11-06 23:07:49'),
(177, 'External - Incoming', 172, 0, '2017-11-06 23:08:05'),
(178, 'External - Outgoing', 172, 0, '2017-11-06 23:08:14'),
(179, 'CHED', 0, 0, '2017-11-06 23:08:48'),
(180, 'DepEd', 0, 0, '2017-11-06 23:09:36'),
(181, 'Internal - Incoming', 179, 0, '2017-11-06 23:11:34'),
(182, 'Internal - Outgoing', 179, 0, '2017-11-06 23:11:43'),
(183, 'External - Incoming', 179, 0, '2017-11-06 23:11:55'),
(184, 'External - Outgoing', 179, 0, '2017-11-06 23:12:01'),
(185, 'Memo', 183, 0, '2017-11-06 23:12:27'),
(186, 'Requirements', 183, 0, '2017-11-06 23:12:33'),
(187, 'Memo', 184, 0, '2017-11-06 23:12:38'),
(188, 'Requirements', 184, 0, '2017-11-06 23:12:43'),
(189, 'Memo', 181, 0, '2017-11-06 23:12:49'),
(190, 'Requirements', 181, 0, '2017-11-06 23:12:56'),
(191, 'Memo', 182, 0, '2017-11-06 23:13:11'),
(192, 'Requirements', 182, 0, '2017-11-06 23:14:09'),
(193, 'External - Incoming', 180, 0, '2017-11-06 23:11:55'),
(194, 'External - Outgoing', 180, 0, '2017-11-06 23:12:01'),
(195, 'Internal - Incoming', 180, 0, '2017-11-06 23:11:34'),
(196, 'Internal - Outgoing', 180, 0, '2017-11-06 23:11:43'),
(198, 'Memo', 193, 0, '2017-11-06 23:32:44'),
(199, 'Requirements', 193, 0, '2017-11-06 23:32:55'),
(200, 'Memo', 194, 0, '2017-11-06 23:33:01'),
(201, 'Requirements', 194, 0, '2017-11-06 23:33:03'),
(202, 'Memo', 195, 0, '2017-11-06 23:33:08'),
(203, 'Requirements', 195, 0, '2017-11-06 23:33:10'),
(204, 'Memo', 196, 0, '2017-11-06 23:33:16'),
(205, 'Requirements', 196, 0, '2017-11-06 23:33:18'),
(206, 'Memo', 177, 0, '2017-11-06 23:33:36'),
(207, 'Requirements', 177, 0, '2017-11-06 23:33:38'),
(208, 'Memo', 178, 0, '2017-11-06 23:33:42'),
(209, 'Requirements', 178, 0, '2017-11-06 23:33:44'),
(210, 'Memo', 176, 0, '2017-11-06 23:33:49'),
(211, 'Requirements', 176, 0, '2017-11-06 23:33:50'),
(212, 'Memo', 175, 0, '2017-11-06 23:33:57'),
(213, 'Requirements', 175, 0, '2017-11-06 23:33:59'),
(226, 'a', 0, 1, '2017-11-06 23:46:28'),
(227, 'b', 0, 1, '2017-11-06 23:46:30'),
(228, 'c', 0, 1, '2017-11-06 23:46:33'),
(229, 'd', 0, 1, '2017-11-06 23:46:34'),
(230, 'e', 0, 1, '2017-11-06 23:46:36'),
(231, 'f', 0, 1, '2017-11-06 23:46:38'),
(232, 'g', 0, 1, '2017-11-06 23:46:40'),
(233, 'h', 0, 1, '2017-11-06 23:46:42'),
(234, 'i', 0, 1, '2017-11-06 23:46:43'),
(235, 'j', 0, 1, '2017-11-06 23:46:46'),
(236, 'k', 0, 1, '2017-11-06 23:46:49'),
(237, 'l', 0, 1, '2017-11-06 23:46:52'),
(238, 'm', 0, 1, '2017-11-06 23:46:53'),
(239, 'n', 0, 1, '2017-11-06 23:46:54'),
(240, 'o', 0, 1, '2017-11-06 23:46:56'),
(241, 'p', 0, 1, '2017-11-06 23:46:57'),
(242, 'q', 0, 1, '2017-11-06 23:46:59'),
(243, 'r', 0, 1, '2017-11-06 23:47:03'),
(244, 's', 0, 1, '2017-11-06 23:47:04'),
(245, 't', 0, 1, '2017-11-06 23:47:05'),
(246, 'u', 0, 1, '2017-11-06 23:47:08'),
(247, 'v', 0, 1, '2017-11-06 23:47:11'),
(248, 'w', 0, 1, '2017-11-06 23:47:13'),
(249, 'x', 0, 1, '2017-11-06 23:47:14'),
(250, 'y', 0, 1, '2017-11-06 23:47:16'),
(251, 'z', 0, 1, '2017-11-06 23:47:17'),
(253, '1a', 0, 1, '2017-11-06 23:47:49'),
(254, '1b', 0, 1, '2017-11-06 23:47:53'),
(255, '1c', 0, 1, '2017-11-06 23:48:02'),
(256, '1d', 0, 1, '2017-11-06 23:48:06'),
(257, '1e', 0, 1, '2017-11-06 23:48:09'),
(258, '1f', 0, 1, '2017-11-06 23:48:11'),
(259, '1g', 0, 1, '2017-11-06 23:48:16'),
(260, '1h', 0, 1, '2017-11-06 23:48:18'),
(261, '1i', 0, 1, '2017-11-06 23:48:20'),
(262, '1j', 0, 1, '2017-11-06 23:48:22'),
(263, '1k', 0, 1, '2017-11-06 23:48:24'),
(264, '1l', 0, 1, '2017-11-06 23:48:26'),
(265, '1m', 0, 1, '2017-11-06 23:48:44'),
(266, '1n', 0, 1, '2017-11-06 23:48:47'),
(267, '1o', 0, 1, '2017-11-06 23:48:50'),
(268, '1p', 0, 1, '2017-11-06 23:48:52'),
(269, '1q', 0, 1, '2017-11-06 23:48:56'),
(270, '1r', 0, 1, '2017-11-06 23:48:59'),
(271, '1s', 0, 1, '2017-11-06 23:49:01'),
(272, '1t', 0, 1, '2017-11-06 23:49:03'),
(273, '1u', 0, 1, '2017-11-06 23:49:05'),
(274, '1v', 0, 1, '2017-11-06 23:49:07'),
(275, '1w', 0, 1, '2017-11-06 23:49:09'),
(276, '1x', 0, 1, '2017-11-06 23:49:11'),
(277, '1y', 0, 1, '2017-11-06 23:49:13'),
(278, '1z', 0, 1, '2017-11-06 23:49:15');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_recent`
--

CREATE TABLE `tbl_recent` (
  `Recent_ID` int(11) NOT NULL,
  `Folder_ID` int(11) NOT NULL,
  `File_ID` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL,
  `DateCreated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `User_ID` int(11) NOT NULL,
  `User_Name` varchar(20) NOT NULL,
  `User_Pass` varchar(20) NOT NULL,
  `Admin` tinyint(1) NOT NULL DEFAULT '0',
  `DateCreated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`User_ID`, `User_Name`, `User_Pass`, `Admin`, `DateCreated`) VALUES
(0, 'ralf', 'admin', 1, '2017-10-19 21:01:19'),
(1, 'ellaine', 'admin', 0, '2017-11-06 20:34:13');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_file`
--
ALTER TABLE `tbl_file`
  ADD PRIMARY KEY (`File_ID`);

--
-- Indexes for table `tbl_folder`
--
ALTER TABLE `tbl_folder`
  ADD PRIMARY KEY (`Folder_ID`);

--
-- Indexes for table `tbl_recent`
--
ALTER TABLE `tbl_recent`
  ADD PRIMARY KEY (`Recent_ID`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`User_ID`),
  ADD UNIQUE KEY `User_Name` (`User_Name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_file`
--
ALTER TABLE `tbl_file`
  MODIFY `File_ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbl_folder`
--
ALTER TABLE `tbl_folder`
  MODIFY `Folder_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=280;
--
-- AUTO_INCREMENT for table `tbl_recent`
--
ALTER TABLE `tbl_recent`
  MODIFY `Recent_ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `User_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
