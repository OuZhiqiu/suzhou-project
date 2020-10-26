/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : mytest

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 25/10/2020 22:16:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for departments
-- ----------------------------
DROP TABLE IF EXISTS `departments`;
CREATE TABLE `departments`  (
  `department_id` int(11) NOT NULL,
  `department_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `manager_id` int(11) NULL DEFAULT NULL,
  `location_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`department_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of departments
-- ----------------------------
INSERT INTO `departments` VALUES (10, 'Administration', 200, 1700);
INSERT INTO `departments` VALUES (20, 'Marketing', 201, 1800);
INSERT INTO `departments` VALUES (50, 'Shipping', 124, 1500);
INSERT INTO `departments` VALUES (60, 'IT', 103, 1400);
INSERT INTO `departments` VALUES (80, 'Sales', 149, 2500);
INSERT INTO `departments` VALUES (90, 'Executive', 100, 1700);
INSERT INTO `departments` VALUES (110, 'Accounting', 205, 1700);
INSERT INTO `departments` VALUES (190, 'Contracting', NULL, 1700);

-- ----------------------------
-- Table structure for employees
-- ----------------------------
DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees`  (
  `employee_id` int(6) NOT NULL,
  `first_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `last_name` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `email` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `phone_number` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `hire_date` date NOT NULL,
  `job_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `salary` decimal(8, 2) NULL DEFAULT NULL,
  `commission_pct` decimal(2, 2) NULL DEFAULT NULL,
  `manager_id` int(6) NULL DEFAULT NULL,
  `department_id` int(4) NULL DEFAULT NULL,
  PRIMARY KEY (`employee_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employees
-- ----------------------------
INSERT INTO `employees` VALUES (100, 'Smith', 'King', 'abc@163.com', NULL, '2000-02-02', 'IT_PROG', 2000.00, NULL, 100, 90);
INSERT INTO `employees` VALUES (101, 'Smith', 'Kochhar', 'Kochhar@163.com', NULL, '2001-02-01', 'IT_PROG', 3800.00, NULL, 101, 90);
INSERT INTO `employees` VALUES (102, 'Too', 'DeHaan', 'DeHaan@163.com', NULL, '1998-09-08', 'IT_PROG', 1200.00, NULL, 201, 90);
INSERT INTO `employees` VALUES (103, 'Aoo', 'Hunold', 'Hunold@163.com', NULL, '2010-09-02', 'AD_PRES', 2000.00, NULL, 100, 60);
INSERT INTO `employees` VALUES (104, 'Efd', 'Emst', 'Emst@163.com', NULL, '2020-09-12', 'AD_VP', 2800.00, NULL, 300, 60);
INSERT INTO `employees` VALUES (107, 'David', 'Lnorentz', 'Lnorentz@163.com', NULL, '2020-09-12', 'AD_VP', 16000.00, NULL, 288, 60);
INSERT INTO `employees` VALUES (109, NULL, 'Mourgos', 'Mourgos@163.com', NULL, '2008-09-12', 'AD_VP', 200.00, NULL, NULL, NULL);
INSERT INTO `employees` VALUES (149, NULL, 'Zlotkey', 'Zlotkey@163.com', NULL, '2008-12-01', 'SA_MAN', 10500.00, NULL, NULL, NULL);
INSERT INTO `employees` VALUES (201, NULL, 'Hartstein', 'Hartstein@163.com', NULL, '2006-09-07', 'SA_MAN', 13000.00, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
