package groovy

import groovy.swing.SwingBuilder

import javax.swing.*
import javax.swing.WindowConstants as WC
import java.awt.*

SwingBuilder swingBuilder = new SwingBuilder()
swingBuilder.edt {
    lookAndFeel 'nimbus'

    def mainPanel = swingBuilder.panel(bounds: [1,1,100,100]){
        label(text: 'Main panel')
    }

    def tablePanel = swingBuilder.panel(bounds: [1,1,100,100]){
        label(text: 'Table panel')
    }

    def content = swingBuilder.layeredPane(){
        widget(mainPanel,constraints:0)
        widget(tablePanel,constraints:1)
    }

    def menu = swingBuilder.menuBar {
        menuItem(text: "Main", mnemonic: 'M', actionPerformed: { content.moveToFront(mainPanel)})
        menuItem(text: "Table", mnemonic: 'T', actionPerformed: { content.moveToFront(tablePanel)})
        menuItem(text: "Exit", mnemonic: 'X', actionPerformed: { dispose() })
    }

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    swingBuilder.frame(title: 'Optika',
            size: [(int) screenSize.getWidth(), (int) screenSize.getHeight()],
            JMenuBar: menu,
            contentPane: content,
            extendedState: JFrame.MAXIMIZED_BOTH,
            defaultCloseOperation: WC.EXIT_ON_CLOSE,
            show: true
    ) {}
}


