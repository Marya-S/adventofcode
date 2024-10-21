package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String brackets = reader.readLine();
        List<Character> bracketsList = brackets.chars()
                .mapToObj(item -> (char) item)
                .toList();
        if(!bracketsList.stream().allMatch(x -> x == '('|| x == ')')){
            System.out.println("Error in string");
            System.exit(-1);
        }
        System.out.println("Floor: " + floorNum(bracketsList));
    }

    public static long floorNum(List<Character> bracketsList){
        long plus = bracketsList.stream().filter(x -> x.equals('(')).count();
        long min = bracketsList.stream().filter(x -> x.equals(')')).count();
        return (plus - min);
    }
}