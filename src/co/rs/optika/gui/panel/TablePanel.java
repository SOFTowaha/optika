package co.rs.optika.gui.panel;

import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class TablePanel extends JPanel {

    private JLabel label;

    public TablePanel() {
        setBounds(1, 1, GUIUtil.getWidth(), GUIUtil.getHeight());
        setBorder(BorderFactory.createTitledBorder("Table panel"));
        label = new JLabel("Table Panel");
        add(label);
    }
}
