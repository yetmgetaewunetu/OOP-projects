import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener{
    JButton addAsset, requestAllocation, viewAssets, AllocationHistory, logout;
    public Home(){
        this.setTitle("Home Page");
        this.setLayout(new FlowLayout());
        this.setSize(1200, 700);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel homePanel = new JPanel();
        homePanel.setBackground(Color.white);
        homePanel.setForeground(Color.black);
        homePanel.setPreferredSize(new Dimension(1200, 700));
        homePanel.setOpaque(true);
        homePanel.setLayout(null);


        JLabel title = new JLabel("HOSPITAL RESOURCE MANAGEMENT PLATFORM");
        title.setBounds(50, 20, 1200, 50);
        title.setFont(new Font("MONOSPACED", Font.BOLD, 35));
        title.setForeground(Color.blue);
        title.setVerticalTextPosition(JLabel.TOP);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setIconTextGap(20);
        
        ImageIcon img = new ImageIcon("assets.png");
        ImageIcon resized = resizeImageIcon(img, 300, 300);
        JLabel image = new JLabel(resized);
        image.setBounds(120, 120, 300,300);
        // image.setLocation(50, 150);

        ImageIcon micro = new ImageIcon("micro.jpg");
        ImageIcon microim = resizeImageIcon(micro, 300, 300);
        JLabel microimg = new JLabel(microim);
        microimg.setBounds(450,120,300,300);
        // microimg.setLocation(360, 150);
        ImageIcon surgery = new ImageIcon("surgery.jpg");
        ImageIcon sugeryre = resizeImageIcon(surgery, 300, 300);
        JLabel surgerim = new JLabel(sugeryre);
        surgerim.setBounds(780, 120, 300,300);

        addAsset = new JButton("Add Assets");
        addAsset.setBackground(Color.blue);
        addAsset.setBounds(250, 450, 400, 60);
        addAsset.setFont(new Font("monospace",Font.BOLD, 40));
        addAsset.setForeground(Color.white);
        addAsset.setFocusable(false);
        addAsset.addActionListener(this);

        requestAllocation = new JButton("Request Allocation");
        requestAllocation.setBackground(Color.decode("#3B8F3F"));
        requestAllocation.setBounds(700, 450, 400, 60);
        requestAllocation.setFont(new Font("monospace",Font.BOLD, 40));
        requestAllocation.setForeground(Color.white);
        requestAllocation.setFocusable(false);
        requestAllocation.addActionListener(this);

        viewAssets = new JButton("View Assets");
        viewAssets.setBackground(Color.blue);
        viewAssets.setBounds(250, 520, 400, 60);
        viewAssets.setFont(new Font("monospace",Font.BOLD, 40));
        viewAssets.setForeground(Color.white);
        viewAssets.setFocusable(false);
        viewAssets.addActionListener(this);

        AllocationHistory = new JButton("Allocation Requests");
        AllocationHistory.setBackground(Color.decode("#3B8F3F"));
        AllocationHistory.setBounds(700, 520, 400, 60);
        AllocationHistory.setFont(new Font("monospace",Font.BOLD, 37));
        AllocationHistory.setForeground(Color.white);
        AllocationHistory.setFocusable(false);
        AllocationHistory.addActionListener(this);

        logout = new JButton("Logout");
        logout.setBounds(0, 720, 100, 40);
        logout.setBackground(Color.white);
        logout.setForeground(Color.blue);
        logout.setFocusable(false);
        logout.addActionListener(this);

        homePanel.add(title);
        homePanel.add(image);
        homePanel.add(microimg);
        homePanel.add(surgerim);
        homePanel.add(addAsset);
        homePanel.add(requestAllocation);
        homePanel.add(viewAssets);
        homePanel.add(AllocationHistory);
        homePanel.add(logout);
        this.add(homePanel);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        Home home = new Home();

    }
    public static ImageIcon resizeImageIcon(ImageIcon originalIcon, int width, int height) {
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
    JPanel imgPanel;

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == addAsset){
            AddAsset addAsset = new AddAsset();
            this.dispose();
        }
        if (e.getSource() == requestAllocation){
            RequestAllocation requestAllocation = new RequestAllocation();
            this.dispose();
        }
        if (e.getSource() == viewAssets){
            AssetManager assetManager = new AssetManager();
            this.dispose();
        }
        if(e.getSource() == AllocationHistory){
            AllocationHistory allocationHistory = new AllocationHistory();
            this.dispose();
        }
        if (e.getSource() == logout){
            Login login = new Login();
            this.dispose();
        }
    }
}



class BackgroundImagePanel extends JPanel {
    private Image backgroundImage;

    // Constructor to load the image
    public BackgroundImagePanel(String imagePath) {
        // Load the background image
        backgroundImage = new ImageIcon(imagePath).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the background image
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }

    public static void main(String[] args) {
        // Create a JFrame to test the BackgroundImagePanel
        JFrame frame = new JFrame("Background Image Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an instance of BackgroundImagePanel with the path to the image
        BackgroundImagePanel backgroundPanel = new BackgroundImagePanel("path/to/your/image.jpg");

        // Set the layout and add components to the panel
        backgroundPanel.setLayout(new BorderLayout());
        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("This is a JLabel");

        backgroundPanel.add(button, BorderLayout.SOUTH);
        backgroundPanel.add(label, BorderLayout.NORTH);

        // Add the panel to the frame
        frame.add(backgroundPanel);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
