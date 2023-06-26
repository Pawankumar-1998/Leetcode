package com.Pawan.GfG;

public class FirstUpperCase {
    public static void main(String[] args) {

        /*
        Question link :- https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/


        Given a string find its first uppercase letter
        Examples :

        Input : geeksforgeeKs
        Output : K

        Input  : geekS
        Output : S
         */

        String str = "geeksforgeeKs";

        char ans = firstUpperCase(str,0);

        if (ans==0){
            System.out.println("There is no capital letters in the string ");
        } else {
            System.out.println("The string has " + ans + " as Capital letter ");
        }
    }

    static char firstUpperCase(String str , int i){

        /*
        this means the program is reached at the end of the list
        if(str.charAt(i)=='\0'){
            return 0;
        }
         */

//      the above line of code will give error because java doesn't use '\0' i.e null
//        to represent the end of the string instead use the below case

        if (i>=str.length()){
            return 0;
        }

//        check if any character at the given index i has a uppercase/ capital letter
        if (Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        }

        return firstUpperCase(str,i+1);



    }
}
