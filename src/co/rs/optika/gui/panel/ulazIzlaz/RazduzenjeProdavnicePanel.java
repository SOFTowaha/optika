package co.rs.optika.gui.panel.ulazIzlaz;

import co.rs.optika.gui.panel.MyPanel;
import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class RazduzenjeProdavnicePanel extends MyPanel {

    private JLabel label;

    public RazduzenjeProdavnicePanel() {
        super("Razduzenje prodavnice");
        label = new JLabel("Razduzenje prodavnice");
        add(label);
    }
}
