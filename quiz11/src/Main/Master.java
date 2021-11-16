/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

//NISANUR YADIGAR KORKMAZ 170201102

public class Master extends LisansUstu{
    
    int masterYili;
    String masterAdi="";
    String masterKodu="";
    
    public Master(String isim, int sinif, int ogrenciNO, String danisman) {
        super(isim, sinif, ogrenciNO, danisman);
    }

    public int getMasterYili() {
        return masterYili;
    }

    public String getMasterAdi() {
        return masterAdi;
    }

    public void setMasterYili(int masterYili) {
        this.masterYili = masterYili;
    }

    public void setMasterAdi(String masterAdi) {
        this.masterAdi = masterAdi;
    }
    
    
}
