/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad2.bai02;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Nhựt Tường
 */
public class Lad2Bai02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a,b,c;
        float Delta,x,x1,x2;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập vào giá trị a của phương trình :");
        a=scanner.nextFloat();
        System.out.println("Nhập vào giá trị b của phương trình :");
        b=scanner.nextFloat();
        System.out.println("Nhập vào giá trị c của phương trình :");
        c=scanner.nextFloat();
        
        if (a==0) {
            if (b==0) {
                if (c==0) {
                    System.out.println("Phương trình có vô số nghiệm !");
                    
                }
                else {
                    System.out.println("Phương trình vô nghiệm !");
                }
                
            }
            else {
                x=-c/b;
                System.out.println("Nghiệm của phương trình là "+x);
            }
            
        }
        else {
            Delta = (float) (Math.pow(b, 2)-4*a*c);
            if (Delta < 0) 
            {
                System.out.println("Phương trình vô nghiệm !");
                
            }
            if (Delta == 0) 
            {
                x=-b/(2*a);
                System.out.println("Phương trình có nghiệm kép !");
            }
            if (Delta > 0) 
            {
                float cangDelta=0;
                cangDelta = (float) Math.sqrt(Delta);
                x1=(float) ((-b+cangDelta)/(2*a));
                x2=(float) ((-b-cangDelta)/(2*a));
                System.out.println("Phương trình có hai nghiệm phân biệt là :");
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
        }
        }
    }
    
}
    
