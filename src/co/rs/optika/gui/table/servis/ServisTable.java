package co.rs.optika.gui.table.servis;

import co.rs.optika.gui.table.MyTable;
import co.rs.optika.model.TestBean;
import co.rs.optika.services.TestBeanService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServisTable extends JPanel{

    private String[] columnNames;
    private MyTable myTable;
    private DefaultTableModel tableModel;
    private JScrollPane jScrollPane;
    private JButton removeAll;
    private JButton selectAll;
    private TestBeanService testBeanService;

    public ServisTable(){
        setSize(300, 300);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        columnNames = new String[]{"Id","Name","Value"};
        myTable = new MyTable(columnNames);
        tableModel = (DefaultTableModel)myTable.getModel();
        jScrollPane = new JScrollPane(myTable.getTable());
        add(jScrollPane);

        selectAll = new JButton("Select all");
        selectAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                select();
            }
        });
        add(selectAll);

        removeAll = new JButton("Remove all");
        removeAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete();
            }
        });
        add(removeAll);
    }

    public void setTestBeanService(TestBeanService testBeanService) {
        this.testBeanService = testBeanService;
    }

    public void select(){
        for(TestBean tb:testBeanService.findAll()){
            tableModel.addRow(tb.getRowData());
        }
    }

    public void insert(){}
    public void update(){}

    public void delete(){
        tableModel.setRowCount(0);
    }
}
