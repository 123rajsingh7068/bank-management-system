package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;

    String Pin;

    FastCash(String Pin){


        super("FAST CASH WITHDRAWAL");

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


        JLabel L1 =new JLabel("SELECT YOUR WITHDRAWAL AMOUNT");
        L1.setForeground(new Color(0,0,0));
        L1.setFont(new Font("AvantGarde", Font.BOLD, 15));
        L1.setBounds(147, 165, 600, 40);
        image.add(L1);


        b1=new JButton("Rs. 100");
        b1.setBounds(140,239,150,22);
        b1.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b1.setBackground(new Color(40, 167, 69));
        b1.setForeground(new Color(255,255,255));
        b1.addActionListener(this);
        image.add(b1);

        b2=new JButton("Rs. 500");
        b2.setBounds(310,239,150,22);
        b2.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b2.setBackground(new Color(40, 167, 69));
        b2.setForeground(new Color(255,255,255));
        b2.addActionListener(this);
        image.add(b2);

        b3=new JButton("Rs. 1000");
        b3.setBounds(140,266,150,22);
        b3.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b3.setBackground(new Color(40, 167, 69));
        b3.setForeground(new Color(255,255,255));
        b3.addActionListener(this);
        image.add(b3);


        b4=new JButton("Rs. 2000");
        b4.setBounds(310,266,150,22);
        b4.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b4.setBackground(new Color(40, 167, 69));
        b4.setForeground(new Color(255,255,255));
        b4.addActionListener(this);
        image.add(b4);


        b5=new JButton("Rs. 5000");
        b5.setBounds(140,293,150,22);
        b5.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b5.setBackground(new Color(40, 167, 69));
        b5.setForeground(new Color(255,255,255));
        b5.addActionListener(this);
        image.add(b5);

        b6=new JButton("Rs. 10000");
        b6.setBounds(310,293,150,22);
        b6.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b6.setBackground(new Color(40, 167, 69));
        b6.setForeground(new Color(255,255,255));
        b6.addActionListener(this);
        image.add(b6);

        b7=new JButton("BACK");
        b7.setBounds(310,212,150,22);
        b7.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b7.setBackground(new Color(108, 117, 125));
        b7.setForeground(new Color(255,255,255));
        b7.addActionListener(this);
        image.add(b7);


        getContentPane().setBackground(new Color(106, 105, 105));
        setLayout(null);
        setSize(1170, 650);
        setLocation(100, 50);
        //setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==b7){
            setVisible(false);
            new Mainclasss(Pin);
        }else {
            String Amount=((JButton)e.getSource()).getText().substring(4);
            Conn c=new Conn();
            Date Date=new Date();
            try{
                ResultSet resultSet=c.statement.executeQuery("select * from Deposit where Pin='"+Pin+"'");
                int Balance=0;
                while (resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        Balance += Integer.parseInt(resultSet.getString("Amount"));
                    }else {
                        Balance -= Integer.parseInt(resultSet.getString("Amount"));
                    }
                }String Number = "17";
                if (e.getSource() != b7 && Balance < Integer.parseInt(Amount)){
                    UIManager.put("OptionPane.background",new Color(30,144,255) );
                    UIManager.put("Panel.background",new Color(30,144,225));
                    JOptionPane.showMessageDialog(null,"Transaction decline due to insufficient funds.","Insufficient Funds",JOptionPane.WARNING_MESSAGE);
                    return;
                }

                c.statement.executeUpdate("insert into Deposit values('"+Pin+"','"+Date+"','Withdrawal','"+Amount+"')");
                UIManager.put("OptionPane.background",new Color(30,144,255) );
                UIManager.put("Panel.background",new Color(30,144,225));
                JOptionPane.showMessageDialog(null,"₹ " + Amount + " has been debited from your account successfully.","Withdrawal Successfully",JOptionPane.INFORMATION_MESSAGE);

            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new Mainclasss(Pin);

        }

    }

    public static void main(String[] args) {

        new FastCash("");
    }
}
