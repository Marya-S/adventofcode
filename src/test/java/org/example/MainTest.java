package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MainTest {

    @Test
    void main() {
        String brackets = "((()))";
        List<Character> bracketsList = brackets.chars()
                .mapToObj(item -> (char) item)
                .toList();
    //    Assertions.assertEquals("Floor: 0", Main.main());
    }

    @Test
    void floorNum() {
        String brackets = "(())))";
        List<Character> bracketsList = brackets.chars()
                .mapToObj(item -> (char) item)
                .toList();
        Assertions.assertEquals(-2, Main.floorNum(bracketsList), "The result is wrong");
    }
}