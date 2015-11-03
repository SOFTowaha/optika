package co.rs.optika.gui.panel.izvestaji;

import co.rs.optika.gui.panel.MyPanel;

import javax.swing.*;

public class TrgovackaKnjigaPanel extends MyPanel {

    private JLabel label;

    public TrgovackaKnjigaPanel() {
        super("Trgovacka knjiga");
        label = new JLabel("Trgovacka knjiga");
        add(label);
    }
}
