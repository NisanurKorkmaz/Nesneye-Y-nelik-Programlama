/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopark;

//NISANUR YADIGAR KORKMAZ 170201102

import java.util.Vector;
import java.util.*;

public class Autopark {

    Vector <Automobile> sayarpark= new Vector <Automobile>();
    static long otoparkKasasi = 0;
    int size=0;
    int boyut=0;
    static long c=0;
    static long gc;

    Autopark(int size) {
        this.size=size;
       
    }
    
    public void girisYap(Automobile oto) {
            if(boyut<size){
                oto.girisZamani=System.currentTimeMillis();
                System.out.println(oto.license+" otoparka girdi ");
                sayarpark.add(oto);
                boyut++;
                System.out.println("Otopark kapasitesi ve boyutu : "+size+","+(size-boyut));
            }
            else 
            {
                System.out.println(oto.license+" park edemedi ");
            }
        }
    
    public void cikisYap(Automobile oto) {
        if(sayarpark.contains(oto)){
        long c=System.currentTimeMillis();
        gc=c-oto.girisZamani;
        System.out.println(oto.license+" otoparktan "+gc+"  milisaniye sonra cikti. Kasaya eklenicek tutar ="+((gc)/100f)*10);
        sayarpark.remove(oto);
        boyut--;
        otoparkKasasi=otoparkKasasi+((gc)/100)*10;
        }
        else {
            System.out.println("Araç bulunamadı");
        }
        }

    
    public static void kasaBilgi() {
        System.out.println("Kasadaki toplam para: "+otoparkKasasi);
    }

        // Çalışma-1 ile ilgili
    public int recursiveTopl(int n) {
        if(n<=2)
            return 1;
        else 
            return 3*recursiveTopl(n/2)+n;
        
    }
    
    public static void main(String[] args) throws InterruptedException {
        Autopark park = new Autopark(1);
        Automobile a = new Automobile(3.0, 100.0 , "41 BR 123");
        Automobile b = new Automobile(4.0, 150.0 ,"34 TR 456 ");
        park.girisYap(a);  
        Thread.sleep(200); 
        park.girisYap(b); 
        Thread.sleep(999); // 999 milisaniye zaman geçiyor
        park.cikisYap(b);
        park.cikisYap(a); 
        park.kasaBilgi();  

    }

    }
