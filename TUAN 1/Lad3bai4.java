/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad3bai4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.Comparator;

/**
 *
 * @author admin
 */
/*class sinhvien 
    {
    public String hoten;
    public float diem;
    }*/
public class Lad3bai4 {
    

    /**
     * @param args the command line arguments
     */
 //   String hoten;
   // float diem;
    //public void nhap()
   // {
 //   Scanner scanner =new Scanner(System.in);  
 //   System.out.println(" Nhap ho ten sinh vien :");
 //   hoten = scanner.nextLine();
 //   System.out.println("nhap diem :");
 //   diem = scanner.nextFloat();
 //   }
    //public String xeploai(float diem){
  //  if (diem >9 && diem <=10){ return "Xuat sac"; }
    //if (diem >=7.5 && diem <= 9){return "Gioi"; }
   // if (diem >6.5 && diem < 7.5) { return "Kha";}
    //if (diem >=5 && diem <6.5) { return "trung binh";}
    //if (diem >= 0 && diem < 5) { return "yeu";}
   // return " nhap sai"; 
    
    /*Collection.sort(mang, new Comparator<sinhvien>()
    {
        
        public int sxhocluc(sinhvien sv1,sinhvien sv2 )
        {
            if (sv1.diem < sv2.diem)
            {
                return 1;
            }
            else {
                if (sv1.diem == sv2.diem)
                {
                    return 0;
                }
                else
                {return -1; }
                  }
        }
    }
        );*/
    public static void main(String[] args) {
        int n;
        String hoten;
        float diem;
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap so sinh vien :");
        n=scanner.nextInt();
        int []mang =new int[n];
        System.out.println(" Nhap ho ten sinh vien :");
        for(int i=0; i<n; i++)
        {
            System.out.println("Nhap ho ten sinh vien thu["+i+"] :");
            mang[i]=scanner.nextInt();
        }
        hoten = scanner.nextLine();
        //System.out.printf("nhap diem :");
        //diem = scanner.nextFloat();
        for(int i=0; i<n; i++)
        {
            System.out.println("Nhap diem sinh vien thu ["+i+"] :");
            mang[i]=scanner.nextInt();
            /*if (diem >9 && diem <=10){ return "Xuat sac"; }
    if (diem >=7.5 && diem <= 9){return "Gioi"; }
   if (diem >6.5 && diem < 7.5) { return "Kha";}
   if (diem >=5 && diem <6.5) { return "trung binh";}
    if (diem >= 0 && diem < 5) { return "yeu";}
   return " nhap sai"; */
        }
        //System.out.println(" Ho ten sv : "+ sinhvien.hoten, " diem :" +sinhvien.diem); //, "hoc luc : " +sinhvien.xeploai(sinhvien.diem ));
        System.out.print("cac phan tu mang duoc xep lai  " );
        for(int i=0; i<n; i++)
        
        {
            
            System.out.printf("ho ten" +mang[i]+" diem  ");
            
            
        }
        
        
    }
    
}
