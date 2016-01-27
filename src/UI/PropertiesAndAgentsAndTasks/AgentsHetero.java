/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PropertiesAndAgentsAndTasks;

import UI.PropertiesAndAgentsAndTasks.Agents.AgentsTree;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Emad Ali
 */
public class AgentsHetero extends javax.swing.JPanel {

    /**
     * Creates new form AllAgentsHetero
     */
    public AgentsHetero() {
        initComponents();
        fillTable();
    }

    public static void fillTable() {
        Object[][] data = new Object[Modules.Agent.getNumberOfAgents()][Modules.Property.getProperties().size() + 1];
        Object[] columnNames = new Object[Modules.Property.getProperties().size() + 1];

        columnNames[0] = "Agents Name";
        int i = 0;
        for (Modules.Property p : Modules.Property.getProperties()) {
            columnNames[++i] = p.getName();
        }
        i = 0;
        for (ArrayList<Modules.Agent> listA : Modules.Agent.getAgentsGroups()) {
            for (Modules.Agent a : listA) {
                data[i++][0] = a.getName();
            }
        }

        TableModel t = new DefaultTableModel(data, columnNames);
        jTable1.setModel(t);

        i = 0;
        JTextField x = new JTextField();
        //x.setEnabled(false);
        jTable1.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(x));

        for (Modules.Property p : Modules.Property.getProperties()) {
            i++;
            switch (p.getType()) {
                case 0:
                    JCheckBox x1 = new JCheckBox();
                    jTable1.getColumnModel().getColumn(i).setCellEditor(new DefaultCellEditor(x1));
                    break;
                case 1:
                case 2:
                    JTextField x2 = new JTextField();
                    jTable1.getColumnModel().getColumn(i).setCellEditor(new DefaultCellEditor(x2));
                    break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        SavePropertiesForAgentsButton = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setDoubleBuffered(true);
        jTable1.setDragEnabled(true);
        jTable1.setName(""); // NOI18N
        jTable1.setRowHeight(30);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setText("Properties values:");

        SavePropertiesForAgentsButton.setText("Save");
        SavePropertiesForAgentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavePropertiesForAgentsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 307, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SavePropertiesForAgentsButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SavePropertiesForAgentsButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SavePropertiesForAgentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavePropertiesForAgentsButtonActionPerformed
        saveTable();
        AgentsTree.refreshTree();
    }//GEN-LAST:event_SavePropertiesForAgentsButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SavePropertiesForAgentsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void saveTable() {
        //read form table to Modules.Agent.Agents InOrder
    }
}
