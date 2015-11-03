package co.rs.optika.gui.panel.sifarnik;

import co.rs.optika.gui.panel.MyPanel;
import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class StopePorezaPanel extends MyPanel {

    private JLabel label;

    public StopePorezaPanel() {
        super("Stope poreza");
        label = new JLabel("Stope poreza");
        add(label);
    }
}
