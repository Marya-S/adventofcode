package org.example.day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class MainTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/floorData.csv", numLinesToSkip = 1)
    void correctFloorNum(String brackets, int expectedResult) {
        Assertions.assertEquals(expectedResult, Main.returnFloor(brackets), "The result is wrong");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/errorFloorData.csv", numLinesToSkip = 1)
    void errorInString(String brackets) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Main.returnFloor(brackets));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/squareData.csv", numLinesToSkip = 1)
    void correctSquareData(int l, int w, int h, int expectedResult) {
        Assertions.assertEquals(expectedResult, Main.returnSquare(l,w,h));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/errorSquareData.csv", numLinesToSkip = 1)
    void errorParameters(int l, int w, int h) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Main.returnSquare(l,w,h));
    }
}