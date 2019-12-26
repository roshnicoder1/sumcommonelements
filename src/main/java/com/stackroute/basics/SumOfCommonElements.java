package com.stackroute.basics;

import java.util.Scanner;

public class SumOfCommonElements {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SumOfCommonElements object = new SumOfCommonElements();

        int size = object.getArraySize();

        int[] array1 = object.getArrayElements(size);
        int[] array2 = object.getArrayElements(size);

        int result = object.calculateSumOfCommonElements(array1, array2);

        object.displayResult(result);
    }

    public int getArraySize() {
        return sc.nextInt();
    }

    public int[] getArrayElements(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
          array[i] = sc.nextInt();
        }
        return array;
    }

    public void displayResult(int result) {
        if(result==-1) {
            System.out.println("No elements in arrays");
        }
        else{
            System.out.println(result);
        }

    }

    public int calculateSumOfCommonElements(int array1[], int array2[]) {
        if(array1.length==0 ||array2.length==0){
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j])
                    sum = sum + array1[i];
            }
        }
        if (sum == 0) {
            return 0;
        } else {
            return sum;
        }
    }
}
