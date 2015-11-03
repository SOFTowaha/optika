package co.rs.optika.gui.panel.ulazIzlaz;

import co.rs.optika.gui.panel.MyPanel;
import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class PocetnoStanjeProdavnicePanel extends MyPanel {

    private JLabel label;

    public PocetnoStanjeProdavnicePanel() {
        super("Pocetno stanje prodavnice");
        label = new JLabel("Pocetno stanje prodavnice");
        add(label);
    }
}
