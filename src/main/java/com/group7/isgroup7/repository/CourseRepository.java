package com.group7.isgroup7.repository;

import com.group7.isgroup7.pojo.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    @Query("select c from Course c where c.teacherId= :teacherId ")
    List<Course> getCourseListByTeacher(String teacherId);

    Course getCourseById(Integer id);

}
