package co.rs.optika.gui.panel;

import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class MyPanel extends JPanel {
    private MyPanel(){}

    public MyPanel(String title) {
        setBounds(1, 1, GUIUtil.getWidth(), GUIUtil.getHeight());
        setBorder(BorderFactory.createTitledBorder(title));
        setOpaque(true);
    }
}
