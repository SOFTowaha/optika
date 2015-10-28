package co.rs.optika.gui.panel;

import javax.swing.*;
import java.util.HashMap;

public class LayeredPane extends JLayeredPane{

    private HashMap<String,JPanel> panelMap;

    public LayeredPane(boolean initialize) {
        panelMap = new HashMap<>();

        if(initialize) {
            addPanel(new MainPanel());
            addPanel(new TablePanel());
        }
    }

    public void addPanel(JPanel panel){
        add(panel, panelMap.size());

        String key = panel.getClass().getSimpleName();
        key = key.substring(0, key.length()-5);
        panelMap.put(key,panel);
    }

    public void moveToFront(String panelName){
       moveToFront(panelMap.get(panelName));
    }
}
