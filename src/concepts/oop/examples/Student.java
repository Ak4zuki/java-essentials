package concepts.oop.examples;

public class Student {

    public String name;
    public int age;
    public double gpa;
    public boolean isEnrolled;

    public Student(String name, int age, double gpa, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = false;
    }
}