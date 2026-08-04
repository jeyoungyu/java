package com.kh.practice2.mode.vo;

//자식을 통해서만 생성이 가능
// abstract : 추상클래스, 추상 메서드
// 추상메서드를 하나라도 가지면 추상클래스가 되어야함
public abstract class Animal {

    private String name;
    private String kinds;

    //기본 생성자 - 반환타입이 없고 , 클래스명과 같다

    protected Animal(){

    }


    //매개변수가 있는 생성자
    //생성자의 오버로딩
    protected Animal(String name , String kind){
        //필드를 초기화
        this.name = name;
        //이름이 다르면 this안써도 됨...
        kinds = kind;

    }

    //@ : 어노테이션
    // Override : 부모 메서드를 자식이 재정의
    // 모든 클래스는 Object 객체의 자식
    @Override
    public String toString() {
        // super : 부모메서드를 호출
        return super.toString();
    }

    //추상메서드 - 코드블럭이 없다
    //자식에게 기능구현을 위임
    public abstract void speak();


}
