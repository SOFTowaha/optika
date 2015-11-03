package co.rs.optika.gui.panel.sifarnik;

import co.rs.optika.gui.panel.MyPanel;
import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class NomenklaturaZavodaPanel extends MyPanel {

    private JLabel label;

    public NomenklaturaZavodaPanel() {
        super("Nomenklatura zavoda");
        label = new JLabel("Nomenklatura zavoda");
        add(label);
    }
}
