package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener  {

    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textSIN, textPassport;
    JRadioButton r1,r2, e1,e2;
    JButton next;
    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");
        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel l1 = new JLabel("Page 2:-");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String[] religion = {"--CHOOSE--","Christian","Muslim","Hindu","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category: ");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String[] category = {"--CHOOSE--","Indigenous","East Asian","Latin American","South Asian","Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350,170,320,30);
        comboBox2.setBackground(new Color(252,208,76));
        add(comboBox2);

        JLabel l5 = new JLabel("Income: ");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String [] income = {"--CHOOSE--","<20,000" ,"<30,000", "<=50,000(Canadian Average)", "Above 50,000" };
        comboBox3 = new JComboBox(income);
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational: ");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String[] educational = {"--CHOOSE--","Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350,270,320,30);
        comboBox4.setBackground(new Color(252,208,76));
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation: ");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100,340,150,30);
        add(l7);

        String[] occupation = {"--CHOOSE--","Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350,340,320,30);
        comboBox5.setBackground(new Color(252,208,76));
        add(comboBox5);

        JLabel l8 = new JLabel("SIN Number: ");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100,390,320,30);
        add(l8);

        textSIN = new JTextField();
        textSIN.setFont(new Font("Raleway", Font.BOLD, 18));
        textSIN.setBounds(350,390,320,30);
        add(textSIN);

        JLabel l9 = new JLabel("Passport Number: ");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100,440,180,30);
        add(l9);

        textPassport = new JTextField();
        textPassport.setFont(new Font("Raleway", Font.BOLD, 18));
        textPassport.setBounds(350,440,320,30);
        add(textPassport);

        JLabel l10 = new JLabel("Senior Citizen: ");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100,490,180,30);
        add(l10);

        r1 =new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(350,490,100,30);
        r1.setBackground(new Color(252,208,76));
        add(r1);
        r2 =new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(460,490,100,30);
        r2.setBackground(new Color(252,208,76));
        add(r2);

        JLabel l11 = new JLabel("Existing Account: ");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100,540,180,30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBounds(350,540,100,30);
        e1.setBackground(new Color(252,208,76));
        add(e1);
        e2 = new JRadioButton("No");
        e2.setBounds(460,540,100,30);
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBackground(new Color(252,208,76));
        add(e2);

        JLabel l12 = new JLabel("Form No: ");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(760,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String sin = textSIN.getText();
        String passport = textPassport.getText();

        String scitizen = " ";
        if (r1.isSelected()){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }
        String eAccount = " ";
        if (e1.isSelected()){
            eAccount = "Yes";
        } else if (e2.isSelected()) {
            eAccount = "No";
        }

        try {
            if (textSIN.getText().equals("")|| textPassport.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Con c = new Con();
                String q = "insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"', '"+inc+"', '"+edu+"', '"+occ+"', '"+sin+"', '"+passport+"', '"+scitizen+"', '"+eAccount+"')";
                c.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
       new Signup2(" ");
    }
}

