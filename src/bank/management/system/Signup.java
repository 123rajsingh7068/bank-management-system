package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, m1, m2;
    JButton next,back;

    JTextField textName, textFname, textEmail, textAdd, textcity, textState, textPin;

    JDateChooser dateChooser;

    Random ran = new Random();

    long first4 = (ran.nextLong() % 9000L) + 1000L;

    String first = " " + Math.abs(first4);


    Signup() {
        super("PAGE-1 APPLICATION FORM");

        getContentPane().setBackground(new Color(18, 32, 47)); // Dark Navy Background

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ruppes.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); JLabel image = new JLabel(i3);
        image.setBounds(10, 10, 70, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(300, 35, 600, 40);
        add(label1);

        JLabel label2 = new JLabel("PAGE 1");
        label2.setForeground(new Color(200,200,200));
        label2.setBounds(535, 75, 100, 30);
        label2.setFont(new Font("AvantGarde", Font.BOLD, 22));
        add(label2);

        JLabel label3 = new JLabel("PERSONAL DETAILS");
        label3.setForeground(new Color(0, 123, 255)); // Highlight Blue
        label3.setBounds(460, 105, 250, 30);
        label3.setFont(new Font("AvantGarde", Font.BOLD, 22));
        add(label3);

        JLabel labelName = new JLabel("Name");
        labelName.setForeground(new Color(220,220,220));
        labelName.setBounds(100, 190, 100, 30);
        labelName.setFont(new Font("AvantGarde", Font.BOLD, 22));
        add(labelName);

        textName = new JTextField();
        textName.setBackground(new Color(240,240,240));
        textName.setForeground(Color.BLACK);
        textName.setBounds(200, 190, 275, 30);
        textName.setFont(new Font("AvantGarde", Font.BOLD, 14));
        add(textName);

        JLabel labelfName = new JLabel("Father's Name");
        labelfName.setForeground(new Color(220,220,220));
        labelfName.setFont(new Font("AvantGarde", Font.BOLD, 20));
        labelfName.setBounds(565, 190, 200, 30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setBackground(new Color(240,240,240));
        textFname.setForeground(Color.BLACK);
        textFname.setFont(new Font("AvantGarde", Font.BOLD, 14));
        textFname.setBounds(765, 190, 275, 30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth");
        DOB.setForeground(new Color(220,220,220));
        DOB.setFont(new Font("AvantGarde", Font.BOLD, 20));
        DOB.setBounds(565, 240, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setBackground(new Color(240,240,240));
        dateChooser.setBounds(765, 240, 275, 30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setForeground(new Color(220,220,220));
        labelG.setFont(new Font("AvantGarde", Font.BOLD, 20));
        labelG.setBounds(100, 240, 200, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setBackground(new Color(18, 32, 47));
        r1.setForeground(Color.WHITE);
        r1.setFont(new Font("AvantGarde", Font.BOLD, 14));
        r1.setBounds(200, 240, 70, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(18, 32, 47));
        r2.setForeground(Color.WHITE);
        r2.setFont(new Font("AvantGarde", Font.BOLD, 14));
        r2.setBounds(282, 240, 90, 30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setBackground(new Color(18, 32, 47));
        r3.setForeground(Color.WHITE);
        r3.setFont(new Font("AvantGarde", Font.BOLD, 14));
        r3.setBounds(382, 240, 90, 30);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelMs = new JLabel("Marital Status");
        labelMs.setForeground(new Color(220,220,220));
        labelMs.setFont(new Font("AvantGarde", Font.BOLD, 20));
        labelMs.setBounds(100, 290, 200, 30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBackground(new Color(18, 32, 47));
        m1.setForeground(Color.WHITE);
        m1.setFont(new Font("AvantGarde", Font.BOLD, 14));
        m1.setBounds(250, 290, 100, 30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(18, 32, 47));
        m2.setForeground(Color.WHITE);
        m2.setFont(new Font("AvantGarde", Font.BOLD, 14));
        m2.setBounds(375, 290, 100, 30);
        add(m2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);

        JLabel labelEmail = new JLabel("Email Address");
        labelEmail.setForeground(new Color(220,220,220));
        labelEmail.setFont(new Font("AvantGarde", Font.BOLD, 20));
        labelEmail.setBounds(565, 290, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setBackground(new Color(240,240,240));
        textEmail.setForeground(Color.BLACK);
        textEmail.setFont(new Font("AvantGarde", Font.BOLD, 14));
        textEmail.setBounds(765, 290, 275, 30);
        add(textEmail);

        JLabel labelAdd = new JLabel("Address");
        labelAdd.setForeground(new Color(220,220,220));
        labelAdd.setFont(new Font("AvantGarde", Font.BOLD, 20));
        labelAdd.setBounds(100, 340, 200, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setBackground(new Color(240,240,240));
        textAdd.setForeground(Color.BLACK);
        textAdd.setFont(new Font("AvantGarde", Font.BOLD, 14));
        textAdd.setBounds(200, 340, 275, 30);
        add(textAdd);

        JLabel labelCity = new JLabel("City");
        labelCity.setForeground(new Color(220,220,220));
        labelCity.setFont(new Font("AvantGarde", Font.BOLD, 20));
        labelCity.setBounds(565, 340, 200, 30);
        add(labelCity);

        textcity = new JTextField();
        textcity.setBackground(new Color(240,240,240));
        textcity.setForeground(Color.BLACK);
        textcity.setFont(new Font("AvantGarde", Font.BOLD, 14));
        textcity.setBounds(765, 340, 275, 30);
        add(textcity);

        JLabel labelPin = new JLabel("Pin Code");
        labelPin.setForeground(new Color(220,220,220));
        labelPin.setFont(new Font("AvantGarde", Font.BOLD, 20));
        labelPin.setBounds(100, 390, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setBackground(new Color(240,240,240));
        textPin.setForeground(Color.BLACK);
        textPin.setFont(new Font("AvantGarde", Font.BOLD, 14));
        textPin.setBounds(200, 390, 275, 30);
        add(textPin);

        JLabel labelstate = new JLabel("State");
        labelstate.setForeground(new Color(220,220,220));
        labelstate.setFont(new Font("AvantGarde", Font.BOLD, 20));
        labelstate.setBounds(565, 390, 200, 30);
        add(labelstate);

        textState = new JTextField();
        textState.setBackground(new Color(240,240,240));
        textState.setForeground(Color.BLACK);
        textState.setFont(new Font("AvantGarde", Font.BOLD, 14));
        textState.setBounds(765, 390, 275, 30);
        add(textState);

        back = new JButton("BACK");
        back.setFont(new Font("AvantGarde", Font.BOLD, 14));
        back.setForeground(Color.WHITE);
        back.setBackground(new Color(108, 117, 125)); // Soft Gray
        back.setBounds(460, 500, 90, 30);
        back.addActionListener(this);
        add(back);

        next = new JButton("NEXT");
        next.setFont(new Font("AvantGarde", Font.BOLD, 14));
        next.setForeground(Color.WHITE);
        next.setBackground(new Color(0, 123, 255)); // Professional Blue
        next.setBounds(600, 500, 90, 30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(1170, 650);
        setLocation(100, 50);
        //setUndecorated(true);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String FormNo = first;
        String Name = textName.getText();
        String FatherName = textFname.getText();

        String Gender = null;
        if (r1.isSelected()) {
            Gender = "Male";
        } else if (r2.isSelected()) {
            Gender = "Female";
        } else if (r3.isSelected()) {
            Gender = "Other";
        }

        String DOB = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String MartialStatus = null;
        if (m1.isSelected()) {
            MartialStatus = "Married";
        } else if (m2.isSelected()) {
            MartialStatus = "Unmarried";
        }

        String Email = textEmail.getText();
        String Address = textAdd.getText();
        String City = textcity.getText();
        String PinCode = textPin.getText();
        String State = textState.getText();

        try {

            if (e.getSource()==back) {
                new Login();
                setVisible(false);
            }else if (textName.getText().equals("")) {
                UIManager.put("OptionPane.background",new Color(30,144,255) );
                UIManager.put("Panel.background",new Color(30,144,225));
                JOptionPane.showMessageDialog(null, "All fields are mandatory. Please ensure no field is left blank.","Validation Error",JOptionPane.INFORMATION_MESSAGE);
            } else if (e.getSource()==next){
                Conn con1 = new Conn();
                String Q = "insert into Signup values('" + FormNo + "','" + Name + "','" + FatherName + "','" + Gender + "','" + DOB + "','" + MartialStatus + "','" + Email + "','" + Address + "','" + City + "','" + PinCode + "','" + State + "')";
                con1.statement.executeUpdate(Q);
                new Signup2(FormNo);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }


    public static void main (String[] args)
    {
        new Signup();
    }
}