/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170201102;

//NISANUR YADIGAR KORKMAZ 170201102
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //calisma 1
        int x;
        int sonuc;
        System.out.println("Bir x degeri giriniz ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        sonuc = (x * x * 4) - (8 * x) + 16;
        System.out.println("sonuc = " + sonuc);

        //calisma 2
        int para;
        int kalan = 0;
        int kagit = 0;

        System.out.println("Lutfen bir deger giriniz:");
        System.out.print(">>");
        para = sc.nextInt();
        
        if ((para / 50) > 0) {
            kagit = para / 50;
            para = para % 50;
        }
        if ((para / 25) > 0) {
            kagit = kagit + (para / 25);
            para = para % 25;
        }
        if ((para / 10) > 0) {
            kagit = kagit + (para / 10);
            para = para % 10;
        }
        if ((para / 5) > 0) {
            kagit = kagit + (para / 5);
            para = para % 5;
        }
        if (para > 0) {
            kalan = para;
        }
        System.out.print(">> " + kagit + " kagit para -");
        if (kalan > 0) {
            System.out.println(kalan + " TL nizi yedim :)");
        }

    }

}
