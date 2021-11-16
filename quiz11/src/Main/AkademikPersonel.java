/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;



public class AkademikPersonel extends Personel {
    
        public AkademikPersonel(String isim, int maas){
        this.isim=isim;
        this.maas=maas;
        
    }
        public AkademikPersonel(String isim, int saat, int mesai){
        this.isim=isim;
        this.maas=maas;
        this.saat=saat;
        this.mesai=mesai;
        
        
    }
        
//        AkademikPersonel gok= new AkademikPersonel("onur", 8000);
//        AkademikPersonel cosgun= new AkademikPersonel("arzu", 9000);
//        AkademikPersonel mutlu= new AkademikPersonel("alev", 8000);
//


    public String getIsim() {
        return isim;
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
