import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class dialog extends JFrame {
    private JTextField textfield;
    private JButton button1;
    private JPanel JPanel;
    private JLabel label;
    private JTextField textField2;
    private JButton button2;
    private JPasswordField passwordField;
    private JButton button3;
    private JLabel label2;
    private JLabel label3;
    private JLabel labelfinal;
    private JButton clickToCloseButton;

    public dialog() {

        setContentPane(JPanel);
        setTitle("Sign Up");
        setSize(322,379);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        label2.setVisible(false);
        button2.setVisible(false);
        textField2.setVisible(false);
        label3.setVisible(false);
        button3.setVisible(false);
        passwordField.setVisible(false);
        labelfinal.setVisible(false);
        clickToCloseButton.setVisible(false);




        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("name: " + textfield.getText());
                label2.setVisible(true);
                label2.setText("Hi" + " " + textfield.getText() + "! " + "What's your email address?");
                label.setVisible(false);
                textfield.setVisible(false);
                button1.setVisible(false);
                button2.setVisible(true);
                textField2.setVisible(true);


            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("email: " + textField2.getText());
                label3.setVisible(true);
                label3.setText("Type your password here ↓");
                button2.setVisible(false);
                textField2.setVisible(false);
                passwordField.setVisible(true);
                button3.setVisible(true);
                label2.setVisible(false);

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("password: " + passwordField.getText());
                button3.setVisible(false);
                passwordField.setVisible(false);
                label3.setVisible(false);
                labelfinal.setVisible(true);
                labelfinal.setText("Welcome aboard " + textfield.getText());
                clickToCloseButton.setVisible(true);
            }


        });
        clickToCloseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        dialog signupdialog = new dialog();

    }
}
