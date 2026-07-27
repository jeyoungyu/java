package ex01;

public class App {

    public static void main(String[] args) {
        // 학생객체를 생성
        // 타입 변수명 = new 타입();
        Student student1 = new Student();

        //필드를 초기화
        student1.name = "오미자";
        student1.age = 20;

        Student student2 = new Student();
        student2.name = "이미자";
        student2.age = 25;

        // 매개변수가 있는 생성자를 이용해서 학생객체를 생성해봅시다
        Student student3 = new Student("미자" , 20, "스카이에듀");
        Student student4 = new Student("미순" , 25 ,"스카이에듀");
        
        //객체를 print 를 이용해서 출력하면 toString()메서드가 호출
        // toString()메서드는 패키지를 포함한 클래스 이름@ 16진수 주소
        // -> 메서드 재정의를 통해서
        System.out.println(student3);
    }

}
