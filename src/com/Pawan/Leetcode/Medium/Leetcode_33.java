package com.Pawan.Leetcode.Medium;

public class Leetcode_33 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(f(arr, 0, 0, arr.length - 1));
    }

    static int f(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        // if the left array is sorted

        if (arr[start] <= arr[mid]) {
            // check if the target lies in these range or not
            if (target >= arr[start] && target <= arr[mid]) {
                return f(arr, target, start, mid - 1);
            } else {
                return f(arr, target, mid + 1, end);
            }
        }


        // if the target is the right sorted array
        if (target >= arr[mid] && target <= arr[end]) {
            return f(arr, target, mid + 1, end);
        }

        return f(arr, target, start, mid - 1);
    }
}
