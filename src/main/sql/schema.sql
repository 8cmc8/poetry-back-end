CREATE DATABASE poetry;
use poetry;
-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(12) NOT NULL COMMENT '用户名',
  `password` varchar(18) NOT NULL COMMENT '密码',
  `gender` char(1) NULL DEFAULT NULL COMMENT '性别', -- m为男，f为女
`birthday` datetime NULL DEFAULT NULL COMMENT '生日',
  `date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for poetry
-- ----------------------------
DROP TABLE IF EXISTS `poetry`;
CREATE TABLE `poetry` (
  `id` int NOT NULL AUTO_INCREMENT,
  `poetry_name` varchar(12) NOT NULL COMMENT '诗名',
  `dynasty` varchar(2) NOT NULL COMMENT '朝代',
  `author` varchar(8) NOT NULL COMMENT '作者',
`content` varchar(255) NOT NULL COMMENT '内容',
`annotation` varchar(255) NULL DEFAULT NULL COMMENT '注释',
`translation` longtext NULL DEFAULT NULL COMMENT '译文',
`image_url` mediumtext NULL DEFAULT NULL COMMENT '图片地址',
  `date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int NOT NULL AUTO_INCREMENT,
  `course_name` varchar(12) NOT NULL COMMENT '课程名',
  `category_id` int NOT NULL COMMENT '课程类目编号',
  `teacher` varchar(12) NULL DEFAULT NULL COMMENT '主讲人',
