package com.aln.day4;

import java.util.HashMap;
import java.util.Map;

public class AssignmentOfMap {
    public static void main(String[] args) {

        String data = "learning java is fun to hava fun learn java in fun way";
        String[] arr = data.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String word : arr){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        System.out.println(map);
    }
}
