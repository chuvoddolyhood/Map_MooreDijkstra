/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Tran Nhan Nghia
 */
public class canvasDemo {
    public canvasDemo() {
        Frame f = new Frame("Ví dụ Canvas trong Java AWT");
        f.add(new MyCanvas());
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        
//        JPanel jPanel1 = new JPanel();
//        jPanel1.add(new JLabel(new ImageIcon("F:\\Programming\\App\\Map_MooreDijkstra\\photo\\map1.png")));
//        jPanel1.setVisible(false);
    }
 
    public static void main(String args[]) {
        new canvasDemo();
    }
}
 
class MyCanvas extends Canvas {
    public MyCanvas() {
        setBackground(Color.GRAY);
        
        setSize(300, 300);
    }
     
    @Override
    public void paint(Graphics g) {
        // vẽ hình tròn
        g.setColor(Color.red);
        g.fillOval(100, 75, 100, 100);
        // vẽ hình vuông
        g.setColor(Color.green);
        g.fillRect(150, 150, 100, 100);
    }
}
