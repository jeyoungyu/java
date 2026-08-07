package ex05;

import java.util.List;

import com.kh.util.InputUtil;

import ex05.dao.DeptDao;
import ex05.dao.EmpDao;
import ex05.dto.DeptDTO;
import ex05.dto.EmpD;

public class HRApp {
    public static void main(String[] args) {
        EmpDao empDao = new EmpDao();

        printMenu();
        //입력을 대기하고있다가 사용자의 입력을 정수로 반환
        int menu = InputUtil.getInt("메뉴를 입력해주세요");

        if(menu==1){
            //사원목록 - empDao
            List<EmpD> list =  empDao.findAll();

            System.out.println(list);
        } else if (menu ==2 ){
            //부서목록
            DeptDao deptDao = new DeptDao();
            List<DeptDTO> list = deptDao.findAll();

            System.out.println(list);
        } else if ( menu == 0 ) {
            System.out.println("""
                    ------------------
                    사원관리 프로그램을 종료합니다
                    오늘도 행복한 하루 보내세요
                    ------------------
                    """);
                    System.exit(0);
        } else if (menu == 3) {
            String name = InputUtil.getString("사원명 : ");
            EmpD empDto = empDao.find(name); 
            //null이 아니면 사원정보를 출력
            if(empDto != null){
                System.out.println(empDto);
            } else {
                System.out.println("%s님은 존재하지 않습니다.".formatted(name));
            }
        }
    }

    private static void printMenu(){
        System.out.println("""
                메뉴
                1.사원목록
                2.부서목록
                3.사원조회-이름
                4.사원조회-사번
                0.프로그램 종료
        """);
    }

}
