import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;



public class History extends JFrame implements ActionListener {
    private JTable jTable;
    JButton home;

    // DefaultTableModel dft;
    public History() {
        this.setTitle("Transaction History");
        this.setSize(700, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jTable = new JTable();

        JScrollPane scrollPane = new JScrollPane(jTable);
        this.add(scrollPane, BorderLayout.CENTER);
        scrollPane.setBounds(0, 0, 700, 600);
        scrollPane.getViewport().setBackground(Color.white);

        loadCSV("transactions.csv");
        jTable.setBackground(Color.white);
        jTable.setForeground(Color.black);
        jTable.setFont(new Font("MONOSPACED", Font.ITALIC, 17));
        jTable.setVisible(true);
        JTableHeader header = jTable.getTableHeader();
        header.setFont(new Font(null, Font.BOLD,20));
        header.setForeground(Color.white);
        header.setBackground(Color.decode("#3B8F3F"));


        home = new JButton("Home");
        home.setBounds(0, 600, 700, 63);
        home.setBackground(Color.decode("#3B8F3F"));
        home.setForeground(Color.white);
        home.setFocusable(false);
        home.addActionListener(this);
        home.setFont(new Font(null, Font.BOLD, 30));

        

        this.add(home);
        
        this.setVisible(true);
    }


    public void loadCSV(String filePath) {
        DefaultTableModel model = new DefaultTableModel();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

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
        History viewer = new History();
        viewer.loadCSV("transactions.csv");

        // SwingUtilities.invokeLater(() -> viewer.setVisible(true));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == home){
            Main main = new Main();
            this.dispose();
        }

        
    }
}
