/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nektli;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 52811
 */
public class Colmenas extends javax.swing.JFrame {

    /**
     * Creates new form Colmenas
     */
    public Colmenas() {
        initComponents();
        jDateChooser1.getDateEditor().setEnabled(false);
        jLabel15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Cerrar la ventana cuando se hace clic en la etiqueta
                Menu menu = new Menu ();
                menu.setVisible(true);
                dispose();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox4 = new javax.swing.JComboBox<String>();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Producción", "Nucleo" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 260, 30));

        jTextField2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 260, 30));

        jLabel5.setBackground(new java.awt.Color(78, 37, 19));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(78, 37, 19));
        jLabel5.setText("Longitud");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        jLabel3.setBackground(new java.awt.Color(78, 37, 19));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(78, 37, 19));
        jLabel3.setText("Número de Bastidores");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel4.setBackground(new java.awt.Color(78, 37, 19));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(78, 37, 19));
        jLabel4.setText("Ciudad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, -1, -1));

        jLabel6.setBackground(new java.awt.Color(78, 37, 19));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(78, 37, 19));
        jLabel6.setText("Tipos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel7.setBackground(new java.awt.Color(78, 37, 19));
        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(78, 37, 19));
        jLabel7.setText("Latitud");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        jTextField5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 260, 30));

        jLabel8.setBackground(new java.awt.Color(78, 37, 19));
        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(78, 37, 19));
        jLabel8.setText("Nombre");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel9.setBackground(new java.awt.Color(78, 37, 19));
        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(78, 37, 19));
        jLabel9.setText("Fecha");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        jLabel10.setBackground(new java.awt.Color(78, 37, 19));
        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(78, 37, 19));
        jLabel10.setText("Número de alzas");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        jLabel11.setBackground(new java.awt.Color(78, 37, 19));
        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(78, 37, 19));
        jLabel11.setText("Suelo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 320, -1, -1));
        getContentPane().add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 260, 100));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 260, 30));

        jTextField6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 260, 30));

        jTextField7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 260, 30));

        jLabel12.setBackground(new java.awt.Color(78, 37, 19));
        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(78, 37, 19));
        jLabel12.setText("Descripción");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        jLabel13.setBackground(new java.awt.Color(78, 37, 19));
        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(78, 37, 19));
        jLabel13.setText("Estado");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, -1, -1));

        jTextField8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 13)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 260, 30));

        jTextField10.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 260, 30));

        jLabel14.setBackground(new java.awt.Color(78, 37, 19));
        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 34)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(78, 37, 19));
        jLabel14.setText("Protección");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 204, 51));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 34)); // NOI18N
        jButton3.setText("Listo");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 480, 210, 60));

        jComboBox1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activa", "Inactiva" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 260, 30));

        jComboBox2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SI", "NO" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 260, 30));

        jComboBox3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 13)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tierra", "Cemento" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 260, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/MovimientoSalida/BotonRegresar.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 53)); // NOI18N
        jLabel2.setText("COLMENAS");
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Colmenas/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String nombre = jTextField8.getText();
            int n_alzas = Integer.parseInt(jTextField7.getText());
            int n_bastidores = Integer.parseInt(jTextField6.getText());
            //Trabajo con jcombobox
            Object Item = jComboBox3.getSelectedItem();
            String suelo = Item.toString();
            Item = jComboBox4.getSelectedItem();
            String tipo = Item.toString();
            Item = jComboBox2.getSelectedItem();
            String proteccion = Item.toString();
            Item = jComboBox1.getSelectedItem();
            String estado = Item.toString();
            ///////////////////////////////
            //Tratamiento de fecha
            Date selectedDate = jDateChooser1.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String Fecha = sdf.format(selectedDate);
            ///////////////////////////////////
            double longitud = Double.parseDouble(jTextField2.getText());
            double latitud = Double.parseDouble(jTextField5.getText());
            String ciudad = jTextField10.getText();
            String descripcion = textArea1.getText();
            if (nombre.equals("") || n_alzas==0 || n_bastidores==0 || tipo.equals("") || Fecha.equals("") || longitud==0
            || latitud==0 || ciudad.equals("") || descripcion.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Ingresa todos los datos");
            }else{
                bd bd = new bd();
                JLogin ID = new JLogin();
                int id = ID.getInt();
                boolean bandera = bd.Insertar_Colmena(nombre, n_alzas, n_bastidores, tipo, suelo, proteccion, estado, Fecha,
                longitud, latitud, ciudad, descripcion, id);
                if (bandera == true) {
                    JOptionPane.showMessageDialog(rootPane, "Se creo la colmena con exito");
                    Menu menu = new Menu ();
                    menu.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Ups! ocurrio un error intentalo despues");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Tipos de datos incorrectos en tus respuestas");
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
            java.util.logging.Logger.getLogger(Colmenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Colmenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Colmenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Colmenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Colmenas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
