/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

//NISANUR YADIGAR KORKMAZ 170201102

import java.util.ArrayList;

public  class daire extends sekil {

    int yaricap = 1;

    public daire(int x, int y) {
        this.x=x;
        this.y=y;
        System.out.println("daire yaratildi...");
        varlikID = sira;
        sira++;
    }

    public daire(int x, int y, int yaricap) {
        this.yaricap = yaricap;
        this.x=x;
        this.y=y;
        System.out.println("daire yaratildi...");
        varlikID = sira;
        sira++;
    }

    int buyut(int k) {
        return yaricap + k;
    }

    
    public double alan() {
        double a;
        a = 3.14 * yaricap * yaricap;
        //System.out.println(a);
        return a;
    }

    
    public double cevre() {
        double c;
        c = 2 * 3.14 * yaricap;
        //System.out.println(c);
        return c;
    }

    public int getYaricap() {
        return yaricap;
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

    public int getI() {
        return i;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
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

    public void setI(int i) {
        this.i = i;
    }
    
}
