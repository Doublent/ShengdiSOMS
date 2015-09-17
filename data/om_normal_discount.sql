/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : shengdisoms

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-09-16 11:21:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `om_normal_discount`
-- ----------------------------
DROP TABLE IF EXISTS `om_normal_discount`;
CREATE TABLE `om_normal_discount` (
  `discount_id` int(10) NOT NULL AUTO_INCREMENT,
  `discount_name` varchar(30) NOT NULL COMMENT '折扣名称 ',
  `type` varchar(8) NOT NULL COMMENT '折扣类型',
  `Discount_base` varchar(8) NOT NULL COMMENT '折扣基准 ',
  `Base_qty` int(8) DEFAULT NULL COMMENT '基准数量 ',
  `Discount_rate` double(8,2) NOT NULL COMMENT '折扣率',
  `activity` varchar(2) NOT NULL DEFAULT '是' COMMENT '有效',
  PRIMARY KEY (`discount_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of om_normal_discount
-- ----------------------------
INSERT INTO `om_normal_discount` VALUES ('1', 'hello', 'hello', 'hello', '10', '10.00', 'Y');
INSERT INTO `om_normal_discount` VALUES ('2', 'hello', 'hello', 'hello', '10', '10.00', 'Y');
INSERT INTO `om_normal_discount` VALUES ('3', 'hello', 'hello', 'hello', '10', '10.00', 'Y');
INSERT INTO `om_normal_discount` VALUES ('4', 'hello', 'hello', 'hello', '10', '10.00', '是');
INSERT INTO `om_normal_discount` VALUES ('5', 'hello', 'hello', 'hello', '10', '10.00', '是');
INSERT INTO `om_normal_discount` VALUES ('6', 'hello', 'hello', 'hello', '10', '10.00', '是');
INSERT INTO `om_normal_discount` VALUES ('7', 'hello', 'hello', 'hello', '10', '10.00', '是');
INSERT INTO `om_normal_discount` VALUES ('8', 'hello', 'hello', 'hello', '10', '10.00', '是');
INSERT INTO `om_normal_discount` VALUES ('9', 'hello', 'hello', 'hello', '10', '10.00', '是');
