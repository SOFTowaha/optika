package groovy

import groovy.swing.SwingBuilder

import javax.swing.*
import javax.swing.WindowConstants as WC
import java.awt.*

SwingBuilder swingBuilder = new SwingBuilder()
swingBuilder.edt {
    lookAndFeel 'nimbus'

    JLayeredPane layeredPane

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    swingBuilder.frame(title: 'Optika',
            size: [(int) screenSize.getWidth(), (int) screenSize.getHeight()],
            pack: true,
            extendedState: JFrame.MAXIMIZED_BOTH,
            defaultCloseOperation: WC.EXIT_ON_CLOSE,
            show: true) {

        menuBar {
            menuItem(text: "Main", mnemonic: 'M', actionPerformed: { println 'Main' })
            menuItem(text: "Table", mnemonic: 'T', actionPerformed: { println 'Table'})
            menuItem(text: "Exit", mnemonic: 'X', actionPerformed: { dispose() })
        }

        /*
        panel(constraints: BorderLayout.CENTER, border: compoundBorder([emptyBorder(10), titledBorder('Panel 1')])){
            label(text:'Test1')
        }
        */
        layeredPane = swingBuilder.layeredPane(constraints: border) {
            widget(label(text: 'Main panel', constraints:0))
            widget(label(text: 'Table panel', verticalAlignment: JLabel.TOP, horizontalAlignment: JLabel.CENTER, bounds: new Rectangle(20, 20, 140i, 140i), constraints: 1))
        }
    }
}


