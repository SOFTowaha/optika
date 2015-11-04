package co.rs.optika.gui.panel;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;

public class LayeredPane extends JLayeredPane{

    private HashMap<String,JPanel> panelMap;

    public LayeredPane(List<JPanel> list) {
        panelMap = new HashMap<>();

        for(JPanel panel:list) {
            addPanel(panel);
        }
    }

    public void addPanel(JPanel panel){
        panel.setVisible(false);
        add(panel, panelMap.size());

        String key = panel.getClass().getSimpleName();
        key = key.substring(0, key.length()-5).toLowerCase();
        panelMap.put(key,panel);
    }

    public void moveToFront(String panelName){
       allPanelsNotVisible();
       setPanelVisible(panelName);
       moveToFront(getPanel(panelName));
    }

    private void allPanelsNotVisible(){
        for(JPanel panel:panelMap.values()){
            panel.setVisible(false);
        }
    }

    private void setPanelVisible(String panelName){
      getPanel(panelName).setVisible(true);
    }

    private JPanel getPanel(String panelName){return panelMap.get(panelName);}
}
