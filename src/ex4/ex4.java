package ex4;

import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int nr1 = rand.nextInt(30);
        int nr2 = rand.nextInt(30);
        while(nr1==0)
        {
            nr1 = rand.nextInt(30);
        }

        while (nr2 == 0)
        {
            nr2 = rand.nextInt(30);
        }
        int cmmdc=0, d=nr1/2;
        while(cmmdc==0)
        {
            if(nr1%d==0 && nr2%d==0)
            {
                cmmdc=d;
            }
            d--;
        }
        System.out.println("Cel mai mare divizor comun al numerelor "+nr1+" si "+nr2+" este: "+cmmdc);
    }
}
