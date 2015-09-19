/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : shengdisoms

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-09-19 22:39:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `om_customers_info`
-- ----------------------------
DROP TABLE IF EXISTS `om_customers_info`;
CREATE TABLE `om_customers_info` (
  `cust_id` int(10) NOT NULL AUTO_INCREMENT,
  `cust_name` varchar(120) NOT NULL,
  `type` varchar(8) NOT NULL,
  `cust_code` varchar(10) NOT NULL,
  `group_company` varchar(10) DEFAULT NULL,
  `corporation` varchar(10) DEFAULT NULL,
  `country` varchar(20) NOT NULL,
  `city` varchar(20) DEFAULT NULL,
  `address1` varchar(100) DEFAULT NULL,
  `address2` varchar(100) DEFAULT NULL,
  `postcode` varchar(15) DEFAULT NULL,
  `port_of_destination` varchar(20) NOT NULL,
  `shipping_mark` varchar(100) NOT NULL,
  `status` varchar(6) NOT NULL,
  `invoice_group` varchar(20) DEFAULT NULL,
  `currency` varchar(3) NOT NULL,
  `payment_method` varchar(120) NOT NULL,
  `price_term1` varchar(100) DEFAULT NULL,
  `price_term2` varchar(100) DEFAULT NULL,
  `price_term3` varchar(100) DEFAULT NULL,
  `markup_name` varchar(20) NOT NULL,
  `discount_name` varchar(20) NOT NULL,
  `market_area` varchar(10) NOT NULL,
  `business_manager` varchar(15) NOT NULL,
  `business_assistant` varchar(15) NOT NULL,
  `discount_id` int(10) DEFAULT NULL,
  `markup_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`cust_id`),
  KEY `Discount_id` (`discount_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10045 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of om_customers_info
-- ----------------------------
INSERT INTO `om_customers_info` VALUES ('10001', 'Great Tasla World\r\n', 'STD', 'GTW', null, null, 'USA', 'Los Angeles\r\n', 'aaaaaa', 'aaaaaa', '200391', 'Los Angeles', 'dsadasasda', '待确认', null, 'USD', '60天后付款\r\n', null, null, null, '低于50片加价5%', '无折扣', '05-美国', '张某某', '张某某', '101', null);
INSERT INTO `om_customers_info` VALUES ('10004', 'bb', 'bb', 'bb', 'bb', 'bb', '1', null, 'a', 'a', 'a', 'a', 'a', '有效', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', null, null);
INSERT INTO `om_customers_info` VALUES ('10044', 'z', 'z', 'z', 'z', 'z', '1', null, 'z', 'z', 'z', 'z', 'z', '待确认', 'z', 'z', 'z', 'z', 'z', 'z', 'z', 'z', 'z', 'z', 'z', null, null);
