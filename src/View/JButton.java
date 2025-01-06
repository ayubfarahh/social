package View;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class JButton extends JLabel {
    private Shape shape;
    private int radius;

    public JButton(String text, int radius, int textSize) {
        super(text,textSize, Temps.white, Font.PLAIN);
        this.radius = radius;
        setFont(new Font("MV Boli", Font.PLAIN,20));
        setForeground(Temps.white);
        setOpaque(false);
        setHorizontalAlignment(CENTER);
        setCursor(new Cursor(Cursor.HAND_CURSOR));

    }
    // corners
    protected void paintComponent(Graphics g) {
        g.setColor(Temps.blue);
        g.fillRoundRect(0,0, getWidth()-1,getHeight()-1,radius,radius);
        super.paintComponent(g);
    }

    // border

    protected void paintBorder(Graphics g) {
        g.setColor(Temps.white);
        g.drawRoundRect(0,0,getWidth()-1,getHeight()-1,radius,radius);
    }

    public boolean contains (int x, int y) {
        if(shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0,0, getWidth()-1, getHeight()-1,45,45);
        }
        return shape.contains(x,y);
    }

}
