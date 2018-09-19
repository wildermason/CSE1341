/*
Author: Wilder Mason
Student ID: 47322253
Date: October 5, 2017
Lab 4- Fall 2017
*/

import java.util.Scanner;

public class SmallestInteger
{

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.print("Enter 10 Numbers: ");
        for(int i = 0; i < 10; i++)
        {
            nums[i] = kb.nextInt();
        }
        System.out.println("The smallest integer is " + returnSmallest(nums));
    }
    public static int returnSmallest(int[] arr)
    {
        int smallest = arr[0];
        for(int j = 0; j < 10; j++)
        {
            if(arr[j] < smallest)
            {
                smallest = arr[j];
            }
        }
        return smallest;
    }
}