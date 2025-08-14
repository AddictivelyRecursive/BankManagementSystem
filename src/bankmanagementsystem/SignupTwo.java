package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton scYes, scNo, eaYes, eaNo;
    JComboBox religionBox, categoryBox, incomeBox, educationBox, occupationBox;
    String formno;
    
    SignupTwo(String formno) {
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        setLayout(null);
        
        JLabel formLabel = new JLabel("Form No: " + formno);
        formLabel.setFont(new Font("Raleway", Font.BOLD, 14));
        formLabel.setBounds(700, 10, 200, 30);
        add(formLabel);
        
        JLabel pageLabel = new JLabel("Page 2: Additional Details");
        pageLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        pageLabel.setBounds(280, 30, 400, 40);
        add(pageLabel);
        
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 18));
        religion.setBounds(100, 120, 150, 30);
        add(religion);
        
        String[] religionValues = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religionBox = new JComboBox(religionValues);
        religionBox.setFont(new Font("Raleway", Font.BOLD, 14));
        religionBox.setBackground(Color.WHITE);
        religionBox.setBounds(350, 120, 320, 30);
        add(religionBox);
        
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 18));
        category.setBounds(100, 170, 150, 30);
        add(category);
        
        String[] categoryValues = {"General", "OBC", "SC", "ST", "Other"};
        categoryBox = new JComboBox(categoryValues);
        categoryBox.setFont(new Font("Raleway", Font.BOLD, 14));
        categoryBox.setBackground(Color.WHITE);
        categoryBox.setBounds(350, 170, 320, 30);
        add(categoryBox);
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 18));
        income.setBounds(100, 220, 150, 30);
        add(income);
        
        String[] incomeValues = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000"};
        incomeBox = new JComboBox(incomeValues);
        incomeBox.setFont(new Font("Raleway", Font.BOLD, 14));
        incomeBox.setBackground(Color.WHITE);
        incomeBox.setBounds(350, 220, 320, 30);
        add(incomeBox);
        
        JLabel education = new JLabel("Educational Qualification:");
        education.setFont(new Font("Raleway", Font.BOLD, 18));
        education.setBounds(100, 270, 250, 30);
        add(education);
        
        String[] educationValues = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        educationBox = new JComboBox(educationValues);
        educationBox.setFont(new Font("Raleway", Font.BOLD, 14));
        educationBox.setBackground(Color.WHITE);
        educationBox.setBounds(350, 270, 320, 30);
        add(educationBox);
        
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 18));
        occupation.setBounds(100, 340, 150, 30);
        add(occupation);
        
        String[] occupationValues = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupationBox = new JComboBox(occupationValues);
        occupationBox.setFont(new Font("Raleway", Font.BOLD, 14));
        occupationBox.setBackground(Color.WHITE);
        occupationBox.setBounds(350, 340, 320, 30);
        add(occupationBox);
        
        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 18));
        pan.setBounds(100, 390, 180, 30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(350, 390, 320, 30);
        add(panTextField);
        
        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 18));
        aadhar.setBounds(100, 440, 180, 30);
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(350, 440, 320, 30);
        add(aadharTextField);
        
        JLabel scitizen = new JLabel("Senior Citizen:");
        scitizen.setFont(new Font("Raleway", Font.BOLD, 18));
        scitizen.setBounds(100, 490, 180, 30);
        add(scitizen);
        
        scYes = new JRadioButton("Yes");
        scYes.setFont(new Font("Raleway", Font.BOLD, 14));
        scYes.setBackground(Color.WHITE);
        scYes.setBounds(350, 490, 100, 30);
        add(scYes);
        
        scNo = new JRadioButton("No");
        scNo.setFont(new Font("Raleway", Font.BOLD, 14));
        scNo.setBackground(Color.WHITE);
        scNo.setBounds(460, 490, 100, 30);
        add(scNo);
        
        ButtonGroup scitizenGroup = new ButtonGroup();
        scitizenGroup.add(scYes);
        scitizenGroup.add(scNo);
        
        JLabel eaccount = new JLabel("Existing Account:");
        eaccount.setFont(new Font("Raleway", Font.BOLD, 18));
        eaccount.setBounds(100, 540, 180, 30);
        add(eaccount);
        
        eaYes = new JRadioButton("Yes");
        eaYes.setFont(new Font("Raleway", Font.BOLD, 14));
        eaYes.setBackground(Color.WHITE);
        eaYes.setBounds(350, 540, 100, 30);
        add(eaYes);
        
        eaNo = new JRadioButton("No");
        eaNo.setFont(new Font("Raleway", Font.BOLD, 14));
        eaNo.setBackground(Color.WHITE);
        eaNo.setBounds(460, 540, 100, 30);
        add(eaNo);
        
        ButtonGroup eaccountGroup = new ButtonGroup();
        eaccountGroup.add(eaYes);
        eaccountGroup.add(eaNo);
        
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(570, 640, 100, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 750);
        setLocation(500, 120);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String religion = (String) religionBox.getSelectedItem();
        String category = (String) categoryBox.getSelectedItem();
        String income = (String) incomeBox.getSelectedItem();
        String education = (String) educationBox.getSelectedItem();
        String occupation = (String) occupationBox.getSelectedItem();

        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();

        String seniorcitizen = scYes.isSelected() ? "Yes" : scNo.isSelected() ? "No" : "";
        String existingaccount = eaYes.isSelected() ? "Yes" : eaNo.isSelected() ? "No" : "";
    
        try {
            if (pan.equals("")) {
                JOptionPane.showMessageDialog(null, "PAN Number is required");
            } else if (aadhar.equals("")) {
                JOptionPane.showMessageDialog(null, "Aadhar Number is required");
            } else if (seniorcitizen.equals("")) {
                JOptionPane.showMessageDialog(null, "Select Senior Citizen status");
            } else if (existingaccount.equals("")) {
                JOptionPane.showMessageDialog(null, "Select Existing Account status");
            } else {
                Conn c1 = new Conn();
                String q1 = "insert into signuptwo(formno, religion, category, income, education, occupation, pan, aadhar, seniorcitizen, existingaccount) "
                      + "values('" + formno + "','" + religion + "','" + category + "','" + income + "','" 
                      + education + "','" + occupation + "','" + pan + "','" + aadhar + "','" 
                      + seniorcitizen + "','" + existingaccount + "')";
                c1.s.executeUpdate(q1);

                new SignupThree(formno).setVisible(true);
                setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new SignupTwo("").setVisible(true);
    }
}