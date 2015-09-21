/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : shengdisoms

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-09-21 21:22:58
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
  `Default_` varchar(2) NOT NULL,
  `criterion` varchar(255) NOT NULL,
  `Base_qty` int(8) DEFAULT NULL,
  `Discount_rate` double(8,2) NOT NULL,
  `active` varchar(2) NOT NULL,
  PRIMARY KEY (`Discount_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of om_cust_discount
-- ----------------------------
INSERT INTO `om_cust_discount` VALUES ('101', 'A', 'A', 'AA', 'AA', '1', '1.00', 'A');
INSERT INTO `om_cust_discount` VALUES ('102', '5%折扣\r\n', '一般折扣\r\n', 'N', '单价', '0', '-0.05', '是');
INSERT INTO `om_cust_discount` VALUES ('103', '低于50片加价5%\r\n', '通用加价\r\n', 'N', '数量\r\n', '50', '0.05', '是');
INSERT INTO `om_cust_discount` VALUES ('104', '低于40片加价8%', '通用加价', 'N', '数量', '40', '0.08', '是');
