package com.service.impl;

import com.dao.ILessonDao;
import com.model.ResultModel;
import com.po.lesson.Lesson;
import com.service.ILessonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LessonServiceImpl implements ILessonService {


    @Resource
    private ILessonDao lessonDao;
    @Override
    public ResultModel createLesson(Lesson lesson) {

        ResultModel rm=new ResultModel();
        Lesson sameLesson=lessonDao.queryLesson(lesson);


        if (sameLesson.getLessonName()!=null) {
            rm.setCode(300);
            rm.setMsg("课程已存在！");
        } else {
            Integer i=lessonDao.createLesson(lesson);

            if(i==1){
                rm.setCode(200);
                rm.setMsg("创建成功！");

            }else{
                rm.setCode(301);
                rm.setMsg("创建失败！");
            }
        }
        return rm;
    }
}
