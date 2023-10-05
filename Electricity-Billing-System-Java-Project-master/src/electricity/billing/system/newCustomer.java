package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class newCustomer extends JFrame implements ActionListener {
    JLabel heading;
    TextField meternumText;
    JLabel customerName;
    JLabel meterNum;
    JLabel address;
    JLabel city;
    JLabel state;
    JLabel email;
    JLabel phone;
    JButton next, cancel;
    TextField nameText, addressText, cityText, stateText ,emailText,phoneText;
    newCustomer(){
        super("New Customer");
        setSize(700,500);
        setLocation(400,200);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(126, 179, 238));
        add(panel);

        heading = new JLabel("New Customer");
        heading.setBounds(180,10,200,20);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(heading);

        customerName = new JLabel("Name");
        customerName.setBounds(50,80,100,20);
        panel.add(customerName);

        nameText = new TextField();
        nameText.setBounds(180,80,150,20);
        panel.add(nameText);

        meterNum = new JLabel("Meter Number");
        meterNum.setBounds(50,120,100,20);
        panel.add(meterNum);

        meternumText = new TextField();
        meternumText.setBounds(180,120,150,20);
        panel.add(meternumText);

        //Random ran = new Random();
        //long number = ran.nextLong() % 1000000;
        //meternumText.setText(""+ Math.abs(number) );

        address = new JLabel("Address ");
        address.setBounds(50,160,100,20);
        panel.add(address);

        addressText = new TextField();
        addressText.setBounds(180,160,150,20);
        panel.add(addressText);

        city = new JLabel("City ");
        city.setBounds(50,200,100,20);
        panel.add(city);

        cityText = new TextField();
        cityText.setBounds(180,200,150,20);
        panel.add(cityText);

        state = new JLabel("Zone");
        state.setBounds(50,240,100,20);
        panel.add(state);

        stateText = new TextField();
        stateText.setBounds(180,240,150,20);
        panel.add(stateText);

        email = new JLabel("Email ");
        email.setBounds(50,280,100,20);
        panel.add(email);

        emailText = new TextField();
        emailText.setBounds(180,280,150,20);
        panel.add(emailText);


        phone = new JLabel("Phone ");
        phone.setBounds(50,320,100,20);
        panel.add(phone);

        phoneText = new TextField();
        phoneText.setBounds(180,320,150,20);
        panel.add(phoneText);

        next = new JButton("Next");
        next.setBounds(120,390,100,25);
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        panel.add(next);

        cancel = new JButton("Cancel");
        cancel.setBounds(230,390,100,25);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        panel.add(cancel);

        setLayout(new BorderLayout());
        add(panel,"Center");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/boy.png"));
        Image i2 = i1.getImage().getScaledInstance(230,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imgLable = new JLabel(i3);
        add(imgLable,"West");

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==next){
            String sname = nameText.getText();
            String smeter = meternumText.getText();
            String saddress = addressText.getText();
            String scity = cityText.getText();
            String sstate = stateText.getText();
            String eemail = emailText.getText();
            String sphone = phoneText.getText();



            //String query_signup = "insert into Signup values('"+smeter+"','','"+sname+"','','')";

            try{
                database c = new database();
                if  (sname.matches("(?=.*[a-z0-9]+$).{2,8}$") && scity.matches("(?=.*[a-zA-Z]+$).{2,12}$") && smeter.matches("(?=.*[0-9]+$).{2,11}$") && sstate.matches("(?=.*[a-zA-Z]+$).{2,12}$")&& eemail.matches("^[a-z0-9+_.]+@[a-z0-9.]+$")  && sphone.matches("(?=01.*[0-9]+$).{11}$") && saddress.matches("(?=.*[a-zA-Z1-9/-]+$).{2,20}$"))
                {
                    String query_customer = "insert into new_customer values('"+sname+"','"+smeter+"','"+saddress+"','"+scity+"','"+sstate+"','"+eemail+"','"+sphone+"')";
                    c.statement.executeUpdate(query_customer);
                    //c.statement.executeUpdate(query_signup);

                    JOptionPane.showMessageDialog(null, "Customer details added successfully");
                    setVisible(false);
                    new meterInfo(smeter);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Input Format ! ");

                }

                if  (sname.matches("(?=.*[a-z0-9]+$).{2,8}$"))
                {}
                else
                {
                    JOptionPane.showMessageDialog(null, "Name must contain 2 to 8 small letters,numbers ");
                }
                if  (scity.matches("(?=.*[a-zA-Z]+$).{2,12}$"))
                {}
                else
                {
                    JOptionPane.showMessageDialog(null, "City must contain 2 to 12 Capital/small letters ");
                }
                if  (smeter.matches("(?=.*[0-9]+$).{2,11}$"))
                {}
                else
                {
                    JOptionPane.showMessageDialog(null, "Meter number must contain 2 to 11 numbers ");
                }
                if  (sstate.matches("(?=.*[a-zA-Z]+$).{2,12}$"))
                {}
                else
                {
                    JOptionPane.showMessageDialog(null, "Zone  must contain 2 to 12 letters ");
                }
                if  (sphone.matches("(?=01.*[0-9]+$).{11}$"))
                {}
                else
                {
                    JOptionPane.showMessageDialog(null, "Number must start with 01 and contain 11 Digits");
                }
                if  (eemail.matches("^[a-z0-9+_.]+@[a-z0-9.]+$"))
                {}
                else
                {
                    JOptionPane.showMessageDialog(null, "Not a valid Email address");
                }

                }



            catch (SQLException ex) {
                //throw new RuntimeException(ex);
                JOptionPane.showMessageDialog(null, "Meter Number Duplication is not allowed ");
            }
        }
        }



    public static void main(String[] args) {
         new newCustomer();
    }
}
