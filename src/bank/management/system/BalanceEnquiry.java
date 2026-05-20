package bank.management.system;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JLabel L2;

    JButton b1;

    String Pin;
    BalanceEnquiry(String Pin){

        super("BALANCE ENQUIRY");

        this.Pin=Pin;

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/ruppes.png"));
        Image ii = i.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon iii = new ImageIcon(ii);
        JLabel img = new JLabel(iii);
        img.setBounds(10, 10, 70, 100);
        add(img);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATM.png"));
        Image i2 = i1.getImage().getScaledInstance(600, 612, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); JLabel image = new JLabel(i3);
        image.setBounds(280, 0, 600, 612);
        add(image);

        JLabel L =new JLabel("ATM");
        L.setForeground(new Color(221, 85, 17));
        L.setFont(new Font("AvantGarde", Font.BOLD, 50));
        L.setBounds(245, 35, 200, 40);
        image.add(L);

        JLabel L1 =new JLabel("YOUR CURRENT BALANCE IS Rs. ");
        L1.setForeground(new Color(0,0,0));
        L1.setFont(new Font("AvantGarde", Font.BOLD, 15));
        L1.setBounds(147, 165, 600, 40);
        image.add(L1);

        JLabel L2 =new JLabel();
        L2.setForeground(new Color(0,0,0));
        L2.setFont(new Font("AvantGarde", Font.BOLD, 15));
        L2.setBounds(147, 195, 500, 40);
        image.add(L2);

        b1=new JButton("BACK");
        b1.setBounds(340,293,115,22);
        b1.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b1.setBackground(new Color(108, 117, 125));
        b1.setForeground(new Color(255,255,255));
        b1.addActionListener(this);
        image.add(b1);

        int Balance=0;
        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from Deposit where Pin = '"+Pin+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    Balance += Integer.parseInt(resultSet.getString("Amount"));
                }else {
                    Balance -=Integer.parseInt(resultSet.getString("Amount"));
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        L2.setText(""+Balance);

        getContentPane().setBackground(new Color(106, 105, 105));
        setLayout(null);
        setSize(1170, 650);
        setLocation(100, 50);
       // setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        setVisible(false);
        new Mainclasss(Pin);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }

}
