package com.Pawan.Leetcode.Optimised;

public class GapMethod {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {0,2,6,8,9};
        int m = arr1.length;
        int n = arr2.length;
        merge(arr1,arr2,m,n);

    }
    static void merge(int[] arr1 , int[] arr2 , int lengthOfFirstArr , int lengthOfSendArr){
        int totalLength = lengthOfFirstArr + lengthOfSendArr;

//        gap method is all about finding the gap between the left pointer and the right pointer

        int gapBetweenTwoPointers = (totalLength / 2) + (totalLength % 2);

//        the first valid condition is gap Between two pointer  should always be greater than 0
        while (gapBetweenTwoPointers>0){
            int leftPointer = 0;
            int rightPointer = gapBetweenTwoPointers;
//            the second valid condition is the right pointer should be inside the total Length
//            if it goes out of the boundary then we need to stop the process
            while (rightPointer<totalLength){

                /**
                 * in the whole process the left pointer and right pointer will be present in three
                 * scenarios
                 *
                 * 1. if the left pointer is in the first array and the right pointer is in the second array
                 *
                 */

                if (leftPointer<lengthOfFirstArr && rightPointer>=lengthOfFirstArr){
//                    // code for swap
                   swapRequire(arr1,arr2,leftPointer,rightPointer-lengthOfFirstArr);
                }
                /**
                 * 2.  the left pointer is the second array and the right pointer is also in the second array
                 *      its simple commonsense if the left pointer is in the second array then we need no
                 *      to check for the right one it will be definitely in the second array
                 */

                else if (leftPointer>=lengthOfFirstArr) {
//                    code for swap
                    swapRequire(arr2,arr2,leftPointer-lengthOfFirstArr,rightPointer-lengthOfFirstArr);
                }
                /**
                 * 3. the left pointer and the right pointer both are on the left array
                 *
                 * if any of the above if cases are false indicates that both are on the left array
                 *
                 */
                else {
//                    code for swap
                    swapRequire(arr1,arr1,leftPointer,rightPointer);
                }
                leftPointer ++;
                rightPointer++;
            }
//            the inner while loop will run for one gap value if the gap between two Pointer is one
//            its better to end the program else go for the next gap value

            if (gapBetweenTwoPointers==1){
                break;
            } else {
                gapBetweenTwoPointers = (gapBetweenTwoPointers / 2) + (gapBetweenTwoPointers % 2);
            }
        }
    }


    static void swapRequire(int[] arr1 , int[] arr2 , int leftPointerIndex , int rightPointerIndex){
        if (arr1[leftPointerIndex] > arr2[rightPointerIndex]){
            int temp = arr2[rightPointerIndex];
            arr2[rightPointerIndex] = arr1[leftPointerIndex];
            arr1[leftPointerIndex] = temp;
        }

    }
}
