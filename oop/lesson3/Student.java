package oop.lesson3;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String specialization;
    private double marks;

    public Student(String name, int age, String specialization, double marks) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", specialization='" + specialization + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }
}
