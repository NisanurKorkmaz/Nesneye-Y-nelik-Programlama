/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170201102;

import java.util.Scanner;

// NISANUR YADIGAR KORKMAZ 170201102

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //calisma 1
        int [][]dizi= new int[3][3];
        System.out.println("Dizinin elemanlarini giriniz (9 adet tam sayi)");
        for(int i=0 ; i<3 ; i++)
        {
            for(int j=0 ; j<3 ; j++)
            {
                dizi[i][j]=sc.nextInt();
            }
        }
        int maksimum=dizi[0][0];
        int minimum=dizi[0][0];
        for(int i=0 ; i<3 ; i++)
        {
            for(int j=0 ; j<3 ; j++)
            {
                if(dizi[i][j]>maksimum)
                {
                    maksimum=dizi[i][j];
                }
                if(dizi[i][j]<minimum)
                {
                    minimum=dizi[i][j];
                }
            }
        }
        int fark= maksimum-minimum;
        System.out.print("En buyuk deger olan "+maksimum+" en kucuk deger olan "+minimum);
        System.out.println(" arasindaki fark "+fark);
        System.out.println("\n");
        
        //calisma 2
        int []A= new int [10];
        int []B= new int [10];
        int []C= new int [10];
        
        System.out.print("A : ");
        for(int i=0 ; i<10 ; i++)
        {
            A[i]=sc.nextInt();
        }
        
        int j=0;
        int k=0;
        for(int i=0 ; i<10 ; i++)
        {
            if(A[i]%2==0)
            {
                B[j]=A[i];
                j++;
            }
            else
            {
                C[k]=A[i];
                k++;
            }
        }
        System.out.print("\nB : ");
        for(int i=0 ; i<j ; i++)
        {
            System.out.print(" "+B[i]);
            
        }
        System.out.print("\nC : ");
        for(int i=0 ; i<k ; i++)
        {
            System.out.print(" "+C[i]);
            
        }
        System.out.print("\n ");
        
    }
    
}
