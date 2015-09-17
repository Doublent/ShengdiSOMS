/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : shengdisoms

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-09-16 11:21:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `om_discount_applied_records`
-- ----------------------------
DROP TABLE IF EXISTS `om_discount_applied_records`;
CREATE TABLE `om_discount_applied_records` (
  `Discount_id` int(10) NOT NULL,
  `discount_name` varchar(30) NOT NULL COMMENT '折扣名称 ',
  `Cust_code` varchar(10) NOT NULL COMMENT '客户代码 ',
  `DN_identify_num` varchar(30) NOT NULL COMMENT '发货单标识号 ',
  `Applied_amount` double(15,2) NOT NULL COMMENT '已用金额 ',
  `applied_date` date NOT NULL COMMENT '应用日期',
  `cancel` varchar(2) DEFAULT NULL COMMENT '取消 ',
  `Cancel_date` date DEFAULT NULL COMMENT '取消日期 '
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of om_discount_applied_records
-- ----------------------------
