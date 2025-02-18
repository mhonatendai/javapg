package org.javapg.collections;

import java.util.Comparator;

public class CourseComparator {

    private String name;
    private int weight;

    public String toString() { return name; }

    public static Comparator<CourseComparator> byWeight() {
        return Comparator.comparingInt(CourseComparator::getWeight);
    }

    private int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
