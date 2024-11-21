package org.example.adventofcode.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Task 01. Put in brackets");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String brackets = reader.readLine();
        System.out.println("Floor: " + returnFloor(brackets));
        System.out.println("Position: " + returnPosition(brackets));
    }

    public static long returnFloor(String brackets) {
        List<Character> bracketsList = brackets.chars()
                .mapToObj(item -> (char) item)
                .toList();
        if (!bracketsList.stream().allMatch(x -> x == '(' || x == ')')) {
            throw new IllegalArgumentException("Incorrect string");
        }
        long plus = bracketsList.stream().filter(x -> x.equals('(')).count();
        long min = bracketsList.stream().filter(x -> x.equals(')')).count();
        return (plus - min);
    }

    public static long returnPosition(String brackets) {
        List<Character> bracketsList = brackets.chars()
                .mapToObj(item -> (char) item)
                .toList();
        int position = 0;
        int floor = 0;
        for (Character a : bracketsList) {
            if (a.equals('(')) {
                floor++;
            } else {
                floor--;
            }
            position++;
            if (floor == -1) {
                return position;
            }
        }
        return 0;
    }
}