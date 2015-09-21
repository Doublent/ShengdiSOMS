/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : shengdisoms

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-09-21 21:23:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `om_cust_price_list_config`
-- ----------------------------
DROP TABLE IF EXISTS `om_cust_price_list_config`;
CREATE TABLE `om_cust_price_list_config` (
  `cust_id` int(10) DEFAULT NULL,
  `cust_code` varchar(120) NOT NULL,
  `type` varchar(8) NOT NULL,
  `cust_name` varchar(120) DEFAULT NULL,
  `display_name` varchar(30) DEFAULT NULL,
  `price_list_col` varchar(30) NOT NULL,
  `EXCEL_col` int(3) DEFAULT NULL,
  `activity` varchar(2) DEFAULT NULL,
  `activity_date_from` varchar(20) DEFAULT NULL,
  `activity_date_to` varchar(20) DEFAULT NULL,
  `serial_number` int(11) NOT NULL,
  PRIMARY KEY (`cust_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of om_cust_price_list_config
-- ----------------------------
INSERT INTO `om_cust_price_list_config` VALUES (null, 'GTW', 'hand', 'hand', null, 'hand', null, '是', null, null, '1');
INSERT INTO `om_cust_price_list_config` VALUES (null, 'GTW12', 'eee', 'erer', null, 'er', null, '全部', null, null, '2');
