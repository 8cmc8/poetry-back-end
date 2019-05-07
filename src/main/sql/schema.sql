CREATE DATABASE poetry;
use poetry;

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(10) NOT NULL DEFAULT '' COMMENT '诗词子类目名',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  `image_url` mediumtext COMMENT '类目图片地址',
  `parent_code` int(11) NOT NULL COMMENT '上级目录',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `child_category_name` (`category_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for category_course
-- ----------------------------
DROP TABLE IF EXISTS `category_course`;
CREATE TABLE `category_course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(12) NOT NULL COMMENT '课程类目名',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for category_game
-- ----------------------------
DROP TABLE IF EXISTS `category_game`;
CREATE TABLE `category_game` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(12) NOT NULL COMMENT '游戏类目名',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for category_poetry
-- ----------------------------

DROP TABLE IF EXISTS `category_poetry`;

CREATE TABLE `category_poetry` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `poetry_id` int(11) NOT NULL COMMENT '诗词id',
  `child_category_id` int(10) NOT NULL COMMENT '诗词子类目id',
  `poetry_name` varchar(11) DEFAULT NULL COMMENT '诗词名',
  `child_category_name` varchar(11) DEFAULT NULL COMMENT '子类目名',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  `image_url` mediumtext COMMENT '子类目图片地址',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `poetry_id` (`poetry_id`),
  KEY `child_category_name` (`child_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '课程名',
  `category_id` int(11) DEFAULT NULL COMMENT '课程类目编号',
  `teacher` varchar(12) DEFAULT NULL COMMENT '主讲人',
  `course_introduce` longtext COMMENT '课程简介',
  `image_url` mediumtext COMMENT '图片地址',
  `total_time` int(11) DEFAULT NULL COMMENT '课程总时长/秒',
  `course_price` double DEFAULT NULL COMMENT '课程价格',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  `free` int(11) DEFAULT NULL COMMENT '是否免费：1为免费，2为付费',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `category_id` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for course_collection
-- ----------------------------
DROP TABLE IF EXISTS `course_collection`;
CREATE TABLE `course_collection` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `course_id` int(11) NOT NULL COMMENT '课程id',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `course_id` (`course_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for course_comment
-- ----------------------------
DROP TABLE IF EXISTS `course_comment`;
CREATE TABLE `course_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `course_id` int(11) NOT NULL COMMENT '课程id',
  `star_level` int(11) DEFAULT NULL COMMENT '评论星级',
  `comment` mediumtext COMMENT '课程评论内容',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `unique` (`user_id`,`course_id`),
  KEY `user_id` (`user_id`),
  KEY `course_id` (`course_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for course_order
-- ----------------------------
DROP TABLE IF EXISTS `course_order`;
CREATE TABLE `course_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `course_id` int(11) NOT NULL COMMENT '课程id',
  `deal_price` double DEFAULT NULL COMMENT '成交价',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `course_id` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for course_section
-- ----------------------------
DROP TABLE IF EXISTS `course_section`;
CREATE TABLE `course_section` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_id` int(11) NOT NULL COMMENT '课程id',
  `section_name` varchar(12) NOT NULL COMMENT '章节名',
  `section_introduce` longtext COMMENT '章节简介',
  `section_time` int(11) DEFAULT NULL COMMENT '章节总时长/秒',
  `video_url` mediumtext COMMENT '地址链接',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  `section_order` int(11) NOT NULL COMMENT '章节序号',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `course_id` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for game
-- ----------------------------
DROP TABLE IF EXISTS `game`;
CREATE TABLE `game` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `game_name` varchar(12) NOT NULL COMMENT '游戏名',
  `category_id` int(11) NOT NULL COMMENT '游戏类目id',
  `rule` varchar(80) NOT NULL COMMENT '游戏规则',
  `comment` int(11) DEFAULT '0' COMMENT '参与人数',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `category_id` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for game_join
-- ----------------------------
DROP TABLE IF EXISTS `game_join`;
CREATE TABLE `game_join` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `game_id` int(11) NOT NULL COMMENT '游戏id',
  `comment` mediumtext COMMENT '发布游戏内容',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `game_id` (`game_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for poetry
-- ----------------------------

DROP TABLE IF EXISTS `poetry`;

CREATE TABLE `poetry` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `poetry_name` varchar(12) NOT NULL DEFAULT '' COMMENT '诗名',
  `dynasty` varchar(2) NOT NULL DEFAULT '' COMMENT '朝代',
  `author` varchar(8) NOT NULL DEFAULT '' COMMENT '作者',
  `content` varchar(255) NOT NULL DEFAULT '' COMMENT '内容',
  `annotation` varchar(255) DEFAULT NULL COMMENT '注释',
  `trans` longtext COMMENT '译文',
  `image_url` mediumtext COMMENT '图片地址',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for poetry_collection
-- ----------------------------
DROP TABLE IF EXISTS `poetry_collection`;
CREATE TABLE `poetry_collection` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `poetry_id` int(11) NOT NULL COMMENT '诗词id',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `poetry_id` (`poetry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for poetry_comment
-- ----------------------------
DROP TABLE IF EXISTS `poetry_comment`;
CREATE TABLE `poetry_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `poetry_id` int(11) NOT NULL COMMENT '诗词id',
  `comment` mediumtext COMMENT '诗词评论内容',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `poetry_id` (`poetry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for topic
-- ----------------------------
DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `topic_name` varchar(12) NOT NULL COMMENT '话题标题',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `content` varchar(80) NOT NULL COMMENT '话题内容',
  `comment_nums` int(11) NOT NULL DEFAULT '0' COMMENT '评论数',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for topic_comment
-- ----------------------------
DROP TABLE IF EXISTS `topic_comment`;
CREATE TABLE `topic_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `topic_id` int(11) NOT NULL COMMENT '话题id',
  `comment` mediumtext COMMENT '话题讨论内容',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `topic_id` (`topic_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(12) NOT NULL COMMENT '用户名',
  `password` varchar(18) NOT NULL COMMENT '密码',
  `gender` tinyint(4) DEFAULT NULL COMMENT '性别（1:男，2:女）',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `date_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
