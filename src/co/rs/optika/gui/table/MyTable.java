package co.rs.optika.gui.table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class MyTable {
    JTable table;

    public MyTable(String[] columnNames) {
        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, columnNames);
        table = new JTable(model);
    }

    public JTable getTable() {
        return table;
    }

    public TableModel getModel(){
        return table.getModel();
    }

    public TableColumnModel getColumnModel(){
        return table.getColumnModel();
    }
}
