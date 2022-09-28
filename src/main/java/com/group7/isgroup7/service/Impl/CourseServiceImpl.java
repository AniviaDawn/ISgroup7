package com.group7.isgroup7.service.Impl;

import com.group7.isgroup7.pojo.Course;
import com.group7.isgroup7.pojo.CourseFile;
import com.group7.isgroup7.pojo.FileDetails;
import com.group7.isgroup7.pojo.Result;
import com.group7.isgroup7.repository.CourseFileRepository;
import com.group7.isgroup7.repository.CourseRepository;
import com.group7.isgroup7.repository.FileRepository;
import com.group7.isgroup7.service.CourseService;
import com.group7.isgroup7.utils.Error;
import com.group7.isgroup7.utils.exception.InsertException;
import com.group7.isgroup7.utils.exception.UpdateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private FileRepository fileRepository;
    @Autowired
    private CourseFileRepository courseFileRepository;
    @Override
    public Result addCourse(Course course) {
        Result result = new Result(Error.OK,null);
        try{
            Course course1 = courseRepository.save(course);
            if (course1==null||course1.getId()==null){
                throw new InsertException(course.getTeacherId()+"create a new course error");
            }
        }catch (InsertException e){
            result.setError(Error.INSERTERROR);
        }catch (NullPointerException e){
            result.setError(Error.NULLPOINTERERROR);
        }
        return result;
    }

    @Override
    public Result<List<Course>> getCourseListByTeacher(String teacherId) {
        Result<List<Course>> result = new Result<>(Error.OK,null);
        List<Course> list = courseRepository.getCourseListByTeacher(teacherId);
        result.setData(list);
        return result;
    }

    @Override
    public Result<Course> getCourse(Integer id) {
        Result<Course> result = new Result<>(Error.OK,null);
        Course course = courseRepository.getCourseById(id);
        result.setData(course);
        return result;
    }

    @Override
    public Result updateCourse(Course course) {
        Result result = new Result(Error.OK,null);
        try{
            Course course1 = courseRepository.save(course);
            if (course1==null){
                throw new UpdateException("update course details error");
            }
        }catch (UpdateException e){
            result.setError(Error.UPDATEERROR);
        }
        return result;
    }

    @Override
    public Result addCourseFile(MultipartFile file, Long time, String name, Integer courseId) {
        Result result = new Result(Error.OK,null);
        try {
            File files = new File("");
            String path = files.getCanonicalPath();
            String s = "\\src\\main\\resources\\file\\";
            String finalPath = path+s+file.getOriginalFilename();
            file.transferTo(new File(finalPath));
            FileDetails fileDetails = new FileDetails(null,s+file.getOriginalFilename(),file.getOriginalFilename(),time);
            FileDetails fileDetails1=fileRepository.save(fileDetails);
            CourseFile courseFile = new CourseFile(null,courseId,fileDetails1.getId());
            courseFileRepository.save(courseFile);
        } catch (IOException e) {
            result.setError(Error.IOEXCEPTION);
        }
        return result;
    }
}
