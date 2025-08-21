package com.aln.day4;

import java.util.ArrayList;
import java.util.List;

public class ListAssignment1 {

    public static void main(String[] args) {
        List<String> names  = new ArrayList<>();
        names.add("John");
        names.add("Suresh");
        names.add("Mahesh");
        names.add("John");
        names.add("Rajesh");
        names.add("Suresh");
        List<String> uniqueNames = getUniqueNames(names);
        // Display unique names
        List<String> additionalNames  = new ArrayList<>();
        additionalNames.add("John");
        additionalNames.add("Suresh");
        additionalNames.add("John Babu");

        List<String> commonNames = getCommonNames(names, additionalNames);
        // Display common names
    }

    public static List<String> getUniqueNames(List<String> names) {
        return null;
    }

    public static List<String> getCommonNames(List<String> names1, List<String> names2) {
        return null;
    }
}
