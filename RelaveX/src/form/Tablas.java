/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import clase.CSistema;
import clase.CTabla;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julio
 */
public class Tablas extends javax.swing.JFrame {
//cerrar form propiedad deafultcloseoperation : hide 

    CSistema objs;
    DefaultTableModel amodel;

    /**
     * Creates new form
     */
    public Tablas(CSistema objs) {
        initComponents();
        this.objs = objs;
        LlenaTabla(this.jTable1);

    }

    void LlenaTabla(JTable tabla) {
        
        //tabla.setDefaultRenderer(Object.class, new Render());
        
        CTabla objt = new CTabla(Long.parseLong(this.idtabla.getText()), this.txtdescripcion.getText());
        amodel = objt.Listar();

        if (objt.xError.equals("") == true) {
            tabla.setModel(amodel);
            
            JButton bt1 = new JButton("Modificar");
            JButton bt2 = new JButton("Eliminar");
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Error : \n" + objt.xError);
        }
        
        
        //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bunuevo = new javax.swing.JButton();
        buguardar = new javax.swing.JButton();
        bueliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        idtabla = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bunuevo.setText("Nuevo");
        bunuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bunuevoActionPerformed(evt);
            }
        });

        buguardar.setText("Guardar");
        buguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buguardarActionPerformed(evt);
            }
        });

        bueliminar.setText("Eliminar");
        bueliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bueliminarActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setLabelFor(idtabla);
        jLabel1.setText("idtabla");

        idtabla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idtabla.setText("0");

        jLabel3.setLabelFor(txtdescripcion);
        jLabel3.setText("Descripcion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idtabla)
                        .addGap(374, 374, 374))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bunuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bueliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdescripcion)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idtabla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bunuevo)
                    .addComponent(buguardar)
                    .addComponent(bueliminar))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bunuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bunuevoActionPerformed
        // TODO add your handling code here:
        Limpiar();

    }//GEN-LAST:event_bunuevoActionPerformed

    private void buguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buguardarActionPerformed
        // TODO add your handling code here:
        if (this.txtdescripcion.getText().trim().equals("") == true) {
            JOptionPane.showMessageDialog(null, "Ingrese descripcion de tabla");
            return;
        }

        CTabla objt = new CTabla(Long.parseLong(this.idtabla.getText()), this.txtdescripcion.getText());
        objt.Guardar();

        if (objt.xError.equals("") == true) {
            Limpiar();
            LlenaTabla(this.jTable1);
            JOptionPane.showMessageDialog(null, "Tabla guardado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error : \n" + objt.xError);
        }


    }//GEN-LAST:event_buguardarActionPerformed


    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        if (jTable1.getSelectedRow() != -1) {
            String cod = (String) amodel.getValueAt(jTable1.getSelectedRow(), 0);
            String des = (String) amodel.getValueAt(jTable1.getSelectedRow(), 1);

            this.idtabla.setText(cod);
            this.txtdescripcion.setText(des);
            this.txtdescripcion.requestFocus();

        } else {
            System.out.println("Seleccione un renglon primero");
        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        boolean a = jTable1.isEditing();
        if (a == false) {
            JOptionPane.showMessageDialog(null, "Tabla no es editable");
        }
    }//GEN-LAST:event_jTable1KeyPressed

    private void bueliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bueliminarActionPerformed
        // TODO add your handling code here:
        if (Long.parseLong(this.idtabla.getText()) == 0){
            JOptionPane.showMessageDialog(null, "Seleccione tabla en lista");
            return;
        }
        
        CTabla objt = new CTabla(Long.parseLong(this.idtabla.getText()), this.txtdescripcion.getText());
        objt.Eliminar();
        
        if (objt.xError.equals("") == true) {
            Limpiar();
            LlenaTabla(this.jTable1);
            JOptionPane.showMessageDialog(null, "Tabla eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error : \n" + objt.xError);
        }
    }//GEN-LAST:event_bueliminarActionPerformed

    private void Limpiar(){
        this.idtabla.setText("0");
        this.txtdescripcion.setText("");
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
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CSistema objs = new CSistema();
                new Tablas(objs).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bueliminar;
    private javax.swing.JButton buguardar;
    private javax.swing.JButton bunuevo;
    private javax.swing.JLabel idtabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtdescripcion;
    // End of variables declaration//GEN-END:variables
}
