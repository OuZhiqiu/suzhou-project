/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : shopdb

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 11/10/2020 22:34:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_goods
-- ----------------------------
DROP TABLE IF EXISTS `t_goods`;
CREATE TABLE `t_goods`  (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT '商品编号',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品标题',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品详情介绍',
  `image_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品图片路径',
  `price` float(10, 2) NULL DEFAULT NULL COMMENT '商品价格',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_goods
-- ----------------------------
INSERT INTO `t_goods` VALUES (1, '【全新版本6+128G】Huawei/华为 P30全面屏超感光徕卡三摄变焦双景录像980芯片智能手机p30', NULL, '/images/01.png', 4288.00);
INSERT INTO `t_goods` VALUES (2, 'Xiaomi/小米 Redmi K20 Pro 全面屏骁龙855超广角AI三摄9手机官方旗舰店正品cc红米k20', NULL, '/images/02.png', 2799.00);
INSERT INTO `t_goods` VALUES (3, 'Huawei/华为 Mate 20 全面屏超大广角徕卡三镜头麒麟980人工智能芯片手机 ', NULL, '/images/03.png', 3299.00);
INSERT INTO `t_goods` VALUES (4, '【6+128G直降100】Huawei/华为 nova 4 自拍极点全面屏超广角三摄正品智能易烊千玺代言手机', NULL, '/images/04.png', 2599.00);

SET FOREIGN_KEY_CHECKS = 1;
