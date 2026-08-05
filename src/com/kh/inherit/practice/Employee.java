package com.kh.inherit.practice;

public class Employee extends Person {

    private int salary;
    private String dept;

    public Employee() {
    }

    public Employee(String name , int age, double height, double weight, int salary, String dept) {
        //부모의 생성자 호출 - 맨위에 적어주어야함
        super(age, height, weight);
        this.salary = salary;
        this.dept = dept;
    }


    @Override
    public String information() {
        return super.information();
    }
}
