package co.rs.optika.gui.util;

import javax.swing.*;
import java.awt.*;

public class GUIUtil {

    private static GUIUtil sr;
    private Dimension dimension;
    private int width;
    private int height;

    private GUIUtil() {
        dimension = Toolkit.getDefaultToolkit().getScreenSize();
        width = (int) dimension.getWidth();
        height = (int) dimension.getHeight();
    }

    private static GUIUtil getScreenResolution() {
        if (sr == null) {
            sr = new GUIUtil();
        }
        return sr;
    }

    public static Dimension getResolution() {
        return getScreenResolution().dimension;
    }

    public static int getWidth() {
        return getScreenResolution().width;
    }

    public static int getHeight() {
        return getScreenResolution().height;
    }

    public static void setNimbusLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName()); //javax.swing.plaf.nimbus.NimbusLookAndFeel
                    break;
                }
            }
        } catch (Exception ex) {
        }
    }
}
