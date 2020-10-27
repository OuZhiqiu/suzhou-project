/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : shopdb

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2020-10-27 16:52:57
*/

SET FOREIGN_KEY_CHECKS=0;


INSERT INTO `student` VALUES ('901', '张老大', '男', '1985', '计算机系', '北京市海定区');
INSERT INTO `student` VALUES ('902', '张老二', '男', '1986', '中文系', '北京市昌平区');
INSERT INTO `student` VALUES ('903', '张三', '女', '1990', '中文系', '湖南省永州市');
INSERT INTO `student` VALUES ('904', '李四', '男', '1990', '英语系', '辽宁省高新市');
INSERT INTO `student` VALUES ('905', '王五', '女', '1991', '英语系', '福建省厦门市');
INSERT INTO `student` VALUES ('906', '王六', '男', '1988', '计算机系', '湖南省衡阳市');

INSERT INTO `score` (`id`, `stu_id`, `c_name`, `grade`) VALUES ('1', '901', '计算机', '98')
INSERT INTO `score` (`id`, `stu_id`, `c_name`, `grade`) VALUES ('2', '901', '英语', '80')
INSERT INTO `score` (`id`, `stu_id`, `c_name`, `grade`) VALUES ('3', '902', '计算机', '65')
INSERT INTO `score` (`id`, `stu_id`, `c_name`, `grade`) VALUES ('4', '902', '中文', '88')
INSERT INTO `score` (`id`, `stu_id`, `c_name`, `grade`) VALUES ('5', '903', '中文', '95')
INSERT INTO `score` (`id`, `stu_id`, `c_name`, `grade`) VALUES ('6', '904', '计算机', '70')
INSERT INTO `score` (`id`, `stu_id`, `c_name`, `grade`) VALUES ('7', '904', '英语', '92')
INSERT INTO `score` (`id`, `stu_id`, `c_name`, `grade`) VALUES ('8', '905', '英语', '94')
INSERT INTO `score` (`id`, `stu_id`, `c_name`, `grade`) VALUES ('9', '906', '计算机', '90')
INSERT INTO `score` (`id`, `stu_id`, `c_name`, `grade`) VALUES ('10', '906', '英语', '85')
