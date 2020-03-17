/*
 Navicat MySQL Data Transfer

 Source Server         : mysql8
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : pay_strategy

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 17/03/2020 14:34:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for payment_channel
-- ----------------------------
DROP TABLE IF EXISTS `payment_channel`;
CREATE TABLE `payment_channel` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `channel_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '渠道名称',
  `channel_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '渠道ID',
  `strategy_bean_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '策略执行beanid',
  PRIMARY KEY (`id`,`channel_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='支付渠道 ';

-- ----------------------------
-- Records of payment_channel
-- ----------------------------
BEGIN;
INSERT INTO `payment_channel` VALUES (1, '支付宝渠道', 'ali_pay', 'aliPayStrategy');
INSERT INTO `payment_channel` VALUES (2, '银联支付渠道', 'union_pay', 'unionPayStrategy');
INSERT INTO `payment_channel` VALUES (3, '微信支付渠道', 'wechat_pay', 'weChatPayStrategy');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
