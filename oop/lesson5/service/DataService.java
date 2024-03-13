package oop.lesson5.service;

import oop.lesson5.data.Student;
import oop.lesson5.data.Teacher;
import oop.lesson5.data.User;

import java.util.ArrayList;




public class DataService implements Service{
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;

    public DataService() {
        teachers = new ArrayList<>();
        students = new ArrayList<>();
    }

    @Override
    public void create(User user){
        if (user instanceof Teacher) {
            Teacher teacher = (Teacher) user;
            teachers.add(teacher);
        } else {
            Student student = (Student) user;
            student.setId(students.size());
            students.add(student);
        }
    }

    @Override
    public String read(UserType userType) {
        if (userType.equals(UserType.TEACHER)) {
            return teachers.toString();
        } else {
            return students.toString();
        }
    }

    @Override
    public String readById(UserType userType, int id){
        if (userType.equals(UserType.STUDENT)) {
            for (Student student : students) {
                if (student.getId() == id) return student.toString();
            }
        }
        return null;
    }


}