
1. Create database & table in MySQL first :

CREATE DATABASE IF NOT EXISTS blangkon;
USE blangkon;

CREATE TABLE `stock` (
  `STOCK_ID` int(10) UNSIGNED NOT NULL,
  `STOCK_CODE` varchar(10) NOT NULL,
  `STOCK_NAME` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


ALTER TABLE `stock`
  ADD PRIMARY KEY (`STOCK_ID`) USING BTREE,
  ADD UNIQUE KEY `UNI_STOCK_NAME` (`STOCK_NAME`),
  ADD UNIQUE KEY `UNI_STOCK_ID` (`STOCK_CODE`) USING BTREE;


ALTER TABLE `stock`
  MODIFY `STOCK_ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;COMMIT;
  
2. On project folder run : mvn package
3. On 'target' folder run : java -jar exampleSpringHibernate-1.0.jar
