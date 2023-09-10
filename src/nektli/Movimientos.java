package nektli;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Movimientos extends javax.swing.JFrame {

    /**
     * Creates new form materialFrame
     */
    public static int ID = 0;
    DefaultTableModel modelo_combinado = new DefaultTableModel();
    public Movimientos() {
        //inicialización de componentes
        initComponents();
        bd bd = new bd();
        JLogin login = new JLogin();
        ID = login.getInt();
        modelo_combinado
                .setColumnCount(0);
        modelo_combinado.addColumn("Nombre de Colmena");
        modelo_combinado.addColumn("Numeros de tratamientos");
        modelo_combinado.addColumn("Numero de cosechas");
        modelo_combinado.addColumn("Numero de alimentaciones");
        jTable1.setModel(modelo_combinado);
        // centra la ventana al medio (850, 450)
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top_panel = new javax.swing.JPanel();
        exit_button = new javax.swing.JLabel();
        minimize_button = new javax.swing.JLabel();
        left_panel = new javax.swing.JPanel();
        tabbed_pane = new javax.swing.JTabbedPane();
        add_tab = new javax.swing.JPanel();
        fill_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        add_tab1 = new javax.swing.JPanel();
        fill_label2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        update_tab = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser9 = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Material");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        top_panel.setBackground(new java.awt.Color(255, 153, 0));
        top_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit_button.setBackground(new java.awt.Color(255, 153, 0));
        exit_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        exit_button.setForeground(new java.awt.Color(255, 255, 255));
        exit_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit_button.setText("X");
        exit_button.setOpaque(true);
        exit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit_buttonMouseExited(evt);
            }
        });
        top_panel.add(exit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 20));

        minimize_button.setBackground(new java.awt.Color(255, 153, 0));
        minimize_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        minimize_button.setForeground(new java.awt.Color(255, 255, 255));
        minimize_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize_button.setText("-");
        minimize_button.setOpaque(true);
        minimize_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimize_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimize_buttonMouseExited(evt);
            }
        });
        top_panel.add(minimize_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 30, 20));

        getContentPane().add(top_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 20));

        left_panel.setBackground(new java.awt.Color(255, 255, 204));
        left_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbed_pane.setBackground(java.awt.Color.orange);
        tabbed_pane.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabbed_pane.setOpaque(true);

        add_tab.setBackground(new java.awt.Color(255, 255, 255));
        add_tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fill_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add_tab.add(fill_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 34)); // NOI18N
        jLabel2.setText("Fecha ");
        add_tab.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        add_tab.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 380, 40));
        add_tab.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 380, 40));

        add_tab1.setBackground(new java.awt.Color(255, 255, 255));
        add_tab1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fill_label2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add_tab1.add(fill_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel14.setFont(new java.awt.Font("OCR A Extended", 0, 34)); // NOI18N
        jLabel14.setText("Fecha ");
        add_tab1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        add_tab1.add(jDateChooser5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 380, 40));
        add_tab1.add(jDateChooser6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 380, 40));

        jLabel18.setFont(new java.awt.Font("OCR A Extended", 0, 34)); // NOI18N
        jLabel18.setText("Latitud");
        add_tab1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));
        add_tab1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 380, 40));
        add_tab1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 380, 40));

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 0, 34)); // NOI18N
        jLabel6.setText("Longitud");
        add_tab1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 34)); // NOI18N
        jLabel3.setText("Ciudad");
        add_tab1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));
        add_tab1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 380, 40));

        add_tab.add(add_tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add_tab.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 140, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add_tab.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 140, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Eliminar");
        add_tab.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 140, 50));

        tabbed_pane.addTab("Entrada", add_tab);

        update_tab.setBackground(new java.awt.Color(255, 255, 255));
        update_tab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        update_tab.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 140, 50));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Actualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        update_tab.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 140, 50));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Eliminar");
        update_tab.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 140, 50));

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 0, 34)); // NOI18N
        jLabel7.setText("Fecha ");
        update_tab.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        update_tab.add(jDateChooser9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 380, 40));

        jLabel26.setFont(new java.awt.Font("OCR A Extended", 0, 34)); // NOI18N
        jLabel26.setText("Ciudad");
        update_tab.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));
        update_tab.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 380, 40));

        jLabel27.setFont(new java.awt.Font("OCR A Extended", 0, 34)); // NOI18N
        jLabel27.setText("Latitud");
        update_tab.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));
        update_tab.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 380, 40));

        jLabel28.setFont(new java.awt.Font("OCR A Extended", 0, 34)); // NOI18N
        jLabel28.setText("Longitud");
        update_tab.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));
        update_tab.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 380, 40));

        tabbed_pane.addTab("Salida", update_tab);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("OCR A Extended", 0, 34)); // NOI18N
        jLabel20.setText("Motivo");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("Guardar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 140, 50));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setText("Actualizar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 140, 50));

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setText("Eliminar");
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 140, 50));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 640, 280));

        tabbed_pane.addTab("Detalles", jPanel1);

        left_panel.add(tabbed_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 0, 1700, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/MovimientoSalida/BotonRegresar.png"))); // NOI18N
        left_panel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 80));

        getContentPane().add(left_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1270, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_buttonMouseClicked
        // método que permite cerrar el sistema cuando se hace click en el
        // botón de salir
        System.exit(0);
    }//GEN-LAST:event_exit_buttonMouseClicked

    private void exit_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_buttonMouseEntered
        // método que cambia el fondo del botón cuando el usuario pasa el cursor
        exit_button.setBackground(new Color(62, 0, 0));
    }//GEN-LAST:event_exit_buttonMouseEntered

    private void exit_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_buttonMouseExited
        // método que cambia el fondo del botón cuando el usuario quita el 
        // cursor
        exit_button.setBackground(new Color(92, 0, 0));
    }//GEN-LAST:event_exit_buttonMouseExited

    private void minimize_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_buttonMouseClicked
        // método que minimiza la ventana del sistema
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimize_buttonMouseClicked

    private void minimize_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_buttonMouseEntered
        // método que cambia el fondo del botón cuando el usuario pasa el cursor
        minimize_button.setBackground(new Color(62, 0, 0));
    }//GEN-LAST:event_minimize_buttonMouseEntered

    private void minimize_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_buttonMouseExited
        // método que cambia el fondo del botón cuando el usuario quita el 
        // cursor
        minimize_button.setBackground(new Color(92, 0, 0));
    }//GEN-LAST:event_minimize_buttonMouseExited

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // guardar alimentacion
        try {
            Date selectedDate = jDateChooser8.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha_inicial = sdf.format(selectedDate);
            String tipo = jTextField14.getText();
            String alimentos = jTextField11.getText();
            double cantidad = Double.parseDouble(jTextField10.getText());
            int cantidad_dias = Integer.parseInt(jTextField7.getText());
            String descripcion = jTextArea2.getText();
            String nombre = jTextField9.getText();
            if(fecha_inicial.equals("")||tipo.equals("")||alimentos.equals("")||descripcion.equals("")||nombre.equals("")){
                JOptionPane.showMessageDialog(rootPane, "No dejes ningun campo sin rellenar");
            }else{
                int id_colmena = bd.Buscar_Colmena(nombre, ID);
                if (id_colmena!=0){
                    //Insertar_alimentacion (int id_Usuario, int id_Colmena, String fecha, String alimento,String tipo, double cantidad, int cantidad_dias
                        //,String descripcion)
                    int bandera = bd.Insertar_alimentacion(ID, id_colmena, fecha_inicial, alimentos, tipo, cantidad, cantidad_dias, descripcion);
                    if (bandera!=0){
                        JOptionPane.showMessageDialog(rootPane, "Se guardo la tarea con exito");
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Se produjo un error intentalo despues");
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "No se encontro el nombre de la colmena");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese los datos correctamente");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // guardar cosechas
        try {
            Date selectedDate = jDateChooser7.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha_inicial = sdf.format(selectedDate);
            String producto = jTextField1.getText();
            double cantidad = Double.parseDouble(jTextField8.getText());
            String descripcion = jTextArea1.getText();
            String nombre = jTextField6.getText();
            if (fecha_inicial.equals("") || producto.equals("") || descripcion.equals("") || nombre.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Rellena todos los datos");
            } else {
                //Insertar_Cosecha (int id_Usuario, int id_Colmena, String fecha, String producto, double cantidad, String descripcion)
                int id_colmena = bd.Buscar_Colmena(nombre, ID);
                if (id_colmena != 0) {
                    int bandera = bd.Insertar_Cosecha(ID, id_colmena, fecha_inicial, producto, cantidad, descripcion);
                    if (bandera != 0) {
                        JOptionPane.showMessageDialog(rootPane, "Se creo la tarea con exito");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Se produjo un error intentelo mas tarde");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se encontro el nombre de la colmena");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese los datos correctamente");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Tratamiento Guardar
        try {
            /*int id_Usuario, int id_Colmena, String fecha_inicial, String fecha_final,
            String enfermedad, String producto, double dosis,int repeticiones, String persona*/
            Date selectedDate = jDateChooser2.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha_inicial = sdf.format(selectedDate);
            selectedDate = jDateChooser1.getDate();
            String fecha_final = sdf.format(selectedDate);
            String enfermedad = jTextField3.getText();
            String producto = jTextField12.getText();
            int repeticiones = Integer.parseInt(jTextField13.getText());
            double dosis = Double.parseDouble(jTextField5.getText());
            String encargado = jTextField4.getText();
            String nombre = jTextField2.getText();

            if (fecha_inicial.equals("") || fecha_final.equals("")
                || enfermedad.equals("") || producto.equals("") || encargado.equals("") || nombre.equals("")) {

            } else {
                int id_colmena = bd.Buscar_Colmena(nombre, ID);
                if (id_colmena != 0) {
                    int bandera = bd.Ingresar_Tratamiento(ID, id_colmena, fecha_inicial, fecha_final, enfermedad, producto, dosis, repeticiones, encargado);
                    if (bandera == 1) {
                        JOptionPane.showMessageDialog(rootPane, "Se guardo la tarea con exito");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Hubo un error intentalo mas tarde");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se encontro ninguna colmena con ese nombre");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese los datos correctamente");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add_tab;
    private javax.swing.JPanel add_tab1;
    private javax.swing.JLabel exit_button;
    private javax.swing.JLabel fill_label;
    private javax.swing.JLabel fill_label2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser9;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel left_panel;
    private javax.swing.JLabel minimize_button;
    private javax.swing.JTabbedPane tabbed_pane;
    private javax.swing.JPanel top_panel;
    private javax.swing.JPanel update_tab;
    // End of variables declaration//GEN-END:variables
}
