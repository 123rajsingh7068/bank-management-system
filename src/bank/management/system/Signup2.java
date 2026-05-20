package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAddar; JRadioButton r1,r2, e1,e2;
    JButton next,cancel;
    String FormNo;

    Signup2(String FormNo){

        super("PAGE-2 APPLICATION FORM");
        this.FormNo=FormNo;

        getContentPane().setBackground(new Color(18, 32, 47)); // Deep Navy

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ruppes.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); JLabel image = new JLabel(i3);
        image.setBounds(10, 10, 70, 100);
        add(image);

        Color labelColor = new Color(220, 230, 255);
        Color fieldBg = new Color(245, 248, 255);

        JLabel label1 = new JLabel("APPLICATION FORM NO.");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(300, 35, 600, 40);
        add(label1);

        JLabel L1 =new JLabel("PAGE 2");
        L1.setForeground(new Color(200,200,200));
        L1.setBounds(535, 75, 100, 30);
        L1.setFont(new Font("AvantGarde", Font.BOLD, 22));
        add(L1);

        JLabel L2 = new JLabel("ADDITIONAL DETAILS");
        L2.setForeground(new Color(0, 123, 255)); // Highlight Blue
        L2.setBounds(460, 105, 250, 30);
        L2.setFont(new Font("AvantGarde", Font.BOLD, 22));
        add(L2);

        JLabel L3 = new JLabel("Religion");
        L3.setForeground(new Color(220,220,220));
        L3.setBounds(100, 190, 150, 30);
        L3.setFont(new Font("AvantGarde", Font.BOLD, 22));
        add(L3);

        String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox= new JComboBox(religion);
        comboBox.setBackground(new Color(240,240,240));
        comboBox.setFont(new Font("AvantGarde", Font.BOLD, 14));
        comboBox.setBounds(250, 190, 250, 30);
        comboBox.setForeground(Color.BLACK);
        add(comboBox);

        JLabel L4 = new JLabel("Category");
        L4.setForeground(new Color(220,220,220));
        L4.setFont(new Font("AvantGarde", Font.BOLD, 20));
        L4.setBounds(565, 190, 200, 30);
        add(L4);

        String category[]={"General","OBC","SC","ST","Other"};
        comboBox2= new JComboBox(category);
        comboBox2.setBackground(new Color(240,240,240));
        comboBox2.setForeground(Color.BLACK);
        comboBox2.setFont(new Font("AvantGarde", Font.BOLD, 14));
        comboBox2.setBounds(765, 190, 250, 30);
        add(comboBox2);

        JLabel L5 = new JLabel("Income");
        L5.setForeground(labelColor);
        L5.setFont(new Font("AvantGarde", Font.BOLD, 20));
        L5.setBounds(565, 240, 200, 30);
        add(L5);

        String income[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3= new JComboBox(income);
        comboBox3.setBackground(fieldBg);
        comboBox3.setFont(new Font("AvantGarde",Font.BOLD,14));
        comboBox3.setBounds(765,240,250,30);
        add(comboBox3);

        JLabel L6 = new JLabel("Education");
        L6.setForeground(labelColor);
        L6.setFont(new Font("AvantGarde", Font.BOLD, 20));
        L6.setBounds(100, 240, 200, 30);
        add(L6);

        String education[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Intermediate","Highschool","Other"};
        comboBox4= new JComboBox(education);
        comboBox4.setBackground(fieldBg);
        comboBox4.setFont(new Font("AvantGarde",Font.BOLD,14));
        comboBox4.setBounds(250,240,250,30);
        add(comboBox4);

        JLabel L7 = new JLabel("Occupation");
        L7.setForeground(labelColor);
        L7.setFont(new Font("AvantGarde", Font.BOLD, 20));
        L7.setBounds(100, 290, 200, 30);
        add(L7);

        String occcupation[]={"Salaried ","Self-Employed","Business","Student","Retired","Other"};
        comboBox5= new JComboBox(occcupation);
        comboBox5.setBackground(fieldBg);
        comboBox5.setFont(new Font("AvantGarde",Font.BOLD,14));
        comboBox5.setBounds(250,290,250,30);
        add(comboBox5);

        JLabel L8 = new JLabel("Pan No");
        L8.setForeground(labelColor);
        L8.setFont(new Font("AvantGarde", Font.BOLD, 20));
        L8.setBounds(565, 290, 200, 30);
        add(L8);

        textPan = new JTextField();
        textPan.setBackground(fieldBg);
        textPan.setForeground(Color.BLACK);
        textPan.setFont(new Font("AvantGarde", Font.BOLD, 14));
        textPan.setBounds(765, 290, 250, 30);
        add(textPan);

        JLabel L9 = new JLabel("Aadhar No");
        L9.setForeground(labelColor);
        L9.setFont(new Font("AvantGarde", Font.BOLD, 20));
        L9.setBounds(100, 340, 200, 30);
        add(L9);

        textAddar = new JTextField();
        textAddar.setBackground(fieldBg);
        textAddar.setForeground(Color.BLACK);
        textAddar.setFont(new Font("AvantGarde", Font.BOLD, 14));
        textAddar.setBounds(250, 340, 250, 30);
        add(textAddar);

        JLabel L10 = new JLabel("Senior Citizen");
        L10.setForeground(labelColor);
        L10.setFont(new Font("AvantGarde", Font.BOLD, 20));
        L10.setBounds(565, 340, 200, 30);
        add(L10);

        r1=new JRadioButton("Yes");
        r1.setBackground(new Color(18,32,47)); // Highlight Blue
        r1.setForeground(Color.WHITE);
        r1.setFont(new Font("AvantGarde", Font.BOLD, 14));
        r1.setBounds(765,340,70,30);
        add(r1);

        r2=new JRadioButton("No");
        r2.setBackground(new Color(18,32,47));
        r2.setForeground(Color.WHITE);
        r2.setFont(new Font("AvantGarde", Font.BOLD, 14));
        r2.setBounds(847,340,70,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel L11 = new JLabel("Exiting A/C");
        L11.setForeground(labelColor);
        L11.setFont(new Font("AvantGarde", Font.BOLD, 20));
        L11.setBounds(100, 390, 200, 30);
        add(L11);

        e1=new JRadioButton("Yes");
        e1.setBackground(new Color(18,32,47));
        e1.setForeground(Color.WHITE);
        e1.setFont(new Font("AvantGarde", Font.BOLD, 14));
        e1.setBounds(250,390,70,30);
        add(e1);

        e2=new JRadioButton("No");
        e2.setBackground(new Color(18,32,47));
        e2.setForeground(Color.WHITE);
        e2.setFont(new Font("AvantGarde", Font.BOLD, 14));
        e2.setBounds(332,390,70,30);
        add(e2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);

      /*  JLabel L12 = new JLabel("FORM NO");
        L12.setForeground(labelColor);
        L12.setFont(new Font("AvantGarde", Font.BOLD, 20));
        L12.setBounds(565, 390, 200, 30);
        add(L12); */

        JLabel L13= new JLabel(FormNo);
        L13.setForeground(Color.WHITE);
        L13.setFont(new Font("AvantGarde", Font.BOLD, 38));
        L13.setBounds(760, 35, 600, 40);
        add(L13);

        cancel = new JButton("CANCEL");
        cancel.setFont(new Font("AvantGarde", Font.BOLD, 14));
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(new Color(220,53,69));
        cancel.setBounds(460, 500, 90, 30);
        cancel.addActionListener(this);
        add(cancel);

        next = new JButton("NEXT");
        next.setFont(new Font("AvantGarde", Font.BOLD, 14));
        next.setForeground(Color.WHITE);
        next.setBackground(new Color(0, 123, 255));
        next.setBounds(600, 500, 90, 30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(1170, 650);
        setLocation(100, 50);
        //setUndecorated(true);
        setVisible(true);
    }

    @Override public void actionPerformed(ActionEvent e)
    {
        String Religion=(String) comboBox.getSelectedItem();
        String Category = (String) comboBox2.getSelectedItem();
        String Income = (String) comboBox3.getSelectedItem();
        String Education = (String) comboBox4.getSelectedItem();
        String Occupation = (String) comboBox5.getSelectedItem();

        String Pan = textPan.getText();
        String Aadhar = textAddar.getText();

        String SeniorCitizen="";
        if((r1.isSelected())){
            SeniorCitizen="Yes";
        } else if (r2.isSelected()) {
            SeniorCitizen="No";
        }

        String ExistingAccount="";
        if((e1.isSelected())){
            ExistingAccount="Yes";
        } else if (e2.isSelected()) {
            ExistingAccount="No";
        }

        try{

            if (e.getSource()==cancel){
                System.exit(0);
            }else if (textPan.getText().equals("")||textAddar.getText().equals("")){
                UIManager.put("OptionPane.background",new Color(30,144,255) );
                UIManager.put("Panel.background",new Color(30,144,225));
                JOptionPane.showMessageDialog(null,"All fields are mandatory. Please ensure no field is left blank.","Validation Error",JOptionPane.INFORMATION_MESSAGE);
            } else if (e.getSource()==next){
                Conn c1=new Conn();
                String Q = "insert into Signuptwo values('"+FormNo+"','"+Religion+"','"+Category+"','"+Income+"','"+Education+"','"+Occupation+"','"+Pan+"','"+Aadhar+"','"+SeniorCitizen+"','"+ExistingAccount+"')";
                c1.statement.executeUpdate(Q);
                new Signup3(FormNo);
                setVisible(false);


            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }
    public static void main(String[] args) {
        new Signup2("");
    }
}