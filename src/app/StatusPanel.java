package app;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class StatusPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JTextArea status;
    
    public StatusPanel() {
        status = new JTextArea();
        setLayout(new BorderLayout());
        add(new JScrollPane(status), BorderLayout.CENTER);
    }
    
    public void updateStatus(String newStatus) {
        status.append(newStatus);
    }
}
