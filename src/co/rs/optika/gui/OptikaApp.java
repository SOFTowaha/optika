package co.rs.optika.gui;

import co.rs.optika.gui.frame.FullScreenFrame;
import co.rs.optika.gui.menu.MenuBar;
import co.rs.optika.gui.panel.LayeredPane;
import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class OptikaApp {

    private LayeredPane content;
    private MenuBar menu;
    private FullScreenFrame frame;

    public OptikaApp() {
        GUIUtil.setNimbusLookAndFeel();

        frame = new FullScreenFrame("Optika");
        content = new LayeredPane(true);
        menu = new MenuBar(content);

        frame.setJMenuBar(menu);
        frame.setContentPane(content);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OptikaApp();
            }
        });
    }

}
