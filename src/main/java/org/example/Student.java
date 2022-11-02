package org.example;

public class Student {


    private String name;
    private float gpa;

    //  public courses [] course;


    // class course
    // {
    //     public String name;
    //    public float grade;
    // }

    Student(String name, float gpa) {
        if (!nameIsValid(name)) throw new IllegalArgumentException("Bad name");
        if (!gpaIsValid(gpa)) throw new IllegalArgumentException("Invalid GPA");

        this.name = name;
        this.gpa = gpa;
    }
    public static boolean nameIsValid(String name){
        return (name != null && name.length() > 0 ) ;
    }
    public static boolean gpaIsValid(float gpa){
        return  (gpa >= 0f && gpa <= 4.0f);
    }
    public static Student of(String name, float gpa) {
        return new Student(name, gpa);
    }

    public String getName() {
        return name;
    }

    public float getGpa() {
        return gpa;
    }
}
    class VIPStudent extends Student {

        VIPStudent(String name, float gpa){
            super(name, gpa);
        }
        public float getGpa(){

            return super.getGpa()*1.1f;
        }
    }

