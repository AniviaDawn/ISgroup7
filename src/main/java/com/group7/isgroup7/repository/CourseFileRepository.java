package com.group7.isgroup7.repository;

import com.group7.isgroup7.pojo.CourseFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface CourseFileRepository extends JpaRepository<CourseFile, Integer> {

}
