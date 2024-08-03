import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AddAsset extends JFrame implements ActionListener{
    JTextField AssetNameInput1;
    JTextField AssetConditionInput1;
    JTextField AssetTypeInput1;
    JTextField AssetLocationInput1;
    JButton addButton, backButton;
    public AddAsset(){
        this.setTitle("Add Asset Page");
        this.setLayout(null);
        this.setSize(1200,700);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon addImg = new ImageIcon("add.png");
        ImageIcon addimg = resizeImageIcon(addImg,600,700);
        JLabel imgLabel = new JLabel(addimg);
        imgLabel.setBounds(600,0,600,700);
        this.add(imgLabel);

        JPanel addPanel = new JPanel();
        addPanel.setPreferredSize(new Dimension(600, 700));
        addPanel.setBackground(Color.WHITE);
        addPanel.setLayout(null);
        addPanel.setBounds(0,0,600,700);


        JLabel title1 = new JLabel("ADD ASSETS");
        title1.setBounds(100, 10, 300, 40);
        title1.setFont(new Font("monospace", Font.BOLD, 28));
        title1.setForeground(Color.BLUE);
        addPanel.add(title1);

        JLabel AssetName1 = new JLabel("Asset Name");
        AssetName1.setBounds(50, 100, 100, 50);
        AssetName1.setFont(new Font("sans serif", Font.PLAIN, 15));
       
        JLabel AssetLocation1 = new JLabel("Location");
        AssetLocation1.setBounds(50, 180, 70, 50);
        AssetLocation1.setFont(new Font("sans serif", Font.PLAIN, 15));
       
        JLabel AssetType1 = new JLabel("Type");
        AssetType1.setBounds(50, 260, 70, 50);
        AssetType1.setFont(new Font("sans serif", Font.PLAIN, 15));
        
        JLabel AssetCondition1 = new JLabel("Condition");
        AssetCondition1.setBounds(50, 340, 70, 50);
        AssetCondition1.setFont(new Font("sans serif", Font.PLAIN, 15));
        
        AssetNameInput1 = new JTextField();
        AssetNameInput1.setBounds(200, 100, 300, 50);
        AssetNameInput1.setFont(new Font("monospace", Font.PLAIN, 18));
        
        AssetLocationInput1 = new JTextField();
        AssetLocationInput1.setBounds(200, 180, 300, 50);
        AssetLocationInput1.setFont(new Font("monospace", Font.PLAIN, 18));
       
        AssetTypeInput1 = new JTextField();
        AssetTypeInput1.setBounds(200, 260, 300, 50);
        AssetTypeInput1.setFont(new Font("monospace", Font.PLAIN, 18));
        
        AssetConditionInput1 = new JTextField();
        AssetConditionInput1.setBounds(200, 340, 300, 50);
        AssetConditionInput1.setFont(new Font("monospace", Font.PLAIN, 18));
        
        
        addButton = new JButton("Add Asset");
        addButton.setBounds(175, 500, 300, 60);
        addButton.setBackground(Color.decode("#3B8F3F"));
        addButton.setForeground(Color.white);
        addButton.setFocusable(false);
        addButton.setFont(new Font("monospace",Font.BOLD, 25));
        addButton.setBorder(new LineBorder(Color.black, 1) );
        addButton.addActionListener(this);

        backButton = new JButton("Back");
        backButton.setBounds(280, 560, 100, 30);
        backButton.setBackground(Color.blue);
        backButton.setForeground(Color.white);
        backButton.setFont(new Font(null, Font.BOLD, 20));
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        addPanel.add(AssetName1);
        addPanel.add(AssetLocation1);
        addPanel.add(AssetType1);
        addPanel.add(AssetCondition1);
        addPanel.add(AssetNameInput1);
        addPanel.add(AssetLocationInput1);
        addPanel.add(AssetTypeInput1);
        addPanel.add(AssetConditionInput1);
        addPanel.add(addButton);
        addPanel.add(backButton);


        this.add(addPanel);

       
       
        
        this.setVisible(true);
    }
    public static ImageIcon resizeImageIcon(ImageIcon originalIcon, int width, int height) {
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
    public static void main(String[] args) {
        AddAsset main = new AddAsset();
      
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == backButton){
            Home home = new Home();
            this.dispose();
        }
        if(e.getSource() == addButton){
            String name = AssetNameInput1.getText();
            String location = AssetLocationInput1.getText();
            String type = AssetTypeInput1.getText();
            String condition = AssetConditionInput1.getText();
            if(name.isEmpty() || location.isEmpty() || type.isEmpty() || condition.isEmpty()){
                JOptionPane.showMessageDialog(this, "Enter all details properly!");
            }else{
                try  {
                    FileWriter writer = new FileWriter("assets.csv", true);
                    BufferedWriter buffer = new BufferedWriter(writer);
                    buffer.write(name + "," + type  + "," + location + "," + condition + "\n");
                    buffer.flush();
                    JOptionPane.showMessageDialog(this, "Asset Added to record successfully!");
                    
                    Home home = new Home();
                    this.dispose();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }

            
        }
    }
    
}
