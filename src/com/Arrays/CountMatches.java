package com.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CountMatches {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        List<String> item1 = new ArrayList<>();
        item1.add("phone");
        item1.add("blue");
        item1.add("pixel");
        items.add(item1);

        List<String> item2 = new ArrayList<>();
        item2.add("computer");
        item2.add("silver");
        item2.add("lenovo");
        items.add(item2);

        List<String> item3 = new ArrayList<>();
        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");
        items.add(item3);

        // System.out.println(items);

        System.out.println(countMatches(items, "color", "silver"));
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int matches = 0;
        for (int i = 0; i < items.size(); i++) {
            List<String> item = items.get(i);
            switch (ruleKey) {
                case "color" -> {
                    if (ruleValue.equals(item.get(1))) matches += 1;
                }
                case "type" -> {
                    if (ruleValue.equals(item.get(0))) matches += 1;
                }
                case "name" -> {
                    if (ruleValue.equals(item.get(2))) matches += 1;
                }
            }
        }

        return matches;
    }
}
