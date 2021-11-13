/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

//NISANUR YADIGAR KORKMAZ 170201102
public class Main {

    public static void main(String[] args) {
        daire d1 = new daire(1, 1);
        d1.ekle();
        daire d2 = new daire(2, 3, 2);
        d2.ekle();
        dortgen dg1 = new dortgen(2, 2);
        dg1.ekle();
        System.out.println(d1.alan());
        System.out.println(d2.alan());
        System.out.println(dg1.alan());
        d1.enUst();
        d2.enUst();
        dg1.enUst();
        d1.listele();
        d2.sil();
        d2.listele();
    }
}
