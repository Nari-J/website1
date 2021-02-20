package com.dao.impl;

import com.dao.ILessonDao;
import com.po.User;
import com.po.lesson.Lesson;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
public class LessonDaoImpl implements ILessonDao {

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public Integer createLesson(Lesson lesson) {
        return jdbcTemplate.update("insert into lessons(lessonName,teacherName1,teacherName2,teacherName3,teacherName4) values (?,?,?,?,?)",
                lesson.getLessonName(),lesson.getTeacherName1(),lesson.getTeacherName2(),lesson.getTeacherName3(),lesson.getTeacherName4());
    }







    @Override
    public Lesson queryLesson(Lesson lesson) {
        Lesson lesson1=new Lesson();
        try {
            return jdbcTemplate.queryForObject("select lessonName,teacherName1,teacherName2,teacherName3,teacherName4" +
                    " from lessons where (lessonName=? and teacherName1=? and teacherName2=? and teacherName3=? and teacherName4=?)",
                    new Object[]{lesson.getLessonName(),lesson.getTeacherName1(),lesson.getTeacherName2(),lesson.getTeacherName3(),lesson.getTeacherName4()},
                    new LessonRowMapper());
        } catch (DataAccessException e) {
            return lesson1;
        }
    }//这里容易出问题，必须保证数据库不存在相同的记录，否则会报错返回数据库中没有该记录
    public static class LessonRowMapper implements RowMapper<Lesson> {
        @Override
        public Lesson mapRow(ResultSet resultSet, int i) throws SQLException {
            Lesson lesson=new Lesson();
            lesson.setLessonName(resultSet.getString("lessonName"));
            lesson.setTeacherName1(resultSet.getString("teacherName1"));
            lesson.setTeacherName2(resultSet.getString("teacherName2"));
            lesson.setTeacherName3(resultSet.getString("teacherName3"));
            lesson.setTeacherName4(resultSet.getString("teacherName4"));
            return lesson;
        }
    }
}
