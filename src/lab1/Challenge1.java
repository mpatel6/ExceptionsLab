package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using Java
 * Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong with
 * this program and use exception handling where appropriate to prevent the
 * program from crashing. In addition you must display a friendly error message
 * in a JOptionPane and ask the user to try again. (Yes, this violates the
 * Single Responsibility Principle, but for this lab, we'll overlook that.)
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {

    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) throws Exception {
        Challenge1 app = new Challenge1();
        boolean loop = true;

        while (loop) {
            try {
                String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
                String lastName = app.extractLastName(fullName);
                String msg = "Your last name is: " + lastName;
                JOptionPane.showMessageDialog(null, msg);
                loop = false;
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, "Illegal name (use Format: first last):");
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Illegal name (use Format: first last):");
            }
        }

    }

    public String extractLastName(String fullName) throws Exception {
        String[] nameParts = fullName.split(" ");

        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return nameParts[nameParts.length - 1];
    }

}
