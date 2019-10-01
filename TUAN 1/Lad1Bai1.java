/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad1.bai1;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Nhựt Tường mssv: 1731102088
 */
public class Lad1Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String hoTen;
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Nhập Họ Và Tên:");
         hoTen = scanner.nextLine();
        
        System.out.println("Nhập Điểm TB ");
        double diemTB=scanner.nextDouble();
        System.out.println("Tên đã nhập là "+hoTen+" Và Điểm Trung Bình là "+diemTB);
    }
    
}
