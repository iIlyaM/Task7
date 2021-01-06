package gui.view;

import javax.swing.*;
import javax.swing.ImageIcon;

public class Frame extends JFrame {
    private Panel panel;

    public Frame() {
        panel = new Panel();

        this.setTitle("Task 7");
        this.setSize(650, 220);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setContentPane(panel);
        ImageIcon image = new ImageIcon("src/resources/images/pepe-min.png");
        this.setIconImage(image.getImage());
    }
}
