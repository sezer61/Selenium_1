package org.example;

import java.util.Arrays;

public class mountain_arry {
    public static void main(String[] args) {
        int input[]={0,2,5,3,1};
        int input1[]={5,2,7,1,4};
        mountArr(input);
        mountArr(input1);
    }
    public static void mountArr(int []arr){
        int max = arr[0];
        int index= 0;
        boolean result= true;

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
            for (int i = 0; i <index ; i++) {
                if (arr[i]<arr[i+1]){
                    continue;
                }else {
                    result=false;
                    break;
                }
            }
            if (result){
                for (int i = index; i <arr.length-1 ; i++) {
                    if (arr[i]>arr[i+1]){
                        continue;

                    }else {
                        result=false;
                        break;
                    }
                }
            }
            if (result){
                System.out.println(Arrays.toString(arr) + "--->>>Mountain Array");
            }else {
                System.out.println(Arrays.toString(arr) + "--->>>Mountain Array Değil");
            }
        }
    }

