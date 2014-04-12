import java.applet.*;
import java.awt.*;
import java.awt.event.*;
// Compilation
// javac appletClic.java
public class appletClic extends Applet implements MouseListener {
int nbClick = 0;
int x=20;
int y=20;
public void init() {
	super.init();
	addMouseListener(this);
}

public void mouseClicked(MouseEvent e) {
	nbClick++;
	x=e.getX();
	y=e.getY();
	repaint();
}

public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
public void mousePressed(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}

public void paint(Graphics g) {
	super.paint(g);
	g.drawString("Nombre de clics : " + nbClick, x, y);
}

}
