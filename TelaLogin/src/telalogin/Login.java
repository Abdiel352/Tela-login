/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telalogin;

/**
 *
 * @author Aluno
 */
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.*;


public class Login extends JPanel {
    
    private JTextField nome;
    private JPasswordField senha;
    private JButton ok;
    public Login(){
        setLayout(new FlowLayout());
        
        nome = new JTextField(10);
        add(nome);
        
        senha = new JPasswordField("                    ");
        add(senha);
        
        ok = new JButton();
        ok.setText("Ok");
        add(ok);
        
        ButtonHandler handler = new ButtonHandler();
        ok.addActionListener(handler);
    }
    
    private class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(Login.this, String.format("Olá "+ nome.getText()+" a sua senha é " +  new String(senha.getPassword()), event.getActionCommand()));
        }
    }
}
