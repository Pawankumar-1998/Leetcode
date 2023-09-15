package com.Pawan.TestField;

public class Leetcode_62 {
    public static void main(String[] args) {
        System.out.println(uniquePath(0,0,3,7));
    }

    static int uniquePath(int i ,int j , int row , int col){
            if (i==(row-1) && j==(col-1)) return 1;
            if (i>=row || j>=col) return 0;
            else return uniquePath(i+1,j,row,col) + uniquePath(i,j+1,row,col);
    }
}
