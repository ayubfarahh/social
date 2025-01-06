package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.geom.RoundRectangle2D;

public class JTextField extends javax.swing.JTextField {
    private Shape shape;
    private String hint;

    public JTextField(String hint) {
        super();
        this.hint = hint;
        setFont(new Font("MV Boli", Font.PLAIN,20));
        setOpaque(false);
        setText(hint);
        setForeground(Temps.textFieldHint);
        setBorder(BorderFactory.createEmptyBorder(TOP,20,BOTTOM, 20));

        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (getText().equals(hint)){
                    setText("");
                    setForeground(Temps.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (getText().trim().isEmpty()){
                    setText(hint);
                    setForeground(Temps.textFieldHint);
                }
            }
        });
        }

        // corners
    protected void paintComponent(Graphics g) {
        g.setColor(Temps.white);
        g.fillRoundRect(0,0, getWidth()-1,getHeight()-1,45,45);
        super.paintComponent(g);
    }

    // border

    protected void paintBorder(Graphics g) {
        g.setColor(Temps.white);
        g.drawRoundRect(0,0,getWidth()-1,getHeight()-1,45,45);
    }

    public boolean contains (int x, int y) {
        if(shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0,0, getWidth()-1, getHeight()-1,45,45);
        }
        return shape.contains(x,y);
    }



}

