package ex2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex2 {

        public static void main(String[] args) throws IOException {
            String nume_fisier = "in.txt";
            Scanner scan = new Scanner(new File("in.txt"));
            int[] num = new int[20];
            int nr=0,suma=0,minim=0,maxim=0;
            while(scan.hasNext()) {
                num[nr] = scan.nextInt();
                suma += num[nr];
                nr++;
            }
            System.out.println("Numerele: \n");
            for(int i=0;i<nr;i++)
                System.out.println(num[i]);
            System.out.println("\nSuma numerelor: "+suma+"\n");
            float ma=(float)suma/nr;
            System.out.println("Media aritmetica: "+ma+"\n");
            minim=num[0];
            maxim=num[0];
            for(int i=0;i<nr;i++)
            {
                if(num[i]>maxim)
                    maxim=num[i];
                if(num[i]<minim)
                    minim=num[i];
            }
            System.out.println("Valoarea minima: "+minim+"\nValoarea maxima: "+maxim+"\n");
            FileWriter fisier = new FileWriter("out.txt");
            PrintWriter flux_out = new PrintWriter(fisier);
            flux_out.printf("Suma numerelor: %d\nMedia aritmetica: %f\nValoarea minima: %d\nValoarea maxima: %d",suma, ma,minim,maxim);
            flux_out.close();
        }
    }

