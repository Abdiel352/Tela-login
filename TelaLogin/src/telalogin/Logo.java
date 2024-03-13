/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telalogin;

/**
 *
 * @author Aluno
 */
import java.awt.*;
import javax.swing.*;
public class Logo extends JPanel {
    
    private JLabel imgLabel;
    
    public Logo(){
        setLayout(new FlowLayout());
        
        Icon logo = new ImageIcon(getClass().getResource("ifmtlogo.png"));
        imgLabel = new JLabel();
        imgLabel.setIcon(logo);
        imgLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        add(imgLabel);
    }
    
}
