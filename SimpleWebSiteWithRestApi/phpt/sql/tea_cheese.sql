-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 27, 2018 at 02:34 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tea_cheese`
--

-- --------------------------------------------------------

--
-- Table structure for table `bread`
--

CREATE TABLE `bread` (
  `breadno` int(11) NOT NULL,
  `breadpic` varchar(255) NOT NULL,
  `breadname` varchar(255) DEFAULT NULL,
  `breadprice` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bread`
--

INSERT INTO `bread` (`breadno`, `breadpic`, `breadname`, `breadprice`) VALUES
(1, 'img/1b.jpg', 'Regular fresh bread', '2$'),
(2, 'img/2b.jpg', 'The soft cocoa bread', '4$'),
(3, 'img/3b.jpg', 'Turkish bread', '3$');

-- --------------------------------------------------------

--
-- Table structure for table `cheese`
--

CREATE TABLE `cheese` (
  `cheeseno` int(11) NOT NULL,
  `cheesepic` varchar(255) NOT NULL,
  `cheesename` varchar(255) DEFAULT NULL,
  `cheeseprice` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cheese`
--

INSERT INTO `cheese` (`cheeseno`, `cheesepic`, `cheesename`, `cheeseprice`) VALUES
(1, 'img/1c.png', 'white cheese with mint', '7$'),
(2, 'img/2c.jpg', 'Roumi cheese', '9$'),
(3, 'img/3c.jpg', 'Cheddar cheese', '13$');

-- --------------------------------------------------------

--
-- Table structure for table `tea`
--

CREATE TABLE `tea` (
  `teano` int(11) NOT NULL,
  `teapic` varchar(255) NOT NULL,
  `teaname` varchar(255) DEFAULT NULL,
  `teaprice` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tea`
--

INSERT INTO `tea` (`teano`, `teapic`, `teaname`, `teaprice`) VALUES
(1, 'img/1t.png', 'Bedtime Bliss Herbal Supplement', '5$'),
(2, 'img/2t.png', 'Soothe Your Tummy Herbal Supplement', '7$'),
(3, 'img/3t.png', 'Daily Support Herbal Supplement with Green Tea', '9$');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userno` int(11) NOT NULL,
  `username` varchar(80) NOT NULL,
  `password` varchar(80) NOT NULL,
  `userrole` varchar(80) NOT NULL,
  `phone` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `gender` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userno`, `username`, `password`, `userrole`, `phone`, `email`, `gender`) VALUES
(1, 'Amer', '12345', 'Admin', '01010102376', 'amer-ashraf@outlook.com', 'Male'),
(2, 'Ahmed', '123456', 'Admin', '012345678', 'ahmedhesham66598@gmail.com', 'Male'),
(3, 'Ashraf', '123', 'customer', '11223344', 'ashrafashraf@outlook.com', 'Male'),
(4, 'Hesham', '1234', 'customer', '1122334466', 'hesham66598@gmail.com', 'Male'),
(8, 'teto', '12121212121212', 'customer', '01010101010', 'amer-ashraf@outlook.com', 'Male');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bread`
--
ALTER TABLE `bread`
  ADD PRIMARY KEY (`breadno`);

--
-- Indexes for table `cheese`
--
ALTER TABLE `cheese`
  ADD PRIMARY KEY (`cheeseno`);

--
-- Indexes for table `tea`
--
ALTER TABLE `tea`
  ADD PRIMARY KEY (`teano`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`userno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bread`
--
ALTER TABLE `bread`
  MODIFY `breadno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `cheese`
--
ALTER TABLE `cheese`
  MODIFY `cheeseno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tea`
--
ALTER TABLE `tea`
  MODIFY `teano` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `userno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
