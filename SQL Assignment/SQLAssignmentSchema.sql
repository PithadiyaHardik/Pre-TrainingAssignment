CREATE DATABASE  IF NOT EXISTS `employeedatabase` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `employeedatabase`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: employeedatabase
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `deptid` int NOT NULL,
  `location` varchar(50) DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  `managerid` int DEFAULT NULL,
  `since` date DEFAULT NULL,
  PRIMARY KEY (`deptid`),
  KEY `fk_manager` (`managerid`),
  CONSTRAINT `fk_manager` FOREIGN KEY (`managerid`) REFERENCES `employee` (`empid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1254,'Andheri','Finanace',1312,'2012-07-05'),(1287,'Andheri','Operations',2316,'2012-07-05'),(1289,'Andheri','Marketing',1256,'2012-07-05'),(8787,'Povai','Marketing',1312,'2015-04-05'),(9987,'Andheri','Sales',1888,'2012-07-05'),(56747,'Andheri','HR',1126,'2013-09-01');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dependent`
--

DROP TABLE IF EXISTS `dependent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dependent` (
  `dependentid` int NOT NULL AUTO_INCREMENT,
  `dname` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL DEFAULT 'other',
  `relationship` varchar(20) NOT NULL,
  `empid` int DEFAULT NULL,
  PRIMARY KEY (`dependentid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dependent`
--

LOCK TABLES `dependent` WRITE;
/*!40000 ALTER TABLE `dependent` DISABLE KEYS */;
INSERT INTO `dependent` VALUES (1,'Naresh','male','father',1126),(2,'Nehal','female','mother',1126),(3,'Suresh','male','father',1186),(4,'Ramesh','male','father',1256),(5,'Sneha','female','mother',1312),(6,'Vishal','male','faather',8976);
/*!40000 ALTER TABLE `dependent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `empid` int NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(200) NOT NULL,
  `dob` date NOT NULL,
  `dateofjoining` date NOT NULL,
  `gender` varchar(10) NOT NULL DEFAULT 'other',
  `mobileno` varchar(10) DEFAULT NULL,
  `deptid` int DEFAULT NULL,
  `salary` int NOT NULL,
  PRIMARY KEY (`empid`),
  UNIQUE KEY `mobileno` (`mobileno`),
  KEY `fk_department_employee` (`deptid`),
  KEY `empid_index` (`empid`),
  CONSTRAINT `fk_department_employee` FOREIGN KEY (`deptid`) REFERENCES `department` (`deptid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1126,'Devya','Ganga building,povai','1985-04-01','2010-03-02','female','6255857890',56747,950000),(1186,'Rani','Ganga building,povai','1980-04-01','2013-03-02','female','6255467890',1287,100000),(1256,'Raj','LDCV building ,near infinity mall,malad','2001-01-10','2010-03-02','male','1254167890',1289,100000),(1312,'Ramesh','MGMc building ,near infinity mall,malad','2001-01-20','2012-03-05','male','1234167890',1254,110000),(1888,'Reena','NKG building,Banglore','1981-01-10','2012-01-28','female','2264167890',9987,90000),(1986,'Rocky','Neela nivas,Hayderabad','1985-11-11','2009-04-02','male','1254177890',56747,50000),(2316,'Nilesh','Raheja tipco heights,dadar','1975-02-27','2011-08-12','male','1254152810',1287,450000),(2346,'Rahul','LDCV building ,near oberoi mall,goregaon','1997-01-10','2020-03-02','male','1226167890',9987,400000),(8976,'Leela','omkar altamonte,malad','1976-05-10','2012-03-02','female','1789416780',8787,750000);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employeework`
--

DROP TABLE IF EXISTS `employeework`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employeework` (
  `empid` int DEFAULT NULL,
  `projectid` int DEFAULT NULL,
  `hoursworked` int DEFAULT NULL,
  KEY `empid` (`empid`),
  KEY `projectid` (`projectid`),
  CONSTRAINT `employeework_ibfk_1` FOREIGN KEY (`empid`) REFERENCES `employee` (`empid`),
  CONSTRAINT `employeework_ibfk_2` FOREIGN KEY (`projectid`) REFERENCES `project` (`projectid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employeework`
--

LOCK TABLES `employeework` WRITE;
/*!40000 ALTER TABLE `employeework` DISABLE KEYS */;
INSERT INTO `employeework` VALUES (1126,6253,120),(1186,9081,200),(1256,9087,90),(1312,6253,100),(1126,6253,240),(2316,9087,400),(2346,7568,300),(1312,9081,380),(1888,6253,420),(1986,7568,160);
/*!40000 ALTER TABLE `employeework` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `male_employees`
--

DROP TABLE IF EXISTS `male_employees`;
/*!50001 DROP VIEW IF EXISTS `male_employees`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `male_employees` AS SELECT 
 1 AS `empid`,
 1 AS `name`,
 1 AS `address`,
 1 AS `dob`,
 1 AS `dateofjoining`,
 1 AS `gender`,
 1 AS `mobileno`,
 1 AS `deptid`,
 1 AS `salary`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project` (
  `projectid` int NOT NULL,
  `location` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `deptid` int DEFAULT NULL,
  PRIMARY KEY (`projectid`),
  KEY `fk_department_project` (`deptid`),
  CONSTRAINT `fk_department_project` FOREIGN KEY (`deptid`) REFERENCES `department` (`deptid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (6253,'Deterministic and Stochastic inventory models.','Andheri',1287),(7568,'Facebook analytics of product','powai',8787),(9081,'Analysis of Satisfaction Level of Employees','Andheri',56747),(9087,'Studying the Home Loans Indian Banks Offer','Andheri',1254);
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'employeedatabase'
--
/*!50003 DROP PROCEDURE IF EXISTS `GetCurrentAgeOfEmployees` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `GetCurrentAgeOfEmployees`()
BEGIN
   SELECT name, TIMESTAMPDIFF(year,employee.dob,curdate()) as age FROM  employee;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `GetEmployeesByDepartmentID` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `GetEmployeesByDepartmentID`(IN deptid int )
BEGIN
   SELECT * from employee where employee.deptid=deptid;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Final view structure for view `male_employees`
--

/*!50001 DROP VIEW IF EXISTS `male_employees`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `male_employees` AS select `employee`.`empid` AS `empid`,`employee`.`name` AS `name`,`employee`.`address` AS `address`,`employee`.`dob` AS `dob`,`employee`.`dateofjoining` AS `dateofjoining`,`employee`.`gender` AS `gender`,`employee`.`mobileno` AS `mobileno`,`employee`.`deptid` AS `deptid`,`employee`.`salary` AS `salary` from `employee` where (`employee`.`gender` = 'male') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-30 20:43:32
