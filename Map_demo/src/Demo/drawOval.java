/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author Tran Nhan Nghia
 */
public class drawOval extends JApplet{
    public void paint ( Graphics gr )
  { 
//    int width  = getWidth();
//    int height = getHeight();
    int width  = 1920;
    int height = 1080;
    int radius;
    
    if ( width<height )
      radius = 2*width/5;
    else
      radius = 2*height/5;
    
    gr.setColor( Color.white );
    gr.fillRect( 0, 0, width, height );
    gr.setColor( Color.black );
    
    gr.drawOval( 0, 0, radius*2, radius*2 );
//    gr.drawOval( (width/2 - radius), (height/2 - radius), radius*2, radius*2 );
   }
}
