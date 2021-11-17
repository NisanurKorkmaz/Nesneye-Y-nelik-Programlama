/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders;


import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class Ders {

    private String adi = "";
    private String donem = "";
    private int not;

    public Ders(int not) {
        this.not = not;
    }
    public Ders(){
        
    }
    public String getAdi() {
        return adi;
    }

    public String getDonem() {
        return donem;
    }

    public int getNot() {
        return not;
    }

    public void setAdi(String ad) {
        this.adi = ad;
    }

    public void setDonem(String donem) {
        this.donem = donem;
    }

    public void setNot(int not) {
        this.not = not;
    }

    public static void main(String[] args) throws IOException {

        //String filename = "\\Users\\nisanurkorkmaz\\Desktop\\Ders\\src\\ders\\ali_bilge.txt";
        File f = new File("/Users/nisanurkorkmaz/Desktop/Ders/src/ders/ali_bilge.txt");
        Scanner dosya = new Scanner(f);
        Ogrenci ali = new Ogrenci();
        double ortalama=0;
        if (f.exists()) {
            System.out.println("Dosya var!");
        } else {
            System.out.println("Dosya yok!");
        }
        String addd = dosya.next();
        ali.setAd(addd);
        String soyadd = dosya.next();
        ali.setSoyAd(soyadd);
        int ogrencino=dosya.nextInt();
        ali.setOgrenciNo(ogrencino);
        
        System.out.println(ali.ad);
        System.out.println(ali.soyAd);
        System.out.println(ali.ogrenciNo);
        
        ArrayList <Ders> liste = new ArrayList<>(6);
        Ders d = new Ders();
        System.out.println("Ali'nin derslerinin listesi : ");
        for(int i=0 ; i<6 ; i++){
            String dersadi=dosya.next();
            d.adi=dersadi;
            
            
            String donemm=dosya.next();
            d.donem=donemm;
            d.setDonem(donemm);
            
            
            int nott=dosya.nextInt();
            d.not=nott;
            
            
            liste.add(d);
            
            System.out.println("--"+liste.get(i).adi);
            ortalama=ortalama+nott;
        }
        ortalama=ortalama/6.0;
        System.out.println("Ali'nin ortalamasi = "+ortalama);
        
//        for(int j=0 ; j<6 ; j++){
//        System.out.println("Ali'nin dersinin adi "+liste.get(j).adi+" donemi "+liste.get(j).donem+" notu "+liste.get(j).not);
//        
//    }
 }

}
