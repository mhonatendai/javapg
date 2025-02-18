package org.javapg;

import org.javapg.collections.MapMerge;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapMergeTest {

    @Test
    public void testGetLongerCourseName() {
        Map.Entry<String, String> mapEntry = new AbstractMap.SimpleEntry<>("CS101", "Introduction to Computer Science");
        String givenValue = "Computer Science Intro";

        MapMerge mapMerge = new MapMerge();
        String result = mapMerge.getLongerCourseName(mapEntry, givenValue);

        // Expected result is "Introduction to Computer Science" as it has more characters
        assertEquals("Introduction to Computer Science", result);
    }
}