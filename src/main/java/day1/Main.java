package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Task 01. Put in brackets");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String brackets = reader.readLine();
        System.out.println("Floor: " + returnFloor(brackets));

        System.out.println("Task 02. Put in parameters");
        System.out.println("Put in length: ");
        int l = Integer.parseInt(reader.readLine());
        System.out.println("Put in width: ");
        int w = Integer.parseInt(reader.readLine());
        System.out.println("Put in height: ");
        int h = Integer.parseInt(reader.readLine());
        System.out.println("Square = " +returnSquare(l,w,h));

    }

    public static int returnSquare(int l, int w, int h) {
        if(l<0 || w<0 || h<0){
            throw new IllegalArgumentException("Incorrect parameters");
        }
        int[] nums = new int[] {l*w, w*h, h*l};
        int min = Arrays.stream(nums).min().getAsInt();
        return (2*l*w + 2*w*h + 2*h*l) + min;

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