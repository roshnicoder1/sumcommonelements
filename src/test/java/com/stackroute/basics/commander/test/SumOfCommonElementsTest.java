package com.stackroute.basics.commander.test;

import com.stackroute.basics.SumOfCommonElements;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SumOfCommonElementsTest {
    private static final String MSG_01 = "Should return sum of the common elements in two arrays";
    private static final String MSG_02 = "Should return -1 if there are no common elements";
    private static SumOfCommonElements object;

    @BeforeAll
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        object = new SumOfCommonElements();
    }

    @AfterAll
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        object = null;
    }

    @Test
    public void givenTwoArraysWithValidSizeHavingCommonElementsWhenCommonElementsFoundThenMethodReturnsTheirSum(){
    int[] array1={10,20,30,40,50};
    int[] array2={5,10,15,20,25};
    int sumExpected=30;
    int sumActual=object.calculateSumOfCommonElements(array1,array2);
    Assertions.assertEquals(sumExpected,sumActual);
    }

    @Test
    public void givenTwoArraysWithValidSizeHavingUncommonElementsWhenCommonElementsNotFoundThenMethodReturnsZero(){
        int[] array1={10,20,30,40,50};
        int[] array2={1,2,3,4,5};
        int sumExpected=0;
        int sumActual=object.calculateSumOfCommonElements(array1,array2);
        Assertions.assertEquals(sumExpected,sumActual);
    }

    @Test
    public void givenTwoArraysWithZeroSizeThenMethodReturnsMinusOne(){
        int[] array1={};
        int[] array2={};
        int sumExpected=-1;
        int sumActual=object.calculateSumOfCommonElements(array1,array2);
        Assertions.assertEquals(sumExpected,sumActual);
    }

}
