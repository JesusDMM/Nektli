package javaswingdev.form;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static nektli.Tareas.ID;
import nektli.bd;

public class Tareas_Total_Tareas extends javax.swing.JPanel {

    public Tareas_Total_Tareas(String name) {
        initComponents();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        search_tab = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javaswingdev.swing.table.Table();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 53)); // NOI18N
        jLabel7.setText("Total de Tareas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(1085, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(374, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(356, 356, 356))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_tab.setBackground(new java.awt.Color(255, 255, 255));
        search_tab.setBorder(new javax.swing.border.MatteBorder(null));
        search_tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jLabel24.setText("Nombre de la colmena");
        search_tab.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jTextField15.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        search_tab.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 380, 35));

        jButton10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jButton10.setText("Buscar");
        jButton10.setOpaque(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        search_tab.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 156, 32));

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 32)); // NOI18N
        jLabel31.setText("Filtros");
        search_tab.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cantidad de tareas", "Tratamiento", "Movimiento", "Cosecha", "Alimento" }));
        search_tab.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 357, 32));

        jPanel3.add(search_tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 190));

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 920, 200));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1100, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // Buscar colmena para la tabla
        String nombre = jTextField15.getText();
        int id_colmena = bd.Buscar_Colmena(nombre, ID);
        if (id_colmena != 0) {
            Object Seleccion = jComboBox1.getSelectedItem();
            String Ocupacion = Seleccion.toString();
            TableColumn columna;
            switch (Ocupacion) {
                //Cantidad de tareas, Tratamiento, Movimiento, Cosecha, Alimento
                case "Cantidad de tareas":
                modelo_combinado
                .setColumnCount(0);
                modelo_combinado.addColumn("Nombre de Colmena");
                modelo_combinado.addColumn("Numeros de tratamientos");
                modelo_combinado.addColumn("Numero de cosechas");
                modelo_combinado.addColumn("Numero de alimentaciones");
                modelo_combinado.addColumn("Numero de movimientos");
                modelo_combinado.setRowCount(0);
                modelo_combinado = bd.Tabla_Tareas(modelo_combinado, ID, id_colmena);
                jTable1.setModel(modelo_combinado);
                break;
                case "Tratamiento":
                modelo_combinado
                .setColumnCount(0);
                modelo_combinado.addColumn("Nombre de Colmena");
                modelo_combinado.addColumn("Fecha inicial");
                modelo_combinado.addColumn("Fecha final");
                modelo_combinado.addColumn("Enfermedad");
                modelo_combinado.addColumn("Producto");
                modelo_combinado.addColumn("Dosis");
                modelo_combinado.addColumn("Repeticiones por dia");
                modelo_combinado.addColumn("Encargado");
                modelo_combinado.setRowCount(0);
                modelo_combinado = bd.Tabla_Tratamiento(modelo_combinado, ID, id_colmena);
                jTable1.setModel(modelo_combinado);
                break;
                case "Movimiento":
                modelo_combinado
                .setColumnCount(0);
                modelo_combinado.addColumn("Nombre de Colmena");
                modelo_combinado.addColumn("Fecha de salida");
                modelo_combinado.addColumn("Ciudad de salida");
                modelo_combinado.addColumn("Fecha llegada");
                modelo_combinado.addColumn("Motivo");
                modelo_combinado.setRowCount(0);
                modelo_combinado = bd.Tabla_Movimientos(modelo_combinado, ID, id_colmena);
                jTable1.setModel(modelo_combinado);
                break;
                case "Cosecha":
                modelo_combinado
                .setColumnCount(0);
                modelo_combinado.addColumn("Nombre de Colmena");
                modelo_combinado.addColumn("Fecha");
                modelo_combinado.addColumn("Producto");
                modelo_combinado.addColumn("Cantidad");
                modelo_combinado.addColumn("Descripción");

                modelo_combinado.setRowCount(0);
                modelo_combinado = bd.Tabla_Cosechas(modelo_combinado, ID, id_colmena);
                jTable1.setModel(modelo_combinado);
                columna = jTable1.getColumnModel().getColumn(4);
                columna.setPreferredWidth(400);
                break;
                case "Alimento":
                modelo_combinado
                .setColumnCount(0);
                modelo_combinado.addColumn("Nombre de Colmena");
                modelo_combinado.addColumn("Fecha");
                modelo_combinado.addColumn("Tipo");
                modelo_combinado.addColumn("Alimento");
                modelo_combinado.addColumn("Cantidad");
                modelo_combinado.addColumn("Cantidad de dias");
                modelo_combinado.addColumn("Descripcion");
                modelo_combinado.setRowCount(0);
                modelo_combinado = bd.Tabla_Alimentaciones(modelo_combinado, ID, id_colmena);
                jTable1.setModel(modelo_combinado);
                columna = jTable1.getColumnModel().getColumn(6);
                columna.setPreferredWidth(400);
                break;
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Nombre de colmena incorrecta");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JPanel search_tab;
    private javaswingdev.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
