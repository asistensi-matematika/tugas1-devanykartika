/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Windows 10
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("Suatu polinomial");
        
        if(a==0){
            System.out.println("Nilai dari a tidak boleh sama dengan 0");
        }
        if(a!=0){
            System.out.println(a+"x^2+"+b+"x+"+c+" mempunyai = ");
        }
        
        int D;
        D = (b^2)-(4*a*c);
        System.out.println("1. Diskriminan = " +D);
        
        int x1;
        int x2;
        x1 = (-b+(D^(1/2)))/(2*a);
        x2 = (-b-(-D^(1/2)))/(2*a);
        System.out.println("2. Akar-akar dari polinomial = " +x1+ " dan " +x2);
        
        int xstationer;
        int ystationer;
        xstationer = (-b)/(2*a);
        ystationer = (-D)/(4*a);
        System.out.println("3. Titik stationer = ("+xstationer+" , "+ystationer+")");
        
        if(a>0){
            System.out.println("4. Kecekungan kurva = Atas");
        }
        if(a<0){
            System.out.println("4. Kecekungan kurva = Bawah");
        }
        
        System.out.println("5. Nilai minimum lokal = " +ystationer);
        }
    }
    

