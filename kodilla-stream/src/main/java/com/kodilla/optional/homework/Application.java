package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        printStudentsWithTeacher();
    }

    public static List<Student> getStudents() {
        return Arrays.asList(new Student("Mark James", null),
                new Student("John Smith", new Teacher("Pete Potter")),
                new Student("Malcolm Gollob", new Teacher("Ann Jones")),
                new Student("James Hertz", new Teacher("Maria Brown")),
                new Student("Frank Smith", null)
        );
    }

    public static void printStudentsWithTeacher() {
        for (Student student : getStudents()) {
            Optional<Teacher> teacher = Optional.ofNullable(student.getTeacher());

            String teacherName = getTeacherName(teacher);

            System.out.println("Uczeń: " + student.getName() + " Nauczyciel: " + teacherName);
        }
    }

    public static String getTeacherName(Optional<Teacher> teacher) {
        String teacherName = teacher.map(u -> u.getName()).orElse("<undefined>");
        return teacherName;
    }

    public static List<Student> getStudentsWithTeacher() {
        List<Student> students = new ArrayList<>();
        for (Student student : getStudents()) {
            Optional<Teacher> teacher = Optional.ofNullable(student.getTeacher());
            if (teacher.isPresent()) {
                students.add(student);
            }
        }
        return students;
    }
}
