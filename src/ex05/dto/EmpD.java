package ex05.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmpD {
    String empId;
    String empName;
    int salary;
    String empNo;

    //남자
    //마이바티스는 객체를 자동으로 생성
    //컬럼이름 - 소문자로 + 카멜표기법
    LocalDate hiredate;

    
    public EmpD(String empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "%s %s %s".formatted(empId, empName, salary);
    }
    
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    
}
