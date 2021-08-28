/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javafx.scene.shape.Circle;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Tran Nhan Nghia
 */
public class addImage {
     public static void main(String[] args) {
        new addImage();
    }

    public addImage() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                JFrame frame = new JFrame("Testing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new TestPane());
                frame.pack();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class TestPane extends JPanel {

        private BufferedImage floorPlan;

        private Rectangle congA = new Rectangle(1760, 770, 20, 20);
        private Rectangle congB = new Rectangle(1560, 770, 20, 20);

        public TestPane() {
            try {
                floorPlan = ImageIO.read(new File("F:\\Programming\\App\\Map_MooreDijkstra\\photo\\map1.png"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public Dimension getPreferredSize() {
            return floorPlan == null ? new Dimension(200, 200) : new Dimension(floorPlan.getWidth(), floorPlan.getHeight());
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawRec_1(g);
            drawRec_2(g);
        }
        
        public void drawRec_1(Graphics g){
            Graphics2D g2d = (Graphics2D) g.create();
            if (floorPlan != null) {

                int x = (getWidth() - floorPlan.getWidth()) / 2;
                int y = (getHeight() - floorPlan.getHeight()) / 2;
                g2d.drawImage(floorPlan, x, y, this);

                g2d.setColor(Color.RED);
                g2d.translate(x, y);
                g2d.draw(congA);
            }

            g2d.dispose();
        }
        
        public void drawRec_2(Graphics g){
            Graphics2D g2d = (Graphics2D) g.create();
            if (floorPlan != null) {

                int x = (getWidth() - floorPlan.getWidth()) / 2;
                int y = (getHeight() - floorPlan.getHeight()) / 2;
                g2d.drawImage(floorPlan, x, y, this);

                g2d.setColor(Color.GREEN);
                g2d.translate(x, y);
                g2d.draw(congB);
            }

            g2d.dispose();
        }
        
    }
}
