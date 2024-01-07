package Lectures;

import java.util.Scanner;

public class TheatrePromotions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = -1;

        if (day.equals("Weekday")) {
            if (0 <= age && age <= 18) {
                price = 12;
            } else if (18 < age && age <= 64) {
                price = 18;
            } else if (64 < age && age <= 122) {
                price = 12;
            }
        } else if (day.equals("Weekend")) {
            if (0 <= age && age <= 18) {
                price = 15;
            } else if (18 < age && age <= 64) {
                price = 20;
            } else if (64 < age && age <= 122) {
                price = 15;
            }
        } else if (day.equals("Holiday")) {
            if (0 <= age && age <= 18) {
                price = 5;
            } else if (18 < age && age <= 64) {
                price = 12;
            } else if (64 < age && age <= 122) {
                price = 10;
            }

        }
        if (price == -1){
            System.out.println("Error!");
        }else{
            System.out.println(price + "$");
        }

    }
}