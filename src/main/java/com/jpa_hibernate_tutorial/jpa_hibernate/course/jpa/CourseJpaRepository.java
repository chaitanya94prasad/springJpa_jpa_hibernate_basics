package com.jpa_hibernate_tutorial.jpa_hibernate.course.jpa;

import com.jpa_hibernate_tutorial.jpa_hibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

//When we want to use transaction with JPA @Transactional should be enabled
@Repository
@Transactional
public class CourseJpaRepository {

//this is more specific with database so when database session is on and this object is required for comms
//    we use the below annotation
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course select(long id) {
        return entityManager.find(Course.class,id);
    }

    public void delete(long id) {
        Course course = entityManager.find(Course.class,id);
        entityManager.remove(course);
    }
}
