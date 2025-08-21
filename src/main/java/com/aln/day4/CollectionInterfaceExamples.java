package com.aln.day4;

import java.util.ArrayList;
import java.util.List;

public class CollectionInterfaceExamples {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Mahesh");
        list.add("Ramesh");
        list.add("Suresh");
        for(String obj: list){
            System.out.println(obj.toUpperCase());
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.stream().forEach(System.out::println);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains("Ramesh"));

    }


}
