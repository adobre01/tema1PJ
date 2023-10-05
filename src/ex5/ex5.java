package ex5;

import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int nr = rand.nextInt(20);
        int a = 0,b = 1, c = 1;
        while(c < nr)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.println(c);
        }
        if(c==nr)
            System.out.println("Numarul "+nr+" apartine sirului Fibonacci.");

        else
            System.out.println("Numarul "+nr+" nu apartine sirului Fibonaci.");
    }
}
