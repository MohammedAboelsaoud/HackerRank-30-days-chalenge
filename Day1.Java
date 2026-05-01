import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
     
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
    
        Scanner input = new Scanner(System.in);


        int a= input.nextInt();
        double b= input.nextDouble();
        input.nextLine();
        String c = input.nextLine();
        
        System.out.println(i + a);
        System.out.println(d + b);
        System.out.println(s + c);
        input.close();
    }
}
