package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MainTest {
    @Test
    void correctFloorNum() {
        String brackets = "(())))";
        Assertions.assertEquals(-2, Main.returnFloor(brackets), "The result is wrong");
    }

    @Test
    void errorInString() {
        String brackets = "()((({((()";
        Assertions.assertThrows(IllegalArgumentException.class, () -> Main.returnFloor(brackets));
    }
}