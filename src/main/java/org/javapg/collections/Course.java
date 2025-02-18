package org.javapg.collections;

public class Course implements Comparable<Course>{

    private final String name;

    public Course(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Course course) {
        return name.compareTo(course.name); // sorts by name in ascending order.
    }
}
