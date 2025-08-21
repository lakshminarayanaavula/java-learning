package com.aln.day4;

import java.util.HashMap;
import java.util.Map;



public class MapExamples {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Krish",4);
        map.put("John",4);
        map.put("Mahesh",3);
        map.put("Suresh",2);
        map.put("Krish",5);
        System.out.println(map);

        System.out.println(map.get("Krishna"));
    }
}
