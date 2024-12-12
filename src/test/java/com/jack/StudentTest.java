package com.jack;

import com.jack.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    void highestScoreTest() {
        Student student = new Student("Jack", 90, 80);
        Assertions.assertEquals(90, student.highest());
    }
    @Test
    void getAverage() {
        Student student = new Student("Jack", 90, 80);
        Assertions.assertEquals((90+80)/2, student.getAverage());
    }
}
