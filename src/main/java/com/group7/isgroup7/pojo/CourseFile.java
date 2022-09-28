package com.group7.isgroup7.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course_file")
public class CourseFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer courseId;
    private Integer fileId;
}
