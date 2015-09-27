package app;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private static final String TITLE = "Tomat";
    private static int width = 300;
    private static int height = 200;
    private JButton playButton;
    private JButton pauseButton;
    private JButton stopButton;
    private StatusPanel statusPanel;
    public MainFrame() {
        super(TITLE);
        setSize(width, height);
        setLayout(new BorderLayout());
        statusPanel = new StatusPanel();
        statusPanel.setSize(300, 100);
        playButton = new JButton("play");
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusPanel.updateStatus("playing...\n");
            }
        });
        add(playButton, BorderLayout.LINE_START);
        pauseButton = new JButton("pause");
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusPanel.updateStatus("pause\n");
            }
        });
        add(pauseButton, BorderLayout.CENTER);
        stopButton = new JButton("stop");
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusPanel.updateStatus("stop\n");
            }
        });
        add(stopButton, BorderLayout.LINE_END);
        add(statusPanel, BorderLayout.PAGE_END);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
