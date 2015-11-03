package co.rs.optika.gui.panel.sifarnik;

import co.rs.optika.gui.panel.MyPanel;
import co.rs.optika.gui.table.MyTable;
import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class DobavljaciPanel extends MyPanel {

    private JLabel label;

    public DobavljaciPanel() {
        super("Dobavljaci");
        label = new JLabel("Dobavljaci");
        add(label);
    }
}
