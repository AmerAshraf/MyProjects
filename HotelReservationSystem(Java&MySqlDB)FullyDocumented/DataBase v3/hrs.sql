-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 16, 2018 at 02:42 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hrs`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `CUSTOMERACCOUNT` int(11) NOT NULL,
  `FIRSTNAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `LASTNAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `GENDER` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `NIC` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `TELEPHONE` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `EMAIL` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `REGISTRATION_DATE` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE `manager` (
  `MID` int(50) NOT NULL,
  `USERNAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `PASSWORD` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `GENDER` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `FIRSTNAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `LASTNAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `mealplan`
--

CREATE TABLE `mealplan` (
  `MEALTYPE` int(50) NOT NULL,
  `MEALPLANNAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `PRICE` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

CREATE TABLE `receptionist` (
  `RID` int(50) NOT NULL,
  `USERNAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `PASSWORD` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `GENDER` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `FIRSTNAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `LASTNAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `RESERVATIONID` int(50) NOT NULL,
  `CA` int(50) NOT NULL,
  `ROOMNO` int(50) NOT NULL,
  `TYPEOFMEAL` int(50) NOT NULL,
  `CUSTOMERREQUEST` int(50) NOT NULL,
  `DURATION` int(50) NOT NULL,
  `CHECKINDATE` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `ROOMNUMBER` int(50) NOT NULL,
  `ROOMLOCATION` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ROOMTYPE` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `roomtype`
--

CREATE TABLE `roomtype` (
  `ROOMTYPE` int(50) NOT NULL,
  `ROOMTYPENAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `PRICE` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`CUSTOMERACCOUNT`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`MID`);

--
-- Indexes for table `mealplan`
--
ALTER TABLE `mealplan`
  ADD PRIMARY KEY (`MEALTYPE`);

--
-- Indexes for table `receptionist`
--
ALTER TABLE `receptionist`
  ADD PRIMARY KEY (`RID`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`RESERVATIONID`),
  ADD KEY `FK_MT` (`TYPEOFMEAL`),
  ADD KEY `FK_ROOMNO` (`ROOMNO`),
  ADD KEY `FK_CA` (`CA`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`ROOMNUMBER`),
  ADD KEY `FK_RT` (`ROOMTYPE`);

--
-- Indexes for table `roomtype`
--
ALTER TABLE `roomtype`
  ADD PRIMARY KEY (`ROOMTYPE`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `CUSTOMERACCOUNT` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `manager`
--
ALTER TABLE `manager`
  MODIFY `MID` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mealplan`
--
ALTER TABLE `mealplan`
  MODIFY `MEALTYPE` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `receptionist`
--
ALTER TABLE `receptionist`
  MODIFY `RID` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `RESERVATIONID` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
  MODIFY `ROOMNUMBER` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `roomtype`
--
ALTER TABLE `roomtype`
  MODIFY `ROOMTYPE` int(50) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `FK_CA` FOREIGN KEY (`CA`) REFERENCES `customer` (`CUSTOMERACCOUNT`),
  ADD CONSTRAINT `FK_MT` FOREIGN KEY (`TYPEOFMEAL`) REFERENCES `mealplan` (`MEALTYPE`),
  ADD CONSTRAINT `FK_ROOMNO` FOREIGN KEY (`ROOMNO`) REFERENCES `room` (`ROOMNUMBER`);

--
-- Constraints for table `room`
--
ALTER TABLE `room`
  ADD CONSTRAINT `FK_RT` FOREIGN KEY (`ROOMTYPE`) REFERENCES `roomtype` (`ROOMTYPE`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
