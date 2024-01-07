package Exersices.DataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        // number of courses = people / capacity; ( закръгляме на горе)

        double courses = people * 1.0 / capacity ;

        System.out.printf("%.0f",Math.ceil(courses));

    }
}
