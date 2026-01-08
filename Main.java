
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();

                    System.out.print("Enter Name: ");
                    String name = scanner.next();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();

                    Student student = new Student(id, name, age);
                    service.addStudent(student);
                    break;

                case 2:
                    service.viewAllStudents();
                    break;

                case 3:
                    System.out.println("Exiting application...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
