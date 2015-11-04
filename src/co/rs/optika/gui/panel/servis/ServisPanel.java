package co.rs.optika.gui.panel.servis;

import co.rs.optika.gui.panel.MyPanel;

import javax.swing.*;

public class ServisPanel extends MyPanel {

    private JLabel label;

    public ServisPanel() {
        super("Servis");
        label = new JLabel("Servis");
        add(label);
    }
}
