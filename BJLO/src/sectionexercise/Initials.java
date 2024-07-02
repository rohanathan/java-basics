package sectionexercise;

import javax.swing.JOptionPane;

public class Initials {

    public static void main(String[] args) {
        String fName = JOptionPane.showInputDialog("Enter your Name: ");
        if (fName == null || fName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "First name input cancelled or empty. Exiting.");
            return;
        }

        String sName = JOptionPane.showInputDialog("Enter your girl's Name: ");
        if (sName == null || sName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Second name input cancelled or empty. Exiting.");
            return;
        }

        String initials = fName.substring(0, 1) + " & " + sName.substring(0, 1);
        JOptionPane.showMessageDialog(null, "Initials : " + initials);
    }
}

