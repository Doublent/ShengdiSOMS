/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : shengdisoms

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-09-19 22:39:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `om_cust_discount`
-- ----------------------------
DROP TABLE IF EXISTS `om_cust_discount`;
CREATE TABLE `om_cust_discount` (
  `Discount_id` int(10) NOT NULL,
  `Discount_name` varchar(30) NOT NULL DEFAULT '无折扣',
  `Type` varchar(8) NOT NULL,
  `Default` varchar(2) NOT NULL,
  `criterion` varchar(255) NOT NULL,
  `Base_qty` int(8) DEFAULT NULL,
  `Discount_rate` double(8,2) NOT NULL,
  `active` varchar(2) NOT NULL,
  PRIMARY KEY (`Discount_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of om_cust_discount
-- ----------------------------
