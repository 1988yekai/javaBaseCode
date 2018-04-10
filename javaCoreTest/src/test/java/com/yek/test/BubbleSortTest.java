package com.yek.test;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Administrator on 2018-4-10.
 */
public class BubbleSortTest {
    @Test
    public void bubbleSort(){
        System.out.println("bubble sort test!");
        int[] array = {9, 8, 5, 2, 4, 3, 44, 25};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length -1; i++){
            for (int j = 0; j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
