package app;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JButton playButton;
    private JButton pauseButton;
    private JButton stopButton;
    private StringListener textListener;
    public Toolbar() {
        Dimension dimension = getPreferredSize();
        dimension.height = 50;
        setPreferredSize(dimension);
        playButton = new JButton("play");
        playButton.addActionListener(this);
        pauseButton = new JButton("pause");
        pauseButton.addActionListener(this);
        stopButton = new JButton("stop");
        stopButton.addActionListener(this);
        setLayout(new FlowLayout());
        add(playButton);
        add(pauseButton);
        add(stopButton);
    }
    public void setTextListener(StringListener listener) {
        this.textListener = listener;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        if (textListener == null) return;
        if (clickedButton == playButton) {
            textListener.textEmitted("Play\n");
        } else if (clickedButton == pauseButton) {
            textListener.textEmitted("Pause\n");
        } else if (clickedButton == stopButton) {
            textListener.textEmitted("Stop\n");
        }
    }
}
