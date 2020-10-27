/*
 Navicat Premium Data Transfer

 Source Server         : localhost_mysql
 Source Server Type    : MySQL
 Source Server Version : 50713
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50713
 File Encoding         : 65001

 Date: 27/10/2020 08:40:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for a_table
-- ----------------------------
DROP TABLE IF EXISTS `a_table`;
CREATE TABLE `a_table`  (
  `a_id` int(11) NULL DEFAULT NULL,
  `a_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `a_part` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of a_table
-- ----------------------------
INSERT INTO `a_table` VALUES (1, '老潘', '总裁部');
INSERT INTO `a_table` VALUES (2, '老王', '秘书部');
INSERT INTO `a_table` VALUES (3, '老张', '设计部');
INSERT INTO `a_table` VALUES (4, '老李', '运营部');

-- ----------------------------
-- Table structure for b_table
-- ----------------------------
DROP TABLE IF EXISTS `b_table`;
CREATE TABLE `b_table`  (
  `b_id` int(11) NULL DEFAULT NULL,
  `b_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `b_part` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of b_table
-- ----------------------------
INSERT INTO `b_table` VALUES (2, '老王', '秘书部');
INSERT INTO `b_table` VALUES (3, '老张', '设计部');
INSERT INTO `b_table` VALUES (5, '老刘', '人事部');
INSERT INTO `b_table` VALUES (6, '老黄', '生产部');

SET FOREIGN_KEY_CHECKS = 1;
