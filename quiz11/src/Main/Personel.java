/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

//NISANUR YADIGAR KORKMAZ 170201102
public abstract class Personel extends Maas implements Kisi {

    int maas;
    String isim;
    String gorev="";

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getSaat() {
        return saat;
    }

    public int getMesai() {
        return mesai;
    }


    public String getIsim() {
        return isim;
    }
    
    public int getMaas() {
        return maas;
    }
}
