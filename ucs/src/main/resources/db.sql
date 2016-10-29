-- 2016-10-29
-- 超级用户
INSERT INTO `ucs_user` VALUES ('00000000000000000000000000000000', 'admin', 'dc3340dedcba93bf6a57f2405a63a62f17993d4c', '148ba0b7cfdf4d86', '超级管理员', null, '393056990@qq.com', '01', '2016-10-29 09:19:48', 'UCS', '00');
-- 菜单权限集合
INSERT INTO `ucs_permission` VALUES ('10000000000000000000000000000000', '', '00', '基础管理', null, '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('11000000000000000000000000000000', '10000000000000000000000000000000', '01', '角色管理', 'ucsRole/show', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('11000000000000000000000000000001', '11000000000000000000000000000000', '02', '查询', 'ucsRole:find', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('11000000000000000000000000000002', '11000000000000000000000000000000', '02', '新增角色', 'ucsRole:add', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('11000000000000000000000000000003', '11000000000000000000000000000000', '02', '删除角色', 'ucsRole:remove', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('11000000000000000000000000000004', '11000000000000000000000000000000', '02', '修改角色', 'ucsRole:edit', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('12000000000000000000000000000000', '10000000000000000000000000000000', '01', '权限管理', 'ucsPermission/show', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('12000000000000000000000000000001', '12000000000000000000000000000000', '02', '查询', 'ucsPermission:find', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('12000000000000000000000000000002', '12000000000000000000000000000000', '02', '新增', 'ucsPermission:add', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('12000000000000000000000000000003', '12000000000000000000000000000000', '02', '删除', 'ucsPermission:remove', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('12000000000000000000000000000004', '12000000000000000000000000000000', '02', '修改', 'ucsPermission:edit', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('13000000000000000000000000000000', '10000000000000000000000000000000', '01', '用户管理', 'ucsUser/show', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('13000000000000000000000000000001', '13000000000000000000000000000000', '02', '查询', 'ucsUser:find', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('13000000000000000000000000000002', '13000000000000000000000000000000', '02', '新增', 'ucsUser:add', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('13000000000000000000000000000003', '13000000000000000000000000000000', '02', '删除', 'ucsUser:remove', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('13000000000000000000000000000004', '13000000000000000000000000000000', '02', '修改', 'ucsUser:edit', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('14000000000000000000000000000000', '10000000000000000000000000000000', '01', '系统管理', 'ucsDomain/show', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('14000000000000000000000000000001', '14000000000000000000000000000000', '02', '查询', 'ucsDomain:find', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('14000000000000000000000000000002', '14000000000000000000000000000000', '02', '新增', 'ucsDomain:add', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('14000000000000000000000000000003', '14000000000000000000000000000000', '02', '删除', 'ucsDomain:remove', '0', null, '01', 'UCS');
INSERT INTO `ucs_permission` VALUES ('14000000000000000000000000000004', '14000000000000000000000000000000', '02', '修改', 'ucsDomain:edit', '0', null, '01', 'UCS');
-- 超级用户的权限
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000000', '00000000000000000000000000000000', '10000000000000000000000000000000', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000001', '00000000000000000000000000000000', '11000000000000000000000000000000', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000002', '00000000000000000000000000000000', '11000000000000000000000000000001', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000003', '00000000000000000000000000000000', '11000000000000000000000000000002', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000004', '00000000000000000000000000000000', '11000000000000000000000000000003', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000005', '00000000000000000000000000000000', '11000000000000000000000000000004', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000006', '00000000000000000000000000000000', '12000000000000000000000000000000', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000007', '00000000000000000000000000000000', '12000000000000000000000000000001', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000008', '00000000000000000000000000000000', '12000000000000000000000000000002', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000009', '00000000000000000000000000000000', '12000000000000000000000000000003', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000010', '00000000000000000000000000000000', '12000000000000000000000000000004', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000011', '00000000000000000000000000000000', '13000000000000000000000000000000', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000012', '00000000000000000000000000000000', '13000000000000000000000000000001', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000013', '00000000000000000000000000000000', '13000000000000000000000000000002', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000014', '00000000000000000000000000000000', '13000000000000000000000000000003', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000015', '00000000000000000000000000000000', '13000000000000000000000000000004', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000016', '00000000000000000000000000000000', '14000000000000000000000000000000', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000017', '00000000000000000000000000000000', '14000000000000000000000000000001', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000018', '00000000000000000000000000000000', '14000000000000000000000000000002', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000019', '00000000000000000000000000000000', '14000000000000000000000000000003', 'UCS');
INSERT INTO `ucs_role_permission` VALUES ('00000000000000000000000000000020', '00000000000000000000000000000000', '14000000000000000000000000000004', 'UCS');