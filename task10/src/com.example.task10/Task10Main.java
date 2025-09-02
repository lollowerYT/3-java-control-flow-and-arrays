package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        int max = 10000000;
        var index = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < max)
            {
                index = i;
                max = arr[i];
            }
        }
        return index;
    }
}
