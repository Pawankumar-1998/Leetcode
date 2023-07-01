package com.Pawan.Leetcode.Easy;

public class Leetcode_1832 {
    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence){
        Boolean ans;

        for (char i = 'a' ; i<= 'z' ; i++){
            if (sentence.indexOf(i)<0){
                return false;
            }
        }
        return true;
    }
}
