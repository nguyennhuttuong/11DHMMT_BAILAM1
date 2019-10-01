/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad.pkg1.bai.pkg2;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Nhựt Tường
 */
public class Lad1Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double chieuDai,chieuRong,dienTich,chuVi,canhnho ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Chiều Dài ");
        chieuDai =scanner.nextDouble();
        System.out.println("Nhập Chiều Rộng ");
        chieuRong =scanner.nextDouble();
        canhnho = (chieuDai>= chieuRong) ? chieuRong:chieuDai;
        dienTich=chieuDai*chieuRong;
        chuVi=(chieuDai+chieuRong)*2;
        System.out.println("Diện Tích Là "+dienTich);
        System.out.println("Chu Vi Là "+chuVi);
        System.out.println("cạnh nhỏ là "+canhnho);
    }
    
}
