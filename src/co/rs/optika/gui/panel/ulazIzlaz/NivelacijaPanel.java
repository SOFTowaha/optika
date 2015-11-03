package co.rs.optika.gui.panel.ulazIzlaz;

import co.rs.optika.gui.panel.MyPanel;
import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class NivelacijaPanel extends MyPanel {

    private JLabel label;

    public NivelacijaPanel() {
        super("Nivelacija");
        label = new JLabel("Nivelacija");
        add(label);
    }
}
