/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170201102;

import java.util.Scanner;


public class pkg170201102 {

    public static void main(String[] args) {

        double fakt;
        fakt = 1;
        for (int i = 2; i <= 10; i++) {
            fakt = fakt * i;

        }

        System.out.println(fakt);

        System.out.println("Lutfen 3 kelime giriniz ");

        String k1;
        String k2;
        String k3;

        Scanner scn = new Scanner(System.in);
        k1 = scn.next();
        k2 = scn.next();
        k3 = scn.next();

        System.out.println(k1 + "\\" + k2 + "\\" + k3);

    }

    
}
