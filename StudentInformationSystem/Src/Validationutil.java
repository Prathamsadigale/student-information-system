public class Validationutil {

    public static boolean validAge(int age) {
        return age > 0;
    }

    public static boolean validGrade(double grade) {
        return grade >= 0 && grade <= 100;
    }

}