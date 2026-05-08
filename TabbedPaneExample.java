package swingassignment;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedPaneExample {

    JFrame f;
    JLabel label;

    TabbedPaneExample() {

        f = new JFrame("Tabbed Pane Example");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.RED);
        p3.setBackground(Color.GREEN);

        JTabbedPane tp = new JTabbedPane();

        tp.add("BLUE", p1);
        tp.add("RED", p2);
        tp.add("GREEN", p3);

        label = new JLabel("Select a Tab");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setHorizontalAlignment(JLabel.CENTER);

        tp.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tp.getSelectedIndex();

                if (index == 0) {
                    label.setText("BLUE Tab Selected");
                } else if (index == 1) {
                    label.setText("RED Tab Selected");
                } else if (index == 2) {
                    label.setText("GREEN Tab Selected");
                }
            }
        });

        f.add(tp);
        f.add(label, "South");

        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}
