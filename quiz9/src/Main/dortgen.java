/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

//NISANUR YADIGAR KORKMAZ 170201102

public class dortgen extends sekil{
    int en=1;
    int boy=1;
    
    public dortgen(int x, int y){
        this.x=x;
        this.y=y;
        System.out.println("dortgen yaratildi...");
        varlikID=sira;
        sira++;
    }
    public dortgen(int x, int y, int en, int boy){
        this.x=x;
        this.y=y;
        System.out.println("dortgen yaratildi...");
        varlikID=sira;
        sira++;
        this.boy=boy;
        this.en=en;
    }
    
        public double alan(){
        double a;
        a=en*boy;
        //System.out.println(a);
        
        return a;
    }
    
    
    public double cevre(){
        double c;
        c=2*en+2*boy;
        //System.out.println(c);
        return c;
    }
}
