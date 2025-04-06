package org.example.adventofcode.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int c;
        String wayString = reader.readLine();
        List<House> houseList = new ArrayList<>();
        houseList.add(new House(0,0));
        houseList.add(new House(0,0));
        char[] way = wayString.toCharArray();
        for (char symbol : way) {
            int index = houseList.size() - 2;
      //      houseList.add(fillHouseList(houseList.getLast(),symbol));
            houseList.add(fillHouseList(houseList.get(index),symbol));
        }
        Set<House> uniq = new HashSet<>(houseList);
        System.out.println(uniq.size());
    }

    private static House fillHouseList(House house, char c) {
        int x = house.getX();
        int y = house.getY();
        switch (c){
            case '^': y+=1; break;
            case 'v': y-=1; break;
            case '<': x-=1; break;
            case '>': x+=1; break;
            default:
                System.out.println("Ошибка в файле"); break;
        }
        return new House(x,y);
    }
}
