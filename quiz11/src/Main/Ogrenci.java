/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

//NISANUR YADIGAR KORKMAZ 170201102

import java.util.ArrayList;


public abstract class Ogrenci extends Ders implements Kisi  {
    
    int ogrenciNO;
    int sinif;
    int dersNotlari;
    String danisman="";
    String isim;
    String bolum="";
    ArrayList <Integer> notlar= new ArrayList<>();
    
    public String getIsim() {
        return isim;
    }

    public int getOgrenciNO() {
        return ogrenciNO;
    }

    public int getSinif() {
        return sinif;
    }

    public int getDersNotlari() {
        return dersNotlari;
    }

    public String getDanisman() {
        return danisman;
    }

    public void setOgrenciNO(int ogrenciNO) {
        this.ogrenciNO = ogrenciNO;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public void setDersNotlari(int dersNotlari) {
        this.dersNotlari = dersNotlari;
    }

    public void setDanisman(String danisman) {
        this.danisman = danisman;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Ogrenci(){
        
    }
    
    public double ortalama(){
        double o=0;
        
        return o;
    }
    
      
    
    
}
