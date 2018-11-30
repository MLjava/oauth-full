/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : 127.0.0.1:3306
 Source Schema         : oauth2

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 30/11/2018 18:08:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '用户id',
  `username` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户账户',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户密码',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建用户时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新用户时间',
  `enable` int(1) NULL DEFAULT 0 COMMENT '用户可用标志（0：可用，1：不可用）',
  `flag` int(1) UNSIGNED ZEROFILL NULL DEFAULT 0 COMMENT '删除标志（0：存在，1：删除）',
  `lock` int(1) UNSIGNED ZEROFILL NULL DEFAULT 0 COMMENT '锁住标志（0：没有锁住，1：锁住）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin1', '$2a$10$BbIr0x3o2LP.FW/Lbs8Q3.qQOI.supqDHfnyYcJeewFXEJNKm.DHe', '2018-11-27 12:22:12', NULL, 0, 0, 0);
INSERT INTO `sys_user` VALUES ('2', 'common1', '$2a$10$BbIr0x3o2LP.FW/Lbs8Q3.qQOI.supqDHfnyYcJeewFXEJNKm.DHe', '2018-11-27 16:22:30', NULL, 0, 0, 0);
INSERT INTO `sys_user` VALUES ('3', 'admin2', '$2a$10$BbIr0x3o2LP.FW/Lbs8Q3.qQOI.supqDHfnyYcJeewFXEJNKm.DHe', '2018-11-27 16:26:21', NULL, 0, 0, 0);

SET FOREIGN_KEY_CHECKS = 1;
