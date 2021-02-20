package com.service;

import com.model.ResultModel;
import com.po.lesson.Lesson;

public interface ILessonService {
    public ResultModel createLesson(Lesson lesson);
}
