package com.kh.inherit;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Student;

public class App {

    public static void main(String[] args) {

        //3명의 학생 정보를 기록할수있는 배열을 생성
        Student[] students = new Student[3];
        students[0] = new Student("홍길동" , 20 , 178.2 , 70.0 , 1 , "컴퓨터공학과");
        students[1] = new Student("김말똥" , 21 , 174.2 , 70.0 , 2 , "컴퓨터공학과");
        students[2] = new Student("강개순" , 22 , 171.2 , 70.0 , 3 , "컴퓨터공학과");


        for(Student s:students){
            // toString() 실행결과 반환받은 문자열을 출력
            System.out.println(s);
        }

        //2명의 사원 정보를 기록할수있는 배열을 생성

        //10명의 사원정보를 기록할 수 있는 배열을 생성
        // [] 방의 갯수 = 배열의 길이
        //10개 , 인덱스는 0~9까지 , 0~(n-1)
        Employee[] emps = new Employee[10];
        emps[0] = 
            new Employee("김김김", 20, 180, 65, 100, "영업기획");
        
        

    }

}
