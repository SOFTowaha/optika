package co.rs.optika.gui.panel.ulazIzlaz;

import co.rs.optika.gui.panel.MyPanel;
import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class MaloprodajnaKalkulacijaPanel extends MyPanel {

    private JLabel label;

    public MaloprodajnaKalkulacijaPanel() {
        super("Maloprodajna kalkulacija");
        label = new JLabel("Maloprodajna kalkulacija");
        add(label);
    }
}
