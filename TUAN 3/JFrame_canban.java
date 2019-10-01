/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad1bai1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class JFrame_canban extends JFrame {
    public JFrame_canban(){
      
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(" bai can ban");
    }
    public static void main(String[] args) {
       JFrame_canban cb= new JFrame_canban();
        
        cb.setSize(400, 300);
        cb.setLocationRelativeTo(null);
   
        cb.setVisible(true); 
       JPanel pnFlow=new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.ORANGE);
        JButton btn1 = new JButton("JFrame can ban 1 ");
        JButton btn2 = new JButton("bai 1 ");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        cb.add(pnFlow);
        btn1.setForeground(Color.MAGENTA);
        Font font;
        font = new Font("Arial",Font.BOLD,25);
       btn2.setForeground(Color.red);
       font = new Font("Arial", Font.ITALIC, 10);
    }
    
}
