package org.example.adventofcode.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/boxParameter.csv"));
        String line;
        Integer allPaperSquare =0;
        Integer allRibbon = 0;
        while((line = reader.readLine()) != null) {
            String[] mas = line.split("x");
            int l = Integer.parseInt(mas[0]);
            int w = Integer.parseInt(mas[1]);
            int h = Integer.parseInt(mas[2]);
            allPaperSquare+=returnSquare(l,w,h);
            allRibbon += returnRibbonSquare(l,w,h);
        }
        System.out.println("Paper = " + allPaperSquare + "\nRibbon = " + allRibbon);
    }

    public static int returnSquare(int l, int w, int h) {
        if (l < 0 || w < 0 || h < 0) {
            throw new IllegalArgumentException("Incorrect parameters");
        }
        int[] nums = new int[]{l * w, w * h, h * l};
        int min = Arrays.stream(nums).min().getAsInt();
        return (2 * l * w + 2 * w * h + 2 * h * l) + min;
    }

    public static int returnRibbonSquare(int l, int w, int h){
        int[] nums = new int[]{2*(w+h), 2*(l+h), 2*(w+l)};
        int min = Arrays.stream(nums).min().getAsInt();
        int s = w*l*h;
        return s+min;
    }
}
