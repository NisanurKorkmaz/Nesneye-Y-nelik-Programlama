/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg170201102;

//NISANUR YADIGAR KORKMAZ 170201102

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String cumle1 ;
        String cumle2 ;
        System.out.println("birinci cumleyi giriniz");
        System.out.println("ikinci cumleyi giriniz");
        
        Scanner sc = new Scanner(System.in);
        
        cumle1=sc.nextLine();
        cumle2=sc.nextLine();
        
        //birinci soru
        int a=0;
        if(cumle1.length()==cumle2.length()){
        for(int i=0 ; i<cumle1.length(); i++){
            
            if(cumle1.charAt(i)!=cumle2.charAt(i)){
                a++; 
            }
        }
        }
        else 
            a++;
        if(a==0){
            System.out.println("iki cumle esittir");
        }
        else 
            System.out.println("iki cumle farklidir");
        
        
        //ikinci soru
        
        int b=cumle1.length()-1;
        for(int i=0 ; i<=b ; i++){
            System.out.print(cumle1.charAt(b-i));
            
        }
        
    }
    
}
