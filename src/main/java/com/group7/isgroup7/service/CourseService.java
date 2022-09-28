package com.group7.isgroup7.service;

import com.group7.isgroup7.pojo.Course;
import com.group7.isgroup7.pojo.Result;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.criteria.CriteriaBuilder;
import java.awt.image.RescaleOp;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public interface CourseService {
    Result addCourse(Course course);

    Result<List<Course>> getCourseListByTeacher(String teacherId);

    Result<Course> getCourse(Integer id);


    Result updateCourse(Course course);

    Result addCourseFile(MultipartFile file,Long time,String name,Integer courseId);
}
