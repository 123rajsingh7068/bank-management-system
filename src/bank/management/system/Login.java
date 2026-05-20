package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;

    Login(){

        super("CUSTOMER SIGNIN/SIGNUP");
        getContentPane().setBackground(new Color(18, 32, 47)); // Dark Navy Background

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ruppes.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); JLabel image = new JLabel(i3);
        image.setBounds(10, 10, 70, 100);
        add(image);


        // LABEL

        label1=new JLabel("WELCOME TO ATM");
        label1.setForeground(new Color(255,255,255)); // White
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(400,125,500,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("AvantGarde", Font.BOLD, 28));
        label2.setForeground(new Color(200, 200, 200)); // Light Gray
        label2.setBounds(400,200,375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(555,200,200,30);
        textField2.setFont(new Font("AvantGarde", Font.BOLD,18));
        textField2.setBackground(new Color(240,240,240)); // Soft white
        textField2.setForeground(Color.BLACK);
        add(textField2);

        label3 = new JLabel("Pin: ");
        label3.setFont(new Font("AvantGarde", Font.BOLD, 28));
        label3.setForeground(new Color(200, 200, 200)); // Light Gray
        label3.setBounds(400,275,375,30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(555,275,200,30);
        passwordField3.setFont(new Font("AvantGarde", Font.BOLD, 28));
        passwordField3.setBackground(new Color(240,240,240));
        passwordField3.setForeground(Color.BLACK);
        add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("AvantGarde", Font.BOLD, 16));
        button1.setForeground(Color.WHITE);
        button1.setBackground(new Color(0, 102, 204)); // Professional Blue
        button1.setBounds(605,350,100, 30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("AvantGarde", Font.BOLD, 16));
        button2.setForeground(Color.WHITE);
        button2.setBackground(new Color(108, 117, 125)); // Soft Gray
        button2.setBounds(450,350,100, 30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("AvantGarde", Font.BOLD, 16));
        button3.setForeground(Color.WHITE);
        button3.setBackground(new Color(40, 167, 69)); // Modern Green
        button3.setBounds(450,425,255, 30);
        button3.addActionListener(this);
        add(button3);

        setSize(1170,650);
        setLocation(100,50);
        setLayout(null);
      //  setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try{

            if (e.getSource()==button1){

                Conn c = new Conn();
                String CardNo = textField2.getText();
                String Pin = passwordField3.getText();
                String Q = "select * from Login where CardNo = '"+CardNo+"' and Pin = '"+Pin+"'";
                ResultSet resultSet = c.statement.executeQuery(Q);
                if (resultSet.next()){
                    setVisible(false);
                    new Mainclasss(Pin);
                }else {
                    UIManager.put("OptionPane.background",new Color(30,144,255) );
                    UIManager.put("Panel.background",new Color(30,144,225));
                    JOptionPane.showMessageDialog(null,"The Card Number or PIN you entered is incorrect. \nPlease check and try again.","Authentication Failed",JOptionPane.ERROR_MESSAGE);

                }

            }
            else if (e.getSource()==button2) {
                textField2.setText("");
                passwordField3.setText("");

            }
            else if(e.getSource()==button3){
                new Signup();
                setVisible(false);
            }

        }
        catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
