package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String brackets = reader.readLine();
        returnFloor(brackets);
        System.out.println("Floor: " + returnFloor(brackets));
    }

    public static long returnFloor(String brackets){
        List<Character> bracketsList = brackets.chars()
                .mapToObj(item -> (char) item)
                .toList();
        if(!bracketsList.stream().allMatch(x -> x == '('|| x == ')')){
            throw new IllegalArgumentException("Incorrect string");
        }

        long plus = bracketsList.stream().filter(x -> x.equals('(')).count();
        long min = bracketsList.stream().filter(x -> x.equals(')')).count();
        return (plus - min);
    }
}