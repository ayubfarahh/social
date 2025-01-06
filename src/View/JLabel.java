package View;

import java.awt.*;

public class JLabel extends javax.swing.JLabel{

    public JLabel(String text, int textSize, Color color, int style){
        setFont(new Font("MV Boli", Font.PLAIN,20));
        setText(text);
        setForeground(color);
    }
}
