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
        if (course == null)
            throw new IllegalArgumentException("No course!");
        if (this.name == null && course.name == null)
            return 0;
        else if (this.name == null) return -1;
        else if (course.name == null) return 1;
        else
        return name.compareTo(course.name); // sorts by name in ascending order.
    }
}
