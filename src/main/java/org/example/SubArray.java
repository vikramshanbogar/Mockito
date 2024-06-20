package org.example;

public class SubArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,4,2,1,0};
        int maxSubArraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i<arr.length-2 && (arr[i]+arr[i+1]+arr[i+2])>maxSubArraySum ){
                maxSubArraySum = arr[i]+arr[i+1]+arr[i+2];
            }
        }
        System.out.println(maxSubArraySum);
    }
}
