package com.kh.inherit.practice;


//모든 객체는 Object를 상속받는다
// 만약에 상속받고 있다면
public class Person extends Object {

    protected String name;

    private int age;
    private double height;
    private double weight;

    public Person() {
    }

    public Person(int age, double height , double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    @Override
    public String toString(){
        return """
                이름 : %s
                나이 : %d
                키 : %f
                몸무게 : %f
                """.formatted(name, age, height, weight);
                
    }
    public String information(){
        return "";
    }

    public String getName() {
        return name;
    }

    



}
