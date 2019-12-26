## Problem Statement: Finding the sum of common elements from given two arrays ##

**Given two set of integer arrays calculate the sum of common elements**

**This exercise contains a class named SumOfCommonElements with the following method:**

    getArraySize():int 
    getArrayElements(int):int[]
    calculateSumOfCommonElements(int[],int[]):int
    displayResult():void  
  
- An int value is scanned for getting the array size using getArraySize() method.
- Set of arrays elements are scanned and stored in two arrays separetely using getArrayElements() method.
- calculateSumOfCommonElements() should return:
         the sum of common elements between the array elements.
         zero if there are no common elements.
         -1 if the input array size is 0.

**Do the following in the main method of SumOfCommonElements class**

call the functions in the required sequence. 

## Example
    Sample Input:
    {10,20,30,40,50}
    {5,10,15,20,25} 
    
    Expected Output:
    30
--------------------------------------------------------
    Sample Input:
    {10,20,20}
    {10,10,20}
    
    Expected Output:
    60
--------------------------------------------------------
    Sample Input:
    {1,2,3}
    {4,5,6}
    
    Expected Output:
    0
--------------------------------------------------------
    Sample Input:
    {}
    {}
    
    Expected Output:
    No elements in arrays

## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding
