package org.javapg;

import org.javapg.collections.CourseComparable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CourseComparableTest {

    @Test
    public void testCourseComparison() {
        CourseComparable courseComparable1 = new CourseComparable("Math");
        CourseComparable courseComparable2 = new CourseComparable("Science");
        CourseComparable courseComparable3 = new CourseComparable("Biology");

        // Test compareTo method
        assertTrue(courseComparable1.compareTo(courseComparable2) < 0); // Math < Science
        assertTrue(courseComparable2.compareTo(courseComparable3) > 0); // Science > Biology
        assertEquals(0, courseComparable1.compareTo(new CourseComparable("Math"))); // Math == Math
    }
}