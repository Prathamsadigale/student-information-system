import java.util.ArrayList;

public class Studentmanager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully.");
    }

    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.printf("%-10s %-15s %-5s %-6s %-15s\n",
                "ID", "Name", "Age", "Grade", "Contact");

        for (Student s : students) {
            s.displayStudent();
        }
    }

    public Student searchStudent(String id) {

        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                return s;
            }
        }

        return null;
    }

}