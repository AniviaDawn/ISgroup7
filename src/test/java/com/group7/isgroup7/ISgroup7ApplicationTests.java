package com.group7.isgroup7;

import com.group7.isgroup7.pojo.Account;
import com.group7.isgroup7.pojo.Course;
import com.group7.isgroup7.repository.AccountRepository;
import com.group7.isgroup7.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ISgroup7ApplicationTests {
@Autowired
    AccountRepository accountRepository;
@Autowired
    private CourseRepository courseRepository;
    @Test
    void contextLoads() {
    Course course = courseRepository.getCourseById(1);
    System.out.println(course.toString());

    }

}
