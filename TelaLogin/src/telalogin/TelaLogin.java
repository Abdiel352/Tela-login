/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telalogin;

/**
 *
 * @author Aluno
 */
import javax.swing.*;
public class TelaLogin {
    JPanel mainPanel;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null); 
        frame.setVisible(true);
        
      
        
        Logo logoPanel = new Logo();
        Login loginPanel = new Login();
        
        logoPanel.setBounds(0,100,300,300);
        loginPanel.setBounds(300,150,120,100);
        
        frame.getContentPane().add(logoPanel);
        frame.getContentPane().add(loginPanel);
    }
}
    
