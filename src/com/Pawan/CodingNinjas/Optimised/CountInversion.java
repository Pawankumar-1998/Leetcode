package com.Pawan.CodingNinjas.Optimised;

public class CountInversion {
    public static void main(String[] args) {
            int[] arr = {3,2,1};
        System.out.println(f(arr,0, arr.length-1));
    }
    static int f(int[] arr , int start , int end ){
        int count = 0;
        if (start<end){
            int mid = start + (end - start)/2;

//            for the left part
            count = count + f(arr, start, mid);

//            for the right part
            count = count + f(arr,mid+1,end);

//            for the merge part
            count = count + merge(arr,start,mid,end);

        }
        return count;
    }

    static int merge(int[] arr , int start , int mid , int end){
        int[] tempAnsArray = new int[(end-start) + 1];
        int count = 0;

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i<=mid && j<=end){
            if (arr[i] < arr[j]){
                tempAnsArray[k] = arr[i];
                i++;
            } else {
                count = count + ((mid - start) + 1);
                tempAnsArray[k] = arr[j];
                j++;
            }
            k++;
        }

//        for the remaining array
        while (i<=mid){
            tempAnsArray[k] = arr[i];
            i++;
            k++;
        }

//        for the another remaining array
        while(j<=end){
            tempAnsArray[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < tempAnsArray.length; l++) {
            arr[start+l] = tempAnsArray[l];
        }

        return count;
    }
}
