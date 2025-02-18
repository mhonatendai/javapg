package org.javapg.collections;

public class CourseComparable implements Comparable<CourseComparable>{

    private final String name;

    public CourseComparable(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public int compareTo(CourseComparable courseComparable) {
        if (courseComparable == null)
            throw new IllegalArgumentException("No courseComparable!");
        if (this.name == null && courseComparable.name == null)
            return 0;
        else if (this.name == null) return -1;
        else if (courseComparable.name == null) return 1;
        else
        return name.compareTo(courseComparable.name); // sorts by name in ascending order.
    }
}
