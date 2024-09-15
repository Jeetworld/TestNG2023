package ProgramTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringMisc {

    public static StringBuilder reverseString(String input){
        StringBuilder output = new StringBuilder();
        char[] ch = input.toCharArray();
        for(int i = ch.length-1; i>=0; i--){
            output.append(ch[i]);
        }

        return output;
    }
    public static void main(String[] args){
    System.out.println("Hi Hello This is programming World !!");
        String result = String.valueOf(reverseString("HELLO"));
        System.out.println("Reverse of string is "+result);
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Aemp","Bemp"));
        System.out.println("1st order "+list);
        System.out.println("Reverse order "+list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));


        String a ="10";
        String b = "20";
        String c = "30";
        int output = Integer.valueOf(a) + Integer.valueOf(b);
        System.out.println("Addition is "+output);
        System.out.println("hi this is kamaljtit singh !!");



        
    }
}
