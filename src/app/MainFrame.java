package app;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private static final String TITLE = "Tomat";
    private static int width = 300;
    private static int height = 200;
    private StatusPanel statusPanel;
    private Toolbar toolbar;
    public MainFrame() {
        super(TITLE);
        setSize(width, height);
        setLayout(new BorderLayout());
        statusPanel = new StatusPanel();
        toolbar = new Toolbar();
        add(toolbar, BorderLayout.NORTH);
        add(statusPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
