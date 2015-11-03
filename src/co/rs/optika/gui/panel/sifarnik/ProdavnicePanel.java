package co.rs.optika.gui.panel.sifarnik;

import co.rs.optika.gui.panel.MyPanel;
import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class ProdavnicePanel extends MyPanel {

    private JLabel label;

    public ProdavnicePanel() {
        super("Prodavnice");
        label = new JLabel("Prodavnice");
        add(label);
    }
}
