/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 100137
 Source Host           : localhost:3306
 Source Schema         : quanlycafe

 Target Server Type    : MySQL
 Target Server Version : 100137
 File Encoding         : 65001

 Date: 07/05/2019 15:44:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for areas
-- ----------------------------
DROP TABLE IF EXISTS `areas`;
CREATE TABLE `areas`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `areas_name_unique`(`name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of areas
-- ----------------------------
INSERT INTO `areas` VALUES (1, 'Khu A');
INSERT INTO `areas` VALUES (2, 'Khu B');
INSERT INTO `areas` VALUES (3, 'Khu C');
INSERT INTO `areas` VALUES (4, 'Khu D');

-- ----------------------------
-- Table structure for bill_details
-- ----------------------------
DROP TABLE IF EXISTS `bill_details`;
CREATE TABLE `bill_details`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `id_bill` bigint(20) UNSIGNED NOT NULL,
  `id_product` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `quantity` int(10) UNSIGNED NOT NULL,
  `price` double UNSIGNED NOT NULL,
  `discount` tinyint(3) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `bill_details_id_bill_foreign`(`id_bill`) USING BTREE,
  INDEX `bill_details_id_product_foreign`(`id_product`) USING BTREE,
  CONSTRAINT `bill_details_id_bill_foreign` FOREIGN KEY (`id_bill`) REFERENCES `bills` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `bill_details_id_product_foreign` FOREIGN KEY (`id_product`) REFERENCES `products` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 162 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bill_details
-- ----------------------------
INSERT INTO `bill_details` VALUES (1, 1, 'cm', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (2, 1, 'necr', 3, 24000, 0);
INSERT INTO `bill_details` VALUES (3, 1, 'btg', 2, 15000, 0);
INSERT INTO `bill_details` VALUES (4, 1, 'cvc', 4, 15000, 0);
INSERT INTO `bill_details` VALUES (5, 1, 'stb', 2, 30000, 0);
INSERT INTO `bill_details` VALUES (6, 1, 'tshn', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (7, 1, 'kscl', 1, 35000, 0);
INSERT INTO `bill_details` VALUES (8, 2, 'cm', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (9, 2, 'necr', 3, 24000, 0);
INSERT INTO `bill_details` VALUES (10, 2, 'btg', 2, 15000, 0);
INSERT INTO `bill_details` VALUES (11, 2, 'cvc', 4, 15000, 0);
INSERT INTO `bill_details` VALUES (12, 2, 'stb', 2, 30000, 0);
INSERT INTO `bill_details` VALUES (13, 2, 'tscrm', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (14, 2, 'kb', 2, 35000, 0);
INSERT INTO `bill_details` VALUES (15, 2, 'tsn', 1, 23000, 0);
INSERT INTO `bill_details` VALUES (16, 2, 'tskw', 1, 21000, 0);
INSERT INTO `bill_details` VALUES (17, 2, 'tshn', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (18, 2, 'kscl', 1, 35000, 0);
INSERT INTO `bill_details` VALUES (19, 3, 'necr', 3, 24000, 0);
INSERT INTO `bill_details` VALUES (20, 3, 'btg', 2, 15000, 0);
INSERT INTO `bill_details` VALUES (21, 3, 'cvc', 4, 15000, 0);
INSERT INTO `bill_details` VALUES (22, 3, 'stb', 2, 30000, 0);
INSERT INTO `bill_details` VALUES (23, 3, 'tscrm', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (24, 3, 'kb', 2, 35000, 0);
INSERT INTO `bill_details` VALUES (25, 3, 'tsn', 1, 23000, 0);
INSERT INTO `bill_details` VALUES (26, 3, 'tskw', 1, 21000, 0);
INSERT INTO `bill_details` VALUES (27, 3, 'tshn', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (28, 3, 'kscl', 1, 35000, 0);
INSERT INTO `bill_details` VALUES (29, 4, 'necr', 3, 24000, 0);
INSERT INTO `bill_details` VALUES (30, 4, 'btg', 2, 15000, 0);
INSERT INTO `bill_details` VALUES (31, 4, 'cvc', 4, 15000, 0);
INSERT INTO `bill_details` VALUES (32, 4, 'stb', 2, 30000, 0);
INSERT INTO `bill_details` VALUES (33, 4, 'tscrm', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (34, 4, 'kb', 2, 35000, 0);
INSERT INTO `bill_details` VALUES (35, 4, 'tsn', 1, 23000, 0);
INSERT INTO `bill_details` VALUES (36, 4, 'tskw', 1, 21000, 0);
INSERT INTO `bill_details` VALUES (37, 4, 'tshn', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (38, 4, 'kscl', 1, 35000, 0);
INSERT INTO `bill_details` VALUES (39, 4, 'stx', 2, 22000, 0);
INSERT INTO `bill_details` VALUES (40, 4, 'aqfn', 3, 10000, 0);
INSERT INTO `bill_details` VALUES (41, 4, 'gtx', 2, 128000, 0);
INSERT INTO `bill_details` VALUES (42, 4, 'kvn', 1, 30000, 0);
INSERT INTO `bill_details` VALUES (43, 5, 'cm', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (44, 5, 'necr', 3, 24000, 0);
INSERT INTO `bill_details` VALUES (45, 5, 'btg', 2, 15000, 0);
INSERT INTO `bill_details` VALUES (46, 5, 'cvc', 4, 15000, 0);
INSERT INTO `bill_details` VALUES (47, 5, 'stb', 2, 30000, 0);
INSERT INTO `bill_details` VALUES (48, 5, 'tshn', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (49, 5, 'kscl', 1, 35000, 0);
INSERT INTO `bill_details` VALUES (50, 6, 'cm', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (51, 6, 'necr', 3, 24000, 0);
INSERT INTO `bill_details` VALUES (52, 6, 'btg', 2, 15000, 0);
INSERT INTO `bill_details` VALUES (53, 6, 'cvc', 4, 15000, 0);
INSERT INTO `bill_details` VALUES (54, 6, 'stb', 2, 30000, 0);
INSERT INTO `bill_details` VALUES (55, 6, 'tscrm', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (56, 6, 'kb', 2, 35000, 0);
INSERT INTO `bill_details` VALUES (57, 6, 'tsn', 1, 23000, 0);
INSERT INTO `bill_details` VALUES (58, 6, 'tskw', 1, 21000, 0);
INSERT INTO `bill_details` VALUES (59, 6, 'tshn', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (60, 6, 'kscl', 1, 35000, 0);
INSERT INTO `bill_details` VALUES (61, 7, 'necr', 3, 24000, 0);
INSERT INTO `bill_details` VALUES (62, 7, 'btg', 2, 15000, 0);
INSERT INTO `bill_details` VALUES (63, 7, 'cvc', 4, 15000, 0);
INSERT INTO `bill_details` VALUES (64, 7, 'stb', 2, 30000, 0);
INSERT INTO `bill_details` VALUES (65, 7, 'tscrm', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (66, 7, 'kb', 2, 35000, 0);
INSERT INTO `bill_details` VALUES (67, 7, 'tsn', 1, 23000, 0);
INSERT INTO `bill_details` VALUES (68, 7, 'tskw', 1, 21000, 0);
INSERT INTO `bill_details` VALUES (69, 7, 'tshn', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (70, 7, 'kscl', 1, 35000, 0);
INSERT INTO `bill_details` VALUES (71, 8, 'necr', 3, 24000, 0);
INSERT INTO `bill_details` VALUES (72, 8, 'btg', 2, 15000, 0);
INSERT INTO `bill_details` VALUES (73, 8, 'cvc', 4, 15000, 0);
INSERT INTO `bill_details` VALUES (74, 8, 'stb', 2, 30000, 0);
INSERT INTO `bill_details` VALUES (75, 8, 'tscrm', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (76, 8, 'kb', 2, 35000, 0);
INSERT INTO `bill_details` VALUES (77, 8, 'tsn', 1, 23000, 0);
INSERT INTO `bill_details` VALUES (78, 8, 'tskw', 1, 21000, 0);
INSERT INTO `bill_details` VALUES (79, 8, 'tshn', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (80, 8, 'kscl', 1, 35000, 0);
INSERT INTO `bill_details` VALUES (81, 8, 'stx', 2, 22000, 0);
INSERT INTO `bill_details` VALUES (82, 8, 'aqfn', 3, 10000, 0);
INSERT INTO `bill_details` VALUES (83, 8, 'gtx', 2, 128000, 0);
INSERT INTO `bill_details` VALUES (84, 8, 'kvn', 1, 30000, 0);
INSERT INTO `bill_details` VALUES (85, 9, 'cm', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (86, 9, 'necr', 3, 24000, 0);
INSERT INTO `bill_details` VALUES (87, 9, 'btg', 2, 15000, 0);
INSERT INTO `bill_details` VALUES (88, 9, 'cvc', 4, 15000, 0);
INSERT INTO `bill_details` VALUES (89, 9, 'stb', 2, 30000, 0);
INSERT INTO `bill_details` VALUES (90, 9, 'tshn', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (91, 9, 'kscl', 1, 35000, 0);
INSERT INTO `bill_details` VALUES (92, 10, 'cm', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (93, 10, 'necr', 3, 24000, 0);
INSERT INTO `bill_details` VALUES (94, 10, 'btg', 2, 15000, 0);
INSERT INTO `bill_details` VALUES (95, 10, 'cvc', 4, 15000, 0);
INSERT INTO `bill_details` VALUES (96, 10, 'stb', 2, 30000, 0);
INSERT INTO `bill_details` VALUES (97, 10, 'tscrm', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (98, 10, 'kb', 2, 35000, 0);
INSERT INTO `bill_details` VALUES (99, 10, 'tsn', 1, 23000, 0);
INSERT INTO `bill_details` VALUES (100, 10, 'tskw', 1, 21000, 0);
INSERT INTO `bill_details` VALUES (101, 10, 'tshn', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (102, 10, 'kscl', 1, 35000, 0);
INSERT INTO `bill_details` VALUES (103, 11, 'necr', 3, 24000, 0);
INSERT INTO `bill_details` VALUES (104, 11, 'btg', 2, 15000, 0);
INSERT INTO `bill_details` VALUES (105, 11, 'cvc', 4, 15000, 0);
INSERT INTO `bill_details` VALUES (106, 11, 'stb', 2, 30000, 0);
INSERT INTO `bill_details` VALUES (107, 11, 'tscrm', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (108, 11, 'kb', 2, 35000, 0);
INSERT INTO `bill_details` VALUES (109, 11, 'tsn', 1, 23000, 0);
INSERT INTO `bill_details` VALUES (110, 11, 'tskw', 1, 21000, 0);
INSERT INTO `bill_details` VALUES (111, 11, 'tshn', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (112, 11, 'kscl', 1, 35000, 0);
INSERT INTO `bill_details` VALUES (113, 12, 'necr', 3, 24000, 0);
INSERT INTO `bill_details` VALUES (114, 12, 'btg', 2, 15000, 0);
INSERT INTO `bill_details` VALUES (115, 12, 'cvc', 4, 15000, 0);
INSERT INTO `bill_details` VALUES (116, 12, 'stb', 2, 30000, 0);
INSERT INTO `bill_details` VALUES (117, 12, 'tscrm', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (118, 12, 'kb', 2, 35000, 0);
INSERT INTO `bill_details` VALUES (119, 12, 'tsn', 1, 23000, 0);
INSERT INTO `bill_details` VALUES (120, 12, 'tskw', 1, 21000, 0);
INSERT INTO `bill_details` VALUES (121, 12, 'tshn', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (122, 12, 'kscl', 1, 35000, 0);
INSERT INTO `bill_details` VALUES (123, 12, 'stx', 2, 22000, 0);
INSERT INTO `bill_details` VALUES (124, 12, 'aqfn', 3, 10000, 0);
INSERT INTO `bill_details` VALUES (125, 12, 'gtx', 2, 128000, 0);
INSERT INTO `bill_details` VALUES (126, 12, 'kvn', 1, 30000, 0);
INSERT INTO `bill_details` VALUES (129, 14, 'cvc', 7, 15000, 0);
INSERT INTO `bill_details` VALUES (130, 14, 'aqfn', 1, 10000, 0);
INSERT INTO `bill_details` VALUES (131, 15, 'std', 5, 22000, 0);
INSERT INTO `bill_details` VALUES (132, 15, 'stcr', 6, 20000, 0);
INSERT INTO `bill_details` VALUES (133, 15, 'stcc', 5, 20000, 0);
INSERT INTO `bill_details` VALUES (134, 16, 'kvn', 4, 30000, 0);
INSERT INTO `bill_details` VALUES (135, 16, 'kscl', 4, 35000, 0);
INSERT INTO `bill_details` VALUES (136, 16, 'ksr', 4, 28000, 0);
INSERT INTO `bill_details` VALUES (139, 13, 'cvc', 10, 15000, 0);
INSERT INTO `bill_details` VALUES (140, 13, 'kvn', 12, 30000, 0);
INSERT INTO `bill_details` VALUES (141, 17, 'st', 1, 12000, 0);
INSERT INTO `bill_details` VALUES (142, 17, 'bbws', 1, 19000, 0);
INSERT INTO `bill_details` VALUES (143, 17, 'ps', 1, 15000, 0);
INSERT INTO `bill_details` VALUES (144, 17, 'btg', 1, 15000, 0);
INSERT INTO `bill_details` VALUES (145, 17, 'aqfn', 10, 10000, 0);
INSERT INTO `bill_details` VALUES (146, 17, 'cccl', 1, 15000, 0);
INSERT INTO `bill_details` VALUES (147, 17, 'lv', 1, 10000, 0);
INSERT INTO `bill_details` VALUES (148, 17, 'bhnk', 1, 18000, 0);
INSERT INTO `bill_details` VALUES (149, 18, 'bbws', 7, 19000, 0);
INSERT INTO `bill_details` VALUES (150, 18, 'aqfn', 7, 10000, 0);
INSERT INTO `bill_details` VALUES (151, 18, 'bhnk', 4, 18000, 0);
INSERT INTO `bill_details` VALUES (152, 19, 'aqfn', 1, 10000, 50);
INSERT INTO `bill_details` VALUES (153, 20, 'bbws', 2, 19000, 0);
INSERT INTO `bill_details` VALUES (154, 20, 'aqfn', 1, 10000, 0);
INSERT INTO `bill_details` VALUES (155, 20, 'bhnk', 2, 18000, 0);
INSERT INTO `bill_details` VALUES (159, 21, 'st', 4, 12000, 0);
INSERT INTO `bill_details` VALUES (160, 21, 'cccl', 4, 15000, 0);
INSERT INTO `bill_details` VALUES (161, 21, 'lv', 3, 10000, 0);

-- ----------------------------
-- Table structure for bills
-- ----------------------------
DROP TABLE IF EXISTS `bills`;
CREATE TABLE `bills`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `time_in` datetime(0) NOT NULL,
  `time_out` datetime(0) NULL DEFAULT NULL,
  `total` double UNSIGNED NOT NULL,
  `id_user_in` bigint(20) UNSIGNED NOT NULL,
  `id_user_out` bigint(20) UNSIGNED NULL DEFAULT NULL,
  `id_table` int(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `bills_id_user_in_foreign`(`id_user_in`) USING BTREE,
  INDEX `bills_id_user_out_foreign`(`id_user_out`) USING BTREE,
  INDEX `bills_id_table_foreign`(`id_table`) USING BTREE,
  CONSTRAINT `bills_id_table_foreign` FOREIGN KEY (`id_table`) REFERENCES `tables` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `bills_id_user_in_foreign` FOREIGN KEY (`id_user_in`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `bills_id_user_out_foreign` FOREIGN KEY (`id_user_out`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bills
-- ----------------------------
INSERT INTO `bills` VALUES (1, '2019-02-16 16:48:50', '2019-02-16 17:14:35', 295000, 1, 1, 1);
INSERT INTO `bills` VALUES (2, '2019-02-16 12:48:45', '2019-02-16 13:24:35', 428000, 1, 2, 2);
INSERT INTO `bills` VALUES (3, '2019-02-16 09:48:50', '2019-02-16 10:14:35', 409000, 2, 3, 3);
INSERT INTO `bills` VALUES (4, '2019-02-16 09:28:50', '2019-02-16 11:15:55', 769000, 1, 3, 4);
INSERT INTO `bills` VALUES (5, '2019-02-17 16:48:50', '2019-02-17 17:14:35', 295000, 2, 2, 5);
INSERT INTO `bills` VALUES (6, '2019-02-17 12:48:45', '2019-02-17 13:24:35', 428000, 2, 3, 6);
INSERT INTO `bills` VALUES (7, '2019-02-17 09:48:50', '2019-02-17 10:14:35', 409000, 3, 2, 7);
INSERT INTO `bills` VALUES (8, '2019-02-17 09:28:50', '2019-02-17 11:15:55', 769000, 1, 2, 8);
INSERT INTO `bills` VALUES (9, '2019-02-18 16:48:50', '2019-02-18 17:14:35', 295000, 3, 3, 9);
INSERT INTO `bills` VALUES (10, '2019-02-18 12:48:45', '2019-02-18 13:24:35', 428000, 3, 3, 10);
INSERT INTO `bills` VALUES (11, '2019-02-18 09:48:50', '2019-02-18 10:14:35', 409000, 3, 2, 11);
INSERT INTO `bills` VALUES (12, '2019-02-18 09:28:50', '2019-02-18 11:15:55', 769000, 2, 1, 12);
INSERT INTO `bills` VALUES (13, '2019-04-17 08:15:18', '2019-04-17 08:46:04', 510000, 1, 1, 3);
INSERT INTO `bills` VALUES (14, '2019-04-17 08:18:15', '2019-04-17 08:20:35', 115000, 1, 1, 1);
INSERT INTO `bills` VALUES (15, '2019-04-17 08:19:45', NULL, 0, 1, NULL, 21);
INSERT INTO `bills` VALUES (16, '2019-04-17 08:19:59', NULL, 0, 1, NULL, 17);
INSERT INTO `bills` VALUES (17, '2019-04-17 08:42:06', '2019-04-17 08:45:10', 204000, 1, 1, 1);
INSERT INTO `bills` VALUES (18, '2019-04-17 08:58:29', '2019-04-17 08:58:54', 275000, 1, 1, 3);
INSERT INTO `bills` VALUES (19, '2019-04-17 09:00:15', '2019-04-17 09:00:28', 10000, 1, 1, 1);
INSERT INTO `bills` VALUES (20, '2019-04-17 09:00:35', NULL, 0, 1, NULL, 1);
INSERT INTO `bills` VALUES (21, '2019-04-20 14:06:15', '2019-04-20 14:11:56', 138000, 1, 1, 3);

-- ----------------------------
-- Table structure for categories
-- ----------------------------
DROP TABLE IF EXISTS `categories`;
CREATE TABLE `categories`  (
  `id` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `categories_name_unique`(`name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of categories
-- ----------------------------
INSERT INTO `categories` VALUES ('bc', 'Bia - Coke');
INSERT INTO `categories` VALUES ('ht', 'Hồng trà');
INSERT INTO `categories` VALUES ('ksc', 'Kem - Sữa chua');
INSERT INTO `categories` VALUES ('netc', 'Nước ép trái cây');
INSERT INTO `categories` VALUES ('st', 'Sinh tố');
INSERT INTO `categories` VALUES ('ta', 'Thức ăn');
INSERT INTO `categories` VALUES ('tcf', 'Trà - Cafe');
INSERT INTO `categories` VALUES ('ts', 'Trà sữa');

-- ----------------------------
-- Table structure for migrations
-- ----------------------------
DROP TABLE IF EXISTS `migrations`;
CREATE TABLE `migrations`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `migration` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of migrations
-- ----------------------------
INSERT INTO `migrations` VALUES (17, '2014_10_12_000000_create_users_table', 1);
INSERT INTO `migrations` VALUES (18, '2014_10_12_100000_create_password_resets_table', 1);
INSERT INTO `migrations` VALUES (19, '2019_02_15_133540_create_areas_table', 1);
INSERT INTO `migrations` VALUES (20, '2019_02_15_133654_create_tables_table', 1);
INSERT INTO `migrations` VALUES (21, '2019_02_15_133715_create_categories_table', 1);
INSERT INTO `migrations` VALUES (22, '2019_02_15_133734_create_products_table', 1);
INSERT INTO `migrations` VALUES (23, '2019_02_15_133823_create_bills_table', 1);
INSERT INTO `migrations` VALUES (24, '2019_02_15_133842_create_bill_details_table', 1);

-- ----------------------------
-- Table structure for password_resets
-- ----------------------------
DROP TABLE IF EXISTS `password_resets`;
CREATE TABLE `password_resets`  (
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `token` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp(0) NULL DEFAULT NULL,
  INDEX `password_resets_email_index`(`email`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for products
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products`  (
  `id` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `price` double UNSIGNED NOT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `id_category` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `products_name_unique`(`name`) USING BTREE,
  INDEX `products_id_category_foreign`(`id_category`) USING BTREE,
  CONSTRAINT `products_id_category_foreign` FOREIGN KEY (`id_category`) REFERENCES `categories` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of products
-- ----------------------------
INSERT INTO `products` VALUES ('aqfn', 'Nước suối Aquafina', 10000, '', 'bc');
INSERT INTO `products` VALUES ('bbws', 'Bia Budweiser', 19000, '', 'bc');
INSERT INTO `products` VALUES ('bhnk', 'Bia Heineken', 18000, '', 'bc');
INSERT INTO `products` VALUES ('bn', 'Bào Ngư', 400000, '', 'ta');
INSERT INTO `products` VALUES ('btg', 'Bia Tiger', 15000, '', 'bc');
INSERT INTO `products` VALUES ('btt', 'Bánh Tráng Trộn', 18000, '', 'ta');
INSERT INTO `products` VALUES ('bvc', 'Bò Viên Chiên', 15000, '', 'ta');
INSERT INTO `products` VALUES ('bwy', 'Bò Wagyu', 1250000, '', 'ta');
INSERT INTO `products` VALUES ('cc', 'Cacao', 20000, '', 'tcf');
INSERT INTO `products` VALUES ('cccl', 'Coca Cola', 15000, '', 'bc');
INSERT INTO `products` VALUES ('cfd', 'Cafe Đen', 15000, '', 'tcf');
INSERT INTO `products` VALUES ('cfs', 'Cafe Sữa', 22000, '', 'tcf');
INSERT INTO `products` VALUES ('cm', 'Chanh muối', 19000, '', 'netc');
INSERT INTO `products` VALUES ('cpcn', 'Cappuccino', 45000, '', 'tcf');
INSERT INTO `products` VALUES ('cvc', 'Cá Viên Chiên', 15000, '', 'ta');
INSERT INTO `products` VALUES ('dc', 'Đá chanh', 15000, '', 'netc');
INSERT INTO `products` VALUES ('dm', 'Đá me', 18000, '', 'netc');
INSERT INTO `products` VALUES ('eps', 'Espresso', 35000, '', 'tcf');
INSERT INTO `products` VALUES ('gtx', 'Đùi gà Texas', 128000, '', 'ta');
INSERT INTO `products` VALUES ('htbh', 'Hồng trà Bạc Hà', 23000, '', 'ht');
INSERT INTO `products` VALUES ('htd', 'Hồng trà Dâu', 23000, '', 'ht');
INSERT INTO `products` VALUES ('htdl', 'Hồng trà Dưa Lưới', 23000, '', 'ht');
INSERT INTO `products` VALUES ('hthtc', 'Hồng trà Hạt Trái Cây', 23000, '', 'ht');
INSERT INTO `products` VALUES ('htlh', 'Hồng trà Lô Hội', 23000, '', 'ht');
INSERT INTO `products` VALUES ('htmo', 'Hồng trà Mật Ong', 23000, '', 'ht');
INSERT INTO `products` VALUES ('htss', 'Hồng trà Sương Sáo', 23000, '', 'ht');
INSERT INTO `products` VALUES ('kb', 'Kimbap', 35000, '', 'ta');
INSERT INTO `products` VALUES ('kc', 'King Crab', 2800000, '', 'ta');
INSERT INTO `products` VALUES ('kscl', 'Kem Socola', 35000, '', 'ksc');
INSERT INTO `products` VALUES ('ksr', 'Kem Sầu Riêng', 28000, '', 'ksc');
INSERT INTO `products` VALUES ('ktc', 'Khoai Tây Chiên', 20000, '', 'ta');
INSERT INTO `products` VALUES ('kvn', 'Kem Vani', 30000, '', 'ksc');
INSERT INTO `products` VALUES ('lt', 'Latte', 25000, '', 'tcf');
INSERT INTO `products` VALUES ('lv', 'Nước suối Lavie', 10000, '', 'bc');
INSERT INTO `products` VALUES ('mc', 'Mì cay', 40000, '', 'ta');
INSERT INTO `products` VALUES ('mch', 'Mocha', 17000, '', 'tcf');
INSERT INTO `products` VALUES ('nec', 'Nước ép Cam', 26000, '', 'netc');
INSERT INTO `products` VALUES ('necc', 'Nước ép Cà Chua', 24000, '', 'netc');
INSERT INTO `products` VALUES ('necr', 'Nước ép Cà Rốt', 24000, '', 'netc');
INSERT INTO `products` VALUES ('nedh', 'Nước ép Dưa Hấu', 22000, '', 'netc');
INSERT INTO `products` VALUES ('neo', 'Nước ép Ổi', 22000, '', 'netc');
INSERT INTO `products` VALUES ('net', 'Nước ép Táo', 24000, '', 'netc');
INSERT INTO `products` VALUES ('ps', 'Pepsi', 15000, '', 'bc');
INSERT INTO `products` VALUES ('sccc', 'Sữa chua Ca Cao', 23000, '', 'ksc');
INSERT INTO `products` VALUES ('schq', 'Sữa chua Hoa Quả', 24000, '', 'ksc');
INSERT INTO `products` VALUES ('scnc', 'Sữa chua Nếp Cẩm', 22000, '', 'ksc');
INSERT INTO `products` VALUES ('sctc', 'Sữa chua Thập Cẩm', 28000, '', 'ksc');
INSERT INTO `products` VALUES ('scvq', 'Sữa chua Việt Quất', 25000, '', 'ksc');
INSERT INTO `products` VALUES ('st', 'Sting', 12000, '', 'bc');
INSERT INTO `products` VALUES ('stb', 'Sinh tố Bơ', 30000, '', 'st');
INSERT INTO `products` VALUES ('stcc', 'Sinh tố Cà Chua', 20000, '', 'st');
INSERT INTO `products` VALUES ('stcr', 'Sinh tố Cà Rốt', 20000, '', 'st');
INSERT INTO `products` VALUES ('std', 'Sinh tố Dâu', 22000, '', 'st');
INSERT INTO `products` VALUES ('stdu', 'Sinh tố Dừa', 20000, '', 'st');
INSERT INTO `products` VALUES ('stmc', 'Sinh tố Mãng Cầu', 25000, '', 'st');
INSERT INTO `products` VALUES ('stspc', 'Sinh tố Sapochê', 24000, '', 'st');
INSERT INTO `products` VALUES ('stx', 'Sinh tố Xoài', 22000, '', 'st');
INSERT INTO `products` VALUES ('tlt', 'Trà Lipton', 20000, '', 'tcf');
INSERT INTO `products` VALUES ('tsbh', 'Trà sữa Bạc Hà', 19000, '', 'ts');
INSERT INTO `products` VALUES ('tscd', 'Trà sữa Chanh Dây', 23000, '', 'ts');
INSERT INTO `products` VALUES ('tscrm', 'Trà sữa Caramen', 19000, '', 'ts');
INSERT INTO `products` VALUES ('tsd', 'Trà sữa Dâu', 22000, '', 'ts');
INSERT INTO `products` VALUES ('tsda', 'Trà sữa Đào', 22000, '', 'ts');
INSERT INTO `products` VALUES ('tshn', 'Trà sữa Honny', 19000, '', 'ts');
INSERT INTO `products` VALUES ('tskw', 'Trà sữa Kiwi', 21000, '', 'ts');
INSERT INTO `products` VALUES ('tsn', 'Trà sữa Nho', 23000, '', 'ts');
INSERT INTO `products` VALUES ('tsph', 'Trà sữa Phượng Hoàng', 18000, '', 'ts');
INSERT INTO `products` VALUES ('tsscl', 'Trà sữa Socola', 16000, '', 'ts');
INSERT INTO `products` VALUES ('tssr', 'Trà sữa Sầu Riêng', 24000, '', 'ts');
INSERT INTO `products` VALUES ('tst', 'Trà sữa Táo', 25000, '', 'ts');
INSERT INTO `products` VALUES ('tstc', 'Trà sữa Trân Châu', 18000, '', 'ts');
INSERT INTO `products` VALUES ('tsv', 'Trà sữa Vải', 17000, '', 'ts');
INSERT INTO `products` VALUES ('vc', 'Vi Cá', 35000, '', 'ta');
INSERT INTO `products` VALUES ('xxd', 'Xúc xích Đức', 24000, '', 'ta');

-- ----------------------------
-- Table structure for tables
-- ----------------------------
DROP TABLE IF EXISTS `tables`;
CREATE TABLE `tables`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `seat` tinyint(3) UNSIGNED NOT NULL,
  `status` tinyint(1) NOT NULL,
  `id_area` int(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `tables_id_area_foreign`(`id_area`) USING BTREE,
  CONSTRAINT `tables_id_area_foreign` FOREIGN KEY (`id_area`) REFERENCES `areas` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tables
-- ----------------------------
INSERT INTO `tables` VALUES (1, 'Bàn A1', 10, 1, 1);
INSERT INTO `tables` VALUES (2, 'Bàn A2', 10, 0, 1);
INSERT INTO `tables` VALUES (3, 'Bàn A3', 10, 0, 1);
INSERT INTO `tables` VALUES (4, 'Bàn A4', 10, 0, 1);
INSERT INTO `tables` VALUES (5, 'Bàn A5', 10, 0, 1);
INSERT INTO `tables` VALUES (6, 'Bàn A6', 10, 0, 1);
INSERT INTO `tables` VALUES (7, 'Bàn A7', 10, 0, 1);
INSERT INTO `tables` VALUES (8, 'Bàn A8', 10, 0, 1);
INSERT INTO `tables` VALUES (9, 'Bàn A9', 10, 0, 1);
INSERT INTO `tables` VALUES (10, 'Bàn A10', 10, 0, 1);
INSERT INTO `tables` VALUES (11, 'Bàn A11', 10, 0, 1);
INSERT INTO `tables` VALUES (12, 'Bàn A12', 10, 0, 1);
INSERT INTO `tables` VALUES (13, 'Bàn A13', 10, 0, 1);
INSERT INTO `tables` VALUES (14, 'Bàn A14', 10, 0, 1);
INSERT INTO `tables` VALUES (15, 'Bàn A15', 10, 0, 1);
INSERT INTO `tables` VALUES (16, 'Bàn B1', 10, 0, 2);
INSERT INTO `tables` VALUES (17, 'Bàn B2', 10, 1, 2);
INSERT INTO `tables` VALUES (18, 'Bàn B3', 10, 0, 2);
INSERT INTO `tables` VALUES (19, 'Bàn B4', 10, 0, 2);
INSERT INTO `tables` VALUES (20, 'Bàn B5', 10, 0, 2);
INSERT INTO `tables` VALUES (21, 'Bàn B6', 10, 1, 2);
INSERT INTO `tables` VALUES (22, 'Bàn B7', 10, 0, 2);
INSERT INTO `tables` VALUES (23, 'Bàn B8', 10, 0, 2);
INSERT INTO `tables` VALUES (24, 'Bàn B9', 10, 0, 2);
INSERT INTO `tables` VALUES (25, 'Bàn B10', 10, 0, 3);
INSERT INTO `tables` VALUES (26, 'Bàn C1', 10, 0, 3);
INSERT INTO `tables` VALUES (27, 'Bàn C2', 10, 0, 3);
INSERT INTO `tables` VALUES (28, 'Bàn C3', 10, 0, 3);
INSERT INTO `tables` VALUES (29, 'Bàn C4', 10, 0, 3);
INSERT INTO `tables` VALUES (30, 'Bàn C5', 10, 0, 3);
INSERT INTO `tables` VALUES (31, 'Bàn C6', 10, 0, 3);
INSERT INTO `tables` VALUES (32, 'Bàn C7', 10, 0, 3);
INSERT INTO `tables` VALUES (33, 'Bàn C8', 10, 0, 3);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `fullname` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `phone` varchar(12) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `salary` double UNSIGNED NOT NULL,
  `access_level` tinyint(3) UNSIGNED NOT NULL,
  `remember_token` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `users_username_unique`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'admin1', 'fc4afe78701bc555de92d38da7b2a9a8', 'Nguyễn Hà Minh Huy', '0523939339', 'image_1.png', 15000000, 1, NULL);
INSERT INTO `users` VALUES (2, 'admin2', 'fc4afe78701bc555de92d38da7b2a9a8', 'Đặng Hoàng Khang', '0523939139', 'image_2.jpg', 25000000, 1, NULL);
INSERT INTO `users` VALUES (3, 'admin3', 'fc4afe78701bc555de92d38da7b2a9a8', 'Nguyễn Tấn Luông', '0899167379', 'image_3.jpg', 35000000, 1, NULL);
INSERT INTO `users` VALUES (4, 'member1', 'fc4afe78701bc555de92d38da7b2a9a8', 'Alan Turing', '0945335379', 'image_4.jpg', 45000000, 0, NULL);
INSERT INTO `users` VALUES (5, 'member2', 'fc4afe78701bc555de92d38da7b2a9a8', 'Dennis Ritchie', '0886494579', 'image_5.jpg', 55000000, 0, NULL);
INSERT INTO `users` VALUES (6, 'member3', 'fc4afe78701bc555de92d38da7b2a9a8', 'Linus Torvalds', '0898083079', 'image_6.png', 50000000, 0, NULL);
INSERT INTO `users` VALUES (7, 'member4', 'fc4afe78701bc555de92d38da7b2a9a8', 'Mark Zuckerberg', '0942460579', 'image_7.png', 40000000, 0, NULL);
INSERT INTO `users` VALUES (8, 'member5', 'fc4afe78701bc555de92d38da7b2a9a8', 'Larry Page', '0868641232', 'image_8.jpg', 30000000, 0, NULL);
INSERT INTO `users` VALUES (9, 'member6', 'fc4afe78701bc555de92d38da7b2a9a8', 'Steve Jobs', '0868324272', 'image_9.jpg', 20000000, 0, NULL);

SET FOREIGN_KEY_CHECKS = 1;
