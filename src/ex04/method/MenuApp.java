package ex04.method;

import java.util.Scanner;

import ex04.method.obj.Basic;

public class MenuApp {
    public static void main(String[] args) {

        //사용자의 입력을 받아오는 객체
        Scanner scan = new Scanner(System.in);
        // 1. 메뉴를 출력
        Basic.printMenu();
        // 2. 사용자 입력 받기
        int menu = scan.nextInt();
        System.out.println("menu : " + menu);
        // 3. 입력에 따라서 메서드를 실행
        if(menu == 1){
            // bmi
            // 키 몸무게 입력받아야함
            System.out.println("키를 입력해주세요");
            System.out.println("몸무게를 입력해주세요");
        } else if(menu == 2) {
            // 로또 생성
            Basic.getLotto();
        } else if("q".equalsIgnoreCase(null))
    } 

}
