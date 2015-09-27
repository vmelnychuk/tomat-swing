package app;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private static final String TITLE = "Tomat";
    private static int width = 200;
    private static int height = 100;
    private JButton playButton;
    private JButton pauseButton;
    private JButton stopButton;
    public MainFrame() {
        super(TITLE);
        setSize(width, height);
        setLayout(new BorderLayout());
        playButton = new JButton("play");
        add(playButton, BorderLayout.LINE_START);
        pauseButton = new JButton("pause");
        add(pauseButton, BorderLayout.CENTER);
        stopButton = new JButton("stop");
        add(stopButton, BorderLayout.LINE_END);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
