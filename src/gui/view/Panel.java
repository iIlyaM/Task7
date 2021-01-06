package gui.view;

import gui.listener.CalcSubSequenceSumButtonListener;
import gui.listener.ClearFieldButtonListener;
import gui.listener.LoadFileButtonListener;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private final JButton clearFieldButton = new JButton("Clear");
    private final JButton loadArrayButton = new JButton("Select file");
    private final JButton startCalcButton = new JButton();
    private final JTextField arrayField = new JTextField();
    private final JTextField resultField = new JTextField();
    private final JLabel arrayInputPointer = new JLabel("Enter your array in field below");
    private final JLabel resultPointer = new JLabel("Result");

    Panel() {
        this.setBackground(new Color(101, 163, 222));

        addClearFieldButton();
        addLoadArrayButton();
        addStartCalcButton();
        addArrayInoutPointer();
        addResultPointer();
        addArrayField();
        addResultField();

        this.setLayout(null);
    }

    private void addClearFieldButton() {
        add(clearFieldButton);
        clearFieldButton.setBounds(10, 100, 90, 30);
        clearFieldButton.addActionListener(new ClearFieldButtonListener(arrayField, resultField));
        clearFieldButton.setBackground(new Color(175, 246, 168));
    }

    private void addLoadArrayButton() {
        add(loadArrayButton);
        loadArrayButton.setBounds(120, 100, 120, 30);
        loadArrayButton.addActionListener(new LoadFileButtonListener(arrayField));
        loadArrayButton.setBackground(new Color(167, 238, 159));
    }

    private void addStartCalcButton() {
        add(startCalcButton);
        startCalcButton.setBounds(380, 50, 40, 35);
        startCalcButton.setBackground(new Color(6, 29, 88));
        ImageIcon pointer = new ImageIcon("src/resources/images/1f449-333x333.png");
        startCalcButton.setIcon(pointer);
        startCalcButton.addActionListener(new CalcSubSequenceSumButtonListener(arrayField, resultField));
    }

    private void addArrayInoutPointer() {
        add(arrayInputPointer);
        arrayInputPointer.setBounds(10, 20, 350, 30);
        arrayInputPointer.setFont(new Font("Arial", 2, 16));
    }

    private void addResultPointer() {
        add(resultPointer);
        resultPointer.setBounds(460, 20, 60, 30);
        resultPointer.setFont(new Font("Arial", 2, 16));
    }

    private void addArrayField() {
        add(arrayField);
        arrayField.setBounds(10, 50, 350, 35);
        arrayField.setFont(new Font("Common", Font.PLAIN, 20));
        setForeground(new Color(5, 22, 35));
        arrayField.setBackground(new Color(166, 237, 245));
    }

    private void addResultField() {
        add(resultField);
        resultField.setBounds(460, 50, 60, 35);
        resultField.setBackground(new Color(166, 237, 245));
        setForeground(new Color(5, 22, 35));
        resultField.setFont(new Font("Common", Font.PLAIN, 20));
    }
}
