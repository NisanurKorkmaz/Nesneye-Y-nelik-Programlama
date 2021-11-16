/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


public class Doktora extends LisansUstu{

    public Doktora(String isim, int sinif, int ogrenciNO, String danisman) {
        super(isim, sinif, ogrenciNO, danisman);
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

    public String getIsim() {
        return isim;
    }

    public int getDersSayisi() {
        return dersSayisi;
    }

    public int getDersKredisi() {
        return dersKredisi;
    }

    public int getDersNotu() {
        return dersNotu;
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

    public void setDersSayisi(int dersSayisi) {
        this.dersSayisi = dersSayisi;
    }

    public void setDersKredisi(int dersKredisi) {
        this.dersKredisi = dersKredisi;
    }

    public void setDersNotu(int dersNotu) {
        this.dersNotu = dersNotu;
    }
    
}
