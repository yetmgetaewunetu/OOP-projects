import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;



public class AllocationHistory extends JFrame implements ActionListener {
    private JTable jTable;
    JButton home, reset;
    // DefaultTableModel dft;
    public AllocationHistory(){
        this.setTitle("allocation request history");
        this.setSize(700,700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);

        jTable = new JTable();

        JScrollPane scrollPane = new JScrollPane(jTable);
        add(scrollPane, BorderLayout.CENTER);
        scrollPane.setBounds(0,0,700,600);
        scrollPane.setFont(new Font(null, Font.PLAIN, 19));
        scrollPane.getViewport().setBackground(Color.white);
        
        loadCSV("request.csv");

        jTable.setBackground(Color.white);
        jTable.setForeground(Color.black);
        jTable.setFont(new Font("MONOSPACED", Font.ITALIC, 17));
        jTable.setVisible(true);
        
        JTableHeader header = jTable.getTableHeader();
        header.setFont(new Font(null, Font.BOLD,20));
        header.setForeground(Color.white);
        header.setBackground(Color.decode("#3B8F3F"));

        home = new JButton("Home");
        home.setBounds(0, 600, 500, 63);
        home.setBackground(Color.decode("#3B8F3F"));
        home.setForeground(Color.white);
        home.setFocusable(false);
        home.addActionListener(this);
        home.setFont(new Font(null, Font.BOLD, 30));

        reset = new JButton("Reset");
        reset.setBounds(500, 600, 200, 63);
        reset.setBackground(Color.red);
        reset.setForeground(Color.white);
        reset.setFont(new Font(null,Font.BOLD, 30));
        reset.setFocusable(false);
        reset.addActionListener(this);

        this.add(reset);
        this.add(home);
        this.setVisible(true);
    }


    public void loadCSV(String filePath) {
        DefaultTableModel model = new DefaultTableModel();
        try (BufferedReader reader = new BufferedReader(new FileReader("request.csv"))) {
            String line;
            boolean isFirstLine = true;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (isFirstLine) {
                    model.setColumnIdentifiers(data);
                    isFirstLine = false;
                } else {
                    model.addRow(data);
                }
            }
            jTable.setModel(model);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
        public static void main(String[] args) {
            AllocationHistory viewer = new AllocationHistory();
            viewer.loadCSV("request.csv");

           // SwingUtilities.invokeLater(() -> viewer.setVisible(true));
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== home){
            Home home = new Home();
            this.dispose();
        }
        if (e.getSource() == reset){
            FileWriter writer ;
            try {
                writer = new FileWriter("request.csv", false);
                BufferedWriter writting = new BufferedWriter(writer);
                writting.write("Asset Name" +"," + "Type" + "," + "Location" + "," + "Condition" + "\n");
                writting.flush();
                JOptionPane.showMessageDialog(this, "History cleared successfully!");
                Home home = new Home();
                this.dispose();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }
    }
}
