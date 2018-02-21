-- MySQL dump 10.13  Distrib 5.7.18, for Win32 (AMD64)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	5.7.18-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `audience`
--

DROP TABLE IF EXISTS `audience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `audience` (
  `show_id` int(11) DEFAULT NULL,
  `booking_id` int(11) NOT NULL,
  `audience_name` varchar(255) DEFAULT NULL,
  `gender` varchar(7) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `email` text,
  `contact_no` int(25) DEFAULT NULL,
  `qrcode` longblob,
  PRIMARY KEY (`booking_id`),
  KEY `show_id` (`show_id`),
  CONSTRAINT `audience_ibfk_1` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`),
  CONSTRAINT `audience_ibfk_2` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`) ON DELETE CASCADE,
  CONSTRAINT `audience_ibfk_3` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`),
  CONSTRAINT `audience_ibfk_4` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`) ON DELETE CASCADE,
  CONSTRAINT `audience_ibfk_5` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `audience`
--

LOCK TABLES `audience` WRITE;
/*!40000 ALTER TABLE `audience` DISABLE KEYS */;
INSERT INTO `audience` VALUES (11,1,'a','Male','2014-11-11','a',9,'âPNG\r\n\Z\n\0\0\0\rIHDR\0\0\0d\0\0\0d\0\0\0ˇÄ\0\09IDATx\⁄\Ì\⁄1É0@˛ˇÈ§•b¿íåeVu¿aãs\Ê¯ô\€s Ä,X∞¿Ç,X`¡Ç\÷˘≤\ÿ\\\‹bâ∫\’a¡jçïuUP∂\Ó?√Ç\’\Î\Œ\”É)}uX∞`›º\·Ñ\’a¡ÇıT\r,Xì˜\–Yè\r÷ÆX¡F)=°v.ˇ`¡*:/zënv∫\÷Ù\Ã\ Jñ _1,XKaem∏≥^∂•!,X{`ª\„Ù#\’9)\÷RXAæ`E\’>\‡a¡*\∆\n&\‘\ÿˆb\Ïº¨Õ∞Íà≥\‘ˆ)ˇ`¡\ Ë™Ç\Ô\ÿ¡\r¨Õ∞&T]c4+f,X\≈XY_6§g\÷B\Â,XKb}¢œÇ´mfΩÚX∞Zc•∑WØ\”¿Ç\’\Î\›\Ô\‡\'˜À∞`-ÖıÕÅ,X∞,X∞`¡Çe`¡Ç,ÛD®mÆ{-V\0\0\0\0IENDÆB`Ç'),(11,1990,'parth','Male','1997-11-24','parth',7845,'âPNG\r\n\Z\n\0\0\0\rIHDR\0\0\0d\0\0\0d\0\0\0ˇÄ\0\0;IDATx\⁄\Ì\⁄AÉ0\0@ˇˇ\Èˆ⁄ì\”Hà.G´ç\Ÿ\ƒ\Î#˛é,X∞`¡ÇÖ\0,X∞`¡B\0,X∞~ã\≈\Õˇ‹¨ïæ:,X\œ¿\ zjk¡;√Çu\÷PÜ™ª2¥:,X∞*≤,X∞¶±Ü\ÍlX∞`m¨°µ;∞`\’Õ≥≤\ÍıWˇ`¡*:8\…\€Rª\”X∞ˆÂ¨πq∞µn]¡√ÇUì≥≤˙\ﬁ-|∞`çµr>ßÄ\Îh¨πW	éû∑\—`¡\ÍÜ5W Ø¨!Z\◊Y∞`uögeâoÜ\ÎD¨∫Ûï°†Æ\‡Ä\Î ¨Ùˆ;à^ë™`¡:+\Î|eN$¯,Xo∆™˚2˛Å9¨UX¡õK?]Ç´9Vqz\€\‹˙D\Z¨Û¨\‡&Éi¨£±\ﬁ∞`¡ÇñÄ,X∞,X∞`¡Ç%æC2\ZÑ\Ó¿Q\0\0\0\0IENDÆB`Ç');
/*!40000 ALTER TABLE `audience` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `employee_id` int(11) NOT NULL,
  `employee_name` varchar(255) DEFAULT NULL,
  `employee_contact` int(15) DEFAULT NULL,
  `employee_address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (11,'abc',78755,'pune');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `engaged`
--

