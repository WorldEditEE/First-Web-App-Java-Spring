package com.ukolov.mirea.spring.mvc;

public class Employee {

    private String name;

    private String surname;

    private int salary;

    private String department;

    public Employee(String name, String surname, int salary, String department){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
    }

    public Employee(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
