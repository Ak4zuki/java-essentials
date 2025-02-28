package concepts.oop;

import concepts.oop.examples.Student;

public class Constructors {
    public static void main(String[] args) {

        Student student1 = new Student("Stefan", 22, 4.9, false);
        Student student2 = new Student("Wj", 22, 0.5, false);
        Student student3 = new Student("Dewald", 21, 2.5, true);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println("\n" + student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println("\n" + student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
    }
}