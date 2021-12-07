package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.WeakHashMap;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
        int result = employeeDao.save(new Employee(4, "Asmaa", 0));
        System.out.println(result);
    }
}
