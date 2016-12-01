
package painta;

import java.awt.Graphics;

public class Linia implements Figura{
private int x=-1;
private int y=-1;

private int x2=1;
private int y2=1;

     public Linia(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 =x2;
        this.y2 =y2;
    }
     
     public void paint(Graphics g){
    
        g.drawLine(x, y, x2, y2);
    }
}
