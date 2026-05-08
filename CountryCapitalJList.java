package swingassignment;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.*;

public class CountryCapitalJList extends JFrame {

    JList<String> countryList;
    Map<String, String> capitalMap;

    public CountryCapitalJList() {

        DefaultListModel<String> model = new DefaultListModel<>();

        model.addElement("USA");
        model.addElement("India");
        model.addElement("Vietnam");
        model.addElement("Canada");
        model.addElement("Denmark");
        model.addElement("France");
        model.addElement("Great Britain");
        model.addElement("Japan");
        model.addElement("Africa");
        model.addElement("Greenland");
        model.addElement("Singapore");

        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Not a country (Region)");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        countryList = new JList<>(model);

        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {

                    List<String> selected = countryList.getSelectedValuesList();

                    for (String country : selected) {
                        System.out.println(country + " → " + capitalMap.get(country));
                    }
                }
            }
        });

        add(new JScrollPane(countryList));

        setTitle("Country Capital JList");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalJList();
    }
}
