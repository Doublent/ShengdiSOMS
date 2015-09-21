/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : shengdisoms

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-09-21 21:23:42
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
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of om_normal_discount
-- ----------------------------
INSERT INTO `om_normal_discount` VALUES ('101', '3%折扣', '一般折扣', '金额', '0', '-0.03', '是');
INSERT INTO `om_normal_discount` VALUES ('102', '5%折扣\r\n', '一般折扣\r\n', '单价', '0', '-0.05', '是');
INSERT INTO `om_normal_discount` VALUES ('103', '低于50片加价5%\r\n', '通用加价\r\n', '数量\r\n', '50', '0.05', '是');
INSERT INTO `om_normal_discount` VALUES ('104', '低于40片加价8%', '通用加价', '数量', '40', '0.08', '是');
