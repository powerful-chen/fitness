/*
 Navicat MySQL Data Transfer

 Source Server         : 项目project
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : fitness

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 07/04/2021 22:36:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `course_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '课程ID',
  `course_section_id` int(11) NULL DEFAULT 1 COMMENT '课程栏目id',
  `calories` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '消耗热量',
  `intensity` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '训练难度',
  `times` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所需时间',
  `training_frequency` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '练习频次',
  `background_image_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '背景图片名',
  PRIMARY KEY (`course_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, 1, '30', 'K1', '7', '不限', '862662a1-c501-4b94-a45c-bd99ab1cca4dprepare1.jpg');

-- ----------------------------
-- Table structure for course_details
-- ----------------------------
DROP TABLE IF EXISTS `course_details`;
CREATE TABLE `course_details`  (
  `course_content_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '课程内容ID',
  `course_sub_id` int(11) NULL DEFAULT 0 COMMENT '子模块ID',
  `image_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片/视频名',
  `step` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '步骤',
  `breathe` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '呼吸',
  `feel` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '动作感觉',
  `fault` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '常见错误',
  `tip` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '教练提示',
  PRIMARY KEY (`course_content_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_details
-- ----------------------------
INSERT INTO `course_details` VALUES (1, 1, '0e155be0-87d3-427a-89d2-5a72217f97ae_chaos_0728_B010C022_main_s.mp4', '双脚约两倍肩宽，脚尖朝向斜前方，重心放在一侧腿上，下蹲至另一侧腿完全伸直\n背部挺直，微微俯身，将伸直的大腿内侧朝向地面，双手触地后做另一侧\n双脚脚跟不要离地', '全程保持均匀呼吸', '大腿内侧有牵拉感', '错误：动作过快\n解决：每侧动作做完略有停顿，感受大腿内侧的牵拉感', '挺直腰背，向前俯身\n双脚跨开最大距离\n大腿内侧朝向地面');
INSERT INTO `course_details` VALUES (2, 2, '71479f5a-de5e-4d25-9dda-fb02fc3d077e_chaos_0816_B018C049_s.mp4', '右手扶椅子保持平衡，左手握住左脚踝尽力向上提，将脚跟贴近臀部\n收腹，向前挺髋', '全程保持均匀呼吸', '左侧大腿前侧有明显牵拉感', '错误：大腿前侧牵拉感不明显\n解决：收腹，向前挺髋，同时左手尽力向上提', '握住脚踝，将腿上提\n上身挺直');
INSERT INTO `course_details` VALUES (3, 3, 'a66cc7e3-477d-4348-866b-8c258e11b14d_chaos_0816_B018C048_s.mp4', '左手扶椅子保持平衡，右手握住右脚踝尽力向上提，将脚跟贴近臀部\n收腹，向前挺髋', '全程保持均匀呼吸', '右侧大腿前侧有明显牵拉感', '错误：大腿前侧牵拉感不明显\n解决：收腹，向前挺髋，同时右手尽力向上', '握住脚腕，将腿上提\n上身挺直');
INSERT INTO `course_details` VALUES (4, 4, '68b66feb-5e06-44e5-90c8-04e040824d3d_chaos_0728_B023C016_main_s.mp4', '左腿在前，膝盖微屈，两腿前后约半腿长距离\n勾左脚，身体前屈，保持住', '深呼吸，呼吸时身体放松，增加拉伸幅度', '左大腿后群有拉伸感', '错误：弯腰低头，骨盆旋转\n解决：收腹，腰背挺直，目视前方，骨盆左侧向后，右侧向前', '左腿伸直\n腹部向前贴近大腿');
INSERT INTO `course_details` VALUES (5, 5, '508b6854-1843-47f5-91e9-4f6701b51b8f_chaos_0728_B023C015_main_s.mp4', '右腿在前，膝盖微屈，两腿前后约半腿长距离\n勾右脚，身体前屈，保持住', '深呼吸，呼吸时身体放松，增加拉伸幅度', '右大腿后群有拉伸感', '错误：弯腰低头，骨盆旋转\n解决：收腹,腰背挺直，目视前方，骨盆右侧向后，左侧向前', '右腿伸直\n腹部贴向大腿');
INSERT INTO `course_details` VALUES (6, 6, '0ab464ec-9a7f-4f8d-8df2-c8cfb1101b5c_chaos_0728_B007C016_main_s.mp4', '面向墙壁，屈肘扶墙\n右腿前弓步，右脚脚尖抵墙\n左腿后撤伸直，左脚脚跟踩地\n臀部下沉，感受左小腿后侧的牵拉感', '全程保持均匀呼吸，不要憋气', '左小腿后侧有明显牵拉感，同时伴随一定强度的疼痛感', '错误：牵拉感不明显\n解决：弓步再深一些，后脚脚跟不要离地', '臀部下沉\n小腿后侧有拉伸感\n脚跟踩地');
INSERT INTO `course_details` VALUES (7, 5, '44196848-c7dc-4928-83c7-fbddd8553901_chaos_0728_B007C017_main_s.mp4', '面向墙壁，屈肘扶墙\n左腿前弓步，左脚脚尖抵墙\n右腿后撤伸直，右脚脚跟踩地\n臀部下沉，感受右小腿后侧的牵拉感', '全程保持均匀呼吸，不要憋气', '右小腿后侧有明显牵拉感，同时伴随一定强度的疼痛感', '错误：牵拉感不明显\n解决：弓步再深一些，后脚脚跟不要离地', '臀部下压\n小腿后侧有拉伸感\n脚后跟踩地');
INSERT INTO `course_details` VALUES (8, 8, 'e2d01bc7-6ebf-41b4-8b16-4d6a5d52d3a8_chaos_0728_A029C0013_main_s.mp4', '双手用力抱紧膝盖紧贴腹部上提\n提膝同时站起脚尖', '抬腿时吸气，还原时呼气', '抬腿时，臀部有一定的牵拉感', '错误：腿部提起幅度过小\n解决：适当增加提腿幅度，感觉到臀部有一定的牵拉感', '抱紧膝盖\n将膝盖拉向胸口\n脚尖踏起');
INSERT INTO `course_details` VALUES (9, 9, 'f3ab8fcb-db15-4fe1-8c52-14dfc1e9d16e_chaos_0728_B033C043_main_s.mp4', '自然站立，双手叉腰，双脚微微分开\n将一侧腿抬起，外展，再落回站立位;略作停顿后做另一侧腿的外展\n第二个循环时将一侧腿保持外展的状态下抬起，内收，再落回站立位；略作停顿后做另一侧腿的内收\n控制动作速度，上身保持稳定', '抬腿时呼气，落腿时吸气', '错误：身体随着腿部的运动而晃动\n解决：尽量稳定上半身，可以扶住身边的桌椅或者墙壁保持稳定', '错误：身体随着腿部的运动而晃动\n解决：尽量稳定上半身，可以扶住身边的桌椅或者墙壁保持稳定', '从侧面抬起膝盖\n水平向内摆\n落下，再反方向摆腿');
INSERT INTO `course_details` VALUES (10, 10, '75ecf5ed-d3ae-4874-b07b-85fafc979d22_chaos_0728_A074C025_main_s.mp4', '双脚并拢，自然站立\n向前迈一侧腿呈弓步，前腿小腿垂直于地面，大腿平行于地面，后腿脚尖朝前与膝关节在同一方向\n双臂伸直前平举于胸前，掌心相对，向前腿一侧转体，打开手臂；略作停顿，然后还原到胸前，回到起始状态;换腿向前迈出，做另一侧的转体', '转体时呼气，还原时吸气', '躯干有牵拉感', '错误:躯干牵拉感不强\n解决:增大转体幅度，到最大限度时略作停顿，深吸气', '眼睛看着后面的手\n手臂与地面平行\n躯干保持正直，不能前倾后仰');
INSERT INTO `course_details` VALUES (11, 11, '00df781a-a7ae-4d01-93ca-241587a8d537_chaos_0728_B023C061_main_s.mp4', '双手扶住椅子保持身体平衡\n保持骨盆位置不动，左腿向身体的后方抬起，停顿一会儿，返回，重复动作', '自然呼吸', '左臀部有发力感,高次数练习后会有明显的酸胀感', '错误：抬腿过程中骨盆位置出现移动\n解决：始终保持骨盆的位置不动，抬腿幅度不用过大', '向上抬起腿部，动作顶部停顿一会儿\n尽可能保持骨盆位置不动');
INSERT INTO `course_details` VALUES (12, 13, 'f105b8fb-5a77-4014-b37b-30b289c53bf4_chaos_0728_B023C060_main_s.mp4', '双手扶住椅子保持身体平衡\n保持骨盆位置不动，右腿向身体的后方抬起，停顿一会儿，返回，重复动作', '自然呼吸', '右臀部有发力感,高次数练习后会有明显的酸胀感', '错误：抬腿过程中骨盆位置出现移动\n解决：始终保持骨盆的位置不动，抬腿幅度不用过大', '尽可能保持骨盆位置不动\n向上抬起腿部，动作顶部停留一会儿');

-- ----------------------------
-- Table structure for course_introduction
-- ----------------------------
DROP TABLE IF EXISTS `course_introduction`;
CREATE TABLE `course_introduction`  (
  `course_intro_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '课程简要介绍ID',
  `course_id` int(11) NULL DEFAULT 0 COMMENT '课程ID',
  `course_intro_detail` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '课程详情',
  `course_intro_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程类型',
  `fit_crowd` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '适用人群',
  `taboo_crowd` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '禁忌人群',
  `prepare` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '练前准备',
  `physical_reaction` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '身体反应',
  `advice` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '课程建议',
  PRIMARY KEY (`course_intro_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_introduction
-- ----------------------------
INSERT INTO `course_introduction` VALUES (1, 1, '跑步是一个下肢为主的运动模式，它的热身方式与平时健身会有些区别。我们日常的行走坐卧会让下肢肌肉的紧张程度不一，这种不平衡会让跑姿变得不自然，增加了受伤的风险。\n这是一套跑前的热身训练，包括肌肉的拉伸以及动作模式的预热，能让你以更好的状态开始奔跑。', '跑步热身', '上班时久坐的跑步爱好者\n柔韧性较差的跑步爱好者', '老年人（年龄大于65岁）、孕妇、残疾人;\n患有糖尿病、心脑血管疾病、肺部类疾病以及其他新陈代谢疾病的人群;\n患有骨科伤病且尚未痊愈的人群;\n及其他医嘱建议不适合运动的人群。', '如在室外进行跑步，在训练前请先确定着装是适宜的。夏季跑步着装应以透气、排汗快、宽松为宜，冬季跑步着装应以保暖、不影响运动为宜。', '训练过程中下肢相关肌肉会有酸涨的情况，微微气喘，这属于正常现象。', '所有动作都要穿鞋训练。\n在身体舒适的范围内拉伸，切忌过度用力拉伸。\n跑步结束之后建议进行「下肢拉伸」。');

-- ----------------------------
-- Table structure for course_section
-- ----------------------------
DROP TABLE IF EXISTS `course_section`;
CREATE TABLE `course_section`  (
  `course_section_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '课程栏目ID',
  `section_id` int(11) NULL DEFAULT 0 COMMENT '栏目ID',
  `course_section_tip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程小提示',
  `course_section_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程名',
  PRIMARY KEY (`course_section_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_section
-- ----------------------------
INSERT INTO `course_section` VALUES (1, 1, '跑步前要做好准备，让身体先“动”起来', '跑前准备');
INSERT INTO `course_section` VALUES (2, 2, '动起来燃烧脂肪', '燃脂全身初级');

-- ----------------------------
-- Table structure for course_submodule
-- ----------------------------
DROP TABLE IF EXISTS `course_submodule`;
CREATE TABLE `course_submodule`  (
  `course_sub_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '子模块ID',
  `course_id` int(11) NULL DEFAULT 0 COMMENT '课程ID',
  `thumb_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '缩略图名',
  `course_sub_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '子模块标题',
  `training_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '训练次数/时长',
  PRIMARY KEY (`course_sub_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_submodule
-- ----------------------------
INSERT INTO `course_submodule` VALUES (1, 1, '8947245b-a41c-40fc-afdf-6ff324713f516.png', '大腿内侧动态拉伸', '10次');
INSERT INTO `course_submodule` VALUES (2, 1, 'c8473e2e-e8b8-41e0-87a9-bbe66ab038a313.png', '扶椅左大腿前侧拉伸', '00:20');
INSERT INTO `course_submodule` VALUES (3, 1, '73610f56-d83c-4ac4-920f-4d864fb087a312.png', '扶椅右大腿前侧拉伸', '00:20');
INSERT INTO `course_submodule` VALUES (4, 1, '53151a5b-b0d4-4333-b03c-68dad1d11b978.png', '俯身左腿后侧拉伸', '00:20');
INSERT INTO `course_submodule` VALUES (5, 1, '6f9fbbdc-2e8d-4feb-9526-5eb74c7d8d507.png', '俯身右腿后侧拉伸', '00:20');
INSERT INTO `course_submodule` VALUES (6, 1, 'fdac79cc-ace6-4b2b-9fef-22622f65b5e04.png', '靠墙左侧小腿拉伸', '00:20');
INSERT INTO `course_submodule` VALUES (7, 1, 'c8e10094-aa06-41fd-9243-e8553f26c0575.png', '靠墙右侧小腿拉伸', '00:20');
INSERT INTO `course_submodule` VALUES (8, 1, '853596b0-d0ea-40e1-be26-8277094672811.png', '臀部动态拉伸', '12次');
INSERT INTO `course_submodule` VALUES (9, 1, '8b06dfc7-5dbc-46fe-a146-84000b49ffe411.png', '髋关节环绕', '10次');
INSERT INTO `course_submodule` VALUES (10, 1, '01632007-565e-482f-847f-4bf13e2fbcc13.png', '弓步后转体', '8次');
INSERT INTO `course_submodule` VALUES (11, 1, '689c0592-d615-4844-8503-3ff4569875e79.png', '站姿左侧后抬腿', '12次');
INSERT INTO `course_submodule` VALUES (13, 1, '9abbec15-e5ca-4765-a863-9faca0d5128310.png', '站姿右侧后抬腿', '12次');

-- ----------------------------
-- Table structure for section
-- ----------------------------
DROP TABLE IF EXISTS `section`;
CREATE TABLE `section`  (
  `section_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '栏目ID',
  `section_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '栏目名称',
  PRIMARY KEY (`section_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of section
-- ----------------------------
INSERT INTO `section` VALUES (1, '跑步');
INSERT INTO `section` VALUES (2, '减脂');
INSERT INTO `section` VALUES (3, '增肌');

-- ----------------------------
-- Table structure for user_login
-- ----------------------------
DROP TABLE IF EXISTS `user_login`;
CREATE TABLE `user_login`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_login
-- ----------------------------
INSERT INTO `user_login` VALUES (1, 'admin', '1234');
INSERT INTO `user_login` VALUES (2, 'root', '1234');

-- ----------------------------
-- Table structure for wx_user
-- ----------------------------
DROP TABLE IF EXISTS `wx_user`;
CREATE TABLE `wx_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wx_user
-- ----------------------------
INSERT INTO `wx_user` VALUES (1, '13111111111', '12345');
INSERT INTO `wx_user` VALUES (2, '13410000000', '1234');
INSERT INTO `wx_user` VALUES (3, '13611111111', '123');

SET FOREIGN_KEY_CHECKS = 1;
