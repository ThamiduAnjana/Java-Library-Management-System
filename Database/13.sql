/*
SQLyog Enterprise - MySQL GUI v7.02 
MySQL - 5.0.45-community-nt : Database - librarymanagementsystemdatabase
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`librarymanagementsystemdatabase` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `librarymanagementsystemdatabase`;

/*Table structure for table `applicationtheme` */

DROP TABLE IF EXISTS `applicationtheme`;

CREATE TABLE `applicationtheme` (
  `ID` int(11) NOT NULL auto_increment,
  `Theme_Name` varchar(255) NOT NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `applicationtheme` */

insert  into `applicationtheme`(`ID`,`Theme_Name`) values (1,'AcrylLookAndFeel  ');

/*Table structure for table `audit_tb` */

DROP TABLE IF EXISTS `audit_tb`;

CREATE TABLE `audit_tb` (
  `Audit_Id` int(100) NOT NULL auto_increment,
  `User_Id` int(100) default NULL,
  `User_Name` varchar(50) default NULL,
  `Date` varchar(50) default NULL,
  `Status` varchar(100) default NULL,
  PRIMARY KEY  (`Audit_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=311 DEFAULT CHARSET=latin1;

/*Data for the table `audit_tb` */

insert  into `audit_tb`(`Audit_Id`,`User_Id`,`User_Name`,`Date`,`Status`) values (12,1,'Admin','Jun 26, 2017 / 11:37:44','Logged in...'),(13,1,'Admin','Jun 26, 2017 / 11:38:27','Add New Customer...'),(22,1,'admin','Jun 26, 2017 / 05:49:31','Logged in...'),(23,1,'admin','Jun 26, 2017 / 05:49:45','Logged Out...'),(24,3,'Thamidu','Jun 26, 2017 / 09:35:27','Logged in...'),(25,3,'Thamidu','Jun 26, 2017 / 09:37:11','Add New Customer...'),(26,3,'Thamidu','Jun 26, 2017 / 09:37:41','Logged Out...'),(27,1,'admin','Jun 26, 2017 / 09:42:38','Logged in...'),(28,4,'asd','Jun 26, 2017 / 10:00:47','Logged in...'),(30,3,'Thamidu','Jun 27, 2017 / 03:30:10','Logged in...'),(31,3,'Thamidu','Jun 27, 2017 / 03:31:37','Logged Out...'),(32,3,'thamidu','Jun 27, 2017 / 08:29:20','Logged in...'),(33,3,'thamidu','Jun 27, 2017 / 08:31:21','Add New Customer...'),(34,1,'Admin','Jun 27, 2017 / 09:24:08','Logged in...'),(35,1,'Admin','Jun 27, 2017 / 09:25:43','Add New Book...'),(36,1,'Admin','Jun 27, 2017 / 09:25:46','Logged Out...'),(37,3,'Thamidu','Jun 28, 2017 / 07:49:33','Logged in...'),(38,1,'Admin','Jul 12, 2017 / 10:26:20','Logged in...'),(39,1,'Admin','Jul 12, 2017 / 10:28:15','Logged Out...'),(40,1,'Admin','Jul 13, 2017 / 01:56:52','Logged in...'),(41,1,'admin','Jul 13, 2017 / 02:04:57','Logged in...'),(42,1,'admin','Jul 13, 2017 / 02:15:43','Logged in...'),(45,1,'admin','Jul 13, 2017 / 02:19:38','Logged in...'),(46,1,'admin','Jul 13, 2017 / 02:22:42','Logged in...'),(47,1,'Admin','Jul 13, 2017 / 06:39:39','Logged in...'),(48,1,'Admin','Jul 13, 2017 / 06:42:35','Logged in...'),(49,1,'Admin','Jul 13, 2017 / 06:42:59','Logged Out...'),(50,1,'Admin','Jul 13, 2017 / 07:16:36','Logged in...'),(51,1,'Admin','Jul 13, 2017 / 09:09:07','Logged in...'),(52,1,'Admin','Jul 14, 2017 / 10:41:11','Logged in...'),(53,1,'Admin','Jul 14, 2017 / 10:47:46','Logged Out...'),(54,1,'Admin','Jul 14, 2017 / 11:20:42','Logged in...'),(55,1,'Admin','Jul 14, 2017 / 11:27:45','Logged Out...'),(56,0,'null','Jul 14, 2017 / 02:21:03','Book Issued...'),(57,0,'null','Jul 14, 2017 / 03:13:54','Add New Book...'),(58,0,'null','Jul 14, 2017 / 03:16:53','Add New Book...'),(59,0,'null','Jul 14, 2017 / 03:18:21','Add New Book...'),(60,0,'null','Jul 14, 2017 / 03:21:08','Add New Book...'),(61,0,'null','Jul 14, 2017 / 03:22:33','Book Issued...'),(62,0,'null','Jul 14, 2017 / 03:48:01','Logged Out...'),(63,1,'Admin','Jul 14, 2017 / 05:19:48','Logged in...'),(64,1,'Admin','Jul 14, 2017 / 05:21:48','Book Issued...'),(65,1,'Admin','Jul 14, 2017 / 05:35:56','Logged in...'),(66,1,'Admin','Jul 14, 2017 / 05:37:59','Logged Out...'),(67,1,'Admin','Jul 14, 2017 / 07:37:21','Logged in...'),(68,1,'Admin','Jul 14, 2017 / 07:47:55','Logged in...'),(69,1,'Admin','Jul 14, 2017 / 07:50:36','Add New Book...'),(70,1,'Admin','Jul 14, 2017 / 08:27:49','Add New Book...'),(71,1,'Admin','Jul 14, 2017 / 08:39:55','Add New Book...'),(72,1,'Admin','Jul 14, 2017 / 08:47:13','Add New Book...'),(73,1,'Admin','Jul 14, 2017 / 09:01:53','Add New Book...'),(74,1,'Admin','Jul 14, 2017 / 09:10:46','Add New Book...'),(75,1,'Admin','Jul 14, 2017 / 09:21:02','Add New Book...'),(76,1,'Admin','Jul 14, 2017 / 09:22:24','Logged Out...'),(77,1,'Admin','Jul 14, 2017 / 09:23:10','Logged in...'),(78,1,'Admin','Jul 14, 2017 / 09:28:03','Logged Out...'),(79,1,'Admin','Jul 17, 2017 / 09:39:48','Logged in...'),(80,1,'Admin','Jul 17, 2017 / 09:42:37','Logged Out...'),(81,0,'null','Jul 17, 2017 / 09:21:08','Create New Account...'),(82,7,'ABC','Jul 17, 2017 / 09:21:25','Logged in...'),(83,7,'ABC','Jul 17, 2017 / 09:21:29','Logged Out...'),(84,0,'null','Jul 18, 2017 / 08:17:41','Create New Account...'),(85,0,'null','Jul 18, 2017 / 08:28:08','Create New Account...'),(86,0,'asd','Jul 18, 2017 / 08:30:06','Create New Account...'),(88,0,'null','Jul 18, 2017 / 09:25:43','Book Issued...'),(89,0,'null','Jul 18, 2017 / 10:08:07','Book Issued...'),(90,0,'null','Jul 18, 2017 / 10:55:34','Book Accepted...'),(91,0,'null','Jul 18, 2017 / 10:56:36','Book Accepted...'),(92,0,'null','Jul 18, 2017 / 10:59:45','Book Issued...'),(93,0,'null','Jul 18, 2017 / 11:00:03','Book Accepted...'),(94,1,'Admin','Jul 18, 2017 / 11:03:10','Logged in...'),(95,1,'Admin','Jul 18, 2017 / 11:03:28','Book Issued...'),(96,1,'Admin','Jul 18, 2017 / 11:04:49','Book Accepted...'),(97,1,'Admin','Jul 18, 2017 / 11:05:09','Book Issued...'),(98,1,'Admin','Jul 18, 2017 / 11:05:59','Logged Out...'),(99,0,'null','Jul 18, 2017 / 11:12:06','Book Accepted...'),(100,1,'Admin','Jul 18, 2017 / 11:14:48','Logged in...'),(101,1,'Admin','Jul 18, 2017 / 11:22:06','Logged in...'),(102,1,'Admin','Jul 18, 2017 / 11:23:00','Logged Out...'),(103,1,'Admin','Jul 18, 2017 / 11:23:11','Logged in...'),(104,1,'Admin','Jul 18, 2017 / 11:23:15','Logged Out...'),(105,1,'Admin','Jul 18, 2017 / 11:23:37','Logged in...'),(106,1,'Admin','Jul 18, 2017 / 11:27:00','Logged Out...'),(107,1,'sunil perera','Jul 18, 2017 / 11:27:41','Create New Account...'),(108,12,'sunil perera','Jul 18, 2017 / 11:27:56','Logged in...'),(109,12,'sunil perera','Jul 18, 2017 / 11:29:07','Logged Out...'),(110,0,'Amal','Jul 18, 2017 / 11:55:32','Create New Account...'),(111,0,'null','Jul 18, 2017 / 12:24:47','sunil perera-Chenge Password...'),(112,0,'null','Jul 18, 2017 / 12:27:39','sunil perera-Chenge Password...'),(113,12,'sunil perera','Jul 18, 2017 / 12:28:02','Logged in...'),(114,0,'null','Jul 18, 2017 / 12:47:18','Droped Account...'),(115,0,'null','Jul 18, 2017 / 12:49:50','asd-Droped Account...'),(116,1,'Admin','Jul 18, 2017 / 12:50:50','Logged in...'),(117,1,'Admin','Jul 18, 2017 / 12:51:14','Logged Out...'),(118,1,'Admin','Jul 18, 2017 / 01:01:48','Logged in...'),(119,1,'Admin','Jul 18, 2017 / 01:02:17','Book Issued...'),(120,1,'Admin','Jul 18, 2017 / 01:02:46','Book Accepted...'),(121,1,'Admin','Jul 18, 2017 / 04:45:27','Logged in...'),(122,1,'Admin','Jul 18, 2017 / 04:45:59','Logged Out...'),(123,1,'Admin','Jul 18, 2017 / 05:57:41','Logged in...'),(124,0,'null','Jul 18, 2017 / 10:00:07','Customer Update...'),(125,0,'null','Jul 18, 2017 / 10:07:56','Customer Deleted...'),(126,0,'null','Jul 18, 2017 / 10:15:59','Customer Deleted...'),(127,0,'null','Jul 18, 2017 / 10:16:09','Customer Updated...'),(128,0,'null','Jul 18, 2017 / 10:56:37','Book Updated...'),(129,1,'Admin','Jul 18, 2017 / 10:57:33','Logged in...'),(130,1,'Admin','Jul 18, 2017 / 10:58:18','Add New Book...'),(131,1,'Admin','Jul 18, 2017 / 10:58:33','Book Deleted...'),(132,1,'Admin','Jul 18, 2017 / 11:04:40','Logged Out...'),(133,0,'abc','Jul 19, 2017 / 04:51:41','Using forget password...'),(134,1,'Admin','Jul 19, 2017 / 05:03:09','Logged in...'),(135,1,'Admin','Jul 19, 2017 / 05:04:16','Logged Out...'),(136,1,'Admin','Jul 19, 2017 / 05:05:11','Logged in...'),(137,1,'Admin','Jul 19, 2017 / 05:09:13','Logged Out...'),(138,0,'null','Jul 19, 2017 / 05:22:57','Logged Out...'),(139,1,'Admin','Jul 19, 2017 / 05:23:11','Logged in...'),(140,1,'Admin','Jul 19, 2017 / 05:23:13','Logged Out...'),(141,0,'null','Jul 19, 2017 / 05:24:27','Logged Out...'),(142,0,'null','Jul 19, 2017 / 05:26:36','Logged Out...'),(143,0,'null','Jul 19, 2017 / 05:28:23','Logged Out...'),(144,0,'null','Jul 19, 2017 / 05:30:47','Logged Out...'),(145,1,'Admin','Jul 19, 2017 / 05:43:18','Logged in...'),(146,1,'Admin','Jul 19, 2017 / 05:43:41','Logged Out...'),(147,1,'Admin','Jul 19, 2017 / 05:48:34','Logged in...'),(148,1,'Admin','Jul 19, 2017 / 08:00:46','Logged in...'),(149,1,'Admin','Jul 19, 2017 / 08:07:37','Logged Out...'),(150,1,'Admin','Jul 19, 2017 / 08:09:31','Logged in...'),(151,1,'Admin','Jul 19, 2017 / 08:14:32','Add New Book...'),(152,1,'Admin','Jul 19, 2017 / 08:17:58','Add New Book...'),(153,1,'Admin','Jul 19, 2017 / 08:21:37','Logged Out...'),(154,1,'Admin','Jul 19, 2017 / 08:23:18','Logged in...'),(155,1,'Admin','Jul 19, 2017 / 08:25:40','Add New Customer...'),(156,1,'Admin','Jul 19, 2017 / 08:27:41','Customer Updated...'),(157,1,'Admin','Jul 19, 2017 / 08:28:37','Book Issued...'),(158,1,'Sachini','Jul 19, 2017 / 08:30:02','Create New Account...'),(159,1,'Admin','Jul 19, 2017 / 08:31:13','Logged Out...'),(160,2,'Sachini','Jul 19, 2017 / 08:31:55','Logged in...'),(161,2,'Sachini','Jul 19, 2017 / 08:32:45','Logged Out...'),(162,0,'null','Jul 20, 2017 / 01:02:16','Book Accepted...'),(163,1,'Admin','Jul 20, 2017 / 03:55:15','Logged in...'),(164,1,'Admin','Jul 20, 2017 / 03:57:24','Logged Out...'),(165,1,'Admin','Jul 20, 2017 / 04:01:56','Logged in...'),(166,1,'Admin','Jul 20, 2017 / 04:04:10','Logged Out...'),(167,0,'null','Jul 20, 2017 / 04:09:00','Logged Out...'),(168,1,'Administrator','Jul 20, 2017 / 04:12:32','Logged in...'),(169,1,'Administrator','Jul 20, 2017 / 04:12:47','Logged Out...'),(170,1,'Administrator','Jul 20, 2017 / 04:18:20','Logged in...'),(171,1,'Administrator','Jul 20, 2017 / 04:19:15','Logged Out...'),(172,1,'Administrator','Jul 20, 2017 / 04:19:50','Logged in...'),(173,1,'Administrator','Jul 20, 2017 / 04:20:47','Logged in...'),(174,1,'Administrator','Jul 20, 2017 / 04:24:12','Logged in...'),(175,1,'Administrator','Jul 20, 2017 / 04:25:06','Logged in...'),(176,1,'Administrator','Jul 20, 2017 / 04:28:01','Logged in...'),(177,1,'Administrator','Jul 20, 2017 / 04:35:53','Logged in...'),(178,1,'Administrator','Jul 20, 2017 / 04:35:57','Logged Out...'),(179,1,'ABC','Jul 20, 2017 / 04:36:33','Create New Account...'),(180,16,'ABC','Jul 20, 2017 / 04:36:46','Logged in...'),(181,16,'abc','Jul 20, 2017 / 04:52:00','Logged in...'),(182,16,'abc','Jul 20, 2017 / 04:52:10','Logged Out...'),(183,1,'Administrator','Jul 20, 2017 / 04:52:29','Logged in...'),(184,1,'Administrator','Jul 20, 2017 / 04:52:43','Logged Out...'),(185,16,'ABC','Jul 20, 2017 / 04:58:44','Logged in...'),(186,16,'ABC','Jul 20, 2017 / 04:59:00','Logged Out...'),(187,1,'Administrator','Jul 20, 2017 / 04:59:18','Logged in...'),(188,1,'Administrator','Jul 20, 2017 / 06:01:58','Logged in...'),(189,16,'Abc','Jul 20, 2017 / 06:03:47','Logged in...'),(190,16,'Abc','Jul 20, 2017 / 06:04:18','Logged Out...'),(191,16,'Abc','Jul 20, 2017 / 06:05:50','Logged in...'),(192,16,'Abc','Jul 20, 2017 / 06:06:24','Logged Out...'),(193,1,'Administrator','Jul 20, 2017 / 06:28:00','Logged in...'),(194,1,'Administrator','Jul 20, 2017 / 06:29:16','Logged Out...'),(195,1,'Administrator','Jul 20, 2017 / 09:15:59','Logged in...'),(196,1,'Administrator','Jul 20, 2017 / 09:16:50','Logged Out...'),(197,1,'Administrator','Jul 20, 2017 / 09:17:55','Logged in...'),(198,1,'Administrator','Jul 20, 2017 / 09:18:00','Logged Out...'),(199,1,'Administrator','Jul 21, 2017 / 08:59:04','Logged in...'),(200,1,'Administrator','Jul 21, 2017 / 08:59:06','Logged Out...'),(201,1,'Administrator','Jul 21, 2017 / 09:04:59','Logged in...'),(202,1,'Administrator','Jul 21, 2017 / 09:05:32','Logged Out...'),(203,0,'null','Jul 21, 2017 / 10:05:39','Book Issued...'),(204,0,'null','Jul 21, 2017 / 10:08:38','Book Issued...'),(205,0,'null','Jul 21, 2017 / 10:29:19','Book Issued...'),(206,0,'null','Jul 21, 2017 / 10:30:10','Book Accepted...'),(207,0,'null','Jul 21, 2017 / 10:30:44','Book Issued...'),(208,0,'null','Jul 21, 2017 / 10:37:16','Book Accepted...'),(209,0,'null','Jul 21, 2017 / 10:38:41','Book Issued...'),(210,0,'null','Jul 21, 2017 / 10:38:54','Book Accepted...'),(211,0,'null','Jul 21, 2017 / 10:45:26','Book Issued...'),(212,0,'null','Jul 21, 2017 / 11:03:17','Book Accepted...'),(213,0,'null','Jul 21, 2017 / 11:05:50','Book Issued...'),(214,0,'null','Jul 21, 2017 / 11:59:07','Add New Customer...'),(215,0,'null','Jul 21, 2017 / 12:02:33','Add New Customer...'),(216,0,'null','Jul 21, 2017 / 12:03:05','Add New Customer...'),(217,0,'null','Jul 21, 2017 / 12:07:46','Add New Customer...'),(218,0,'null','Jul 21, 2017 / 12:09:33','Add New Book...'),(219,0,'null','Jul 21, 2017 / 12:09:59','Add New Book...'),(220,0,'null','Jul 21, 2017 / 12:11:51','Add New Book...'),(221,0,'null','Jul 21, 2017 / 12:33:41','Add New Customer...'),(222,0,'null','Jul 21, 2017 / 12:39:44','Add New Customer...'),(223,0,'null','Jul 21, 2017 / 01:10:22','Add New Customer...'),(224,0,'null','Jul 21, 2017 / 01:19:42','Add New Customer...'),(225,0,'null','Jul 21, 2017 / 01:22:01','Add New Customer...'),(226,0,'null','Jul 21, 2017 / 01:25:35','Add New Customer...'),(227,0,'null','Jul 21, 2017 / 01:35:22','Add New Customer...'),(228,0,'null','Jul 21, 2017 / 01:43:50','Add New Customer...'),(229,0,'null','Jul 21, 2017 / 01:46:32','Add New Customer...'),(230,0,'null','Jul 21, 2017 / 02:01:56','Add New Customer...'),(231,0,'null','Jul 21, 2017 / 02:28:08','Customer Updated...'),(232,3,'abc','Jul 21, 2017 / 05:21:19','Logged in...'),(233,3,'abc','Jul 21, 2017 / 05:23:21','Logged Out...'),(234,1,'Administrator','Jul 21, 2017 / 07:11:03','Logged in...'),(235,1,'Administrator','Jul 21, 2017 / 07:11:29','Book Accepted...'),(236,1,'Administrator','Jul 21, 2017 / 07:18:45','Book Issued...'),(237,1,'Administrator','Jul 21, 2017 / 07:19:52','Book Accepted...'),(238,1,'Administrator','Jul 21, 2017 / 07:20:18','Book Accepted...'),(239,1,'Administrator','Jul 21, 2017 / 07:20:44','Book Accepted...'),(240,1,'Administrator','Jul 21, 2017 / 07:20:58','Logged Out...'),(241,0,'null','Jul 21, 2017 / 07:24:18','Book Accepted...'),(242,0,'null','Jul 21, 2017 / 07:26:59','Book Accepted...'),(243,3,'ABC','Jul 21, 2017 / 08:41:58','Logged in...'),(244,3,'ABC','Jul 21, 2017 / 08:42:28','Book Issued...'),(245,3,'ABC','Jul 21, 2017 / 08:43:00','Book Accepted...'),(246,3,'ABC','Jul 21, 2017 / 08:43:18','Book Issued...'),(247,3,'ABC','Jul 21, 2017 / 08:43:21','Logged Out...'),(248,1,'Administrator','Jul 21, 2017 / 08:43:35','Logged in...'),(249,1,'Administrator','Jul 21, 2017 / 08:43:53','Book Accepted...'),(250,1,'Administrator','Jul 21, 2017 / 08:44:35','Logged Out...'),(251,1,'Administrator','Jul 22, 2017 / 01:06:32','Logged in...'),(252,1,'Administrator','Jul 22, 2017 / 01:08:16','Book Issued...'),(253,1,'Administrator','Jul 22, 2017 / 01:08:34','Book Accepted...'),(254,1,'Administrator','Jul 22, 2017 / 01:09:04','Logged Out...'),(255,1,'Administrator','Jul 23, 2017 / 08:52:00','Logged in...'),(256,1,'Administrator','Jul 23, 2017 / 08:53:19','Add New Customer...'),(257,1,'Administrator','Jul 23, 2017 / 08:55:06','Book Issued...'),(258,1,'Administrator','Jul 23, 2017 / 08:55:45','Logged Out...'),(259,1,'Administrator','Jul 23, 2017 / 09:23:15','Logged in...'),(260,1,'Administrator','Jul 23, 2017 / 09:24:37','Logged Out...'),(261,1,'Administrator','Jul 23, 2017 / 09:27:23','Logged in...'),(262,1,'Administrator','Jul 23, 2017 / 09:33:33','Logged Out...'),(263,1,'Administrator','Jul 23, 2017 / 09:45:05','Logged in...'),(264,1,'Administrator','Jul 23, 2017 / 09:54:20','Logged Out...'),(265,1,'Administrator','Jul 27, 2017 / 08:46:07','Logged in...'),(266,1,'Administrator','Jul 27, 2017 / 08:49:48','Logged Out...'),(267,1,'Administrator','Jul 28, 2017 / 09:39:32','Logged in...'),(268,1,'Administrator','Jul 28, 2017 / 09:41:25','Logged Out...'),(269,1,'Administrator','Aug 1, 2017 / 02:22:51','Logged in...'),(270,1,'Administrator','Aug 1, 2017 / 02:23:21','Logged Out...'),(271,1,'Administrator','Aug 10, 2017 / 01:39:41','Logged in...'),(272,1,'Administrator','Aug 10, 2017 / 01:40:36','Logged Out...'),(273,1,'Administrator','Aug 10, 2017 / 01:41:41','Logged in...'),(274,1,'Administrator','Aug 10, 2017 / 01:41:51','Book Issued...'),(275,1,'Administrator','Aug 10, 2017 / 01:42:05','Book Accepted...'),(276,1,'Administrator','Aug 10, 2017 / 08:07:19','Logged in...'),(277,1,'Administrator','Aug 10, 2017 / 08:07:48','Logged Out...'),(278,1,'Administrator','Aug 10, 2017 / 08:29:30','Logged in...'),(279,1,'Administrator','Aug 10, 2017 / 08:30:00','Logged Out...'),(280,1,'Administrator','Aug 13, 2017 / 08:29:32','Logged in...'),(281,0,'null','Aug 13, 2017 / 10:47:22','Logged Out...'),(282,1,'Administrator','Aug 14, 2017 / 07:17:43','Logged in...'),(283,1,'Administrator','Aug 14, 2017 / 07:18:50','Logged Out...'),(284,1,'Administrator','Aug 28, 2017 / 11:23:06','Logged in...'),(285,1,'Administrator','Aug 28, 2017 / 11:28:39','Logged Out...'),(286,0,'abc','Oct 2, 2017 / 08:39:28','Create New Account...'),(287,4,'Abc','Oct 2, 2017 / 08:39:38','Logged in...'),(288,4,'Abc','Oct 2, 2017 / 08:43:33','Logged Out...'),(289,4,'Abc','Oct 3, 2017 / 12:44:53','Logged in...'),(290,4,'Abc','Oct 3, 2017 / 12:47:31','Logged Out...'),(291,3,'abc','Nov 18, 2017 / 02:39:24','Logged in...'),(292,3,'abc','Nov 18, 2017 / 02:40:17','Logged Out...'),(293,0,'abc','Dec 11, 2017 / 12:03:54','Create New Account...'),(294,3,'abc','Dec 11, 2017 / 12:04:04','Logged in...'),(295,3,'abc','Dec 11, 2017 / 12:09:10','Logged Out...'),(296,3,'abc','Dec 11, 2017 / 12:11:27','Logged in...'),(297,3,'abc','Dec 11, 2017 / 12:13:35','Logged Out...'),(298,3,'abc','Dec 11, 2017 / 12:15:51','Logged in...'),(299,3,'abc','Dec 11, 2017 / 12:27:33','Logged Out...'),(300,0,'chamila','Dec 11, 2017 / 01:42:30','Create New Account...'),(301,6,'chamila','Dec 11, 2017 / 01:42:45','Logged in...'),(302,6,'chamila','Dec 11, 2017 / 01:46:44','Book Issued...'),(303,6,'chamila','Dec 11, 2017 / 04:06:33','Logged Out...'),(304,3,'abc','Dec 11, 2017 / 04:33:55','Logged in...'),(305,3,'abc','Dec 11, 2017 / 04:35:14','Book Accepted...'),(306,3,'abc','Dec 11, 2017 / 04:39:45','Logged Out...'),(307,3,'abc','Jan 3, 2018 / 12:19:17','Logged in...'),(308,3,'abc','Jan 3, 2018 / 12:19:43','Logged Out...'),(309,3,'abc','Jan 3, 2018 / 12:22:44','Logged in...'),(310,3,'abc','Jan 3, 2018 / 12:22:48','Logged Out...');

/*Table structure for table `books_keeping` */

DROP TABLE IF EXISTS `books_keeping`;

CREATE TABLE `books_keeping` (
  `keeping_id` int(255) NOT NULL auto_increment,
  `customer_id` int(100) NOT NULL,
  `book_id` int(100) NOT NULL,
  `starting_date` date NOT NULL,
  `due_date` date NOT NULL,
  `issue` varchar(20) NOT NULL default '',
  `issued_user` varchar(50) NOT NULL default '',
  `Accepting_user` varchar(50) default NULL,
  PRIMARY KEY  (`keeping_id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;

/*Data for the table `books_keeping` */

insert  into `books_keeping`(`keeping_id`,`customer_id`,`book_id`,`starting_date`,`due_date`,`issue`,`issued_user`,`Accepting_user`) values (1,1,1,'2017-07-21','2017-07-31','Accepted','',NULL),(17,1,1,'2017-07-21','2017-07-31','Accepted','null',NULL),(18,2,5,'2017-07-21','2017-07-31','Accepted','null',NULL),(19,2,9,'2017-07-21','2017-07-31','Accepted','null',NULL),(20,2,11,'2017-07-21','2017-07-31','Accepted','null',NULL),(21,2,12,'2017-07-21','2017-07-31','Accepted','Administrator',NULL),(22,2,5,'2017-07-21','2017-07-31','Accepted','ABC','ABC'),(23,1,13,'2017-07-21','2017-07-31','Accepted','ABC','Administrator'),(24,1,1,'2017-07-22','2017-08-01','Accepted','Administrator','Administrator'),(25,3,3,'2017-07-23','2017-08-02','Issued','Administrator','Null'),(26,1,1,'2017-08-10','2017-08-20','Accepted','Administrator','Administrator'),(27,1,1,'2017-12-11','2017-12-21','Accepted','chamila','abc');

/*Table structure for table `books_tb` */

DROP TABLE IF EXISTS `books_tb`;

CREATE TABLE `books_tb` (
  `book_id` int(100) NOT NULL,
  `book_isbn_no` varchar(100) NOT NULL default '',
  `book_title` varchar(255) NOT NULL default '',
  `book_author` varchar(100) NOT NULL default '',
  `publish_date` varchar(100) NOT NULL default '',
  `company_name` varchar(100) NOT NULL default '',
  `address1` varchar(255) default '',
  `address2` varchar(255) default NULL,
  `company_email` varchar(255) default NULL,
  `company_tp_no` varchar(50) default NULL,
  `adding_date` date NOT NULL,
  `pages` varchar(50) NOT NULL default '',
  `price` int(50) NOT NULL,
  `source` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `In_Store` varchar(20) NOT NULL default '',
  PRIMARY KEY  (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `books_tb` */

insert  into `books_tb`(`book_id`,`book_isbn_no`,`book_title`,`book_author`,`publish_date`,`company_name`,`address1`,`address2`,`company_email`,`company_tp_no`,`adding_date`,`pages`,`price`,`source`,`remark`,`In_Store`) values (1,'955-8415-07-3','Wahallu','Martin Wekramasinha','1951-2013','Sarasa(Pvt)Ltd','18/3Kirimandala Mawaatha','Nawala Rajagiriya','mwtrustadd@yahoo.com','0112865543','2017-07-14','155',200,'Me','Successful Story','Yes'),(2,'955-8415-09-X','Lila','Martin Wekramasinha','1914-2013','Sarasa(Pvt)Ltd','18/3Kirimandala Mawaatha','Nawala Rajagiriya','mwtrustadd@yahoo.com','0112865543','2017-07-14','116',160,'Me','Successful Story','Yes'),(3,'978-955-677-248-7','Kala Nadee Gala Basee','Nobrat Ayagamage','2013-2014','Fast Publision(Pvt)Ltd','165Dewanampiyathissa Mawatha','Colombo 7',NULL,'0112682223','2017-07-14','436',550,'Kaleni Univercity','Successful Story','Pending'),(4,'13-978-0230-63322-3','Oliver Twist','Charles Dickens','1969-2012','Macmillan Publishers India(Pvt)Ltd','',NULL,NULL,NULL,'2017-07-14','103',218,'Me','Successful Story','Yes'),(5,'123-456-789-01-3','Saman Saluwa','Namali Silwa','1996-2017','ASD(Pvt)Ltd','18/6Kothalawala Road','Raja Ela Hingurakgoda','asdbooks@gmail.com','0271801521','2017-07-14','652',200,'Me','Successfull Story','Yes'),(6,'456-258-369-10-5','Dangaya','Kamal Surange','2000-2017','HK(Pvt)Ltd','Blaaa Blaaa','Blaaa Blaaa','hkbookscompany@yahoo.com','0274561286','2017-07-14','850',200,'Me','Successfull Story','Yes'),(7,'789-3639-146-02-3','DataBases 1','Ariyarathne Kumara','1996-2010','WPB(Pvt)Ltd','2/3Minneriya','Hingurakgoda','wbpbooksdealers@yahoo.com','0114503789','2017-07-14','300',250,'My Friend','Successfull Story','Yes'),(8,'978-955-30-1092-6 ','Rathnawali','Piyadasa Nishshanka','1957-2012','se/sa s.godage and sahodarayo(Pvt)Ltd','661,665,675,P,dha s.Kularathna Mawath,','Colombo 10.','','0112685369','2017-07-14','96',175,'Me','Successfull story','Yes'),(9,'978-955-8508-09-1','Magiya Eththo','Sarathchandra','1959-2009','ad ads','272/5,isuru pedesa,hailewal Roda,','Maharagama','adads@sltnet.lk','0112897470','2017-07-14','128',180,'Me','successfull story','Yes'),(10,'978-955-8508-10-7','Hasthikanth Manthare','Sarathchandra','1959-2009','Ad Ads','272/5,Isuru Pedesa,HailewalRoad,','Maharagama.','adads@sltnet.lk','0112897470','2017-07-14','69',125,'My Mom','Successfull story','Yes'),(11,'978-955-0230-00-6','Boniki Gedara','Sunil Vijewardana','2000-2015','Agahas Prakashakayo','717/2,Madinnagoda,','Rajagiriya.','','0112793671','2017-07-14','150',300,'My Mom','Successfull srory','Yes'),(12,'978-955-673-022-7','Neranjana','Ben Rasnek','2011','Saraswathi Prakashana','2/60,Raum Road,','Diulapitiya.','saraspub@g-mail.com','0312246233','2017-07-01','316',450,'Me','Successful Story','Yes'),(13,'123-258-650-02-B','DataBases 2','Athula S Bandara','1996-2011','Fast Publish(Pvt)Ltd','25/2Deke Ela','Colombo 07','fastpublishbook@yahoo.com','0112245037','2017-07-19','551',200,'','','Yes'),(14,'700-900-995-05-BXA','Java 1','Anjana S Bandara','2013-2017','Fast Publish(Pvt)Ltb','25/6Deke Ela','Colombo 07','fastpublishbook@yahoo.com','0112245037','2017-07-19','655',200,'','','Yes');

/*Table structure for table `customers` */

DROP TABLE IF EXISTS `customers`;

CREATE TABLE `customers` (
  `customer_id` int(100) NOT NULL auto_increment,
  `customer_name` varchar(50) default NULL,
  `address` varchar(50) default NULL,
  `sex` varchar(10) default NULL,
  `mobail_no` varchar(10) default NULL,
  `nic_no` varchar(10) default NULL,
  `register_date` date default NULL,
  `customer_type` varchar(10) default NULL,
  `class` varchar(50) default NULL,
  `gread_of_class` varchar(10) default NULL,
  PRIMARY KEY  (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `customers` */

insert  into `customers`(`customer_id`,`customer_name`,`address`,`sex`,`mobail_no`,`nic_no`,`register_date`,`customer_type`,`class`,`gread_of_class`) values (1,'Thamindu Anjana Bandara','Anjana,Kothalawala Road,Raja Ela,Hingurakgoda','Male','0771801521','693204469V','2017-07-21','Student','A/L Student','A-Art'),(2,'Amali Perera','18/2Deke Ela,Polonnaruwa','Female','0711506545','695405596V','2017-07-21','Teacher',NULL,NULL),(3,'Nimal Jayasundara','Nimal,Jayasundara,ABC','Male','0771801692','963125569V','2017-07-23','Teacher','Null','Null');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `ID` int(10) NOT NULL auto_increment,
  `USERNAME` varchar(50) NOT NULL default '',
  `PASSWORD` varchar(50) NOT NULL default '',
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`ID`,`USERNAME`,`PASSWORD`) values (1,'Administrator','d033e22ae348aeb5660fc2140aec35850c4da997'),(2,'Sachini','6367c48dd193d56ea7b0baad25b19455e529f5ee'),(3,'ABC','40bd001563085fc35165329ea1ff5c5ecbdbbeef'),(4,'abc','a9993e364706816aba3e25717850c26c9cd0d89d'),(5,'abc','40bd001563085fc35165329ea1ff5c5ecbdbbeef'),(6,'chamila','df211ccdd94a63e0bcb9e6ae427a249484a49d60');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
