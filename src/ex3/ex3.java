package ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int n,ok=0;
        System.out.println("Introduceti numarul: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i=2;i<n;i++) {
            if (n % i == 0)
            {
                System.out.println(i);
                ok = 1;
            }
        }
        if(ok==0)
        {
            System.out.println("Numarul este prim.");
        }
    }
}
