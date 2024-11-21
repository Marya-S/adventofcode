package org.example.adventofcode.day1;

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
}