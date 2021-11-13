/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

//NISANUR YADIGAR KORKMAZ 170201102

import java.util.ArrayList;

public  abstract class sekil {
    int x, y;
    int varlikID ;
    double alan;
    double cevre;
    static int sira;
    static int n;
    String sinif = "" ;
    ArrayList<sekil> liste = new ArrayList<>();

    public void sil(){
        
    }
    int i=0;
    public void ekle (){
        liste.add(this);
        //System.out.println(liste.get(i).x);
        //System.out.println(liste.get(i).y);
        i++;
    }
    public void listele(){
        System.out.println(varlikID);
    }
    public double alan(){
      return alan;
  }
    
    public double cevre(){
        return cevre;
  }
    public void enUst(){
        
        System.out.println("sekil sinifi :"+liste.get(n).getClass().getSimpleName());
        System.out.println("x :"+x);
        System.out.println("y :"+y);
        System.out.println("cevre :"+liste.get(n).cevre());
        System.out.println("alan :"+liste.get(n).alan());
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVarlikID() {
        return varlikID;
    }

    public double getAlan() {
        return alan;
    }

    public double getCevre() {
        return cevre;
    }

    public static int getSira() {
        return sira;
    }

    public ArrayList<sekil> getListe() {
        return liste;
    }

    

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setVarlikID(int varlikID) {
        this.varlikID = varlikID;
    }

    public void setAlan(double alan) {
        this.alan = alan;
    }

    public void setCevre(double cevre) {
        this.cevre = cevre;
    }

    public static void setSira(int sira) {
        sekil.sira = sira;
    }

    public void setListe(ArrayList<sekil> liste) {
        this.liste = liste;
    }

    
}
