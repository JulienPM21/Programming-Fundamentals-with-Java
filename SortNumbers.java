package Exersices.BasicSyntaxExercise;

public class SortNumbers {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }
        } else {
            if (a >= b) {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }
        }
        }
    }

