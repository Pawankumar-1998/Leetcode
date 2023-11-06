package com.Pawan.GfG;

public class UpperCaseInString {
    public static void main(String[] args) {

        String str = "geeksforgeeKs";
        System.out.println(firstChar(str,0));
    }
    static char firstChar(String str, int i){
        if (str.charAt(i)=='\0'){
            return 0;
        }

        if (Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        }

        return firstChar(str, i+1);
    }
}
