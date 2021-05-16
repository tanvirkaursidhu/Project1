//Your first Java applet
//An applet to print Hello World 

import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorldApplet extends Applet{
          public void paint(Graphics g){
		    g.drawString("Hello World!", 150, 150);
			}
}