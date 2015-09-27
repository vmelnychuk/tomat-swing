package app;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel {
    private static final long serialVersionUID = 1L;
    private JButton playButton;
    private JButton pauseButton;
    private JButton stopButton;
    public Toolbar() {
        playButton = new JButton("paly");
        pauseButton = new JButton("pause");
        stopButton = new JButton("stop");
        setLayout(new FlowLayout());
        add(playButton);
        add(pauseButton);
        add(stopButton);
    }
}
