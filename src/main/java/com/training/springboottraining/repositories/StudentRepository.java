package com.training.springboottraining.repositories;
import com.training.springboottraining.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class StudentRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Student> getAllStudents() {
        String sqlQuery =
                "SELECT " +
                "student_id, " +
                "first_name, " +
                "last_name, " +
                "email, " +
                "gender " +
                "FROM " +
                "student";

        return jdbcTemplate.query(sqlQuery, mapStudentFromDB());
    }

    private static RowMapper<Student> mapStudentFromDB() {
        return (resultSet, i) -> {
            UUID student_id = UUID.fromString(resultSet.getString("student_id"));
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String email = resultSet.getString("email");
            Student.Gender gender = Student.Gender.valueOf(resultSet.getString("gender"));

            return new Student(student_id, firstName, lastName, email, gender);
        };
    }

}
