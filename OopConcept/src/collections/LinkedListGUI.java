package collections;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

public class LinkedListGUI extends JFrame implements ActionListener {
    private LinkedList<Object> linkedList = new LinkedList<>();
    private JTextArea displayArea;
    private JTextField inputField;
    private JComboBox<String> operationBox;
    private JButton executeButton;

    public LinkedListGUI() {
        setTitle("LinkedList Operations");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new BorderLayout());
        inputField = new JTextField();
        inputPanel.add(inputField, BorderLayout.CENTER);

        String[] operations = {
            "Add element at last",
            "Add element at first",
            "Add element at given index",
            "Update the element at given index",
            "Delete the first element",
            "Delete the last element",
            "Delete the given element",
            "Delete the element at given index",
            "Display the elements",
            "Exit"
        };
        operationBox = new JComboBox<>(operations);
        inputPanel.add(operationBox, BorderLayout.NORTH);

        executeButton = new JButton("Execute");
        executeButton.addActionListener(this);
        inputPanel.add(executeButton, BorderLayout.SOUTH);

        add(inputPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        int index;
        String input = inputField.getText();
        String selectedOperation = (String) operationBox.getSelectedItem();

        try {
            switch (selectedOperation) {
                case "Add element at last":
                    linkedList.add(input);
                    displayMessage("Added '" + input + "' at the last.");
                    break;
                case "Add element at first":
                    linkedList.addFirst(input);
                    displayMessage("Added '" + input + "' at the first.");
                    break;
                case "Add element at given index":
                    index = Integer.parseInt(inputField.getText());
                    input = JOptionPane.showInputDialog("Enter the element to add:");
                    if (index >= 0 && index <= linkedList.size()) {
                        linkedList.add(index, input);
                        displayMessage("Added '" + input + "' at index " + index + ".");
                    } else {
                        displayMessage("Index out of bounds.");
                    }
                    break;
                case "Update the element at given index":
                    index = Integer.parseInt(inputField.getText());
                    input = JOptionPane.showInputDialog("Enter the new element:");
                    if (index >= 0 && index < linkedList.size()) {
                        linkedList.set(index, input);
                        displayMessage("Updated index " + index + " to '" + input + "'.");
                    } else {
                        displayMessage("Index out of bounds.");
                    }
                    break;
                case "Delete the first element":
                    if (!linkedList.isEmpty()) {
                        Object removedElement = linkedList.removeFirst();
                        displayMessage("Deleted the first element: " + removedElement);
                    } else {
                        displayMessage("The list is empty.");
                    }
                    break;
                case "Delete the last element":
                    if (!linkedList.isEmpty()) {
                        Object removedElement = linkedList.removeLast();
                        displayMessage("Deleted the last element: " + removedElement);
                    } else {
                        displayMessage("The list is empty.");
                    }
                    break;
                case "Delete the given element":
                    if (linkedList.remove(input)) {
                        displayMessage("Deleted element: " + input);
                    } else {
                        displayMessage("Element not found.");
                    }
                    break;
                case "Delete the element at given index":
                    index = Integer.parseInt(inputField.getText());
                    if (index >= 0 && index < linkedList.size()) {
                        Object removedElement = linkedList.remove(index);
                        displayMessage("Deleted element at index " + index + ": " + removedElement);
                    } else {
                        displayMessage("Index out of bounds.");
                    }
                    break;
                case "Display the elements":
                    displayMessage("Elements in the LinkedList: " + linkedList);
                    break;
                case "Exit":
                    System.exit(0);
                    break;
                default:
                    displayMessage("Invalid operation.");
                    break;
            }
        } catch (NumberFormatException ex) {
            displayMessage("Invalid input: Please enter a valid number.");
        }

        inputField.setText("");
    }

    private void displayMessage(String message) {
        displayArea.append(message + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LinkedListGUI frame = new LinkedListGUI();
            frame.setVisible(true);
        });
    }
}
