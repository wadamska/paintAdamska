package painta;

import java.awt.Graphics;

public class Kolko implements Figura {
private int x=-1;
private int y=-1;

    public Kolko(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void paint(Graphics g){
    
        g.drawOval(x-25, y-25, 50, 50);
    }
}
