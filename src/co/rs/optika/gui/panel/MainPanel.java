package co.rs.optika.gui.panel;

import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class MainPanel extends JPanel {

    private JLabel label;

    public MainPanel() {
        setBounds(1, 1, GUIUtil.getWidth(), GUIUtil.getHeight());
        setBorder(BorderFactory.createTitledBorder("Main panel"));
        label = new JLabel("Main Panel");
        add(label);
    }
}
