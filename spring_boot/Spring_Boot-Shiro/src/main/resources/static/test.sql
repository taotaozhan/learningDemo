/*
 Navicat Premium Data Transfer

 Source Server         : 张涛
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 06/12/2019 09:26:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `sno` varchar(3) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `sname` varchar(9) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `ssex` char(2) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('001', 'zhang', '23');
INSERT INTO `student` VALUES ('002', 'wang', 'M');
INSERT INTO `student` VALUES ('004', 'zhu', 'M');
INSERT INTO `student` VALUES ('003', 'zhu', 'M');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `ID` int(11) NOT NULL,
  `USERNAME` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `PASSWD` varchar(128) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `CREATE_TIME` date NULL DEFAULT NULL,
  `STATUS` char(1) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (2, 'test', '7a38c13ec5e9310aed731de58bbc4214', '2017-11-19', '0');
INSERT INTO `t_user` VALUES (1, 'mrbird', '42ee25d1e43e9f57119a00d0a39e5250', '2017-11-19', '1');
INSERT INTO `t_user` VALUES (3, 'zhangtao', '42ee25d1e43e9f57119a00d0a39e5250', '2017-11-19', '1');

SET FOREIGN_KEY_CHECKS = 1;
