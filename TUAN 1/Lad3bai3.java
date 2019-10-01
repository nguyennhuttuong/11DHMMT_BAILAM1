/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad3bai3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Nhựt Tường
 */
public class Lad3bai3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n;
        double TbCong, tong=0, diem=0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap so phan tu mang :");
        n=scanner.nextInt();
        int []mang =new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Nhap phan tu thu a["+i+"] :");
            mang[i]=scanner.nextInt();
        }
       Arrays.sort(mang);
        System.out.print("cac phan tu mang duoc xep lai  ");
        for(int i=0; i<n; i++)
        {
            System.out.print(+mang[i]+" ");
            
            
        }
        int min=mang[0];
        for(int i=0; i<n; i++){
            if (mang[i]%3 ==0 ){
                tong=tong+mang[i];
                diem++;
            }
        }
        System.out.println();
        System.out.println("tong phan tu chia het cho 3: "+tong);
        TbCong=tong/diem;
        System.out.println("trung binh cong la :"+TbCong);
    }
    
}
