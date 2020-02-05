package com.example.androidlab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Sort {
    String string = " вы ничего не ввели";
    private String[] strings;

    public List<Integer> getList() {
        return list;
    }

    private List<Integer> list = new ArrayList<>();

    public List<Integer> sort(String text) {

        if (!text.isEmpty()) {
            Map<Integer, Integer> map = new TreeMap<>();
            strings = text.split(" ");
            for (String str : strings) {
                if (isInteger(str)) {
                    map.put(Integer.parseInt(str), Integer.parseInt(str));
                } else {
                    throw new NumberFormatException("Invalid value");
                }

            }
            Set<Integer> set = map.keySet();
            for (int x : set) {
                list.add(map.get(x));
            }
            map.clear();
            strings = new String[0];
            return list;
        } else {
            throw new NumberFormatException("Invalid value");
        }
    }


    private boolean isInteger(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
