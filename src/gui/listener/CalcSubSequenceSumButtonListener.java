package gui.listener;

import common.LargestSubsequenceSum;
import util.ArrayUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcSubSequenceSumButtonListener implements ActionListener {
    private JTextField arrayField;
    private JTextField resultField;

    public CalcSubSequenceSumButtonListener(JTextField arrayField, JTextField resultField) {
        this.arrayField = arrayField;
        this.resultField = resultField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sourceArray = arrayField.getText();
        int[] arr = ArrayUtils.toIntArray(sourceArray);
        int largestSubSequence = LargestSubsequenceSum.calcMaxSequenceSum(arr);
        resultField.setText(Integer.toString(largestSubSequence));
    }
}
