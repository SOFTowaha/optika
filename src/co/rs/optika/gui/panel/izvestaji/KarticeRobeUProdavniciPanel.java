package co.rs.optika.gui.panel.izvestaji;

import co.rs.optika.gui.panel.MyPanel;
import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class KarticeRobeUProdavniciPanel extends MyPanel {

    private JLabel label;

    public KarticeRobeUProdavniciPanel() {
        super("Kartice robe u prodavnici");
        label = new JLabel("Kartice robe u prodavnici");
        add(label);
    }
}
