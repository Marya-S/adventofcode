package org.example.adventofcode.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/wayScript.csv", numLinesToSkip = 1)
    void correctHouseNumber(String script, int expectedResult) {
        Assertions.assertEquals(expectedResult, org.example.adventofcode.day3.Main.main(), "The result is wrong");
    }

}