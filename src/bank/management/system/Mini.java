package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.print.PrinterJob;
import java.awt.print.Printable;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.Graphics2D;

public class Mini extends JFrame implements ActionListener {

    String Pin;
    JButton button, print;
    JLabel image;   // 🔥 Made global for printing

    Mini(String Pin) {

        super("MINI STATEMENT");
        this.Pin = Pin;

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/ruppes.png"));
        Image ii = i.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon iii = new ImageIcon(ii);
        JLabel img = new JLabel(iii);
        img.setBounds(10, 10, 70, 100);
        add(img);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paper.png"));
        Image i2 = i1.getImage().getScaledInstance(900, 665, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        image = new JLabel(i3);  // 🔥 Important change
        image.setBounds(100, 0, 900, 665);
        add(image);

        getContentPane().setBackground(new Color(18, 32, 47));
        setLayout(null);
        setSize(1170, 650);
        setLocation(100, 50);

        JLabel label1 = new JLabel();
        label1.setBounds(290, 140, 600, 220);
        label1.setFont(new Font("Courier New", Font.BOLD, 15));
        label1.setForeground(Color.WHITE);
        image.add(label1);

        JLabel label2 = new JLabel("MINI STATEMENT");
        label2.setFont(new Font("Courier New", Font.BOLD, 25));
        label2.setForeground(Color.WHITE);
        label2.setBounds(380, 70, 250, 30);
        image.add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(350, 115, 350, 20);
        label3.setFont(new Font("Courier New", Font.BOLD, 15));
        label3.setForeground(Color.WHITE);
        image.add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(360, 450, 300, 20);
        label4.setFont(new Font("Courier New", Font.BOLD, 15));
        label4.setForeground(Color.WHITE);
        image.add(label4);

        try {
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from Login where Pin = '" + Pin + "'");
            while (resultSet.next()) {
                label3.setText("Card Number : " +
                        resultSet.getString("CardNo").substring(0, 4)
                        + "XXXXXXXXXXXX" +
                        resultSet.getString("CardNo").substring(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int Balance = 0;
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from Deposit where Pin='" + Pin + "'");

            while (resultSet.next()) {

                label1.setText(label1.getText() + "<html>"
                        + resultSet.getString("Date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                        + resultSet.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                        + resultSet.getString("Amount")
                        + "<br><br></html>");

                if (resultSet.getString("type").equals("Deposit")) {
                    Balance += Integer.parseInt(resultSet.getString("Amount"));
                } else {
                    Balance -= Integer.parseInt(resultSet.getString("Amount"));
                }
            }

            label4.setText("Your Total Balance is ₹ " + Balance);

        } catch (Exception e) {
            e.printStackTrace();
        }

        button = new JButton("BACK");
        button.setBounds(400, 500, 90, 30);
        button.setFont(new Font("Courier New", Font.BOLD, 14));
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(108, 117, 125)); // Soft Gray
        button.addActionListener(this);
        image.add(button);

        print = new JButton("PRINT");
        print.setBounds(520, 500, 90, 30);
        print.setFont(new Font("Courier New", Font.BOLD, 14));
        print.setBackground(new Color(40, 167, 69)); // Modern Green
        print.setForeground(new Color(255,255,255));
        print.addActionListener(this);
        image.add(print);

       // setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            new Mainclasss(Pin);
            setVisible(false);
        }

        else if (e.getSource() == print) {

            try {
                PrinterJob printerJob = PrinterJob.getPrinterJob();
                printerJob.setJobName("Mini Statement");

                printerJob.setPrintable((graphics, pageFormat, pageIndex) -> {

                    if (pageIndex > 0) {
                        return Printable.NO_SUCH_PAGE;
                    }

                    Graphics2D g2d = (Graphics2D) graphics;
                    g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

                    double scaleX = pageFormat.getImageableWidth() / getContentPane().getWidth();
                    double scaleY = pageFormat.getImageableHeight() / getContentPane().getHeight();
                    double scale = Math.min(scaleX, scaleY);

                    g2d.scale(scale, scale);

                    getContentPane().printAll(g2d);   // 🔥 PRINT FULL FRAME

                    return Printable.PAGE_EXISTS;
                });

                if (printerJob.printDialog()) {
                    printerJob.print();
                    UIManager.put("OptionPane.background",new Color(30,144,255) );
                    UIManager.put("Panel.background",new Color(30,144,225));
                    JOptionPane.showMessageDialog(this, "Printing Completed Successfully.","Printing",JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Mini("");
    }
}