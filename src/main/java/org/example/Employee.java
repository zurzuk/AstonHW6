package org.example;

public class Employee {
    String name;
    String job_title;
    String email;
    String phone_number;
    String salary;
    Integer age;
    public Employee (String name, String job_title, String email, String phone_number, String salary, Integer age) {
        this.name = name;
        this.job_title = job_title;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo () {
        System.out.println(this.name);
        System.out.println(this.job_title);
        System.out.println(this.email);
        System.out.println(this.phone_number);
        System.out.println(this.salary);
        System.out.println(this.age);
    }
}
