package oop.lesson3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * - Создать класс Студент
 * - Создать класс УчебнаяГруппа
 * - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
 * - Реализовать его контракты
 *
 *
 *
 *
 * - Модифицировать класс Студент, заставив его реализовать интерфейс Comparable
 * - Реализовать контракт compareTo () со сравнением по какому-либо параметру (пример studentId)
 *
 *
 *
 * - Создать класс СтудентКомпаратор реализующий интерфейс Comparator
 * - Реализовать контракт compare () со сравнением по какому-либо параметру (пример: сочетание Имя+Фамилия)
 */
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Q", 20, "Chemistry");
        Student s5 = new Student("Q", 26, "Chemistry");
        Student s2 = new Student("A", 22, "Chemistry");
        Student s3 = new Student("Z", 24, "Chemistry");
        Student s4 = new Student("E", 21, "Chemistry");
        ArrayList<Student> students = new ArrayList<>(List.of(s1, s2, s3, s4, s5));

        Group group = new Group(students);

        students.sort(new StudentComparator());

        for (Student student : group) {
            System.out.println(student);
        }
    }
}
