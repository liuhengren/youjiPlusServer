/*
Navicat MySQL Data Transfer

Source Server         : localhost_2333
Source Server Version : 80012
Source Host           : localhost:2333
Source Database       : youjiplus

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2019-06-05 09:19:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for at
-- ----------------------------
DROP TABLE IF EXISTS `at`;
CREATE TABLE `at` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dynamic_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `userId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `dynamic_id` (`dynamic_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `at_ibfk_1` FOREIGN KEY (`dynamic_id`) REFERENCES `dynamic` (`id`),
  CONSTRAINT `at_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of at
-- ----------------------------

-- ----------------------------
-- Table structure for comlike
-- ----------------------------
DROP TABLE IF EXISTS `comlike`;
CREATE TABLE `comlike` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `commnet_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `commnet_id` (`commnet_id`),
  CONSTRAINT `comlike_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `comlike_ibfk_2` FOREIGN KEY (`commnet_id`) REFERENCES `commnet` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comlike
-- ----------------------------

-- ----------------------------
-- Table structure for commnet
-- ----------------------------
DROP TABLE IF EXISTS `commnet`;
CREATE TABLE `commnet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commnet_text` text NOT NULL,
  `dynamic_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `dynamic_id` (`dynamic_id`),
  CONSTRAINT `commnet_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `commnet_ibfk_2` FOREIGN KEY (`dynamic_id`) REFERENCES `dynamic` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commnet
-- ----------------------------

-- ----------------------------
-- Table structure for dylike
-- ----------------------------
DROP TABLE IF EXISTS `dylike`;
CREATE TABLE `dylike` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `dynamic_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `dynamic_id` (`dynamic_id`),
  CONSTRAINT `dylike_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `dylike_ibfk_2` FOREIGN KEY (`dynamic_id`) REFERENCES `dynamic` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dylike
-- ----------------------------

-- ----------------------------
-- Table structure for dynamic
-- ----------------------------
DROP TABLE IF EXISTS `dynamic`;
CREATE TABLE `dynamic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `content` text,
  `image` varchar(255) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_2kbhohay4rmrwuxfi55hd8po0` (`user_id`),
  CONSTRAINT `FK_2kbhohay4rmrwuxfi55hd8po0` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `dynamic_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dynamic
-- ----------------------------
INSERT INTO `dynamic` VALUES ('2', '5', '1231321', '5135135000', '2019-06-04 08:17:18');
INSERT INTO `dynamic` VALUES ('3', '5', '123123', '123123', '2019-06-05 08:49:37');

-- ----------------------------
-- Table structure for fun
-- ----------------------------
DROP TABLE IF EXISTS `fun`;
CREATE TABLE `fun` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `fun_user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `fun_user_id` (`fun_user_id`),
  CONSTRAINT `fun_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `fun_ibfk_2` FOREIGN KEY (`fun_user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fun
-- ----------------------------
INSERT INTO `fun` VALUES ('2', '5', '6');
INSERT INTO `fun` VALUES ('3', '5', '7');
INSERT INTO `fun` VALUES ('4', '5', '8');
INSERT INTO `fun` VALUES ('5', '6', '5');
INSERT INTO `fun` VALUES ('6', '6', '7');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phones` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) NOT NULL,
  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('5', '1234', '123', '5555', null, null, '6666');
INSERT INTO `user` VALUES ('6', '1', '1', '1', '1', '1', '1');
INSERT INTO `user` VALUES ('7', '2', '2', '2', '2', '2', '2');
INSERT INTO `user` VALUES ('8', '3', '3', '3', '3', '3', '3');
INSERT INTO `user` VALUES ('9', '4', '4', '4', '4', '4', '4');
