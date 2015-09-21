/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : shengdisoms

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-09-21 21:24:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `om_user_info`
-- ----------------------------
DROP TABLE IF EXISTS `om_user_info`;
CREATE TABLE `om_user_info` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `en_name` varchar(255) DEFAULT NULL,
  `invalid_date` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of om_user_info
-- ----------------------------
INSERT INTO `om_user_info` VALUES ('1', 'admin1', 'admin1', '0000-00-00 00:00:00', 'admin1', 'admin1', '123456', '财务人员', 'admin1');
INSERT INTO `om_user_info` VALUES ('2', 'admin2', 'admin2', '2015-09-30 20:29:48', 'admin2', 'admin2', '654321', '业务经理', 'admin2');
INSERT INTO `om_user_info` VALUES ('3', 'admin3', 'admin3', '2015-11-28 19:30:28', 'admin3', 'admin3', '123654', '业务助理', 'admin3');
