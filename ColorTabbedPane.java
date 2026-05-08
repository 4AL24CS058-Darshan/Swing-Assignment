package swingassignment;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorTabbedPane {

    JFrame f;
    JLabel label;

    ColorTabbedPane() {

        f = new JFrame("Color Tabbed Pane");

        JPanel cyanPanel = new JPanel();
        JPanel magentaPanel = new JPanel();
        JPanel yellowPanel = new JPanel();

        cyanPanel.setBackground(Color.CYAN);
        magentaPanel.setBackground(Color.MAGENTA);
        yellowPanel.setBackground(Color.YELLOW);

        JTabbedPane tp = new JTabbedPane();

        tp.add("CYAN", cyanPanel);
        tp.add("MAGENTA", magentaPanel);
        tp.add("YELLOW", yellowPanel);

        label = new JLabel("Select a Color Tab");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setHorizontalAlignment(JLabel.CENTER);

        tp.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {

                int index = tp.getSelectedIndex();

                if (index == 0) {
                    label.setText("CYAN Tab Selected");
                } else if (index == 1) {
                    label.setText("MAGENTA Tab Selected");
                } else if (index == 2) {
                    label.setText("YELLOW Tab Selected");
                }
            }
        });

        f.setLayout(new BorderLayout());
        f.add(tp, BorderLayout.CENTER);
        f.add(label, BorderLayout.SOUTH);

        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ColorTabbedPane();
    }
}
