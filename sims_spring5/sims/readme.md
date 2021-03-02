### 系统功能（期望）
- 本系统分为学生端与教师端。
- 教师端可以登录、注册、创建课程、修改课程信息、上传课程资源、对课程增删查改（尚未完成）。
- 学生端可以登录、注册、选课（尚未完成）、查询已选课表（尚未完成）。

### MySql数据库
- src/main/resources/jdbc.properties 为数据库信息，包括数据库用户名密码与数据库名
- 需要在本地创建5个表，sql文件已放在resources下。

### 系统采用jetty插件运行，运行后在浏览器输入：

#### http://localhost:8080/teacher/index 即可进入教师端主页
#### http://localhost:8080/student/index 即可进入学生端主页

