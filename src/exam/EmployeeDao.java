package exam;
import exam.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public List<Employee> findAll() {
        List<Employee> list = new ArrayList<>();

        String sql = "SELECT EMP_ID, EMP_NAME, SALARY FROM EMP";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String empId = rs.getString("EMP_ID");
                String empName = rs.getString("EMP_NAME");
                Integer salary = rs.getInt("SALARY");

                list.add(new Employee(empId, empName, salary));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();
        List<Employee> employees = dao.findAll();

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}