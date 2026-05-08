package swingassignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo extends JFrame implements ActionListener {

    JButton digitalBtn, hourGlassBtn;
    JLabel label;

    public ImageButtonDemo() {

        setTitle("Image Button Example");
        setSize(500, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        ImageIcon digitalIcon = new ImageIcon("digital.png");
        ImageIcon hourIcon = new ImageIcon("hourglass.png");

        digitalBtn = new JButton(digitalIcon);
        hourGlassBtn = new JButton(hourIcon);

        digitalBtn.setText("Digital Clock");
        hourGlassBtn.setText("Hour Glass");

        digitalBtn.setHorizontalTextPosition(JButton.CENTER);
        digitalBtn.setVerticalTextPosition(JButton.BOTTOM);

        hourGlassBtn.setHorizontalTextPosition(JButton.CENTER);
        hourGlassBtn.setVerticalTextPosition(JButton.BOTTOM);

        digitalBtn.addActionListener(this);
        hourGlassBtn.addActionListener(this);

        panel.add(digitalBtn);
        panel.add(hourGlassBtn);

        label = new JLabel("Click an image button");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));

        add(panel, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == digitalBtn) {
            label.setText("Digital Clock is pressed");
        }

        if (e.getSource() == hourGlassBtn) {
            label.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ImageButtonDemo();
    }
}
