/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170201102;

//NISANUR YADIGAR KORKMAZ 170201102
import java.util.Scanner;

public class Main {
    
    static int []d= new int[5];
    public static void main(String[] args) {
        //CALISMA 1
        int i, j;
        System.out.println("dizinin boyutlarini giriniz");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        j = sc.nextInt();
        int[][] dizi = matris(i, j);
        
        for(int a=0 ; a<i ; a++){
            for(int b=0 ; b<j ; b++){
                System.out.print(dizi[a][b]+" ");
            }
            System.out.println();
        }
        
        //CALISMA 2
        System.out.print("2. calismanin dizisi \nd: ");
        for(int x=0 ; x<5 ; x++){
            
            d[x] = (int) (100 * Math.random());
            System.out.print(d[x]+" ");
            }
            System.out.println();
        
        int s=sum();
        System.out.println("d dizisinin elemanlarinin toplami = "+s);
    }
    
    public static int sum(){
        int s=0;
        for(int k=0 ; k<5; k++){
                s=s+d[k];
        }
        return s;
    } 
//CALISMA 1 
    public static int[][] matris(int i, int j) {
        int[][] dizi = new int[i][j];
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {
                dizi[a][b] = (int) (100 * Math.random());
                
            }
        }
        return dizi;
    }
}
