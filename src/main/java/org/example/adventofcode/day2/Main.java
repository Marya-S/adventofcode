package org.example.adventofcode.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Put in length: ");
        int l = Integer.parseInt(reader.readLine());
        System.out.println("Put in width: ");
        int w = Integer.parseInt(reader.readLine());
        System.out.println("Put in height: ");
        int h = Integer.parseInt(reader.readLine());
        System.out.println("Square = " + returnSquare(l, w, h));
    }

    public static int returnSquare(int l, int w, int h) {
        if (l < 0 || w < 0 || h < 0) {
            throw new IllegalArgumentException("Incorrect parameters");
        }
        int[] nums = new int[]{l * w, w * h, h * l};
        int min = Arrays.stream(nums).min().getAsInt();
        return (2 * l * w + 2 * w * h + 2 * h * l) + min;
    }
}
