package Lectures.DataType;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
       if (Character.isLowerCase(a)){
           System.out.println("lower-case");
       }else if (Character.isUpperCase(a)){
           System.out.println("upper-case");
       }


    }
}
