import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static void changeNumber(int number) {
        number = 100;
    }
    public static void changeStudentScore(Student student) {
        student.setScore(100);
    }
    public static void objectChange(Student student) {
        student = new Student("ads", 12, 23);
    }

    public static void main(String[] args) {
        int a = 20;
        Student stu = new Student("sda",123,23);
        System.out.println(add(1, 3));
        System.out.println(add(1.0, 3.4));
        changeNumber(a);
        System.out.println(a);
        changeStudentScore(stu);
        System.out.println(stu.getScore());
        System.out.println(stu);
        objectChange(stu);
        System.out.println(stu);
    }
}
