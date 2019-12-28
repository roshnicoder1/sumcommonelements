package com.stackroute.basics;

import java.util.Scanner;

public class SumOfCommonElements {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SumOfCommonElements object = new SumOfCommonElements();

        int size = object.getArraySize();

        int[] firstArray = object.getArrayElements(size);
        int[] secondArray = object.getArrayElements(size);

        int result = object.calculateSumOfCommonElements(firstArray, secondArray);

        object.displayResult(result);
    }

    public int getArraySize() {
        return scanner.nextInt();
    }

    public int[] getArrayElements(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
          array[i] = scanner.nextInt();
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

    public int calculateSumOfCommonElements(int firstArray[], int secondArray[]) {
        if(firstArray.length==0 ||secondArray.length==0){
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j])
                    sum = sum + firstArray[i];
            }
        }
        if (sum == 0) {
            return 0;
        } else {
            return sum;
        }
    }
}
