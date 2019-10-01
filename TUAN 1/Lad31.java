/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad3.pkg1;

import java.util.Scanner;

/**
 
 * @author Nguyễn Nhựt Tường
 */
public class Lad31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("nhap so n can kiem tra :" );
        n = scanner.nextInt();
        boolean ok;
        ok = false;
        for(int i=2; i< n-1 ; i++)
        {
        if(n % i == 0)
        {
       
        ok = false;
        System.out.println("so n khong phai so nguyen to ");
        break;
        
        } 
        else
            {
             System.out.println("so ban nhap la so nguyen to");
             break;
            }
        }
    }
    
}
