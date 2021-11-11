package lab_7;



import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //soru 2
        double deger1=12.00;
        double deger2=7.00;
        Islemlerim i = new Islemlerim(deger1);
        System.out.println("toplama :"+i.topla(deger2));
        System.out.println("cikarma : "+i.cikar(deger2));
        System.out.println("carpma :"+i.carp(deger2));
        System.out.println("bolme :"+i.bol(deger2));
        System.out.println("buyukdur :"+i.buyukdur(deger2));
        System.out.println("kucuktur :"+i.kucuktur(deger2));
        System.out.println("esittir :"+i.esittir(deger2));
        
        //soru 4
        Scanner s = new Scanner(System.in);
        int d1;
        double d1alan , d1cevre ;
        System.out.println("Dairenin yaricapini giriniz ");
        d1=s.nextInt();
        Daire e = new Daire(d1);
        d1alan=e.alanHesapla();
        d1cevre=e.cevreHesapla();
        e.ekranaYazdir();
        
        int d2=6;
        double d2alan , d2cevre ;
        Daire f= new Daire(d2);
        d2alan=f.alanHesapla();
        d2cevre=f.cevreHesapla();
        System.out.println("\n2. daire ");
        f.ekranaYazdir();
        
        Islemlerim j = new Islemlerim(d1alan);
        System.out.println("Daire 1 alani daire 2nin alanindan buyuktur "+j.buyukdur(d2alan));
        System.out.println("Daire 1 alani daire 2nin alanindan kucuktur "+j.kucuktur(d2alan));
        
        Islemlerim k = new Islemlerim(d1cevre);
        System.out.println("Daire 1 cevresi daire 2nin alanindan buyuktur "+k.buyukdur(d2cevre));
        System.out.println("Daire 1 cevresi daire 2nin alanindan kucuktur "+k.kucuktur(d2cevre));
        
        //soru 6
        System.out.println();
        Faktoriyal q = new Faktoriyal();
        q.setDeger(5);
        q.hesapla();
        q.ekranaYazdir();
        
        q.setDeger(10);
        q.hesapla();
        q.ekranaYazdir();
        
        
    }
}
