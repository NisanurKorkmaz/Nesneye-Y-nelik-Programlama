/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//NISANUR YADIGAR KORKMAZ 170201102

package Main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Personel[] personeller = new Personel[10];
        
        Personel gok = new AkademikPersonel("onur gok", 8000);
        Personel cosgun = new AkademikPersonel("arzu erdem cosgun", 9000);
        Personel mutlu = new AkademikPersonel("alev mutlu", 8000);
        Personel kavak=new AkademikPersonel("adnan kavak", 7000);
        
        IdariPersonel hulagu = new IdariPersonel("sadettin hulagu", 15000);
        IdariPersonel sayar = new IdariPersonel("ahmet sayar", 10000);
        IdariPersonel ozkan = new IdariPersonel("resul ozkan", 7000);

        personeller[0] = gok;
        personeller[1] = cosgun;
        personeller[2] = mutlu;
        personeller[3]= kavak;
        personeller[6] = hulagu;
        personeller[4] = sayar;
        personeller[5] = ozkan;
        System.out.println("Personel kadrosu :");
        for (Personel calisan : personeller) {
            if (calisan != null) {
                System.out.println("personel adi : "+calisan.getIsim() + " -- maasi : " + calisan.getMaas());
            }
        }
       
        Ogrenci[] ogrenciler = new Ogrenci[10];
        
        Lisans nisa =new Lisans("nisa", 2, 170, "Furkan");
        Lisans rana =new Lisans("rana", 2, 190, "Furkan");
        Lisans gulay =new Lisans("gulay", 2, 190, "Furkan");
        
        LisansUstu efe =new Doktora("efe", 5, 150, "bora"); 
        
        Doktora furkan = new Doktora("furkan", 7, 120, "ozge");
                
        ogrenciler[0]=nisa;
        ogrenciler[1]=rana;
        ogrenciler[2]=gulay;
        ogrenciler[3]=furkan;
        ogrenciler[4]=nisa;
        ogrenciler[5]=efe;
        System.out.println("\nOgrenci kadrosu :");
         for (Ogrenci calisan : ogrenciler) {
            if (calisan != null) {
                System.out.println("ogrenci adi : "+calisan.getIsim() + " --sinifi : " + calisan.getSinif());
            }
        }
         furkan.setDersSayisi(5);
         System.out.println(furkan.dersSayisi);
         
    }
    
    
}
