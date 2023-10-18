package utility;


import edusera.ui.RouterJPanel;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ingale.r
 */
public class Utility {
    
    public static void switchPanel(JPanel switchTo, JPanel switchWhere){
        switchWhere.add("switched",switchTo);
        CardLayout layout = (CardLayout) switchWhere.getLayout();
        layout.next(switchWhere);
    }
    
    public static void imageResize(JLabel lbl, String imgPath){
        ImageIcon ii = new ImageIcon(imgPath);
        Image image = ii.getImage().getScaledInstance(225, 225, Image.SCALE_SMOOTH);
        lbl.setIcon(new ImageIcon(image));
    }
  
}
