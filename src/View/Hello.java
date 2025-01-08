package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
        JTextField firstName = new JTextField("First Name");
        center.add(firstName);
        JTextField lastName = new JTextField("Last Name");
        center.add(lastName);
        JTextField email = new JTextField("Email");
        center.add(email);
        JTextField password = new JTextField("Password");
        center.add(password);
        JTextField confirmPassword = new JTextField("Confirm Password");
        center.add(confirmPassword);
        JButton createAcc = new JButton("Create Account", 45, 20);


        createAcc.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clickd!");
                if (firstName.getText().isEmpty()) {
                    new Notification("First name cannot be empty", frame);
                    return;
                }
                if (lastName.getText().isEmpty()) {
                    new Notification("Last name cannot be empty", frame);
                    return;
                }
                if (email.getText().isEmpty()) {
                    new Notification("Email name cannot be empty", frame);
                    return;
                }
                if (password.getText().isEmpty()) {
                    new Notification("Password cannot be empty", frame);
                    return;
                }
                if (confirmPassword.getText().isEmpty()) {
                    new Notification("First name cannot be empty", frame);
                    return;
                }
                if (!password.getText().equals(confirmPassword.getText())) {
                    new Notification("Password doesn't match", frame);
                    return;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
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
    public static void main(String[] args) {
        new Hello();
    }

}
