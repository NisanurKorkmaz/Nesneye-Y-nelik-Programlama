/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

//NISANUR YADIGAR KORKMAZ 170201102

public class IdariPersonel extends Personel {
    
    public IdariPersonel(String isim, int maas){
        this.isim=isim;
        this.maas=maas;
        
    }

    public int getMaas() {
        return maas;
    }

    public String getIsim() {
        return isim;
    }

    public int getSaat() {
        return saat;
    }

    public int getMesai() {
        return mesai;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSaat(int saat) {
        this.saat = saat;
    }

    public void setMesai(int mesai) {
        this.mesai = mesai;
    }
    
    
}
