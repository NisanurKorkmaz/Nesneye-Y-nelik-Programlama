/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.ArrayList;

//NISANUR YADIGAR KORKMAZ 170201102

public class JavaApplication19 {
    
    public static void main(String[] args) {
        kume km = new kume();
        km.ekle(10);
        km.ekle(11);
        km.ekle(2);
        System.out.print("km = {");
        km.yazdir();
        System.out.println("}");
        int[] a = {1, 2, 3, 4, 5, 6};
        kume km2 = new kume(a);
        System.out.print("km2 = {");
        km2.yazdir();
        System.out.println("}");
        kume km3 = new kume(a);
        System.out.print("km3 = {");
        km3.yazdir();
        System.out.println("}");
        
        if (km.denk(km2)) {
            System.out.println("km ve km2 kumeleri denk.");
        } else {
            System.out.println("km ve km2 kumeleri denk degil.");
        }
        
        if (km2.esit(km3)) {
            System.out.println("km2 ve km3 kumeleri esit.");
        } else {
            System.out.println("km2 ve km3 kumeleri esit degil.");
        }
  
        kume sn = km.birlesim(km2);
        System.out.print("km ve km2 birlesimi = {");
        sn.yazdir();
        System.out.println("}");
        
        kume sn2 = km.kesisim(km2);
        System.out.print("km ve km2 kesisimi = {");
        sn2.yazdir();
        System.out.println("}");
        
        kume sn3 = km.fark(km2);
        System.out.print("km ve km2 farki = [");
        sn3.yazdir();
        System.out.println("}");
        

        System.out.println("km\'nin alt kumeleri");
        ArrayList<kume> sonuc = km.altKumeler();

        for (int i = 0; i < sonuc.size(); i++) {
            System.out.print("{");
            sonuc.get(i).yazdir();
            System.out.println("}");
        }
    }
}

 class kume {

    ArrayList<Integer> km = new ArrayList<Integer>();
    
    public kume kesisim(kume a) {// cagrici obje ile parametre objenin kesisiminden olusan kumeyi dondurur
        kume d=new kume();
        for(int i=0 ; i<km.size() ; i++)
        {
            if(km.contains(a.km.get(i)))
                d.ekle(a.km.get(i));
        }
        return d;
    }

    public kume fark(kume a) { // cagrici obje ile parametre objenin farkindan olusan kumeyi dondurur
        
        kume e= new kume();
        ArrayList<Integer> g = new ArrayList<Integer>();//km icin yedek liste 
        
        for(int i=0 ; i<km.size(); i++){//km yi g ye kopyalama
            g.add(km.get(i));
        }
        
        int w=g.size();
        
        for(int i=0 ; i<w ;i++){
            if(g.contains(a.km.get(i)))
                g.remove(a.km.get(i));}

        for(int i=0 ; i< g.size() ; i++){
            int p=g.get(i);
            e.ekle(p);
        }
        return e;
    }
    
    public ArrayList<kume> altKumeler() { // kumenin alt kumelerinden olusan bir ArrayList<kume> dondurur
        double w=Math.pow(2, km.size());
        ArrayList<kume>sc=new ArrayList<>();
        kume x=new kume();

        return sc;
    }

    public kume() {// parametresiz constructor
    
    }

    public kume(int[] a) { // a dizisinin elemanlarindan olusan kume
        for(int i=0 ; i<a.length ; i++){
            km.add(a[i]);
        }
    }

    public kume(kume a) { //copy constructor
    }

    public void ekle(int a) { // kumeye yeni eleman ekleme
    km.add(a);
    }

    public void yazdir() { // kume icerigini yazdirir
    for(int i=0 ; i<km.size(); i++){
        System.out.print(km.get(i));
        if(i!=(km.size()-1))
                System.out.print(", ");
                
    }
    }

    public boolean denk(kume a) { // cagrici obje ile parametre objenin denk kume olup olmadigini test eder
        
        if(km.size()==a.km.size())
            return true;
        else 
            return false;
    }

    public boolean esit(kume a) { //// cagrici obje ile parametre objenin esit kume olup olmadigini test eder

        if(km.equals(a.km))
            return true;
        else 
            return false;
        
    }

    public kume birlesim(kume a) { // cagrici obje ile parametre objenin bilesiminden olusan kumeyi dondurur
        kume c = new kume();
        for(int i=0 ; i< km.size() ; i++){
            int p=km.get(i);
            c.ekle(p);
        }
        int q;
        if(km.size()<a.km.size())
            q=a.km.size();
        else 
            q=km.size();
        int g=0;
        for(int i=0 ; i<q ; i++){
            
                if(km.contains(a.km.get(i)))
                    g++;
                else 
                    c.ekle(a.km.get(i));
        }
        return c;
    }

}
