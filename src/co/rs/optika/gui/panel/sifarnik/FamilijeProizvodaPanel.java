package co.rs.optika.gui.panel.sifarnik;

import co.rs.optika.gui.panel.MyPanel;
import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class FamilijeProizvodaPanel extends MyPanel {

    private JLabel label;

    public FamilijeProizvodaPanel() {
        super("Familije proizvoda");
        label = new JLabel("Familije proizvoda");
        add(label);
    }
}
