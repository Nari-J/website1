CREATE TABLE `t_user` (
`id` int(10) unsigned NOT NULL AUTO_INCREMENT,
`user_name` char(20) DEFAULT NULL,
`user_pwd` char(30) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1


CREATE TABLE `stu_user` (
`id` int(10) unsigned NOT NULL AUTO_INCREMENT,
`stu_name` char(20) DEFAULT NULL,
`stu_pwd` char(30) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1


CREATE TABLE `lessons` (
`id` int(10) unsigned NOT NULL AUTO_INCREMENT,
`lessonName` char(20) NOT NULL,
`teacherName1` char(20) DEFAULT NULL,
`teacherName2` char(20) DEFAULT NULL,
`teacherName3` char(20) DEFAULT NULL,
`teacherName4` char(20) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1


CREATE TABLE `lesson_info` (
`id` int(11) NOT NULL,
`building` char(10) NOT NULL,
`room` smallint(6) NOT NULL,
`week` smallint(6) NOT NULL COMMENT '第几周',
`weekday` smallint(6) NOT NULL COMMENT '星期几',
`num` smallint(6) NOT NULL COMMENT '第几节'
) ENGINE=InnoDB DEFAULT CHARSET=latin1


CREATE TABLE `lesson_choo` (
`id` int(11) DEFAULT NULL,
`stu_name` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1


