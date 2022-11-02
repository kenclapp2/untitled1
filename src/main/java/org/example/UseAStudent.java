package org.example;

public class UseAStudent {

    public static void main(String[] args) {

        Student s1 = Student.of("Fred", 3.2F);
        Student s2 = Student.of("Jim", 2.2F);
        VIPStudent s3 = new VIPStudent("Ace",3.0F);
        printStudent(s1);
        printStudent(s2);
        printStudent(s3);

    }

    public static void printStudent(Student s)
    {
        System.out.println("Student Name: "+s.getName());
        System.out.println("GPA: "+s.getGpa());
    }

}