package co.rs.optika.gui.frame;

import co.rs.optika.gui.util.GUIUtil;

import javax.swing.*;

public class FullScreenFrame extends JFrame {
    public FullScreenFrame(String title){
        setTitle(title);
        setSize(GUIUtil.getWidth(), GUIUtil.getHeight());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