DROP TABLE IF EXISTS `engaged`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `engaged` (
  `engaged_id` int(11) NOT NULL,
  `show_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`engaged_id`),
  KEY `show_id` (`show_id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `engaged_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`),
  CONSTRAINT `engaged_ibfk_2` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`),
  CONSTRAINT `engaged_ibfk_3` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`) ON DELETE CASCADE,
  CONSTRAINT `engaged_ibfk_4` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`),
  CONSTRAINT `engaged_ibfk_5` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`) ON DELETE CASCADE,
  CONSTRAINT `engaged_ibfk_6` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`) ON DELETE CASCADE,
  CONSTRAINT `engaged_ibfk_7` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `engaged`
--

LOCK TABLES `engaged` WRITE;
/*!40000 ALTER TABLE `engaged` DISABLE KEYS */;
/*!40000 ALTER TABLE `engaged` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event` (
  `event_id` int(11) NOT NULL,
  `event_name` varchar(255) DEFAULT NULL,
  `event_loction` varchar(255) DEFAULT NULL,
  `event_description` text,
  `event_date` date DEFAULT NULL,
  PRIMARY KEY (`event_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
INSERT INTO `event` VALUES (1,'techtonic1','scoe','technical event','2017-09-27');
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `id` varchar(25) NOT NULL,
  `pass` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('dhyey','34939'),('dhyey1','34939'),('meen','meen123'),('parth2411','7061727468');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `performer`
--

DROP TABLE IF EXISTS `performer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `performer` (
  `performer_id` int(11) NOT NULL,
  `show_id` int(11) DEFAULT NULL,
  `performer_name` varchar(255) DEFAULT NULL,
  `contact_details` int(15) DEFAULT NULL,
  `performer_address` varchar(255) DEFAULT NULL,
  `genre` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`performer_id`),
  KEY `show_id` (`show_id`),
  CONSTRAINT `performer_ibfk_1` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`),
  CONSTRAINT `performer_ibfk_2` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`) ON DELETE CASCADE,
  CONSTRAINT `performer_ibfk_3` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`),
  CONSTRAINT `performer_ibfk_4` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`) ON DELETE CASCADE,
  CONSTRAINT `performer_ibfk_5` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `performer`
--

LOCK TABLES `performer` WRITE;
/*!40000 ALTER TABLE `performer` DISABLE KEYS */;
/*!40000 ALTER TABLE `performer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registeration`
--

DROP TABLE IF EXISTS `registeration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registeration` (
  `name` varchar(255) DEFAULT NULL,
  `mobile_no` int(15) NOT NULL,
  `email` text,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`mobile_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registeration`
--

LOCK TABLES `registeration` WRITE;
/*!40000 ALTER TABLE `registeration` DISABLE KEYS */;
INSERT INTO `registeration` VALUES ('meen patel',78945,'mp3009','kutchh'),('parth bhalodiya',789456,'parth.bhalodiya','pune');
/*!40000 ALTER TABLE `registeration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `required`
--

DROP TABLE IF EXISTS `required`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `required` (
  `required_id` int(11) NOT NULL,
  `show_id` int(11) DEFAULT NULL,
  `equipment_name` varchar(255) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`required_id`),
  KEY `show_id` (`show_id`),
  CONSTRAINT `required_ibfk_1` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`),
  CONSTRAINT `required_ibfk_2` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`) ON DELETE CASCADE,
  CONSTRAINT `required_ibfk_3` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`),
  CONSTRAINT `required_ibfk_4` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`) ON DELETE CASCADE,
  CONSTRAINT `required_ibfk_5` FOREIGN KEY (`show_id`) REFERENCES `shows` (`show_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `required`
--

LOCK TABLES `required` WRITE;
/*!40000 ALTER TABLE `required` DISABLE KEYS */;
/*!40000 ALTER TABLE `required` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  `employee_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`role_id`),
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `role_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`),
  CONSTRAINT `role_ibfk_2` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shows`
--

DROP TABLE IF EXISTS `shows`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shows` (
  `show_id` int(11) NOT NULL,
  `show_name` varchar(255) DEFAULT NULL,
  `start_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `end_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `event_id` int(11) DEFAULT NULL,
  `cost` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`show_id`),
  KEY `event_id` (`event_id`),
  CONSTRAINT `shows_ibfk_1` FOREIGN KEY (`event_id`) REFERENCES `event` (`event_id`),
  CONSTRAINT `shows_ibfk_2` FOREIGN KEY (`event_id`) REFERENCES `event` (`event_id`) ON DELETE CASCADE,
  CONSTRAINT `shows_ibfk_3` FOREIGN KEY (`event_id`) REFERENCES `event` (`event_id`),
  CONSTRAINT `shows_ibfk_4` FOREIGN KEY (`event_id`) REFERENCES `event` (`event_id`) ON DELETE CASCADE,
  CONSTRAINT `shows_ibfk_5` FOREIGN KEY (`event_id`) REFERENCES `event` (`event_id`) ON DELETE CASCADE,
  CONSTRAINT `shows_ibfk_6` FOREIGN KEY (`event_id`) REFERENCES `event` (`event_id`),
  CONSTRAINT `shows_ibfk_7` FOREIGN KEY (`event_id`) REFERENCES `event` (`event_id`),
  CONSTRAINT `shows_ibfk_8` FOREIGN KEY (`event_id`) REFERENCES `event` (`event_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shows`
--

LOCK TABLES `shows` WRITE;
/*!40000 ALTER TABLE `shows` DISABLE KEYS */;
INSERT INTO `shows` VALUES (11,'a','2017-01-27 05:00:00','2017-01-27 07:00:00',1,2500.00);
/*!40000 ALTER TABLE `shows` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-03  2:32:11
