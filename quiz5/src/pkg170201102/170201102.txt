/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170201102;

// NISANUR YADIGAR KORKMAZ 170201102
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //CALISMA 1
        int nombre;
        double moyenne = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("lutfen bir sayi giriniz. Cikmak istiyosaniz 0'a basiniz");
            nombre = sc.nextInt();
            if (nombre != 0) {
                moyenne = moyenne + nombre;
                n++;
            } else {
                break;
            }
        } while (nombre != 0);
        moyenne = moyenne / n;
        if(n!=0)
            System.out.println("giridiginiz sayilarin ortalamasi : " + moyenne);
        

        //CALISMA 2
        int[] A = new int[10];
        int[] B = new int[5];
        int[] C = new int[5];

        System.out.print("Lutfen 10 adet sayi giriniz\n A: ");
        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
        }
        
        int b = 0, c = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                C[c] = A[i];
                c++;
            } else {
                B[b] = A[i];
                b++;
            }
        }

        System.out.print("B :");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + B[i]);
        }
        System.out.println();

        System.out.print("C :");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + C[i]);
        }
        System.out.println();
    }

}
