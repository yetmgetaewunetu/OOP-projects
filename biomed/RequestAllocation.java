import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class RequestAllocation extends JFrame implements ActionListener{
        JTextField AssetNameInput2;
        JTextField AssetConditionInput2;
        JTextField AssetTypeInput2;
        JTextField AssetLocationInput2;
        JButton request, backButton;
    public RequestAllocation(){
        this.setTitle("Request Allocation Form");
        this.setLayout(null);
        this.setSize(1200,700);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ImageIcon requestImg = new ImageIcon("request.jpg");
        ImageIcon rqimg = resizeImageIcon(requestImg, 600,700);
        JLabel imgPanel = new JLabel(rqimg);
        imgPanel.setBounds(600,0,600,700);
        this.add(imgPanel);

        JPanel AllocationPanel = new JPanel();
        
        AllocationPanel.setPreferredSize(new Dimension(600, 700));
        AllocationPanel.setBackground(Color.lightGray);
        AllocationPanel.setBounds(0,0,600,700);
        JLabel title3 = new JLabel("Allocation Request Form");
        title3.setBounds(130, 10, 400, 40);
        title3.setFont(new Font("monospace", Font.BOLD, 32));
        title3.setForeground(Color.blue);
       
        AllocationPanel.add(title3);

        AllocationPanel.setLayout(null);
        JLabel AssetName2 = new JLabel("Asset Name");
        AssetName2.setBounds(50, 100, 100, 50);
        AssetName2.setFont(new Font("sans serif", Font.PLAIN, 15));
        JLabel AssetLocation2 = new JLabel("Location");
        AssetLocation2.setBounds(50, 180, 70, 50);
        AssetLocation2.setFont(new Font("sans serif", Font.PLAIN, 15));
        JLabel AssetType2 = new JLabel("Type");
        AssetType2.setBounds(50, 260, 70, 50);
        AssetType2.setFont(new Font("sans serif", Font.PLAIN, 15));
        JLabel AssetCondition2 = new JLabel("Condition");
        AssetCondition2.setBounds(50, 340, 70, 50);
        AssetCondition2.setFont(new Font("sans serif", Font.PLAIN, 15));
        AssetNameInput2 = new JTextField();
        AssetNameInput2.setBorder(new LineBorder(Color.black, 1));
        AssetNameInput2.setBounds(200, 100, 300, 50);
        AssetNameInput2.setFont(new Font("monospace", Font.PLAIN, 18));
        AssetLocationInput2 = new JTextField();
        AssetLocationInput2.setBorder(new LineBorder(Color.black, 1));
        AssetLocationInput2.setBounds(200, 180, 300, 50);
        AssetLocationInput2.setFont(new Font("monospace", Font.PLAIN, 18));
        AssetTypeInput2 = new JTextField();
        AssetTypeInput2.setBorder(new LineBorder(Color.black, 1));
        AssetTypeInput2.setBounds(200, 260, 300, 50);
        AssetTypeInput2.setFont(new Font("monospace", Font.PLAIN, 18));
        AssetConditionInput2 = new JTextField();
        AssetConditionInput2.setBorder(new LineBorder(Color.black, 1));
        AssetConditionInput2.setBounds(200, 340, 300, 50);
        AssetConditionInput2.setFont(new Font("monospace", Font.PLAIN, 18));
        request = new JButton("Request Allocation");
       
        request.setBounds(150, 500, 350, 60);
        request.setBackground(Color.decode("#3B8F3F"));
        request.setForeground(Color.white);
        request.setFocusable(false);
        request.setFont(new Font("monospace",Font.BOLD, 30));
        request.addActionListener(this);

        backButton = new JButton("Back");
        backButton.setBounds(280, 560, 100, 30);
        backButton.setBackground(Color.blue);
        backButton.setForeground(Color.white);
        backButton.setFont(new Font(null, Font.BOLD, 20));
        backButton.setFocusable(false);
        backButton.addActionListener(this);


        AllocationPanel.add(AssetName2);
        AllocationPanel.add(AssetLocation2);
        AllocationPanel.add(AssetType2);
        AllocationPanel.add(AssetCondition2);
        AllocationPanel.add(AssetNameInput2);
        AllocationPanel.add(AssetLocationInput2);
        AllocationPanel.add(AssetTypeInput2);
        AllocationPanel.add(AssetConditionInput2);
        AllocationPanel.add(request);
        AllocationPanel.add(backButton);
        this.add(AllocationPanel);
        this.setVisible(true);
    }
    public static ImageIcon resizeImageIcon(ImageIcon originalIcon, int width, int height) {
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
    public static void main(String[] args) {
        RequestAllocation rq = new RequestAllocation();
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == backButton){
            Home home = new Home();
            this.dispose();
        }
        if(e.getSource() == request){
            String name = AssetNameInput2.getText();
            String location = AssetLocationInput2.getText();
            String type = AssetTypeInput2.getText();
            String condition = AssetConditionInput2.getText();
            if(name.isEmpty() || location.isEmpty() || type.isEmpty() || condition.isEmpty()){
                JOptionPane.showMessageDialog(this, "Enter all details properly!");
            }else{
                try  {
                    FileWriter writer = new FileWriter("request.csv", true);
                    BufferedWriter buffer = new BufferedWriter(writer);
                    buffer.write(name + "," + type + "," + location + "," + condition + "\n");
                    buffer.flush();
                    JOptionPane.showMessageDialog(this, "Your request added to the queue!");
                    AssetConditionInput2.setText("");
                    AssetLocationInput2.setText("");
                    AssetNameInput2.setText("");
                    AssetTypeInput2.setText("");
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
