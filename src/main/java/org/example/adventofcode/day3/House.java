package org.example.adventofcode.day3;

import java.util.Objects;

public class House {
    int x;
    int y;

    public House(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //Списала у чата GPT. Понимаю, что он делает, но сама бы не догадалась
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        House house = (House) obj;
        return x == house.x && y == house.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
