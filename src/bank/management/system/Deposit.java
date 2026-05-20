package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    TextField textField;

    JButton b1,b2;

    String Pin;
    Deposit(String Pin){

        super("CASH DEPOSIT");

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
        L.setForeground(new Color(221, 85, 17)); // Highlight Blue
        L.setFont(new Font("AvantGarde", Font.BOLD, 50));
        L.setBounds(245, 35, 200, 40);
        image.add(L);

        JLabel L1 =new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        L1.setForeground(new Color(0,0,0));
        L1.setFont(new Font("AvantGarde", Font.BOLD, 15));
        L1.setBounds(147, 165, 600, 40);
        image.add(L1);

        textField=new TextField();
        textField.setBounds(142,210,320,25);
        textField.setFont(new Font("AvantGarde", Font.BOLD, 15));
        textField.setBackground(new Color(108, 117, 125)); // Soft Gray
        textField.setForeground(new Color(0,0,0));
        image.add(textField);

        b1=new JButton("DEPOSIT");
        b1.setBounds(350,266,100,22);
        b1.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b1.setBackground(new Color(40, 167, 69)); // Modern Green
        b1.setForeground(new Color(255,255,255));
        b1.addActionListener(this);
        image.add(b1);

        b2=new JButton("BACK");
        b2.setBounds(350,293,100,22);
        b2.setFont(new Font("AvantGarde", Font.BOLD, 12));
        b2.setBackground(new Color(108, 117, 125)); // Soft Gray
        b2.setForeground(new Color(255,255,255));
        b2.addActionListener(this);
        image.add(b2);

        getContentPane().setBackground(new Color(106, 105, 105));
        setLayout(null);
        setSize(1170, 650);
        setLocation(100, 50);
        //setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String Amount = textField.getText();
            Date Date = new Date();
            if(e.getSource()==b1){
                if(textField.getText().equals("")){
                    UIManager.put("OptionPane.background",new Color(30,144,255) );
                    UIManager.put("Panel.background",new Color(30,144,225));
                    JOptionPane.showMessageDialog(null,"No amount entered.\nKindly enter the amount you wish to deposit.","Input Required",JOptionPane.WARNING_MESSAGE);
                }else {
                    Conn c=new Conn();
                    c.statement.executeUpdate("insert into Deposit values('"+Pin+"','"+Date+"','Deposit','"+Amount+"')");
                    UIManager.put("OptionPane.background",new Color(30,144,255) );
                    UIManager.put("Panel.background",new Color(30,144,225));
                    JOptionPane.showMessageDialog(null,"₹ "+Amount+" has been credited to your account successfully.","Deposit Successfully",JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                    new Mainclasss(Pin);
                }
            } else if(e.getSource()==b2){
                setVisible(false);
                new Mainclasss(Pin);

            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
