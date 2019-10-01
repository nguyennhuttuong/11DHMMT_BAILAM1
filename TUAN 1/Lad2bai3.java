/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad2bai3;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Nhựt Tường
 */
public class Lad2bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a ,tienDien;
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Nhập số điện sử dụng trong tháng :");
        a = scanner.nextInt();
        if (a <= 50) // vì số điện  chưa vượt trên hạng mức nên <= 50
        {
            tienDien = (a*1000) ;
            System.out.println("Tiền điện phải đóng là :"+tienDien +"đồng");
            
        } 
        else {
            tienDien = (50*1000+(a-50)*1200); // vì số điện vượt trên 50 sẽ tính 1200
            System.out.println("Tiền điện phải đóng là :"+tienDien +"đồng");
        }
    }
    
}
