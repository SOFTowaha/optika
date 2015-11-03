package co.rs.optika.gui.panel.izvestaji;

import co.rs.optika.gui.panel.MyPanel;
import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class StanjeRobeUProdavniciPanel extends MyPanel {

    private JLabel label;

    public StanjeRobeUProdavniciPanel() {
        super("Stanje robe u prodavnici");
        label = new JLabel("Stanje robe u prodavnici");
        add(label);
    }
}
