/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : shengdisoms

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-09-16 11:21:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `om_customers_info`
-- ----------------------------
DROP TABLE IF EXISTS `om_customers_info`;
CREATE TABLE `om_customers_info` (
  `cust_id` int(10) NOT NULL AUTO_INCREMENT,
  `Cust_name` varchar(120) NOT NULL,
  `type` varchar(8) NOT NULL,
  `Cust_code` varchar(10) NOT NULL,
  `Group_company` varchar(10) DEFAULT NULL,
  `Corporation` varchar(10) DEFAULT NULL,
  `country` varchar(20) NOT NULL,
  `City` varchar(20) DEFAULT NULL,
  `Address1` varchar(100) DEFAULT NULL,
  `Address2` varchar(100) DEFAULT NULL,
  `postcode` varchar(15) DEFAULT NULL,
  `port_of_destination` varchar(20) NOT NULL,
  `shipping_mark` varchar(100) NOT NULL,
  `status` varchar(6) NOT NULL,
  `invoice_group` varchar(20) DEFAULT NULL,
  `currency` varchar(3) NOT NULL,
  `payment_methor` varchar(120) NOT NULL,
  `price_term1` varchar(100) DEFAULT NULL,
  `price_term2` varchar(100) DEFAULT NULL,
  `price_term3` varchar(100) DEFAULT NULL,
  `markup_name` varchar(20) NOT NULL,
  `discount_name` varchar(20) NOT NULL,
  `Market_area` varchar(10) NOT NULL,
  `business_manager` varchar(15) NOT NULL,
  `business_assistant` varchar(15) NOT NULL,
  `Discount_id` int(10) NOT NULL,
  PRIMARY KEY (`cust_id`),
  KEY `Discount_id` (`Discount_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10002 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of om_customers_info
-- ----------------------------
INSERT INTO `om_customers_info` VALUES ('10001', 'Great Tasla World\r\n', 'STD', 'GTW', null, null, 'USA', 'Los Angeles\r\n', 'aaaaaa', 'aaaaaa', '200391', 'Los Angeles', 'dsadasasda', '待确认', null, 'USD', '60天后付款\r\n', null, null, null, '低于50片加价5%', '无折扣', '05-美国', '张某某', '张某某', '101');
