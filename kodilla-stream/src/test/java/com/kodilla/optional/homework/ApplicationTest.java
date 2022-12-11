package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTest {

    @Test
    void testGetTeacherName() {
        List<Student> studentWithTeacher = Application.getStudentsWithTeacher();

        assertEquals(3, studentWithTeacher.size());
    }
}
