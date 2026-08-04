package com.kh.practice2.model;

import com.kh.practice2.mode.vo.Animal;
import com.kh.practice2.mode.vo.Dog;


public class App {

    public static void main(String[] args) {
        //추상클래스는 생성이 불가능하다
        Dog dog = new Dog();

        //패키지가 다르면 import
        //추상클래스는 생성이 불가능하다
        //new Animal();

        //1. Animal 타입의객체 배열 생성[방의갯수]
        Animal[] animals = new Animal[5];

        //2.각 인덱스에 무작위로 dog , cat 객체 생성해서 넣기
        Dog dog1 = new Dog("멍멍이" , 15);
        animals[0] = dog1;


    }

}
