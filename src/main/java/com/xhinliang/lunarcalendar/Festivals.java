package com.xhinliang.lunarcalendar;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xhinliang
 */
@SuppressWarnings("WeakerAccess")
public class Festivals {
    private Set<String> festivals;

    Festivals() {
        festivals = new HashSet<>();
    }

    void add(String festival) {
        festivals.add(festival);
    }

    public Set<String> getSet() {
        return festivals;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (String item : festivals) {
            buffer.append(item);
        }
        return "Festivals{" + buffer.toString() + "}";
    }
}
