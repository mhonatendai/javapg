package org.javapg;

import org.javapg.collections.Course;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {

    @Test
    public void testCourseComparison() {
        Course course1 = new Course("Math");
        Course course2 = new Course("Science");
        Course course3 = new Course("Biology");

        // Test compareTo method
        assertTrue(course1.compareTo(course2) < 0); // Math < Science
        assertTrue(course2.compareTo(course3) > 0); // Science > Biology
        assertEquals(0, course1.compareTo(new Course("Math"))); // Math == Math
    }
}