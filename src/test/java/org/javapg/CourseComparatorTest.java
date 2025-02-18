package org.javapg;

import org.javapg.collections.CourseComparator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseComparatorTest {

    @Test
    public void testCourseComparatorByWeight() {
        List<CourseComparator> courses = getCourseComparators();

        // Sort courses by weight using byWeight comparator
        courses.sort(CourseComparator.byWeight());

        // Verify the order after sorting
        assertEquals("Science", courses.get(0).getName()); // Science has the lowest weight
        assertEquals("Math", courses.get(1).getName()); // Math is the next in weight
        assertEquals("History", courses.get(2).getName()); // History has the highest weight
    }

    private static List<CourseComparator> getCourseComparators() {
        CourseComparator course1 = new CourseComparator();
        course1.setName("Math");
        course1.setWeight(5);

        CourseComparator course2 = new CourseComparator();
        course2.setName("Science");
        course2.setWeight(3);

        CourseComparator course3 = new CourseComparator();
        course3.setName("History");
        course3.setWeight(7);

        List<CourseComparator> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        return courses;
    }
}