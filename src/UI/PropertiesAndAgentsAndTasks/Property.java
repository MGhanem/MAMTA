/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PropertiesAndAgentsAndTasks;

import UI.PropertiesAndAgentsAndTasks.PropertiesTree;
import java.awt.Color;

/**
 *
 * @author M Ghanem
 */
public class Property extends javax.swing.JPanel {

    /**
     * Creates new form Property
     */
    public Property() {
        initComponents();
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Properties"));
        setMaximumSize(new java.awt.Dimension(32767, 200));
        setPreferredSize(new java.awt.Dimension(419, 200));

        jLabel1.setText("Property Name:");

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel2.setText("Property Type:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Boolean");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton1MousePressed(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Number");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton1MousePressed(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Text");
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton1MousePressed(evt);
            }
        });
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Intial Value:");

        jLabel4.setText("Meteric:");

        jButton1.setText("Add Property");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new javax.swing.OverlayLayout(jPanel1));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setToolTipText("");
        jTextField2.setEnabled(false);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jPanel1.add(jTextField2);

        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox1.setIconTextGap(0);
        jCheckBox1.setMinimumSize(new java.awt.Dimension(200, 23));
        jCheckBox1.setOpaque(false);
        jCheckBox1.setPreferredSize(new java.awt.Dimension(40, 23));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);

        jPanel2.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("* must have a name");

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("* must have a type");

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("this is not a number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jTextField2.setVisible(false);
        jTextField2.setEnabled(false);
        jCheckBox1.setVisible(true);
        jTextField3.setEnabled(false);
        jLabel4.setEnabled(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jTextField2.setVisible(true);
        jTextField2.setEnabled(true);
        jCheckBox1.setVisible(false);
        jTextField3.setEnabled(true);
        jLabel4.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jTextField2.setVisible(true);
        jTextField2.setEnabled(true);
        jCheckBox1.setVisible(false);
        jTextField3.setEnabled(true);
        jLabel4.setEnabled(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setEnabled(false);
        String propName = jTextField1.getText();
        if ("".equals(propName)) {
            jLabel5.setVisible(true);
            jButton1.setEnabled(true);
            return;
        }

        if (buttonGroup1.getSelection() == null) {
            System.out.println("XXX must select Property type XXX");
            jLabel6.setVisible(true);
            jButton1.setEnabled(true);
            return;
        }

        String propMeteric = jTextField3.getText();
        boolean bValue = jCheckBox1.isSelected();
        String tValue = jTextField2.getText();
        int nValue = -1;
        if (jRadioButton2.isSelected()) {
            try {
                if (!"".equals(tValue)) {
                    nValue = Integer.parseInt(tValue);
                }
            } catch (NumberFormatException e) {
                System.out.println("XXX initial value must be a number XXX");
                jLabel7.setVisible(true);
                jButton1.setEnabled(true);
                return;
            }
        }

        //--Update if Property modified--//
        for (Modules.Property p : Modules.Property.getProperties()) {
            if (p.getName().compareToIgnoreCase(propName) == 0) {
                System.out.println("WWW Update property not creat new WWW");
                if (jRadioButton1.isSelected()) {
                    p.setType(0);
                    p.setValue(bValue);
                }
                if (jRadioButton2.isSelected()) {
                    p.setType(1);
                    p.setValue(nValue);
                }
                if (jRadioButton3.isSelected()) {
                    p.setType(2);
                    p.setValue(tValue);
                }
                p.setMeteric(propMeteric);
                PropertiesTree.refreshTree();
                jTextField1.setBackground(Color.white);
                jButton1.setEnabled(true);
                jButton1.setText("Add Property");
                return; // if not willing to update ...
            }
        }
        //--Add new--//
        if (jRadioButton1.isSelected()) {
            Modules.Property.getProperties().add(new Modules.Property(propName, 0, bValue, propMeteric));

        } else if (jRadioButton2.isSelected()) {
            Modules.Property.getProperties().add(new Modules.Property(propName, 1, nValue, propMeteric));

        } else if (jRadioButton3.isSelected()) {
            Modules.Property.getProperties().add(new Modules.Property(propName, 2, tValue, propMeteric));

        }
        //Update Property Tree
        PropertiesTree.refreshTree();
        //Update Table Of Agent Task Selection on Hetero
        if (Modules.Agent.getHemogeniousValue() == 2) {
            AgentsHetero.fillTable();
        }
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jLabel5.setVisible(false);
    }//GEN-LAST:event_jTextField1FocusGained

    private void jRadioButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MousePressed
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
    }//GEN-LAST:event_jRadioButton1MousePressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        String str = jTextField1.getText() + evt.getKeyChar();
        for (Modules.Property p : Modules.Property.getProperties()) {
            if (p.getName().equals(str)) {
                jTextField1.setBackground(Color.yellow);
                jButton1.setText("Update Property");
                return;
            }
        }
        jTextField1.setBackground(Color.white);
        jButton1.setText("Add Property");
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        String str = jTextField1.getText();
        for (Modules.Property p : Modules.Property.getProperties()) {
            if (p.getName().equals(str)) {
                jTextField1.setBackground(Color.yellow);
                jButton1.setText("Update Property");
                return;
            }
        }
        jTextField1.setBackground(Color.white);
        jButton1.setText("Save Property");
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jLabel7.setVisible(false);
    }//GEN-LAST:event_jTextField2FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private static javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JRadioButton jRadioButton1;
    private static javax.swing.JRadioButton jRadioButton2;
    private static javax.swing.JRadioButton jRadioButton3;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField2;
    private static javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    protected static void resetPropertyUI() {
        jCheckBox1.setSelected(false);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField2.setVisible(true);
        jTextField3.setText("");
        buttonGroup1.clearSelection();
    }
}