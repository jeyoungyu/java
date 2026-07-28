package ex04.method;

import ex04.method.obj.Basic;

public class App {
    public static void main(String[] args) {
        //패키지가 다른경우
        //Basic 객체 생성하기
        Basic basic = new Basic();
        // + info(name:String , age:int, height:double)
        //이름,나이,키를 받아서 출력
        basic.info("이미자",25,160.3);
        // + getInfo(name:String , age:int , height:double):String
        //이름,나이,키를 받아서 한줄로 반환
        String basic_info = basic.getInfo("오미자",25,160.3);
        //반환 받은 값을 변수에 저장해서 출력
        System.out.println(basic_info);

        //getBmi(키-mdouble , 몸무게-kg:double):double
        //메서드를 호출할때는 파라메터만 넘겨주면된다
        double bmi = Basic.getBmi(1.63 , 55.5);
        String str = basic.bmiToStr(bmi);
        System.out.println(str);
    }

}
