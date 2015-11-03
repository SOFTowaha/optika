package co.rs.optika.gui.menu;

import co.rs.optika.gui.panel.LayeredPane;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MenuItemPanelAction extends AbstractAction {
    private String panelName;
    private LayeredPane layeredPane;

    private MenuItemPanelAction() {
    }

    public MenuItemPanelAction(LayeredPane layeredPane, String panelName) {
        this.layeredPane = layeredPane;
        this.panelName = panelName;
    }

    public void actionPerformed(ActionEvent e) {

        layeredPane.moveToFront(panelName);
    }
}
