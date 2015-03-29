package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {

    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {

        boolean loop = true;

        do {
            try {
                String fullName = JOptionPane.showInputDialog("Enter full name:");
                String lastName = nameService.extractLastName(fullName);
                String msg = "Your last name is: " + lastName;
                JOptionPane.showMessageDialog(null, msg);
                loop = false;
            } catch (IlegalNameException e) {
                //JOptionPane.showMessageDialog(null, "Illegal name (use Format: first last):");

            } catch (IllegalArgumentException e){
                
            }
        } while (loop);

    }

}
