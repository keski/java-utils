package io.github.keski.javautils;

public class StringUtil {
    public static void main(String[] args){
        String s = "Hello world";
        System.out.println(s);
        System.out.println(reverse(s));
    }

    public static String reverse(String s){
        String reversed = "";
        for(int i = s.length()-1; i >= 0; i--){
            reversed += s.substring(i,  i + 1);
        }
        return reversed;
    }
    
}