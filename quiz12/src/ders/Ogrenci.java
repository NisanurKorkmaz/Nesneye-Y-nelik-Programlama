/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders;
//NISANUR YADIGAR KORKMAZ 170201102
import java.util.ArrayList;

public class Ogrenci {
     String ad="";
     String soyAd="";
     int ogrenciNo;
    
    public Ogrenci(){
        
    }
    public Ogrenci(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }
  

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

  
}
