/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Tran Nhan Nghia
 */
public class ImageIconGUITest extends JPanel{
    private static final String UP_IMG_PATH = "https://upload.wikimedia.org/wikipedia/commons/7/7d/Green_circle_icon.jpg";
    private static final String DN_IMG_PATH = "https://upload.wikimedia.org/wikipedia/commons/b/bc/Red_circle_icon.jpg";
    private static final int GUI_W = 1000;
    private static final int GUI_H = 800;
    private Point upPt = new Point(300, 100);
    private Point dnPt = new Point(700, 650);
    private BufferedImage upImg, dnImg;

    public ImageIconGUITest() {
        MyMouse myMouse = new MyMouse();
        addMouseListener(myMouse);
        addMouseMotionListener(myMouse);
        setBackground(Color.WHITE);
        try {
            URL url = new URL(UP_IMG_PATH);
            upImg = ImageIO.read(url);

            url = new URL(DN_IMG_PATH);
            dnImg = ImageIO.read(url);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(GUI_W, GUI_H);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (upImg != null && dnImg != null) {
            g.drawImage(upImg, upPt.x, upPt.y, this);
            g.drawImage(dnImg, dnPt.x, dnPt.y, this);

            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setStroke(new BasicStroke(5f));

            int x1 = upPt.x + upImg.getWidth() / 2;
            int y1 = upPt.y + upImg.getHeight() / 2;
            int x2 = dnPt.x + dnImg.getWidth() / 2;
            int y2 = dnPt.y + dnImg.getHeight() / 2;
            g.drawLine(x1, y1, x2, y2);
        }       
    }

    private class MyMouse extends MouseAdapter {
        private Point p1 = null;

        @Override
        public void mousePressed(MouseEvent e) {
            if (e.getX() < upPt.x || e.getX() > upPt.x + upImg.getWidth()) {
                return;
            }
            if (e.getY() < upPt.y || e.getY() > upPt.y + upImg.getHeight()) {
                return;
            }
            p1 = new Point(e.getX(), e.getY());
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (p1 != null) {
                moveSprite(e);
                p1 = null;
            }
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if (p1 != null) {
                moveSprite(e);
            }
        }

        private void moveSprite(MouseEvent e) {
            Point p2 = new Point(e.getX(), e.getY());
            int x = upPt.x + p2.x - p1.x;
            int y = upPt.y + p2.y - p1.y;
            upPt = new Point(x, y);

            p1 = p2;
            repaint();
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> {
            ImageIconGUITest foo01 = new ImageIconGUITest();

            JFrame frame = new JFrame("Draw Sprites");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(foo01);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
