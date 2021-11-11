
package lab_7;

//NISANUR YADIGAR KORKMAZ 170201102

public class Daire {
    
    // Class parametreleri
    public double PI=3.14;
    public int yaricap;
    double alan;
    double cevre ;
    /**
     * Constructor
     * @param yaricap Dairenin yarıçapı
     */
    public Daire(int yaricap){
        this.yaricap=yaricap;
    }
    
    /**
     * Dairenin alanını Islemlerim class ındaki 
     * methodları kullanarak hesaplar
     * @return alanı double cinsinden dondurur
     */
    public double  alanHesapla(){
        
        Islemlerim y=new Islemlerim(PI);
        alan=y.carp(yaricap);
        Islemlerim z=new Islemlerim(yaricap);
        alan=z.carp(alan);
        return alan;
    }
    
    /**
     * Dairenin çevresini Islemlerim class ındaki 
     * methodları kullanarak hesaplar
     * @return cevreyi double cinsinden dondurur
     */
    public double cevreHesapla(){
        Islemlerim a=new Islemlerim(PI);
        cevre=a.carp(yaricap);
        Islemlerim b=new Islemlerim(cevre);
        cevre=b.carp(2.0);
        return cevre;
    }
    
    /**
     * Bir dairenin cevresinin alanından büyüyk
     * olup olmadığını Islemlerim class ındaki 
     * methodları kullanarak belirler
     * @return boolean değer dönderir
     */
    public boolean cevreAlandanBuyuktur(){
        Islemlerim c = new Islemlerim(cevre);
        boolean result;
        result=c.buyukdur(alan);
        return result;
    }
    
    /**
     * Bir dairenin cevresinin alanından küçük
     * olup olmadığını ıslemlerim class ındaki 
     * methodları kullanarak belirler
     * @return boolean değer dönderir
     */
    public boolean cevreAlandanKucuktur(){
        boolean result;
        Islemlerim d = new Islemlerim(cevre);
        result=d.kucuktur(alan);
        return result;
    }
    
    /**
     * Dairenin alanını ve çevresini ekrana yazdırır.
     */
    public void ekranaYazdir(){
        System.out.println("Dairenin alani : "+ alan);
        System.out.println("Dairenin cevresi : "+cevre);
    }
    
    

}
