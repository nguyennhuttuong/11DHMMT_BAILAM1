/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad.pkg1.bai.pkg3;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Nhựt Tường
 */
public class Lad1Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Canh,TheTichlapPhuong ;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập độ dài các cạnh ");
        Canh =scanner.nextDouble();
        TheTichlapPhuong=(Canh*Canh*Canh); //V=a^3 thể tích khối lập phương
        System.out.println("Thể Tích Khối Lập Phương Là "+TheTichlapPhuong);
    }
    
}
