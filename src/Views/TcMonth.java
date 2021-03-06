/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.Tree.TreeTools;
import Models.TreeTable.ColumnData;
import Models.TreeTable.RowData;
import Models.TreeTable.TreeTableTc;
import comptedit_db.Entreprise;
import comptedit_db.Exercice;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.jdesktop.swingx.JXTree;
import org.jdesktop.swingx.JXTreeTable;

/**
 *
 * @author Flash
 */
public class TcMonth extends javax.swing.JPanel {

    private final Exercice exercice_;
    private final JXTreeTable jXTreeTable1;
    private final Entreprise entreprise_;

    /**
     * Creates new form TcMonth
     * @param entreprise
     * @param e
     */
    public TcMonth(Entreprise entreprise, Exercice e) {
        initComponents();
        exercice_ = e;
        entreprise_ = entreprise;
        ColumnData data = new ColumnData(exercice_, true);
        
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) loadModel(data).getRoot();
        

        jXTreeTable1 = new JXTreeTable(new TreeTableTc(data, root));
        jXTreeTable1.setAutoResizeMode(JXTreeTable.AUTO_RESIZE_ALL_COLUMNS);
        jXTreeTable1.expandAll();
        jXTreeTable1.getColumn(0).setMinWidth(300);
        jXTreeTable1.doLayout();

        jPanel3.add(new JScrollPane(jXTreeTable1), BorderLayout.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXTaskPane1 = new org.jdesktop.swingx.JXTaskPane();
        jPanel2 = new javax.swing.JPanel();
        jXSearchPanel1 = new org.jdesktop.swingx.JXSearchPanel();
        jXRadioGroup1 = new org.jdesktop.swingx.JXRadioGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jXTaskPane1.setTitle("Tableaux comparatifs");
        jXTaskPane1.setToolTipText("");

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));
        jPanel2.add(jXSearchPanel1);

        jXTaskPane1.getContentPane().add(jPanel2);

        jXRadioGroup1.setLayout(new java.awt.FlowLayout());

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Janvier");
        jXRadioGroup1.add(jRadioButton1);

        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Février");
        jXRadioGroup1.add(jRadioButton2);

        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Mars");
        jXRadioGroup1.add(jRadioButton3);

        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Avril");
        jXRadioGroup1.add(jRadioButton4);

        jRadioButton5.setSelected(true);
        jRadioButton5.setText("Mai");
        jXRadioGroup1.add(jRadioButton5);

        jRadioButton6.setSelected(true);
        jRadioButton6.setText("Juin");
        jXRadioGroup1.add(jRadioButton6);

        jRadioButton7.setSelected(true);
        jRadioButton7.setText("Juillet");
        jXRadioGroup1.add(jRadioButton7);

        jRadioButton8.setSelected(true);
        jRadioButton8.setText("Août");
        jXRadioGroup1.add(jRadioButton8);

        jRadioButton10.setSelected(true);
        jRadioButton10.setText("Septembre");
        jXRadioGroup1.add(jRadioButton10);

        jRadioButton9.setSelected(true);
        jRadioButton9.setText("Octobre");
        jXRadioGroup1.add(jRadioButton9);

        jRadioButton11.setSelected(true);
        jRadioButton11.setText("Novembre");
        jXRadioGroup1.add(jRadioButton11);

        jRadioButton12.setSelected(true);
        jRadioButton12.setText("Décembre");
        jXRadioGroup1.add(jRadioButton12);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED)));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(java.awt.Color.lightGray);
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Année 2013");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        jXRadioGroup1.add(jPanel1);

        jXTaskPane1.getContentPane().add(jXRadioGroup1);

        add(jXTaskPane1, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.BorderLayout());
        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public final DefaultTreeModel loadModel(ColumnData cd) {
        JXTree load_tree = new JXTree();
        TreeTools t = new TreeTools(load_tree);
        t.loadTcTree(entreprise_.getStructureAnalytique(), load_tree, exercice_.getFec(), exercice_, cd);
        return (DefaultTreeModel) load_tree.getModel();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private org.jdesktop.swingx.JXRadioGroup jXRadioGroup1;
    private org.jdesktop.swingx.JXSearchPanel jXSearchPanel1;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane1;
    // End of variables declaration//GEN-END:variables
}
