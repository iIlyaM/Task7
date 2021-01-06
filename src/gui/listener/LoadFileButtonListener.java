package gui.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class LoadFileButtonListener implements ActionListener {
    private JTextField arrayField;

    public LoadFileButtonListener(JTextField arrayField) {
        this.arrayField = arrayField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder sr = new StringBuilder();
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String filename = file.getAbsolutePath();
            try {
                String line;
                FileReader reader = new FileReader(filename);
                BufferedReader br = new BufferedReader(reader);
                line = br.readLine();
                sr.append(line);
                arrayField.setText(line);
                br.close();
            } catch (IOException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
        }
    }
}
