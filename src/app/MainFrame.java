package app;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private static final String TITLE = "Tomat";
    private static int width = 200;
    private static int height = 100;
    private JButton playButton;
    private JButton pauseButton;
    private JButton stopButton;
    private JTextArea status;
    public MainFrame() {
        super(TITLE);
        setSize(width, height);
        setLayout(new BorderLayout());
        status = new JTextArea();
        playButton = new JButton("play");
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                status.setText("playing...");
            }
        });
        add(playButton, BorderLayout.LINE_START);
        pauseButton = new JButton("pause");
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                status.setText("pause");
            }
        });
        add(pauseButton, BorderLayout.CENTER);
        stopButton = new JButton("stop");
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                status.setText("stop");
            }
        });
        add(stopButton, BorderLayout.LINE_END);
        add(status, BorderLayout.PAGE_END);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
