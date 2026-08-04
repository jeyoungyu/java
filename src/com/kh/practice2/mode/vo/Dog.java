package com.kh.practice2.mode.vo;

//vo/dot : 필드와 setter/getter 메서드를 가진
//데이터를 담는 그릇과 같은 역할
//자식은 부모가 가진 모든 필드와 메서드를 상속
//미구현된 메서드가 있따면 구현해야함
// -> 아니면 추상 클래스가 되어야함
public class Dog extends Animal {
    public static final String PLACE = "애견카페";
    private int weight;

    //접근제한자를 안쓸경우 Default 접근제한자가 됨 - 같은 패키지에서 접근 가능
    // - 같은 패키지에서 접근 가능
    public Dog(){

    }

    public Dog(String name , int weight){
        

    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public void speak(){
        throw new UnsupportedOperationException("Unimplemented method 'speak'");
    }



}
