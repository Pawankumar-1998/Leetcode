package com.Pawan.GfG;

public class GeekOnacci {
    public static void main(String[] args) {
        System.out.println(f(6));
    }
    static int f(int number){
        if (number==1){
            return 1;
        }

        if (number==2){
            return 3;
        }

        if (number==3){
            return 2;
        }

        return f(number-1) + f(number-2) + f(number-3);
    }
}
