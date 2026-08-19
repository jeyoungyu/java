package ex09.file;

public class SwitchEx {
    public static void main(String[] args) {
        //조건문/분기문
        //if , 삼항연산자

        //변수값을 바꿔가면서 실행
        //1일때 2일때
        //요일 (0-6까지 숫자로 표현된 경우 -> 문자로 변환)

        int grade = 1;
        //변수를 지정
        switch(grade) {
            case 1:
                System.out.println("1학년");
                //계속해서 다음 문장을 실행
                //if문과 다른점
                break;
            case 2:
                System.out.println("2학년");
            default:
                System.out.println("기본");
                break;
        }

        int 요일 = 0;
        switch (요일) {
            case 0:
                System.out.println("일요일");
                break;
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            default:
                break;
        }
    }

}
