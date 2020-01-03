package com.stackroute.basics;

import com.stackroute.basics.SumOfCommonElements;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SumOfCommonElementsTests {
    private static final String messageOne = "Should return sum of the common elements in two arrays";
    private static final String messageTwo = "Should return 0 if there are no common elements";
    private static SumOfCommonElements object;

    @BeforeEach
    public static void setup() {
        // This methods runs, before running each test case
        // This method is used to initialize the required variables
        object = new SumOfCommonElements();
    }

    @AfterEach
    public static void teardown() {
        // This method runs, after each test case
        // This method is used to clear the initialized variables
        object = null;
    }

    @Test
    public void givenTwoArraysWithValidSizeHavingCommonElementsWhenCommonElementsFoundThenMethodReturnsTheirSum() {
        int[] arrayOne = {10, 20, 30, 40, 50};
        int[] arrayTwo = {5, 10, 15, 20, 25};
        int sumExpected = 30;
        int sumActual = object.calculateSumOfCommonElements(arrayOne, arrayTwo);
        Assertions.assertEquals(sumExpected, sumActual, messageOne);
    }

    @Test
    public void givenTwoArraysWithValidSizeHavingUncommonElementsWhenCommonElementsNotFoundThenMethodReturnsZero() {
        int[] arrayOne = {10, 20, 30, 40, 50};
        int[] arrayTwo = {1, 2, 3, 4, 5};
        int sumExpected = 0;
        int sumActual = object.calculateSumOfCommonElements(arrayOne, arrayTwo);
        Assertions.assertEquals(sumExpected, sumActual,messageTwo);
    }
}
