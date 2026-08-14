package ex08.lambda;

public class App {
    public static void main(String[] args) {

        /**
         * 람다식
         * 함수를 매개변수로 전달
         */

        GreeterImpl greeterImpl = new GreeterImpl();
        greeterImpl.greet("미자");

        // 인터페이스는 생성이 불가능 => 추상 메서드!!
        // 추상 메서드를 구현 하면 생성 할 수 있다
        // 익명의 클래스
        Greeter greeter = new Greeter() {

            @Override
            public void greet(String name) {
                System.out.println("익명의 클래스를 이용해서 인터페이스를 구현");
                System.out.println(name + "님 반갑습니다");
            }
            //추상 메서드 구현
        };

        greeter.greet("미자");

        //람다식은 (매개변수) -> { 실행문 } 형태로,
        // 익명 클래스보다 훨씬 짧게 함수형 인터페이스를 구현하는 문법입니다
        Greeter greeter2 = (String name) -> {
            System.out.println(name + "님 환영합니다.");
        };

        //매개변수의 타입 생략 가능(추상메서드가 하나밖에 없기 때문에 추론이 가능)
        //매개변수가 하나이면 괄호가 생략가능
        //실행문이 한줄이면 코드블럭 생략가능 (반환도 생략가능)
        Greeter greeter3 = name -> System.out.println(name + "님 환영합니다");

        System.out.println("========================");
        //람다식을 매개변수로 전달해서 호출
        // 1. 인터페이스 - 추상메서드가 하나인 Calc.alc(int a , int b)
        // 2. 인터페이스를 매개변수로 받아서 실행하는 메서드 만들기
        // 3. 람다식을 이용해서 매개변수에 함수(메서드)를 전달
        
    }

}

 //하나의 파일에 여러개의 클래스/인터페이스를 정의하는 경우  public은 하나에만 사용할 수 있다
 interface Calc {
    int calc(int a , int b);
 }
