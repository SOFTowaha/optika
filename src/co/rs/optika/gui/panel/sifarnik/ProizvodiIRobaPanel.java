package co.rs.optika.gui.panel.sifarnik;

import co.rs.optika.gui.panel.MyPanel;
import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class ProizvodiIRobaPanel extends MyPanel {

    private JLabel label;

    public ProizvodiIRobaPanel() {
        super("Proizvodi i roba");
        label = new JLabel("Proizvodi i roba");
        add(label);
    }
}
