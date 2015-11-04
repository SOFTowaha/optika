package co.rs.optika.gui.panel.testBean;

import co.rs.optika.gui.panel.MyPanel;
import co.rs.optika.gui.table.testBean.TestBeanTable;

public class TestBeanPanel extends MyPanel {

    private TestBeanTable testBeanTable;

    public TestBeanPanel() {
        super("TestBean");
    }

    public void setTestBeanTable(TestBeanTable testBeanTable) {
        this.testBeanTable = testBeanTable;
        add(testBeanTable);
    }
}
