package com.dao;

import com.po.User;
import com.po.lesson.Lesson;

public interface ILessonDao {
    public Integer createLesson(Lesson lesson);
    public Lesson queryLesson(Lesson lesson);


}
