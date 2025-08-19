package com.aln.day2;

public class ReadingCommandLineArguments {

    public static void main(String[] args) {
        String input = "1001 Krish 30 krish@gmail.com 5.7 300000";
        String[] arr = input.split(" ");

        int id = Integer.parseInt(arr[0]);
        String name = arr[1];
        int age = Integer.parseInt(arr[2]);
        String email = arr[3];
        double height = Double.parseDouble(arr[4]);
        double salary = Double.parseDouble(arr[5]);

        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setAge(age);
        employee.setEmail(email);
        employee.setHeight(height);
        employee.setSalary(salary);

        System.out.println(employee);

    }
}
