package painta;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
public class Panel extends JPanel implements MouseListener, MouseMotionListener
{
    ArrayList<Figura> lista;
    
private int x=-1;
private int y=-1;

private int x2=1;
private int y2=1;

Linia linia;

 public Panel()
 {
     lista = new ArrayList<Figura>();
 addMouseListener(this);
 addMouseMotionListener(this);
 }
 public void mouseExited(MouseEvent e){}
 public void mouseEntered(MouseEvent e){
// JOptionPane.showMessageDialog(null,
// e.getPoint().toString());
// System.out.println("mouse Entered");
 }
 public void mousePressed(MouseEvent e){ }
 public void mouseReleased(MouseEvent e){ }

 public void mouseClicked(MouseEvent e)
 {
    x=e.getX();
    y=e.getY();
    
    if(e.getClickCount() == 2)
    {
        linia  = new Linia(e.getX(), e.getY(),x, y);
        lista.add(linia);
    }
     
    //x2=e.getX();
    //y2=e.getY();
     
   // lista.add(new Kolko(e.getX(),e.getY())); 
   // lista.add(new Linia(e.getX(), e.getY(),x2, y2));
    //repaint();
// JOptionPane.showMessageDialog(null,
// e.getPoint().toString());
 }
public void mouseDragged(MouseEvent e) {}
public void mouseMoved(MouseEvent e) {       
       // x=e.getX();
       // y=e.getY();
        lista.remove(linia);
        linia  = new Linia(e.getX(), e.getY(),x, y);
        lista.add(linia);
        
    //repaint();
        repaint(); 
    }
 public void paint(Graphics g)
 {
 //g.setColor(Color.RED);
 //if(x!=-1 && y!=-1)
   g.clearRect(0, 0, getSize().width, getSize().height);
 //g.drawOval(x-25, y-25, 50, 50);
 //g.drawLine(x, y, x2, y2);
 
 for (Figura figura : lista)
     figura.paint(g);
 }



 //public void paint(Graphics g){}
 
}

