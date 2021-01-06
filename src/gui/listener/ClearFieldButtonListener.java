package gui.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearFieldButtonListener implements ActionListener {
    private JTextField arrayField;
    private JTextField resultField;

    public ClearFieldButtonListener(JTextField arrayField, JTextField resultField) {
        this.arrayField = arrayField;
        this.resultField = resultField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        arrayField.setText(null);
        resultField.setText(null);
    }
}
