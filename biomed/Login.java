import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame implements ActionListener{
    JButton login;
    JTextField usernameInput;
    JTextField passwordInput;


    public Login(){
            this.setTitle("Login");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(1000, 500);
            this.setBackground(Color.white);
            this.setLocationRelativeTo(null);
            this.setLayout(null);
            this.setResizable(false);
            this.getContentPane().setBackground(Color.black);

            ImageIcon modern = new ImageIcon("modern.jpg");
            ImageIcon resized = resizeImageIcon(modern, 500,500);
            JLabel sideImage = new JLabel(resized);
            sideImage.setBounds(500,0,500,500);

           
            JLabel title = new JLabel("Enter your credentials");
            title.setBounds(50, 50, 350,50);
            title.setForeground(Color.blue);
            title.setFont(new Font("monospace", Font.ITALIC,35));
            
            JLabel username = new JLabel("Username");
            username.setBounds(50, 200, 100,30);
            username.setForeground(Color.red);
            username.setFont(new Font("monospace", Font.ITALIC,20));

            JLabel password = new JLabel("Password");
            password.setBounds(50, 250, 100,30);
            password.setForeground(Color.red);
            password.setFont(new Font("monospace", Font.ITALIC,20));

            usernameInput = new JTextField();
            usernameInput.setBounds(200, 200, 200,30);
            usernameInput.setBackground(Color.white);
            usernameInput.setFont(new Font("monospace", Font.ITALIC,15));

            passwordInput = new JTextField();
            passwordInput.setBounds(200, 250, 200,30);
            passwordInput.setBackground(Color.white);
            passwordInput.setFont(new Font("monospace", Font.ITALIC,15));
            

            login = new JButton("Login");
            login.setBounds(200, 350, 150,60);
            login.setBackground(Color.decode("#3B8F3F"));
            login.setForeground(Color.WHITE);
            login.setFont(new Font(null, Font.BOLD,30));
            login.setFocusable(false);
            login.addActionListener(this);

            this.add(title);
            this.add(username);
            this.add(usernameInput);
            this.add(password);
            this.add(passwordInput);
            this.add(login);
            this.add(sideImage);
            // this.add(title);
            this.setVisible(true);
}
public static ImageIcon resizeImageIcon(ImageIcon originalIcon, int width, int height) {
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
public static void main(String[] args) {
    Login log = new Login();
    
}
@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    if(e.getSource() == login){
        login.setBackground(Color.darkGray);
        String passInput = passwordInput.getText();
        String userInput = usernameInput.getText();
        if(userInput.equals("admin") && passInput.equals("1234")){
            JOptionPane.showMessageDialog(this, "logged in successfully!");
            Home myHome = new Home();
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "incorrect credentials!");
            return;
        }
}
}

}