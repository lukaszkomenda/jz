package com.sda.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap {
    public static void main(String[] args) {
        List<String> teksty = new ArrayList<>();

        teksty.add("Tekst1");
        teksty.add("Tekst2");

        for (int i = 0; i < teksty.size(); i++) {
            System.out.println(teksty.get(i));
        }

        Map<String, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Lukasz" ,"792900929");
        System.out.println(phoneNumbers.get("Lukasz"));

        phoneNumbers.put("Lukasz" ,"792900926");
        System.out.println(phoneNumbers.get("Lukasz"));

        phoneNumbers.put("Tomek" ,"792900922");


        System.out.println(phoneNumbers.get("Tomek"));
    }
}
