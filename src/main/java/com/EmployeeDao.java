package com;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Employee employee) {
        String query = "INSERT INTO emp VALUES(?, ?, ?)";
        return jdbcTemplate.update(query, employee.getId(), employee.getName(), employee.getSalary());

    }
}
