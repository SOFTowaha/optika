package co.rs.optika.gui.panel;

import co.rs.optika.gui.panel.sifarnik.*;
import co.rs.optika.gui.panel.ulazIzlaz.*;
import co.rs.optika.gui.panel.izvestaji.*;
import co.rs.optika.gui.panel.servis.*;

import javax.swing.*;
import java.util.HashMap;

public class LayeredPane extends JLayeredPane{

    private HashMap<String,JPanel> panelMap;

    public LayeredPane(boolean initialize) {
        panelMap = new HashMap<>();

        if(initialize) {
            //SIFARNIK
            addPanel(new DobavljaciPanel());
            addPanel(new ProdavnicePanel());
            addPanel(new StopePorezaPanel());
            addPanel(new NomenklaturaZavodaPanel());
            addPanel(new FamilijeProizvodaPanel());
            addPanel(new ProizvodiIRobaPanel());
            addPanel(new CenovnikPanel());

            //ULAZ / IZLAZ
            addPanel(new PocetnoStanjeProdavnicePanel());
            addPanel(new MaloprodajnaKalkulacijaPanel());
            addPanel(new NivelacijaPanel());
            addPanel(new RazduzenjeProdavnicePanel());

            //IZVESTAJI
            addPanel(new StanjeRobeUProdavniciPanel());
            addPanel(new KarticeRobeUProdavniciPanel());
            addPanel(new TrgovackaKnjigaPanel());

            //SERVIS
            addPanel(new ServisPanel());
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
