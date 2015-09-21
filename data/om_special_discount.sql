/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : shengdisoms

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-09-20 17:21:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `om_special_discount`
-- ----------------------------
DROP TABLE IF EXISTS `om_special_discount`;
CREATE TABLE `om_special_discount` (
  `discount_id` int(10) NOT NULL AUTO_INCREMENT,
  `Cust_id` int(10) NOT NULL,
  `discount_name` varchar(30) NOT NULL COMMENT '折扣名称',
  `Cust_code` varchar(10) NOT NULL COMMENT '客户代码',
  `Amount` double(15,0) NOT NULL COMMENT '折扣金额',
  `Applied_amount` double(15,2) NOT NULL COMMENT '已用金额',
  `Balance` double(15,2) NOT NULL COMMENT '折扣余额',
  `activity` varchar(2) NOT NULL DEFAULT '是' COMMENT '有效',
  PRIMARY KEY (`discount_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of om_special_discount
-- ----------------------------
INSERT INTO `om_special_discount` VALUES ('1', '0', 'hand', 'hand', '10000', '0.00', '10000.00', '是');
