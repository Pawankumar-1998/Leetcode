package com.Pawan.Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_118 {
    public static void main(String[] args) {
//        pascalTriangle(5);
        System.out.println(pascalTriangle(5));

    }

    static List<List<Integer>> pascalTriangle(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();

//        base case
        if (numRows==0){
            return triangle;
        }

        for (int i = 1; i <=numRows ; i++) {
//            create a new array list
            List<Integer> row = new ArrayList<>();
//            for columns
            for (int j = 0; j <i ; j++) {
                // if it is the first row or the last row then just add one
                if (j==0 || j==i-1){
                    row.add(1);
                }else {
                    row.add(triangle.get(i-2).get(j)+triangle.get(i-2).get(j-1)); // dry run yourself you will get it
                }
            }
            triangle.add(row);  // add the row list to triangle list
        }
        return triangle;
    }
}
