/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopark;

//NISANUR YADIGAR KORKMAZ 170201102

public class Automobile implements Arac {

    double fuel;
    double speed;
    String license;
    long girisZamani;
    int aracsayisi=0;

    public Automobile(){
        aracsayisi++;
        fuel=0;
        speed=0;
        license="NULL";
    }
    

    public Automobile(double f, double s, String l) {
    this.fuel=f;
    this.speed=s;
    this.license=l;
    }

    public Automobile(String l) {
        this.setLicense(l);
    }
 
    public void hızlan(double hızlanmaOranı){
    if(hızlanmaOranı>0 && hızlanmaOranı<=1){
        if((speed+speed*(hızlanmaOranı))<=300){
            speed=speed+speed*(hızlanmaOranı);
            System.out.println("yeni hizi "+speed);
        }
        else{
            System.out.println("Hiz degismedi ");
        } 
    }
    else{
        System.out.println("Hiz degismedi ");
    }
    }

    public void yavasla(double yavaslamaOranı) {
        if(yavaslamaOranı>0 && yavaslamaOranı<=1){
            if(speed-speed*(yavaslamaOranı)>0){
                speed=speed-speed*(yavaslamaOranı);
                System.out.println("yeni hiz "+speed);
            }
            else{
                System.out.println("Hiz degismedi");
            }
        }
        else{
                System.out.println("Hiz degismedi");
            }

 
    }
    public void stop() {
    speed=0;
    System.out.println("Hiz sifirlandi, arac durdu");
    }


    public double getFuel() {
        return fuel;
    }

    public double getSpeed() {
        return speed;
    }

    public String getLicense() {
        return license;
    }

    public long getGirisZamani() {
        return girisZamani;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setGirisZamani(long girisZamani) {
        this.girisZamani = girisZamani;
    }
    
}

