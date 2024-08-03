import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Sofa extends JFrame implements ActionListener{
    Resizer resizer = new Resizer();
    JButton p1,p2,p3,p4,p5,p6, home;
    public Sofa(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700, 800);
        this.setTitle("Sofa");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        JPanel pan1, pan2,pan3,pan4, pan5, pan6;
        
        home = new JButton("HOME");
        home.setForeground(Color.decode("#03a9fc"));
        home.setBackground(Color.white);
        home.setFont(new Font("Monospace", Font.BOLD, 40));
        home.setFocusable(false);
        home.setBorder(null);
        home.setPreferredSize(new Dimension(500,100));
        home.addActionListener(this);
        home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        
    

        JPanel sofaPanel = new JPanel();
        sofaPanel.setSize(1000,800);
        sofaPanel.setBackground(Color.white);
        JScrollPane scroll = new JScrollPane(sofaPanel);
        scroll.setBounds(0,100,1500,700);
        sofaPanel.setLayout(new BoxLayout(sofaPanel, BoxLayout.Y_AXIS));
        JScrollBar verticalScrollBar = scroll.getVerticalScrollBar();
        verticalScrollBar.setUnitIncrement(16); // Adjust this value to increase/decrease the scroll speed
        verticalScrollBar.setBlockIncrement(80);
        
        
       
        ImageIcon sofa1 = resizer.resizeImageIcon(new ImageIcon("sofa.jpg"), 700, 500);
        String S1 = "<html> Price --> $500 <br>made from--> pure wood <br>made in --> china</html>";
        JLabel sofaLabel1 = new JLabel(S1, sofa1, JLabel.CENTER);
        sofaLabel1.setSize(300, 600);
        sofaLabel1.setVerticalTextPosition(JLabel.BOTTOM);
        sofaLabel1.setHorizontalTextPosition(JLabel.CENTER);
        sofaLabel1.setBackground(Color.decode("#25BE63"));
        sofaLabel1.setOpaque(true);
        sofaLabel1.setForeground(Color.white);
        sofaLabel1.setFont(new Font("SANS", Font.BOLD, 18));
        sofaLabel1.setBounds(0,0,300,600);
        p1 = new JButton("purchase");
        p1.setBackground(Color.white);
        p1.setForeground(Color.blue);
        p1.setFont(new Font(null, Font.BOLD, 40));
        p1.setBounds(100,600, 100,100);
        p1.setFocusable(false);
        p1.setBorder(null);
        p1.addActionListener(this);
        p1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
        
        
        ImageIcon sofa2 = resizer.resizeImageIcon(new ImageIcon("sofa2.jpg"), 700, 500);
        String S2 = "<html> Price --> $500 <br>made from--> pure wood & comfy cushions<br>made in --> china</html>";
        JLabel sofaLabel2 = new JLabel(S2, sofa2, JLabel.CENTER);
        sofaLabel2.setSize(300, 600);
        sofaLabel2.setVerticalTextPosition(JLabel.BOTTOM);
        sofaLabel2.setHorizontalTextPosition(JLabel.CENTER);
        sofaLabel2.setBackground(Color.decode("#25BE63"));
        sofaLabel2.setOpaque(true);
        sofaLabel2.setForeground(Color.white);
        sofaLabel2.setFont(new Font("SANS", Font.BOLD, 18));
        p2 = new JButton("purchase");
        p2.setBackground(Color.white);
        p2.setForeground(Color.blue);
        p2.setFont(new Font(null, Font.BOLD, 40));
        p2.setBounds(100,600, 100,100);
        p2.setFocusable(false);
        p2.setBorder(null);
        p2.addActionListener(this);
        p2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        

        ImageIcon sofa3 = resizer.resizeImageIcon(new ImageIcon("sofa3.jpg"), 700, 500);
        String S3 = "<html> Price --> $500 <br>made from--> pure wood & comfy cushions<br>made in --> china</html>";
        JLabel sofaLabel3 = new JLabel(S3, sofa3, JLabel.CENTER);
        sofaLabel3.setSize(300, 600);
        sofaLabel3.setVerticalTextPosition(JLabel.BOTTOM);
        sofaLabel3.setHorizontalTextPosition(JLabel.CENTER);
        sofaLabel3.setBackground(Color.decode("#25BE63"));
        sofaLabel3.setOpaque(true);
        sofaLabel3.setForeground(Color.white);
        sofaLabel3.setFont(new Font("SANS", Font.BOLD, 18));
        p3 = new JButton("purchase");
        p3.setBackground(Color.white);
        p3.setForeground(Color.blue);
        p3.setFont(new Font(null, Font.BOLD, 40));
        p3.setBounds(100,600, 100,100);
        p3.setFocusable(false);
        p3.setBorder(null);
        p3.addActionListener(this);
        p3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        

        ImageIcon sofa4 = resizer.resizeImageIcon(new ImageIcon("sofa4.jpg"), 700, 500);
        String S4 = "<html> Price --> $500 <br>made from--> pure wood & comfy cushions<br>made in --> china</html>";
        JLabel sofaLabel4 = new JLabel(S4, sofa4, JLabel.CENTER);
        sofaLabel4.setSize(300, 600);
        sofaLabel4.setVerticalTextPosition(JLabel.BOTTOM);
        sofaLabel4.setHorizontalTextPosition(JLabel.CENTER);
        sofaLabel4.setBackground(Color.decode("#25BE63"));
        sofaLabel4.setOpaque(true);
        sofaLabel4.setForeground(Color.white);
        sofaLabel4.setFont(new Font("SANS", Font.BOLD, 18));
        p4 = new JButton("purchase");
        p4.setBackground(Color.white);
        p4.setForeground(Color.blue);
        p4.setFont(new Font(null, Font.BOLD, 40));
        p4.setBounds(100,600, 100,100);
        p4.setFocusable(false);
        p4.setBorder(null);
        p4.addActionListener(this);
        p4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        

        ImageIcon sofa5 = resizer.resizeImageIcon(new ImageIcon("sofa5.jpg"), 700, 500);
        String S5 = "<html> Price --> $500 <br>made from--> pure wood & comfy cushions<br>made in --> china</html>";
        JLabel sofaLabel5 = new JLabel(S5, sofa5, JLabel.CENTER);
        sofaLabel5.setSize(300, 600);
        sofaLabel5.setVerticalTextPosition(JLabel.BOTTOM);
        sofaLabel5.setHorizontalTextPosition(JLabel.CENTER);
        sofaLabel5.setBackground(Color.decode("#25BE63"));
        sofaLabel5.setOpaque(true);
        sofaLabel5.setForeground(Color.white);
        sofaLabel5.setFont(new Font("SANS", Font.BOLD, 18));
        p5 = new JButton("purchase");
        p5.setBackground(Color.white);
        p5.setForeground(Color.blue);
        p5.setFont(new Font(null, Font.BOLD, 40));
        p5.setBounds(100,600, 100,100);
        p5.setFocusable(false);
        p5.setBorder(null);
        p5.addActionListener(this);
        p5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        

        ImageIcon sofa6 = resizer.resizeImageIcon(new ImageIcon("sofa6.jpg"), 700, 500);
        String S6= "<html> Price --> $500 <br>made from--> pure wood & comfy cushions<br>made in --> china</html>";
        JLabel sofaLabel6 = new JLabel(S6, sofa6, JLabel.CENTER);
        sofaLabel6.setSize(300, 600);
        sofaLabel6.setVerticalTextPosition(JLabel.BOTTOM);
        sofaLabel6.setHorizontalTextPosition(JLabel.CENTER);
        sofaLabel6.setBackground(Color.decode("#25BE63"));
        sofaLabel6.setOpaque(true);
        sofaLabel6.setForeground(Color.white);
        sofaLabel6.setFont(new Font("SANS", Font.BOLD, 18));
        p6 = new JButton("purchase");
        p6.setBackground(Color.white);
        p6.setForeground(Color.blue);
        p6.setFont(new Font(null, Font.BOLD, 40));
        // p6.setBounds(100,600, 100,100);
        p6.setPreferredSize(new Dimension(400, 100));
        p6.setFocusable(false);
        p6.setBorder(null);
        p6.addActionListener(this);
        p6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        

        











        sofaPanel.add(home);
        sofaPanel.add(sofaLabel1);
        sofaPanel.add(p1);
        sofaPanel.add(sofaLabel2);
        sofaPanel.add(p2);
        sofaPanel.add(sofaLabel3);
        sofaPanel.add(p3);
        sofaPanel.add(sofaLabel4);
        sofaPanel.add(p4);
        sofaPanel.add(sofaLabel5);
        sofaPanel.add(p5);
        sofaPanel.add(sofaLabel6);
        sofaPanel.add(p6);
      
        this.add(scroll);
        
        this.setVisible(true);
}
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == home){
            Main main = new Main();
            this.dispose();
        }
        if (e.getSource() == p1){
            int response = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to proceed?",
            "Confirm",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        // Check the user's response
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Item purchased successfully! \n you spent your money on the right place:)");
            p1.setEnabled(false);
            writer();
        } 
            
            
        }
        if (e.getSource() == p2){
            int response = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to proceed?",
            "Confirm",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        // Check the user's response
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Item purchased successfully! \n you spent your money on the right place:)");
            p2.setEnabled(false);
            writer();
        } 
           
        }
        if (e.getSource() == p3){
            int response = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to proceed?",
            "Confirm",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        // Check the user's response
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Item purchased successfully! \n you spent your money on the right place:)");
            p3.setEnabled(false);
            writer();
        } 
            
        }
        if (e.getSource() == p4){
            int response = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to proceed?",
            "Confirm",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        // Check the user's response
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Item purchased successfully! \n you spent your money on the right place:)");
        
            writer();
            p4.setEnabled(false);
        }
        }
        if (e.getSource() == p5){
            int response = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to proceed?",
            "Confirm",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        // Check the user's response
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Item purchased successfully! \n you spent your money on the right place:)");
        
           writer();
            p5.setEnabled(false);
        }
        }
        if (e.getSource() == p6){
            int response = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to proceed?",
            "Confirm",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        // Check the user's response
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Item purchased successfully! \n you spent your money on the right place:)");
            writer();
           p6.setEnabled(false);
        }
    }
    }
    public void writer(){
        try{
                    FileWriter writer = new FileWriter("transactions.csv", true);
                    BufferedWriter buffer = new BufferedWriter(writer);
                    buffer.write("Sofa" + "," + "500" + "," +   "1" + "\n");
                    buffer.flush();
                    
    }
    catch(IOException e){
                
    }
}
    public static void main(String[] args) {
        Sofa sofa = new Sofa();

    }
}
