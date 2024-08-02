-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: questionservicedb
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question` (
  `id` int NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `difficulty_level` varchar(255) DEFAULT NULL,
  `option1` varchar(255) DEFAULT NULL,
  `option2` varchar(255) DEFAULT NULL,
  `option3` varchar(255) DEFAULT NULL,
  `option4` varchar(255) DEFAULT NULL,
  `question_title` varchar(255) DEFAULT NULL,
  `right_answer` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'Java','Easy','Java Virtual Machine','Java Very Machine','Java Verification Machine','None of the above','What is JVM?','Java Virtual Machine'),(2,'Java','Easy','Dynamic','Architecture Neutral','Use of pointers','Object-oriented','Which of the following is not a Java feature?','Use of pointers'),(3,'Java','Easy','4 bytes','2 bytes','8 bytes','Depends on the system','What is the size of int in Java?','4 bytes'),(4,'Java','Medium','identifier','keyword','variable','None of the above','Which of these cannot be used for a variable name in Java?','keyword'),(5,'Java','Easy','0','0.0','null','undefined','What is the default value of byte variable?','0'),(6,'Java','Medium','run()','start()','stop()','main()','Which method must be implemented by all threads?','run()'),(7,'Java','Medium','int','Object','void','long','What is the return type of the hashCode() method in the Object class?','int'),(8,'Java','Medium','java.util package','java.lang package','java.io package','java.net package','Which package contains the Random class?','java.util package'),(9,'Java','Medium','Runnable Interface','Marker Interface','Abstract Interface','CharSequence Interface','An interface with no fields or methods is known as a ______.','Marker Interface'),(10,'Java','Medium','Stack','String memory','Heap memory','Random memory','In which memory a String is stored, when we create a string using new operator?','Heap memory'),(11,'Python','Easy','16','32','64','None of the above','What is the maximum possible length of an identifier in Python?','None of the above'),(12,'Python','Easy','.py','.python','.p','.pyt','Which of the following is the correct extension of the Python file?','.py'),(13,'Python','Easy','Function','Def','Fun','Define','Which keyword is used for function in Python?','Def'),(14,'Python','Easy','Lists','Dictionary','Tuples','Class','Which of these in not a core data type?','Class'),(15,'Python','Medium','sys.version(1)','sys.version(0)','sys.version()','sys.version','Which of the following functions can help us to find the version of python that we are currently working on?','sys.version()'),(16,'Python','Easy','Indentation','Key','Brackets','All of the mentioned','Which of the following is used to define a block of code in Python language?','Indentation'),(17,'Python','Medium','{}','[]','set()','set([])','Which of the following statements is used to create an empty set in Python?','set()'),(18,'Python','Medium','Hello','H','None','Error','What is the output of print(str[0]) if str = ‘Hello World!’?','H'),(19,'Python','Medium','Indentation','Key','Brackets','All of the mentioned','Which of the following is used to define a block of code in Python?','Indentation'),(20,'Python','Medium','True','False','Machine Dependent','Error','What will be the output of the following Python code? print ( 0.1 + 0.2 == 0.3 )','False');
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-02 15:06:04
