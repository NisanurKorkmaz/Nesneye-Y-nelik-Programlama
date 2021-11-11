
package lab_7;



 
public class Faktoriyal {
    
    private int deger;
    private int sonuc;
    
    /**
     * Faktoriyali bulunmak istenen
     * değeri atar
     * @param deger
     */
    public void setDeger(int deger){
        this.deger=deger;
    }
    /**
     * Faktoriyali bulunmak istenen
     * dönderir
     * @return
     */
    public int getDeger(){
        
        return deger;
    }
    
    /** 
     * Girilen değerin faktorial değerini Islemlerim
     * class ındaki methodları kullanarak 
     * hesaplayıp sonuc parametresine yazdırır
     */    
    public void hesapla(){
        sonuc=1;
        for(int i=1 ; i<=deger ; i++)
        {
            Islemlerim g= new Islemlerim(sonuc);
            sonuc=(int)g.carp(i);
        }
        
    }
    
    /**
     * Degeri ve sonucu ekrana yazdırır
     */
    public void ekranaYazdir(){        
     System.out.println(deger+"in faktoriyeli : "+sonuc);
    }

}
