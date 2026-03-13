import java.util.Scanner;

public class Studentinformationsystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Studentmanager manager = new Studentmanager();

        while (true) {

            System.out.println("\n===== STUDENT INFORMATION SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Student ID: ");
                    String id = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Age: ");
                    int age = sc.nextInt();

                    System.out.print("Grade: ");
                    double grade = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Contact: ");
                    String contact = sc.nextLine();

                    if (!Validationutil.validAge(age)) {
                        System.out.println("Invalid age!");
                        break;
                    }

                    if (!Validationutil.validGrade(grade)) {
                        System.out.println("Invalid grade!");
                        break;
                    }

                    Student s = new Student(id, name, age, grade, contact);
                    manager.addStudent(s);

                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    String searchId = sc.nextLine();

                    Student found = manager.searchStudent(searchId);

                    if (found != null) {
                        found.displayStudent();
                    } else {
                        System.out.println("Student not found.");
                    }

                    break;

                case 4:
                    System.out.println("Exiting system...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}