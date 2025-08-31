package com.jpa_hibernate_tutorial.jpa_hibernate.course.jdbc;

import com.jpa_hibernate_tutorial.jpa_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//this annotation is added to denote that this class will communicate with database
@Repository
public class CourseJDBCRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    public void insert(Course course) {
        String INSERT_QUERY =
                """
                insert into course(id,name,author) 
                values(?,?,?);
                """;
        springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public void delete(long id) {
        String DELETE_QUERY =
                """
                delete from course where id = ?;
                """;
        springJdbcTemplate.update(DELETE_QUERY,id);
    }

    public Course select(long id) {
        String SELECT_QUERY =
                """
                select * from course where id = ?;
                """;
        return springJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
    }
}
