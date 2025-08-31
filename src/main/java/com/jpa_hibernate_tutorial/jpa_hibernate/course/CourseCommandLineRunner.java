package com.jpa_hibernate_tutorial.jpa_hibernate.course;

import com.jpa_hibernate_tutorial.jpa_hibernate.course.springDataJpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

//implementing CommandLineRunner helps to run functions at startup of application through run()
/*
* in java usually when we need an object we create it by ourself like ClassA obj = new ClassA()
* but in spring we mark the classes as component service or repository etc and spring internally creates it's object
* these spring created objects are called bean. these bean are stored in applicationcontext of spring
* */
@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    /*
    * here in normal java code we would have to create an object using new but since we have mentioned Autowired
    * here the object will be created by spring internally whenever it is required
    * */
//    @Autowired
//    private CourseJDBCRepository courseJDBCRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        courseJDBCRepository.insert(new Course(1L, "Learn Azure","Chaitanya"));
//        courseJDBCRepository.insert(new Course(2L, "Learn AWS","Chaitanya"));
//        courseJDBCRepository.insert(new Course(3L, "Learn GCP","Chaitanya"));
//        courseJDBCRepository.insert(new Course(4L, "Learn Spark","Chaitanya"));
//
//        courseJDBCRepository.delete(2);
//
//        System.out.println(courseJDBCRepository.select(3));
//    }

    /*The above code was for using jdbc and now we have commented it and want to use the below code for jpa*/

//    @Autowired
//    private CourseJpaRepository courseJpaRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        courseJpaRepository.insert(new Course(1L, "Learn Azure","Chaitanya"));
//        courseJpaRepository.insert(new Course(2L, "Learn AWS","Chaitanya"));
//        courseJpaRepository.insert(new Course(3L, "Learn GCP","Chaitanya"));
//        courseJpaRepository.insert(new Course(4L, "Learn Spark","Chaitanya"));
//
//        courseJpaRepository.delete(2);
//
//        Course course = courseJpaRepository.select(3);
//
//        System.out.println("id:"+course.getId()+" name:"+course.getName()+" author:"+course.getAuthor());
//    }

    /*The above code was for using jpa and now we have commented it and want to use the below code for springjpa*/


    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        courseSpringDataJpaRepository.save(new Course(1L, "Learn Azure","Chaitanya"));
        courseSpringDataJpaRepository.save(new Course(2L, "Learn AWS","Chaitanya"));
        courseSpringDataJpaRepository.save(new Course(3L, "Learn GCP","Chaitanya"));
        courseSpringDataJpaRepository.save(new Course(4L, "Learn Spark","Chaitanya"));

        courseSpringDataJpaRepository.deleteById(2L);

        Optional<Course> course = courseSpringDataJpaRepository.findById(3L);

        System.out.println("id:"+course.get().getId()+" name:"+course.get().getName()+" author:"+course.get().getAuthor());
    }
}
