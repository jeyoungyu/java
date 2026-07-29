package ex04.method.obj;

public class Basic {

    public void info(String name, int age, double height) {

        // 숫자를 나타내는 타입
        //정수형 - int
        //실수형 - double
        System.out.println("""
                이름: %s
                나이 : %d
                키 : %f
                """.formatted(name , age , height));
    }

    public String getInfo(String name, int age, double height) {
        return "이름 : %s , 나이 : %d , 키 : %f".formatted(name , age , height);
    }
    public static double getBmi(double h, double w) {
        double bmi = 0.0;
        //신체질량지수(BMI)
        //bmi = 체중 / (신장(m)*신장(m))
        //당신의 키, 몸무게는 , bmi , 정상입니다
        bmi = w / (h*h);

        return bmi;
    }

    //형변환
    //정수 cm/kg
    public static String getBmiStr(int h, int w) {
        String bmiStr = "";
        double bmi = 0.0;
        //신체질량지수(BMI)
        //bmi = 체중 / (신장(m)*신장(m))
        //당신의 키, 몸무게는 , bmi , 정상입니다
        //소수점 2자리까지 나옵니다
        //bmi = w / (h*h);


        
        //18.5미만이면 저체중 , 22.9이하이면 정상 , 24.9이하이면 비만전단계 , 나머지 비만
        String res = "";



        bmi = w / ((double)h/100 * (double)h/100);
        bmiStr = """
                키:%dcm , 몸무게:%dkg, bmi:%f , %s입니다.
                """.formatted(h,w,bmi,"정상");
        return bmiStr;
    }

    /**
     * bmi를 매개변수로 받아서 문자로 변환해주는 역할
     * @param args
     */
    public String bmiToStr(double bmi){
        //변수선언
        String str;
        //변수초기화
        //변수를 초기화 하지 않으면 사용불가
        str="";
        // + bmiToStr(bmi:double):String
        //18.5미만이면 저체중 , 22.9이하이면 정상 , 24.9이하이면 비만전단계 , 나머지 비만
        if(bmi<18.5) {
            //문장의 끝은 ; , 문자열은 ""로 감싼다
            str = "저체중";
        } else if(bmi < 22.9) {
            str = "정상";
        } else if(bmi < 24.9) {
            str = "비만 전단계";
        } else {
            str = "비만";
        }
        return str;
    }



    //static 키워드 : 프로그램 시작과 동시에 메모리에 올라간다
    //생성하지않고 사용할수있다
    //지들끼리 호출할수있따

    public static void main(String[] args) {
        double bmi = getBmi(1.63 , 55.5);
        System.out.println(bmi);

        String bmiStr = getBmiStr(163, 55);
        System.out.println(bmiStr);

        //정수의 연산 결과는 정수
        //타입변환 (형변환) - 명시적 형변환/자동 형변환
        long l = 100; //자동현변환
        System.out.println((double)100/3);
    }


    

    

}
