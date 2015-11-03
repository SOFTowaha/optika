package co.rs.optika.gui.panel.servis;

import co.rs.optika.gui.panel.MyPanel;
import co.rs.optika.gui.table.servis.ServisTable;
import co.rs.optika.util.SpringUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServisPanel extends MyPanel {

    private ServisTable servisTable;

    public ServisPanel() {
        super("Servis");

        servisTable = SpringUtil.getBean("servisTable", ServisTable.class);
        add(servisTable);
    }
}
