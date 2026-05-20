package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;


   JCheckBox c1,c2,c3,c4,c5,c6;

   JButton s,c;

    String FormNo;
    Signup3(String FormNo){

        super("PAGE-3 APPLICATION FORM ");
        this.FormNo=FormNo;

        getContentPane().setBackground(new Color(18, 32, 47)); // Dark Navy Background

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ruppes.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); JLabel image = new JLabel(i3);
        image.setBounds(10, 10, 70, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO.");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(300, 35, 600, 40);
        add(label1);

        JLabel L1 =new JLabel("PAGE 3");
        L1.setForeground(new Color(200,200,200));
        L1.setBounds(535, 75, 100, 30);
        L1.setFont(new Font("AvantGarde", Font.BOLD, 22));
        add(L1);

        JLabel L2 = new JLabel("ACCOUNT DETAILS");
        L2.setForeground(new Color(0, 123, 255)); // Highlight Blue
        L2.setBounds(460, 105, 250, 30);
        L2.setFont(new Font("AvantGarde", Font.BOLD, 22));
        add(L2);

        JLabel L3 = new JLabel("Account Type");
        L3.setForeground(new Color(220,220,220));
        L3.setBounds(100, 190, 200, 30);
        L3.setFont(new Font("AvantGarde", Font.BOLD, 22));
        add(L3);

        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("AvantGarde", Font.BOLD, 15));
        r1.setBackground(new Color(18, 32, 47));
        r1.setForeground(Color.WHITE);
        r1.setBounds(100, 220, 200, 25);
        add(r1);

        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("AvantGarde", Font.BOLD, 15));
        r2.setBackground(new Color(18, 32, 47));
        r2.setForeground(Color.WHITE);
        r2.setBounds(100, 250, 250, 25);
        add(r2);

        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("AvantGarde", Font.BOLD, 15));
        r3.setBackground(new Color(18, 32, 47));
        r3.setForeground(Color.WHITE);
        r3.setBounds(100, 280, 200, 25);
        add(r3);

        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("AvantGarde", Font.BOLD, 15));
        r4.setBackground(new Color(18, 32, 47));
        r4.setForeground(Color.WHITE);
        r4.setBounds(100, 310, 270, 25);
        add(r4);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel L4 = new JLabel("Card Number");
        L4.setForeground(new Color(220,220,220));
        L4.setFont(new Font("AvantGarde", Font.BOLD, 20));
        L4.setBounds(565, 190, 200, 30);
        add(L4);

        JLabel L5 = new JLabel("(Your 16 Digit Card Number)");
        L5.setFont(new Font("AvantGarde",Font.BOLD,14));
        L5.setForeground(Color.WHITE);
        L5.setBounds(565,210,250,30);
        add(L5);

        JLabel L6 = new JLabel("XXXX-XXXX-XXXX-4841");
        L6.setForeground(new Color(220,220,220));
        L6.setFont(new Font("AvantGarde", Font.BOLD, 14));
        L6.setBounds(565, 230, 200, 30);
        add(L6);

        JLabel L7 = new JLabel("(It would appear on ATM card/cheque book and statement)");
        L7.setForeground(new Color(70,70,70));
        L7.setFont(new Font("AvantGarde", Font.BOLD, 14));
        L7.setForeground(Color.WHITE);
        L7.setBounds(565, 250, 500, 30);
        add(L7);

        JLabel L8 = new JLabel("Pin");
        L8.setForeground(new Color(220,220,220));
        L8.setBounds(100, 345, 200, 30);
        L8.setFont(new Font("AvantGarde", Font.BOLD, 22));
        add(L8);

        JLabel L9 = new JLabel("XXXX");
        L9.setFont(new Font("AvantGarde", Font.BOLD, 14));
        L9.setForeground(Color.WHITE);
        L9.setBounds(100, 365, 200, 30);
        add(L9);

        JLabel L10 = new JLabel("(4-Digit Password)");
        L10.setFont(new Font("AvantGarde", Font.BOLD, 14));
        L10.setForeground(Color.WHITE);
        L10.setBounds(100, 385, 500, 30);
        add(L10);

        JLabel L11 = new JLabel("Service Required");
        L11.setForeground(new Color(220,220,220));
        L11.setFont(new Font("AvantGarde", Font.BOLD, 22));
        L11.setBounds(565, 285, 500, 30);
        add(L11);

        c1=new JCheckBox("ATM Card");
        c1.setBackground(new Color(18, 32, 47));
        c1.setFont(new Font("AvantGarde", Font.BOLD, 14));
        c1.setForeground(Color.WHITE);
        c1.setBounds(565,315,120,30);
        add(c1);

        c2=new JCheckBox("Internet Banking");
        c2.setBackground(new Color(18, 32, 47));
        c2.setFont(new Font("AvantGarde", Font.BOLD, 14));
        c2.setForeground(Color.WHITE);
        c2.setBounds(695,315,150,30);
        add(c2);

        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(18, 32, 47));
        c3.setFont(new Font("AvantGarde", Font.BOLD, 14));
        c3.setForeground(Color.WHITE);
        c3.setBounds(855,315,140,30);
        add(c3);

        c4=new JCheckBox("Email Alert");
        c4.setBackground(new Color(18, 32, 47));
        c4.setFont(new Font("AvantGarde", Font.BOLD, 14));
        c4.setForeground(Color.WHITE);
        c4.setBounds(855,340,120,30);
        add(c4);

        c5=new JCheckBox("Cheque Book");
        c5.setBackground(new Color(18, 32, 47));
        c5.setFont(new Font("AvantGarde", Font.BOLD, 14));
        c5.setForeground(Color.WHITE);
        c5.setBounds(565,340,130,30);
        add(c5);

        c6=new JCheckBox("E-Statement");
        c6.setBackground(new Color(18, 32, 47));
        c6.setFont(new Font("AvantGarde", Font.BOLD, 14));
        c6.setForeground(Color.WHITE);
        c6.setBounds(695,340,130,30);
        add(c6);

        JCheckBox c7=new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.",true);
        c7.setBackground(new Color(18, 32, 47));
        c7.setFont(new Font("AvantGarde", Font.BOLD, 14));
        c7.setForeground(Color.WHITE);
        c7.setBounds(100,450,700,30);
        add(c7);

       /* JLabel L12 = new JLabel("FORM NO");
        L12.setForeground(new Color(220,220,220));
        L12.setFont(new Font("AvantGarde", Font.BOLD, 20));
        L12.setBounds(565, 450, 200, 30);
        add(L12);
*/
        JLabel L13= new JLabel(FormNo);
        L13.setForeground(Color.WHITE);
        L13.setFont(new Font("AvantGarde", Font.BOLD, 38));
        L13.setBounds(760, 35, 600, 40);
        add(L13);

        s=new JButton("SUBMIT");
        s.setFont(new Font("AvantGarde", Font.BOLD, 14));
        s.setBackground(new Color(0,102,204));
        s.setForeground(Color.white);
        s.setBounds(600, 500, 90, 30);
        s.addActionListener(this);
        add(s);

        c=new JButton("CANCEL");
        c.setFont(new Font("AvantGarde", Font.BOLD, 14));
        c.setBackground(new Color(220,53,69));
        c.setForeground(Color.white);
        c.setBounds(460, 500, 90, 30);
        c.addActionListener(this);
        add(c);

        setLayout(null);
        setSize(1170, 650);
        setLocation(100, 50);
       // setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

       String AccountType="";
       if(r1.isSelected()){
           AccountType="Saving Account";
       } else if (r2.isSelected()){
           AccountType="Fixed Deposit Account";
       } else if (r3.isSelected()){
           AccountType="Current Account";
       } else if (r4.isSelected()){
           AccountType="Recurring Deposit Account";
       }
        Random ran=new Random();
       long first7=(ran.nextLong()%90000000L)+1409963000000000L;
       String CardNo=""+Math.abs(first7);

       long first3=(ran.nextLong()%9000L)+1000L;
       String Pin=""+Math.abs(first3);

       String Facility ="";
       if(c1.isSelected()){
            Facility=Facility+"ATM Card";
        } else if (c2.isSelected()){
           Facility=Facility+"Internet Banking";
       } else if (c3.isSelected()){
           Facility=Facility+"Mobile Banking";
       } else if (c4.isSelected()){
           Facility=Facility+"Email Alert";
       } else if (c5.isSelected()){
           Facility=Facility+"Cheque Book";
       } else if (c6.isSelected()){
           Facility=Facility+"E-Statement";
       }

       try{
           if (e.getSource()==s){
               if(AccountType.equals("")){
                   UIManager.put("OptionPane.background",new Color(30,144,255) );
                   UIManager.put("Panel.background",new Color(30,144,225));
                   JOptionPane.showMessageDialog(null,"All fields are mandatory. Please ensure no field is left blank.","Validation Error",JOptionPane.INFORMATION_MESSAGE);
               }else {
                   Conn c1 =new Conn();
                   String Q1="insert into Signupthree values('"+FormNo+"','"+AccountType+"','"+CardNo+"','"+Pin+"','"+Facility+"')";
                   String Q2="insert into Login values('"+FormNo+"','"+CardNo+"','"+Pin+"')";
                   c1.statement.executeUpdate(Q1);
                   c1.statement.executeUpdate(Q2);
                   UIManager.put("OptionPane.background",new Color(30,144,255) );
                   UIManager.put("Panel.background",new Color(30,144,225));
                   JOptionPane.showMessageDialog(null,"Your Card has been created successfully!\n\n"+"Card Number :"+CardNo+"\nPin :"+Pin+"\n\n"+"Importance : Please remember your Card Number and PIN.","Card Details",JOptionPane.INFORMATION_MESSAGE);
                   new Deposit(Pin);
                   setVisible(false);
               }
           } else if (e.getSource()==c){
               System.exit(0);
           }
       }catch (Exception E){
           E.printStackTrace();
       }


    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