`course_introduce` longtext NULL DEFAULT NULL COMMENT '课程简介',
`image_url` mediumtext NULL DEFAULT NULL COMMENT '图片地址',
`total_time` int NULL DEFAULT NULL COMMENT '课程总时长/秒',
`course_price` double NULL DEFAULT NULL COMMENT '课程价格',
  `date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `category_id` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for topic
-- ----------------------------
DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic` (
  `id` int NOT NULL AUTO_INCREMENT,
  `topic_name` varchar(12) NOT NULL COMMENT '话题标题',
  `content` varchar(80) NOT NULL COMMENT '话题内容',
  `comment` int NOT NULL DEFAULT 0 COMMENT '评论数',
  `date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for game
-- ----------------------------
DROP TABLE IF EXISTS `game`;
CREATE TABLE `game` (
  `id` int NOT NULL AUTO_INCREMENT,
  `game_name` varchar(12) NOT NULL COMMENT '游戏名',
  `category_id` int NOT NULL COMMENT '游戏类目id',
  `rule` varchar(80) NOT NULL COMMENT '游戏规则',
  `comment` int NULL DEFAULT 0 COMMENT '参与人数',
`date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
INDEX `category_id` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for category_root_poetry
-- ----------------------------
-- DROP TABLE IF EXISTS `category_root_poetry`;
-- CREATE TABLE `category_root_poetry` (
--   `id` int NOT NULL AUTO_INCREMENT,
--   `category_name` varchar(12) NOT NULL COMMENT '诗词根类目名',
--   `category_description` varchar(12) NULL COMMENT '根类目描述',
-- `date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
--   `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
--   PRIMARY KEY (`id`) USING BTREE
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- -- ----------------------------
-- -- Table structure for category_child_poetry
-- -- ----------------------------
-- DROP TABLE IF EXISTS `category_child_poetry`;
-- CREATE TABLE `category_child_poetry` (
--   `id` int NOT NULL AUTO_INCREMENT,
--   `parent_id` int NOT NULL COMMENT '诗词根类目id',
--   `category_name` varchar(12) NOT NULL COMMENT '诗词子类目名',
--   `category_description` varchar(12) NULL COMMENT '子类目描述',
-- `date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
--   `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
--   PRIMARY KEY (`id`) USING BTREE,
--   INDEX `parent_id` (`parent_id`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for category_ poetry
-- ----------------------------
DROP TABLE IF EXISTS `category_poetry`;
CREATE TABLE `category_poetry` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `poetry_id` int(11) DEFAULT NULL COMMENT '诗词id',
  `child_category_name` varchar(10) NOT NULL COMMENT '诗词子类目名',
  `root_category_name` varchar(10) NOT NULL COMMENT '诗词父类目名',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `poetry_id` (`poetry_id`),
  KEY `child_category_name` (`child_category_name`),
  KEY `root_category_name` (`root_category_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for poetry_collection
-- ----------------------------
DROP TABLE IF EXISTS `poetry_collection`;
CREATE TABLE `poetry_collection` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL COMMENT '用户id',
  `poetry_id` int NOT NULL COMMENT '诗词id',
`date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_id` (`user_id`),
  INDEX `poetry_id` (`poetry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for poetry_comment
-- ----------------------------
DROP TABLE IF EXISTS `poetry_comment`;
CREATE TABLE `poetry_comment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL COMMENT '用户id',
  `poetry_id` int NOT NULL COMMENT '诗词id',
`comment` mediumtext NULL DEFAULT NULL COMMENT '诗词评论内容',
`date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_id` (`user_id`),
  INDEX `poetry_id` (`poetry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for category_course
-- ----------------------------
DROP TABLE IF EXISTS `category_course`;
CREATE TABLE `category_course` (
  `id` int NOT NULL AUTO_INCREMENT,
  `category_name` varchar(12) NOT NULL COMMENT '课程类目名',
`date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for course_section
-- ----------------------------
DROP TABLE IF EXISTS `course_section`;
CREATE TABLE `course_section` (
  `id` int NOT NULL AUTO_INCREMENT,
  `course_id` int NOT NULL COMMENT '课程id',
  `section_name` varchar(12) NOT NULL COMMENT '章节名',
`section_introduce` longtext NULL COMMENT '章节简介',
`section_time` int NULL COMMENT '章节总时长/秒',
`video_url` mediumtext NULL COMMENT '地址链接',
`date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `course_id` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for course_collection
-- ----------------------------
DROP TABLE IF EXISTS `course_collection`;
CREATE TABLE `course_collection` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL COMMENT '用户id',
  `course_id` int NOT NULL COMMENT '课程id',
`date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
INDEX `user_id` (`user_id`),
  INDEX `course_id` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for course_comment
-- ----------------------------
DROP TABLE IF EXISTS `course_comment`;
CREATE TABLE `course_comment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL COMMENT '用户id',
  `course_id` int NOT NULL COMMENT '课程id',
`star_level` int NULL COMMENT '评论星级',
`comment` mediumtext NULL COMMENT '课程评论内容',
`date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
INDEX `user_id` (`user_id`),
  INDEX `course_id` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for topic_comment
-- ----------------------------
DROP TABLE IF EXISTS `topic_comment`;
CREATE TABLE `topic_comment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL COMMENT '用户id',
  `topic_id` int NOT NULL COMMENT '话题id',
`comment` mediumtext NULL COMMENT '话题讨论内容',
`date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
INDEX `user_id` (`user_id`),
  INDEX `topic_id` (`topic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for category_game
-- ----------------------------
DROP TABLE IF EXISTS `category_game`;
CREATE TABLE `category_game` (
  `id` int NOT NULL AUTO_INCREMENT,
  `category_name` varchar(12) NOT NULL COMMENT '游戏类目名',
`date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for game_join
-- ----------------------------
DROP TABLE IF EXISTS `game_join`;
CREATE TABLE `game_join` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL COMMENT '用户id',
  `game_id` int NOT NULL COMMENT '游戏id',
`comment` mediumtext NULL COMMENT '发布游戏内容',
`date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
INDEX `user_id` (`user_id`),
  INDEX `game_id` (`game_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Table structure for course_order
-- ----------------------------
DROP TABLE IF EXISTS `course_order`;
CREATE TABLE `course_order` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL COMMENT '用户id',
  `course_id` int NOT NULL COMMENT '课程id',
`deal_price` double NULL COMMENT '成交价',
`date_create` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
INDEX `user_id` (`user_id`),
  INDEX `course_id` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;