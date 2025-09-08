package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr))
        System.out.println(numMin(new int[]{5, 3, 3, 1, 1, 2}));
        System.out.println(numMin(new int[]{10, 20, 10, 5, 5}));
    }

    static int numMin(int[] arr) {
        int min = arr[0];
        var index = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] <= max)
            {
                index = i;
                max = arr[i];
            }
        }
        return index;
    }
}
