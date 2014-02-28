package GoldenCage.Presentation.Administrateur;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;
public class ImagePanel extends JPanel {
 
        public void paintComponent(Graphics g){
                try {
                        Image img = ImageIO.read(new File("C:\\Users\\minoo\\Desktop\\triste.png"));
                        g.drawImage(img, 0, 0, this);
                        //Pour une image de fond
                        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                
        }               
}
