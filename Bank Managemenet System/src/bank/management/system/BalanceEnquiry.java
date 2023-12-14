package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    // Variable to store the PIN of the user
    String pin;

    // GUI components
    JLabel label2;
    JButton b1;

    // Constructor that takes PIN as a parameter
    BalanceEnquiry(String pin){
        this.pin = pin;

        // Creating and setting up the background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        // Label to display balance information
        JLabel label1 = new JLabel("Your current Balance is $ ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(430,220,400,35);
        l3.add(label1);

        // Label to dynamically display the balance
        label2 = new JLabel();
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setForeground(Color.WHITE);
        label2.setBounds(630,220,400,35);
        l3.add(label2);

        // Button for navigating back to the main menu
        b1 = new JButton("Back");
        b1.setBounds(700,406,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        // Retrieving and calculating the balance from the database
        int balance = 0;
        try {
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        // Setting the calculated balance to the label
        label2.setText(""+ balance);

        // Setting up the JFrame properties
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    // ActionPerformed method to handle button click events
    @Override
    public void actionPerformed(ActionEvent E) {
        // Closing the current window and opening the main menu window
        setVisible(false);
        new main_Class(pin);
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Creating an instance of BalanceEnquiry (for testing purposes)
        new BalanceEnquiry("");
    }
}

