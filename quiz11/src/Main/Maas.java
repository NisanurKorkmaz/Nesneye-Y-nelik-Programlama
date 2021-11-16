/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;



public class Maas {
    int maas;
    int saat;
    int mesai;
    
    public int MaasHesapla(int mesai, int saat){
        maas=saat*mesai;
        return maas;
    }

    public int getMaas() {
        return maas;
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

    public void setSaat(int saat) {
        this.saat = saat;
    }

    public void setMesai(int mesai) {
        this.mesai = mesai;
    }
    
    
}
