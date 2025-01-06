package View;

public class JFrame extends javax.swing.JFrame{
    public JFrame(){
        super("Legbook");
        getContentPane().setBackground(Temps.white);
        setSize(900,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
