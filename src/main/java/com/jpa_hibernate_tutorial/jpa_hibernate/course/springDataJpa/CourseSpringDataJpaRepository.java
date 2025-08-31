package com.jpa_hibernate_tutorial.jpa_hibernate.course.springDataJpa;

import com.jpa_hibernate_tutorial.jpa_hibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {
}
