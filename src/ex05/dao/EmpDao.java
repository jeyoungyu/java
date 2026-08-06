package ex05.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ex05.Util.DBUtil;
import ex05.dto.EmpD;


public class EmpDao {

    //사원의 정보를 조회하고 리스트를 반환하는 메서드
    public List<EmpD> findAll() {
        List<EmpD> list = new ArrayList<>();

        // 사원 정보를 조회하는 쿼리
        // ORDER BY 정렬컬럼 DESC(내림차순)
        String sql = "SELECT * FROM DEPT"; 

        // 자원 반납 -> try ()안에서 생성하면 구문이 끝나면 자동으로 반납해줌
        try (
            //1.connecion 연결
            Connection con = DBUtil.getConnection();
            //2. 쿼리 질의 객체 생성
            Statement stmt = con.createStatement();
            //3. 결과 집합을 반환 -> 객체생성 -> 리스트에 담기
            ResultSet rs = stmt.executeQuery(sql);
        ) {

            while (rs.next()) {
                String empId = rs.getString(1);
                String empName = rs.getString(2);
                int salary = rs.getInt(8);
                //dto생성및 리스트에 담기
                list.add(new EmpD(empId, empName, salary));
            }

        }   catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public List<DeptDTO> findAllDept() {
        List<DeptDTO> list = new ArrayList<>();

        String sql = "SELECT * FROM EMP ORDER BY SALARY DESC"; 

        try (
            Connection con = DBUtil.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {

            while (rs.next()) {
                int deptId = rs.getInt(1);
                String deptName = rs.getString(2);
                String location = rs.getString(3);
                list.add(new DeptDTO(deptId, deptName, location));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

}
