package exam;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("홍길동", 90));
        students.add(new Student("유제영", 85));
        students.add(new Student("호날두", 78));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}