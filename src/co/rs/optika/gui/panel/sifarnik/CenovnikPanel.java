package co.rs.optika.gui.panel.sifarnik;

import co.rs.optika.gui.panel.MyPanel;
import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class CenovnikPanel extends MyPanel {

    private JLabel label;

    public CenovnikPanel() {
        super("Cenovnik");
        label = new JLabel("Cenovnik");
        add(label);
    }
}
