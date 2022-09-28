package com.group7.isgroup7.controller;

import com.alibaba.fastjson.JSON;
import com.group7.isgroup7.pojo.Course;
import com.group7.isgroup7.pojo.Data;
import com.group7.isgroup7.pojo.Result;
import com.group7.isgroup7.service.AccountService;
import com.group7.isgroup7.service.CourseService;
import com.group7.isgroup7.utils.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.mongo.ReactiveStreamsMongoClientDependsOnBeanFactoryPostProcessor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

import static com.group7.isgroup7.utils.JsonUtils.Json;

@RestController
@RequestMapping("/group7/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @PostMapping("/addCourse")
    public Object addCourse(@RequestBody Course course){
        course.setId(null);
        Result result = courseService.addCourse(course);
        if (result.getError()!= Error.OK){
            return Json(-1,result.getError().getMsg());
        }
        return Json(0,"add a new course successfully");
    }
    @RequestMapping("/getListByTeacher")
    public Object getCourseListByTeacher(@Param("teacherId")String teacherId){
        Result<List<Course>> list = courseService.getCourseListByTeacher(teacherId);
        return Json(0,"get course list successfully",new Data(list.getData()));
    }
    @RequestMapping("/getCourse")
    public Object getCourseById(@Param("id")Integer id){
        Result<Course> result = courseService.getCourse(id);
        return Json(0,"get Course details successfully",result.getData());
    }
    @PostMapping("/updateCourse")
    public Object updateCourse(@RequestBody Course course){
        Result result = courseService.updateCourse(course);
        if (result.getError()!=Error.OK){
            return Json(-1,result.getError().getMsg());
        }
        return Json(0,"update Course details successfully");
    }
    @PostMapping("/uploadFile")
    public Object uploadCourseFile(@Param("file")MultipartFile file, @Param("time")Long time, @Param("name")String name,
                                   @Param("courseId")Integer courseId){
        Result result=courseService.addCourseFile(file,time,name,courseId);
        if (result.getError()!=Error.OK){
            return Json(-1,result.getError().getMsg());
        }
        return Json(0,"add new file successfully");
    }

}
