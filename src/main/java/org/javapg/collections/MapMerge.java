package org.javapg.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapMerge {

    public String getLongerCourseName(Map.Entry<String, String> mapEntry, String givenValue) {
        BiFunction<String, String, String> mapper = (value1, value2) ->
                value1.length() > value2.length() ? value1 : value2;
        String mapEntryValue = mapEntry.getValue();
        return mapper.apply(mapEntryValue, givenValue);
    }
}
