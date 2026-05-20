package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {

    JButton b1,b2;
    JPasswordField p1,p2;
    String Pin;

    Pin(String Pin){

        super("CHANGE ATM PIN");

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

        JLabel L1 =new JLabel("CHANGE YOUR ATM PIN");
        L1.setForeground(new Color(0,0,0));
        L1.setFont(new Font("AvantGarde", Font.BOLD, 15));
        L1.setBounds(147, 165, 600, 40);
        image.add(L1);

        JLabel L2 =new JLabel("NEW PIN");
        L2.setForeground(new Color(0,0,0));
        L2.setFont(new Font("AvantGarde", Font.BOLD, 15));
        L2.setBounds(147, 200, 150, 40);
        image.add(L2);

        p1=new JPasswordField();
        p1.setBounds(147,235,100,25);
        p1.setFont(new Font("AvantGarde", Font.BOLD, 15));
        p1.setBackground(new Color(108, 117, 125));
        p1.setForeground(new Color(0,0,0));
        image.add(p1);

        JLabel L3 =new JLabel("CONFIRM PIN");
        L3.setForeground(new Color(0,0,0));
        L3.setFont(new Font("AvantGarde", Font.BOLD, 15));
        L3.setBounds(147, 260, 200, 25);
        image.add(L3);

        p2=new JPasswordField();
        p2.setBounds(147,287,100,25);
        p2.setFont(new Font("AvantGarde", Font.BOLD, 15));
        p2.setBackground(new Color(108, 117, 125));
        p2.setForeground(new Color(0,0,0));
        image.add(p2);


        b1=new JButton("CHANGE");
        b1.setBounds(350,266,100,22);
        b1.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b1.setBackground(new Color(40, 167, 69));
        b1.setForeground(new Color(255,255,255));
        b1.addActionListener(this);
        image.add(b1);

        b2=new JButton("BACK");
        b2.setBounds(350,293,100,22);
        b2.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b2.setBackground(new Color(108, 117, 125));
        b2.setForeground(new Color(255,255,255));
        b2.addActionListener(this);
        image.add(b2);


        getContentPane().setBackground(new Color(106, 105, 105));
        setLayout(null);
        setSize(1170, 650);
        setLocation(100, 50);
      //  setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            String Pin1 = p1.getText();
            String Pin2 = p2.getText();

            if (!Pin1.equals(Pin2)) {
                UIManager.put("OptionPane.background",new Color(30,144,255) );
                UIManager.put("Panel.background",new Color(30,144,225));
                JOptionPane.showMessageDialog(null, "The entered pin does not match.","Invalid Pin",JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (e.getSource() == b1) {
                if (p1.getText().equals("")) {
                    UIManager.put("OptionPane.background",new Color(30,144,255) );
                    UIManager.put("Panel.background",new Color(30,144,225));
                    JOptionPane.showMessageDialog(null, "Please enter your new PIN.","New PIN Required",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                if (p2.getText().equals("")) {
                    UIManager.put("OptionPane.background",new Color(30,144,255) );
                    UIManager.put("Panel.background",new Color(30,144,225));
                    JOptionPane.showMessageDialog(null, "Re-Enter New Pin","Invalid Pin",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                Conn c = new Conn();
                String Q1 = "update Deposit set Pin='" + Pin1 + "' where Pin='" + Pin + "'";
                String Q2 = "update Login set Pin='" + Pin1 + "' where Pin='" + Pin + "'";
                String Q3 = "update Signupthree set Pin='" + Pin1 + "' where Pin='" + Pin + "'";

                c.statement.executeUpdate(Q1);
                c.statement.executeUpdate(Q2);
                c.statement.executeUpdate(Q3);

                UIManager.put("OptionPane.background",new Color(30,144,255) );
                UIManager.put("Panel.background",new Color(30,144,225));
                JOptionPane.showMessageDialog(null, "Your PIN has been updated successfully.","PIN Updated",JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                new Mainclasss(Pin);

            } else if (e.getSource()==b2) {
                new Mainclasss(Pin);
                setVisible(false);

            }


        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Pin("");
    }
}
