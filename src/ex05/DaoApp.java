package ex05;

import java.util.List;

import ex05.dao.EmpDao;
import ex05.dto.EmpD;

public class DaoApp {
    public static void main(String[] args) {
        EmpDao empDao =  new EmpDao();
        List<EmpD> list = empDao.findAll();

        for(EmpD emp:list){
            System.out.println(emp);
        }
    }

}
