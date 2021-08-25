/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Tran Nhan Nghia
 */
public class Photo2Size {

    public Photo2Size() {
    }

    
    public static void main(String[] args) throws IOException{

        BufferedImage bimg = ImageIO.read(new File("F:\\Programming\\App\\Map_MooreDijkstra\\photo\\map1.png"));
        int width          = bimg.getWidth();
        int height         = bimg.getHeight();

        System.out.println(width +" "+ height);
    }
}
