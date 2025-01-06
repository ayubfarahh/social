package View;

import javax.swing.*;
import java.awt.*;

public class Hello {
    public Hello() {
        JFrame frame = new JFrame(); // Use the custom View.JFrame

        // Create the main panel
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(null);
        panel.setBorder(BorderFactory.createEmptyBorder(45, 83, 75, 84));
        panel.add(new JLabel("Hello there!", 40, Temps.blue, Font.BOLD), BorderLayout.NORTH);

        // Create the center panel with form fields
        JPanel center = new JPanel(new GridLayout(6, 1, 10, 10));
        center.setBackground(null);
        center.setBorder(BorderFactory.createEmptyBorder(22, 231, 17, 231));
        JTextField firstname = new JTextField("First Name");
        center.add(firstname);
        JTextField lastName = new JTextField("Last Name");
        center.add(lastName);
        JTextField email = new JTextField("Email");
        center.add(email);
        JTextField password = new JTextField("Password");
        center.add(password);
        JTextField confirmPassword = new JTextField("Confirm Password");
        center.add(confirmPassword);
        JButton createAcc = new JButton("Create Account", 45, 20);
        center.add(createAcc);

        panel.add(center, BorderLayout.CENTER);

        // Add login label to the panel
        JLabel login = new JLabel("Already have an account? Login", 20, Temps.black, Font.BOLD);
        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(login, BorderLayout.SOUTH);

        // Add the panel to the frame
        frame.add(panel);

        // Finalize the frame setup (no need to set size or default close operation here)
        frame.setVisible(true);
    }

}
