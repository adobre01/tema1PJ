package ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lungime: ");
        int l1 = scanner.nextInt();
        System.out.println("Latime: ");
        int l2 = scanner.nextInt();
        int perimetru = 2 * l1 + 2 * l2;
        int arie = l1 * l2;
        System.out.println("Perimetrul = " + perimetru);
        System.out.println("Aria = " + arie);
    }
}
