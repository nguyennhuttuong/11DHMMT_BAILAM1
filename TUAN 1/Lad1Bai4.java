/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad.pkg1.bai.pkg4;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Nhựt Tường
 */
public class Lad1Bai4 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        float a,b,c ;
        float Delta,x;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Tìm Delta và căng Delta của phương trình 2");
        System.out.print("Nhập số a :");
        a=scanner.nextFloat();
        System.out.print("Nhập số b :");
        b=scanner.nextFloat();
        System.out.print("Nhập số c :");
        c=scanner.nextFloat();
        Delta=(float) (Math.pow(b, 2)-4*a*c);
        x=(float) Math.sqrt(Delta);
        System.out.println("Delta "+Delta);
        System.out.println("Căng Delta "+x);
    }
    
}
