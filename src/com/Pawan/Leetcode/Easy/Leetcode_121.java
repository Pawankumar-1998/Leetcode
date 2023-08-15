package com.Pawan.Leetcode.Easy;

public class Leetcode_121 {
    public static void main(String[] args) {
        int[] arr = {7,5,4,3,1};

        System.out.println(buyAndSellStocks(arr));
        }

        static int buyAndSellStocks(int[] arr){
            int minimumPrice = arr[0];
            int maxProfitEarned = 0;

            for (int currentDay = 1; currentDay < arr.length; currentDay++) {
                int currentProfit = arr[currentDay] - minimumPrice;
                if (currentProfit>maxProfitEarned){
                    maxProfitEarned = currentProfit;
                }
                if (arr[currentDay]<minimumPrice){
                    minimumPrice = arr[currentDay];
                }
            }
            return maxProfitEarned;
        }
    }

