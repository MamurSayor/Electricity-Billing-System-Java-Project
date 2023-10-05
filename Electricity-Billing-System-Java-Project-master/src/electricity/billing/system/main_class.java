package electricity.billing.system;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class main_class extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new main_class("", "");


    }
    String acctype;
    String meter_pass;
    main_class(String acctype, String meter_pass) {


            this.meter_pass = meter_pass;
            this.acctype = acctype;
            setExtendedState(JFrame.MAXIMIZED_BOTH);
            getContentPane().setBackground(new Color(168,203,255));

        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icon/bg1.jpg"));
        Image a2 = a1.getImage().getScaledInstance(600,900,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(a2);
        JLabel img = new JLabel(i3);
        img.setBounds(560,180,220,250);
        add(img);


        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("icon/bg.png"));
        Image b2 = b1.getImage().getScaledInstance(600,900,Image.SCALE_SMOOTH);
        ImageIcon j3 = new ImageIcon(b2);
        JLabel img1 = new JLabel(j3);
        add(img1);



            JMenuBar menuBar = new JMenuBar();
            setJMenuBar(menuBar);
            menuBar.setPreferredSize(new Dimension(80, 80));
            menuBar.setLayout(new GridBagLayout());
            menuBar.setBackground(new Color(100, 130, 240));





            JMenu menu = new JMenu("Menu");
            menu.setFont(new Font("serif", Font.BOLD, 50));
            Border blackline ;
            blackline = BorderFactory.createLineBorder(Color.black);
            menu.setBorder(blackline);



            JMenuItem newcustomer = new JMenuItem("New Customer");
            newcustomer.setFont(new Font("monospaced", Font.BOLD, 30));

            ImageIcon customerImg = new ImageIcon(ClassLoader.getSystemResource("icon/newcustomer.png"));
            Image customerImage = customerImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            newcustomer.setIcon(new ImageIcon(customerImage));
            newcustomer.addActionListener(this);
            menu.add(newcustomer);

            JMenuItem customerdetails = new JMenuItem("Customer Details");
            customerdetails.setFont(new Font("monospaced", Font.BOLD, 30));
            ImageIcon customerdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/customerDetails.png"));
            Image customerdetailsImage = customerdetailsImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            customerdetails.setIcon(new ImageIcon(customerdetailsImage));
            customerdetails.addActionListener(this);
            menu.add(customerdetails);

            JMenuItem depositdetails = new JMenuItem("Deposit Details");
            depositdetails.setFont(new Font("monospaced", Font.BOLD, 30));
            ImageIcon depositdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/depositdetails.png"));
            Image depositdetailsImage = depositdetailsImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            depositdetails.setIcon(new ImageIcon(depositdetailsImage));
            depositdetails.addActionListener(this);
            menu.add(depositdetails);

            JMenuItem calculatebill = new JMenuItem("Calculate Bill");
            calculatebill.setFont(new Font("monospaced", Font.BOLD, 30));
            ImageIcon calculatebillImg = new ImageIcon(ClassLoader.getSystemResource("icon/calculatorbills.png"));
            Image calculatebillImage = calculatebillImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            calculatebill.setIcon(new ImageIcon(calculatebillImage));
            calculatebill.addActionListener(this);
            menu.add(calculatebill);


            JMenu info = new JMenu("Information");
            info.setFont(new Font("serif", Font.BOLD, 50));
            info.setBorder(blackline);

            JMenuItem upinfo = new JMenuItem("Update Information");
            upinfo.setFont(new Font("monospaced", Font.BOLD, 30));
            ImageIcon upinfoImg = new ImageIcon(ClassLoader.getSystemResource("icon/refresh.png"));
            Image upinfoImage = upinfoImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            upinfo.setIcon(new ImageIcon(upinfoImage));
            upinfo.addActionListener(this);
            info.add(upinfo);

            JMenuItem viewInfo = new JMenuItem("View Information");
            viewInfo.setFont(new Font("monospaced", Font.BOLD, 30));
            ImageIcon viewInfoImg = new ImageIcon(ClassLoader.getSystemResource("icon/information.png"));
            Image viewInfoImage = viewInfoImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            viewInfo.setIcon(new ImageIcon(viewInfoImage));
            viewInfo.addActionListener(this);
            info.add(viewInfo);

            JMenu user = new JMenu("User");
            user.setFont(new Font("serif", Font.BOLD, 50));
            user.setBorder(blackline);

            JMenuItem paybill = new JMenuItem("Pay Bill");
            paybill.setFont(new Font("monospaced", Font.BOLD, 30));
            ImageIcon paybillImg = new ImageIcon(ClassLoader.getSystemResource("icon/pay.png"));
            Image paybillImage = paybillImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            paybill.setIcon(new ImageIcon(paybillImage));
            paybill.addActionListener(this);
            user.add(paybill);

            JMenuItem billdetails = new JMenuItem("Bill Details");
            billdetails.setFont(new Font("monospaced", Font.BOLD, 30));
            ImageIcon billdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icon/detail.png"));
            Image billdetailsImage = billdetailsImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            billdetails.setIcon(new ImageIcon(billdetailsImage));
            billdetails.addActionListener(this);
            user.add(billdetails);

            JMenu bill = new JMenu("Bill");
            bill.setFont(new Font("serif", Font.BOLD, 50));
            bill.setBorder(blackline);

            JMenuItem genBill = new JMenuItem("Generate Bill");
            genBill.setFont(new Font("monospaced", Font.BOLD, 30));
            ImageIcon genBillImg = new ImageIcon(ClassLoader.getSystemResource("icon/bill.png"));
            Image genBillImage = genBillImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            genBill.setIcon(new ImageIcon(genBillImage));
            genBill.addActionListener(this);
            bill.add(genBill);


            JMenu exit = new JMenu("Exit");
            exit.setFont(new Font("serif", Font.BOLD, 50));
            //exit.setBackground(Color.red);
            exit.setBorder(blackline);
        exit.setForeground(Color.RED);


            JMenuItem eexit = new JMenuItem("Exit");
            eexit.setFont(new Font("monospaced", Font.BOLD, 30));
            ImageIcon eexitImg = new ImageIcon(ClassLoader.getSystemResource("icon/exit.png"));
            Image eexitImage = eexitImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            eexit.setForeground(Color.RED);
            eexit.setIcon(new ImageIcon(eexitImage));
            eexit.addActionListener(this);
            exit.add(eexit);

        if (acctype.equals("Admin")){
            menuBar.add(menu);
        }else {
            menuBar.add(bill);
            menuBar.add(user);
            menuBar.add(info);
        }

        menuBar.add(exit);


        setSize(100,380);
        setLayout(new FlowLayout());
        //setLayout(null);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if (msg.equals("New Customer")) {
            new newCustomer();
        } else if (msg.equals("Customer Details")) {
            new customer_details();
        } else if (msg.equals("Deposit Details")) {
            new deposit_details();
        } else if (msg.equals("Calculate Bill")) {
            new calculate_bill();
        } else if (msg.equals("View Information")) {
            new view_information(meter_pass);
        } else if (msg.equals("Update Information")) {
            new update_information(meter_pass);
        } else if (msg.equals("Bill Details")) {
            new bill_details(meter_pass);
        } else if (msg.equals("Calculator")) {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (msg.equals("Notepad")) {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (msg.equals("Exit")) {
            setVisible(false);
            new Login();
        } else if (msg.equals("Pay Bill")) {
            new pay_bill(meter_pass);
        } else if (msg.equals("Generate Bill")) {
            new generate_bill(meter_pass);
        }
    }


}
