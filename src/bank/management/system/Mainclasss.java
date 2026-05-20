package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainclasss extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;

    String Pin;

    Mainclasss(String Pin){

        super("ATM FEATURES");

        this.Pin=Pin;

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/ruppes.png"));
        Image ii = i.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon iii = new ImageIcon(ii);
        JLabel img = new JLabel(iii);
        img.setBounds(10, 10, 70, 100);
        add(img);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATM.png"));
        Image i2 = i1.getImage().getScaledInstance(600, 612, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(280, 0, 600, 612);
        add(image);

        JLabel L =new JLabel("ATM");
        L.setForeground(new Color(221, 85, 17));
        L.setFont(new Font("AvantGarde", Font.BOLD, 50));
        L.setBounds(245, 35, 200, 40);
        image.add(L);


        JLabel L1 =new JLabel("PLEASE SELECT YOUR TRANSACTION");
        L1.setForeground(new Color(0,0,0));
        L1.setFont(new Font("AvantGarde", Font.BOLD, 15));
        L1.setBounds(147, 165, 600, 40);
        image.add(L1);


        b1=new JButton("DEPOSIT");
        b1.setBounds(310,266,150,22);
        b1.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b1.setBackground(new Color(0, 123, 255));
        b1.setForeground(new Color(255,255,255));
        b1.addActionListener(this);
        image.add(b1);

        b2=new JButton("CASH WITHDRAWAL");
        b2.setBounds(140,266,150,22);
        b2.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b2.setBackground(new Color(0, 123, 255));
        b2.setForeground(new Color(255,255,255));
        b2.addActionListener(this);
        image.add(b2);

        b3=new JButton("FAST WITHDRAWAL");
        b3.setBounds(310,293,150,22);
        b3.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b3.setBackground(new Color(0, 123, 255));
        b3.setForeground(new Color(255,255,255));
        b3.addActionListener(this);
        image.add(b3);

        b4=new JButton("MINI STATEMENT");
        b4.setBounds(140,293,150,22);
        b4.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b4.setBackground(new Color(0, 123, 255));
        b4.setForeground(new Color(255,255,255));
        b4.addActionListener(this);
        image.add(b4);

        b5=new JButton("PIN CHANGE");
        b5.setBounds(310,239,150,22);
        b5.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b5.setBackground(new Color(0, 123, 255));
        b5.setForeground(new Color(255,255,255));
        b5.addActionListener(this);
        image.add(b5);

        b6=new JButton("BALANCE ENQUIRY");
        b6.setBounds(140,239,150,22);
        b6.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b6.setBackground(new Color(0, 123, 255));
        b6.setForeground(new Color(255,255,255));
        b6.addActionListener(this);
        image.add(b6);

        b7=new JButton("EXIT");
        b7.setBounds(310,212,150,22);
        b7.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b7.setBackground(new Color(220,53,69));
        b7.setForeground(new Color(255,255,255));
        b7.addActionListener(this);
        image.add(b7);


        getContentPane().setBackground(new Color(106, 105, 105));
        setLayout(null);
        setSize(1170, 650);
        setLocation(100, 50);
       // setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            new Deposit(Pin);
            setVisible(false);
        } else if (e.getSource()==b7) {
            System.exit(0);

        } else if (e.getSource()==b2) {
            new Withdrawal(Pin);
            setVisible(false);
        } else if (e.getSource()==b6) {
            new BalanceEnquiry(Pin);
            setVisible(false);
        } else if (e.getSource()==b3) {
            new FastCash(Pin);
            setVisible(false);
        } else if (e.getSource()==b5) {
            new Pin(Pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new Mini(Pin);
            setVisible(false);
        }

    }

    public static void main(String[] args) {

         new Mainclasss("");
    }
}
