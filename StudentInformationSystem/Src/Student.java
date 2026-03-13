public class Student {

    private String studentId;
    private String name;
    private int age;
    private double grade;
    private String contact;

    public Student(String studentId, String name, int age, double grade, String contact) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.contact = contact;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public String getContact() {
        return contact;
    }

    public void displayStudent() {
        System.out.printf("%-10s %-15s %-5d %-6.2f %-15s\n",
                studentId, name, age, grade, contact);
    }
}