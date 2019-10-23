package edu.wctc.mvcforms.travel;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MapDemo {

    public static void main(String[] args) throws FileNotFoundException {
        MapDemo demo = new MapDemo();
        // demo.githubUsername();
        // demo.iterate();
        // demo.objectsAsKeys();
        TravelMethod[] enumValues = TravelMethod.values();
        for (TravelMethod value : enumValues) {
            System.out.println(value);
        }
    }

    public void githubUsername() {
        Map<String, String> myMap = new HashMap<>();

        // Map WCTC name to GitHub name
        String key = "sread", value = "oroborous";

        // Every object has a hashCode() function
        System.out.println(key.hashCode());

        // Constant time insertion
        myMap.put(key, value);

        // Given WCTC name, look up GitHub name
        String wctcName = JOptionPane.showInputDialog("What is your WCTC account?");

        // Constant time search
        String githubName = myMap.get(wctcName);

        JOptionPane.showMessageDialog(null, "Your GitHub name is " + githubName);
    }

    public void iterate() throws FileNotFoundException {
        Map<String, String> myMap = new HashMap<>();

        Scanner book = new Scanner(new File("totc.txt"));
        while (book.hasNext()) {
            String line = book.nextLine();
            myMap.put(line, line);
        }

        // Iterate over the map entries
        // Lines of the book don't come out in any particular order
        printMap(myMap);
    }

    public void printMap(Map<?, ?> anyMap) {
        anyMap.forEach((mapKey, mapValue) -> {
            System.out.println("key: " + mapKey + ", value: " + mapValue);
        });

        System.out.println();
    }

    public void objectsAsKeys() {
        Map<Employee, Integer> empSalaryMap = new HashMap<>();

        Employee stacy = new Employee(1, "Read", "Stacy");
        Employee gigi = new Employee(2, "Read", "Gigi");

        empSalaryMap.put(stacy, 50);
        empSalaryMap.put(gigi, 28);

        printMap(empSalaryMap);

        // What makes two employee objects equal? Their ID
        Employee stacy2 = new Employee(1, "Read", "Stacy");

        empSalaryMap.put(stacy2, 55);

        printMap(empSalaryMap);
    }

    private class Employee {
        private int id;
        private String lastName, firstName;

        public Employee(int id, String lastName, String firstName) {
            this.id = id;
            this.lastName = lastName;
            this.firstName = firstName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        public String toString() {
            return id + ", " + lastName + ", " + firstName;
        }
    }
}
