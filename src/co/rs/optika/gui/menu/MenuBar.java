package co.rs.optika.gui.menu;

import co.rs.optika.gui.panel.LayeredPane;
import co.rs.optika.util.Util;

import javax.swing.*;
import java.util.LinkedHashMap;

public class MenuBar extends JMenuBar {
    private LayeredPane layeredPane;
    private LinkedHashMap<String, JMenu> menuMap;

    private MenuBar() {
    }

    public MenuBar(LayeredPane layeredPane) throws Exception {
        this.layeredPane = layeredPane;
        menuMap = new LinkedHashMap<>();

        addMenu("SIFARNIK");
        addMenuItem("SIFARNIK", "Dobavljaci");
        addMenuItem("SIFARNIK", "Prodavnice");
        addMenuItem("SIFARNIK", "Stope poreza");
        addMenuItem("SIFARNIK", "Nomenklatura zavoda");
        addMenuItem("SIFARNIK", "Familije proizvoda");
        addMenuItem("SIFARNIK", "Proizvodi i roba");
        addMenuItem("SIFARNIK", "Cenovnik");

        addMenu("ULAZ / IZLAZ");
        addMenuItem("ULAZ / IZLAZ", "Pocetno stanje prodavnice");
        addMenuItem("ULAZ / IZLAZ", "Maloprodajna kalkulacija");
        addMenuItem("ULAZ / IZLAZ", "Nivelacija");
        addMenuItem("ULAZ / IZLAZ", "Razduzenje prodavnice");

        addMenu("IZVESTAJI");
        addMenuItem("IZVESTAJI", "Stanje robe u prodavnici");
        addMenuItem("IZVESTAJI", "Kartice robe u prodavnici");
        addMenuItem("IZVESTAJI", "Trgovacka knjiga");

        addMenu("SERVIS");
        addMenuItem("SERVIS", "Servis");

        addMenus();
    }

    private void addMenu(String menuName) throws Exception {
        if (menuMap.containsKey(menuName)) {
            throw new Exception("MenuBar.addManu(String menuName): Menu with name " + menuName + " already exists.");
        }

        JMenu menu = new JMenu(menuName);
        menuMap.put(menuName, menu);
    }

    private void addMenuItem(String menuName, String menuItemName) throws Exception {
        if (menuMap.containsKey(menuName)) {
            JMenuItem menuItem = new JMenuItem(menuItemName);
            menuItem.addActionListener(new MenuItemPanelAction(layeredPane, Util.noSpaceLowercase(menuItemName)));
            menuMap.get(menuName).add(menuItem);
        } else {
            throw new Exception("MenuBar.addMenuItem(String menuName, String menuItemName): Menu with name " + menuName + " does not exists.");
        }
    }

    private void addMenus() {
        for (JMenu menu : menuMap.values()) {
            this.add(menu);
        }
    }
}
