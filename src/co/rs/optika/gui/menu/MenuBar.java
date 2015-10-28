package co.rs.optika.gui.menu;

import co.rs.optika.gui.panel.LayeredPane;

import javax.swing.*;

public class MenuBar extends JMenuBar {
    private LayeredPane layeredPane;

    private JMenu menu;
    private JMenuItem mainMenuItem, tableMenuItem;

    private MenuBar(){}

    public MenuBar(LayeredPane layeredPane){
        this.layeredPane = layeredPane;

        menu = new JMenu("File");

        mainMenuItem = new JMenuItem("Main");
        mainMenuItem.addActionListener(new MenuItemPanelAction(layeredPane,"Main"));

        tableMenuItem = new JMenuItem("Table");
        tableMenuItem.addActionListener(new MenuItemPanelAction(layeredPane,"Table"));

        menu.add(mainMenuItem);
        menu.add(tableMenuItem);
        this.add(menu);
    }
}
