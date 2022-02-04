package BasicPrograms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpForm extends Frame implements ActionListener {
    TextField nameText;
    TextField addressText;
    TextField emailText;
    TextField phNo;
    TextField passcode;
    SignUpForm(){
        //Frame Settings
        setTitle("SignInPage");
        setSize(800,800);
        setLayout(null);
        setVisible(true);

        //Name Label
        Label name = new Label();
        name.setBounds(100,100,50,50);
        name.setText("Name :");
        add(name);

        //TextField corresponding to name
        nameText = new TextField();
        nameText.setBounds(300,115,300,20);
        add(nameText);

        //Address Label
        Label Address = new Label();
        Address.setBounds(100,200,50,50);
        Address.setText("Address :");
        add(Address);

        //TextField corresponding to address
        addressText = new TextField();
        addressText.setBounds(300,215,300,20);
        add(addressText);

        //Email Label
        Label email = new Label();
        email.setBounds(100,300,50,50);
        email.setText("Email :");
        add(email);

        //TextField corresponding to address
        emailText = new TextField();
        emailText.setBounds(300,315,300,20);
        add(emailText);

        //Email Label
        Label phone = new Label();
        phone.setBounds(100,400,50,50);
        phone.setText("Phone :");
        add(phone);

        //TextField corresponding to address
        phNo = new TextField();
        phNo.setBounds(300,415,300,20);
        add(phNo);

        //Password Label
        Label password = new Label();
        password.setBounds(100,500,50,50);
        password.setText("Password :");
        add(password);

        //TextField corresponding to address
        passcode = new TextField();
        passcode.setBounds(300,515,300,20);
        add(passcode);

        //Button
        Button button = new Button("Sign In");
        button.setBounds(300,700,100,25);
        add(button);
        button.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e) {
        System.out.println(nameText.getText());
        System.out.println(addressText.getText());
        System.out.println(emailText.getText());
        System.out.println(phNo.getText());

    }
    public static void main (String [] args){
        new SignUpForm();

    }
}
