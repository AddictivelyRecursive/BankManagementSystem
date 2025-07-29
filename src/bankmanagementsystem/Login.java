package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login,clear,signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    public Login() {
        setTitle("ATM Panel");
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        // to put the image OR text over the frame JLabel used
        
        JLabel text=new JLabel("ATM Machine");
        text.setFont(new Font("Osward", Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel text2=new JLabel("Card No:");
        text2.setFont(new Font("Osward", Font.BOLD,28));
        text2.setBounds(120,150,400,40);
        add(text2);
        
        cardTextField=new JTextField();
        cardTextField.setFont(new Font("Osward", Font.BOLD,20));
        cardTextField.setBounds(300,160,250,30);
        add(cardTextField);
        
        JLabel text3=new JLabel("PIN:");
        text3.setFont(new Font("Osward", Font.BOLD,28));
        text3.setBounds(120,220,400,40);
        add(text3);
        
        pinTextField=new JPasswordField();
        pinTextField.setFont(new Font("Osward", Font.BOLD,20));
        pinTextField.setBounds(300,230,250,30);
        add(pinTextField);
        
        login=new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup=new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.white);
        
        setSize(800, 480); 
        setVisible(true);
        setLocation(350, 200);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==clear){
            pinTextField.setText("");
            cardTextField.setText("");
        }
        else if(e.getSource()==login){
            
        }
        else if(e.getSource()==signup){
            
        }
    }

    public static void main(String[] args) {
            new Login();
    }
} 