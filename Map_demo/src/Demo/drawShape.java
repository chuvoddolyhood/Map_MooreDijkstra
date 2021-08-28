/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sun.applet.Main;

/**
 *
 * @author Tran Nhan Nghia
 */
public class drawShape extends JPanel{
//    public void paint(Graphics g){
//        g.drawOval(200, 200, 100, 100);
//    }
    
    public static void main(String[] args){
//        JFrame frame = new JFrame();
//        frame.setSize(600,600);
//        
//        drawShape circle = new drawShape();
//        frame.add(circle);
//        
//        frame.setVisible(true);
        



        try {
            BufferedImage phone = ImageIO.read(Main.class.getResource("F:\\Programming\\App\\Map_MooreDijkstra\\photo\\map1.png"));
            Graphics2D g2d = phone.createGraphics();
            g2d.setColor(Color.RED);
            g2d.fillOval(phone.getWidth() - 17, 0, 16, 16);
            g2d.dispose();

            JLabel label = new JLabel("Phone");
            label.setIcon(new ImageIcon(phone));

            JOptionPane.showMessageDialog(null, label);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    
    
}


//public static class ExampleLabel extends JLabel {
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        Graphics2D g2d = (Graphics2D) g.create();
//        g2d.setColor(Color.RED);
//        g2d.fillOval(getWidth() - 17, 0, 16, 16);
//        g2d.dispose();
//    }
//
//}
