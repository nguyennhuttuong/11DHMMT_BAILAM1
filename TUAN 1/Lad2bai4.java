/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad2bai4;

import java.util.Scanner;

/**
 *Nguyễn Nhựt Tường
 */
public class Lad2bai4 {
    public static void bac1() {
    float a,b,x;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Giải phương trình bậc nhất có dạng ax + b = 0 ");
        System.out.print("Nhập giá trị a : ");
        a= scanner.nextFloat();
        System.out.print("Nhập giá trị b : ");
        b= scanner.nextFloat();
        
        if (a==0) {
            if (b==0) {
                System.out.println("Phương trình có vô số nghiệm !");
                
            } 
            else {
                System.out.println("Phương trình vô nghiệm !");
            }
            
        } 
        else {
            x=-b/a;
            System.out.println("Nghiệm của phương trình là :" +x);
        }
    }
    public static void bac2(){
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
public static void dien() {
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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int luaChon;
        System.out.println("Chọn Chức năng cần thiết hãy ấn các số sau : ");
        System.out.println("MENU \r\n 1.Giải phương trình bậc nhất \r\n 2.Giải phương trình bậc 2 \r\n 3.Tính tiền điện \r\n 4.Kết thúc");
        
        System.out.println("+-----------------+\r\n");
        Scanner scanner=new Scanner(System.in);
        luaChon = scanner.nextInt();
        switch(luaChon){
        case 1:bac1(); break;
        case 2:bac2(); break;
        case 3:dien(); break;
        case 4:break;
       
        }
    }
    
}
