/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.ComboBox.ComboBoxStructure;
import Models.Table.TableStructureEdit;
import Models.Table.TableEntreprise2;
import Models.Table.TableEntreprise;
import Tools.Resizer;
import comptedit_db.Entreprise;
import comptedit_db.EntrepriseRequest;
import comptedit_db.StructAnalRequest;
import comptedit_db.StructureAnalytique;
import java.awt.Point;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Flash
 */
public class EditStructure extends javax.swing.JFrame {

    /**
     * Creates new form Main_window2
     */
    public EditStructure() {
        sar_ = StructAnalRequest.getInstance();

        initComponents();

        sa_ = new ComboBoxStructure(jComboBox2);
        sa2_ = new ComboBoxStructure(jComboBox1);
        esa_ = new TableStructureEdit(jXTable1, jComboBox1);

        sar_.add_fire_component(sa_, jComboBox2);
        jComboBox2.setModel(sa_);
        jComboBox2.revalidate();
        jComboBox2.repaint();
        jComboBox2.setSelectedItem(null);

        sar_.add_fire_component(sa2_, jComboBox1);
        jComboBox1.setModel(sa2_);
        jComboBox1.revalidate();
        jComboBox1.repaint();
        jComboBox1.setSelectedItem(null);

        sar_.add_fire_component(esa_, jXTable1);
        jXTable1.setModel(esa_);
        addListeners();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXTitledPanel3 = new org.jdesktop.swingx.JXTitledPanel();
        jXTitledPanel1 = new org.jdesktop.swingx.JXTitledPanel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jXButton2 = new org.jdesktop.swingx.JXButton();
        jXTitledPanel2 = new org.jdesktop.swingx.JXTitledPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jXTitledPanel4 = new org.jdesktop.swingx.JXTitledPanel();
        jXButton1 = new org.jdesktop.swingx.JXButton();
        jXButton4 = new org.jdesktop.swingx.JXButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edition de liste");
        setMinimumSize(new java.awt.Dimension(711, 308));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jXTitledPanel3.setTitle("Structure analytique");

        jXTitledPanel1.setTitle(" Ajout");
        jXTitledPanel1.setToolTipText("");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Nom :");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setText("Se basant sur le modèle :");

        jXButton2.setText("Ajouter");
        jXButton2.setEnabled(false);
        jXButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jXButton2);

        javax.swing.GroupLayout jXTitledPanel1Layout = new javax.swing.GroupLayout(jXTitledPanel1.getContentContainer());
        jXTitledPanel1.getContentContainer().setLayout(jXTitledPanel1Layout);
        jXTitledPanel1Layout.setHorizontalGroup(
            jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTitledPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jXTitledPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(jXTitledPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jXTitledPanel1Layout.setVerticalGroup(
            jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXTitledPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXTitledPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jXTitledPanel2.setTitle("Edition");

        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jXTable1.setSortable(false);
        jXTable1.setSortsOnUpdates(false);
        jScrollPane1.setViewportView(jXTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Selection du modèle à éditer :");
        jLabel3.setToolTipText("");

        jXTitledPanel4.setTitle("Outils");

        jXButton1.setText("Ajouter une ligne");
        jXButton1.setEnabled(false);
        jXButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXButton1ActionPerformed(evt);
            }
        });

        jXButton4.setText("Supprimer la ligne");
        jXButton4.setEnabled(false);
        jXButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXTitledPanel4Layout = new javax.swing.GroupLayout(jXTitledPanel4.getContentContainer());
        jXTitledPanel4.getContentContainer().setLayout(jXTitledPanel4Layout);
        jXTitledPanel4Layout.setHorizontalGroup(
            jXTitledPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTitledPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXTitledPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jXButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jXTitledPanel4Layout.setVerticalGroup(
            jXTitledPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTitledPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jXTitledPanel2Layout = new javax.swing.GroupLayout(jXTitledPanel2.getContentContainer());
        jXTitledPanel2.getContentContainer().setLayout(jXTitledPanel2Layout);
        jXTitledPanel2Layout.setHorizontalGroup(
            jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTitledPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXTitledPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jXTitledPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jXTitledPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, 706, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jXTitledPanel2Layout.setVerticalGroup(
            jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXTitledPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXTitledPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXTitledPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jXTitledPanel3Layout = new javax.swing.GroupLayout(jXTitledPanel3.getContentContainer());
        jXTitledPanel3.getContentContainer().setLayout(jXTitledPanel3Layout);
        jXTitledPanel3Layout.setHorizontalGroup(
            jXTitledPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTitledPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXTitledPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXTitledPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTitledPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jXTitledPanel3Layout.setVerticalGroup(
            jXTitledPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXTitledPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXTitledPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTitledPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jXTitledPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        jXButton2.setEnabled(!jTextField1.getText().equals(""));
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jXButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXButton2ActionPerformed
        StructureAnalytique sa = new StructureAnalytique(jTextField1.getText(), "", "", "");
        if (sar_.add_structanal(sa)) {
            if (jComboBox2.getSelectedItem() != null) {
                String alias = (String) jComboBox2.getSelectedItem();
                List<StructureAnalytique> importation = sar_.list_structanal_on_alias(alias);
                for (StructureAnalytique imp : importation) {
                    sar_.add_row_to_with(sa.getAliasStructure(), imp.getSection(), imp.getCompteAnalytique(), imp.getLibelle());
                }
            }
            jTextField1.setText("");
            jComboBox2.setSelectedItem(null);
            jXButton2.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(jTextField1, "La structure analytique : " + sa.getAliasStructure() + " existe déjà.");
        }
    }//GEN-LAST:event_jXButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem() == null)
        {
            jXButton1.setEnabled(false);
            jXButton4.setEnabled(false);
        }
        else
        {
            jXButton4.setEnabled(true);
            jXButton1.setEnabled(true);
        }
        esa_.property_change();
        jXTable1.setModel(esa_);
        jXTable1.revalidate();
        jXTable1.repaint();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jXButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXButton1ActionPerformed
        sar_.add_row_to((String) jComboBox1.getSelectedItem());
        jXTable1.setModel(esa_);
        jXTable1.revalidate();
        jXTable1.repaint();

    }//GEN-LAST:event_jXButton1ActionPerformed

    private void jXButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXButton4ActionPerformed
        
        if (jXTable1.getSelectedRow() >= 0) {
            long delete_index = jXTable1.getSelectedRow();
            sar_.delete_row(esa_.get_id_selected());
            jXTable1.setModel(esa_);
            jXTable1.revalidate();
            jXTable1.repaint();
            if (jXTable1.getRowCount() > delete_index)
                jXTable1.setRowSelectionInterval((int)delete_index, (int)delete_index);
            if (jXTable1.getRowCount() == 0)
                jComboBox1.setSelectedItem(null);

        }
    }//GEN-LAST:event_jXButton4ActionPerformed

    private void addListeners() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditStructure().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXButton jXButton1;
    private org.jdesktop.swingx.JXButton jXButton2;
    private org.jdesktop.swingx.JXButton jXButton4;
    private org.jdesktop.swingx.JXTable jXTable1;
    private org.jdesktop.swingx.JXTitledPanel jXTitledPanel1;
    private org.jdesktop.swingx.JXTitledPanel jXTitledPanel2;
    private org.jdesktop.swingx.JXTitledPanel jXTitledPanel3;
    private org.jdesktop.swingx.JXTitledPanel jXTitledPanel4;
    // End of variables declaration//GEN-END:variables
    private ComboBoxStructure sa_;
    private ComboBoxStructure sa2_;
    private TableStructureEdit esa_;
    private StructAnalRequest sar_;
}