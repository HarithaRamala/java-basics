import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students) {
            s.displayStudent();
        }
    }
}
