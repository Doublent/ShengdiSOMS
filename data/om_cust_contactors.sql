/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : shengdisoms

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-09-19 22:39:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `om_cust_contactors`
-- ----------------------------
DROP TABLE IF EXISTS `om_cust_contactors`;
CREATE TABLE `om_cust_contactors` (
  `cust_id` int(10) NOT NULL,
  `MailFrom` varchar(50) DEFAULT NULL,
  `PrePO_MailTo` varchar(200) DEFAULT NULL,
  `PO_MailTo` varchar(200) DEFAULT NULL,
  `OCPI_MailTo` varchar(200) DEFAULT NULL,
  `INV_Pklist_mailto` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`cust_id`),
  CONSTRAINT `cust_id` FOREIGN KEY (`cust_id`) REFERENCES `om_customers_info` (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of om_cust_contactors
-- ----------------------------
INSERT INTO `om_cust_contactors` VALUES ('10001', 'michael@winhere.com.cn', 'michael@winhere.com.cn', 'michael@winhere.com.cn', 'michael@winhere.com.cn', 'michael@winhere.com.cn');
INSERT INTO `om_cust_contactors` VALUES ('10004', 'a', 'a', 'a', 'a', 'a');
INSERT INTO `om_cust_contactors` VALUES ('10044', 'z', 'z', 'z', 'z', 'z');
