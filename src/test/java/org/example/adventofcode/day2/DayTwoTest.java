package org.example.adventofcode.day2;

import org.example.adventofcode.day1.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class DayTwoTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/squareData.csv", numLinesToSkip = 1)
    void correctSquareNum(int l, int w, int h, int expectedResultPaper, int expectedResultRibbon) {
        Assertions.assertEquals(expectedResultPaper, org.example.adventofcode.day2.Main.returnSquare(l,w,h), "The result for paper is wrong");
        Assertions.assertEquals(expectedResultRibbon, org.example.adventofcode.day2.Main.returnRibbonSquare(l,w,h), "The result for ribbon is wrong");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/errorSquareData.csv", numLinesToSkip = 1)
    void errorInString(String brackets) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Main.returnFloor(brackets));
    }
}
