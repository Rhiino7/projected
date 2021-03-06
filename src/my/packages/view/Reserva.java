/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.packages.view;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import my.packages.Empresa;
import my.packages.Usuario;
import my.packages.utilities.DBconnection;

/**
 *
 * @author Estudiante
 */
public class Reserva extends javax.swing.JFrame {

    private Usuario user;
    private inicioUsuario inicio;
    private Empresa empresa;
    private DBconnection connection;
    private String name;
    private String evento;
    public Reserva(Empresa empresa, DBconnection connection, String name, Usuario user, String evento) {
        this.user = user;
        this.empresa = empresa;
        this.connection = connection;
        this.name = name;
        this.evento = evento;
        initComponents();
        this.setLocationRelativeTo(null);
        //ImageIcon imagen1 = new ImageIcon(getClass().getResource(""))
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButton_cerrar1 = new javax.swing.JButton();
        UNTIQUETE1 = new javax.swing.JLabel();
        jButton1_atras = new javax.swing.JButton();
        jLabel_info = new javax.swing.JLabel();
        jButton_reserva = new javax.swing.JButton();
        jLabel_reserva = new javax.swing.JLabel();
        jRadioButton_preferencial = new javax.swing.JRadioButton();
        jRadioButton_platino = new javax.swing.JRadioButton();
        jLabel_fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButton_cerrar1.setBackground(new java.awt.Color(255, 0, 0));
        JButton_cerrar1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JButton_cerrar1.setText("Cerrar");
        JButton_cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_cerrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(JButton_cerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));

        UNTIQUETE1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        UNTIQUETE1.setForeground(new java.awt.Color(255, 0, 0));
        UNTIQUETE1.setText("UNTIQUETE");
        getContentPane().add(UNTIQUETE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 390, 90));

        ImageIcon imagen5= new ImageIcon(getClass().getResource("/my/packages/utilities/images/atras.jpg"));
        Icon ic5 = new ImageIcon(imagen5.getImage().getScaledInstance(70,30, Image.SCALE_DEFAULT));
        jButton1_atras.setIcon(ic5);
        jButton1_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 30));

        jLabel_info.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_info.setText("<html>Seleccione la ubicación deseada para realizar su reserva.");
        getContentPane().add(jLabel_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 550, 60));

        jButton_reserva.setBackground(new java.awt.Color(255, 255, 0));
        jButton_reserva.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton_reserva.setText("Reservar");
        jButton_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reservaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, -1, -1));

        jLabel_reserva.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_reserva.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_reserva.setText("Reserva de boleta");
        getContentPane().add(jLabel_reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        jRadioButton_preferencial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton_preferencial.setText("Preferencial    $150.000");
        getContentPane().add(jRadioButton_preferencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        jRadioButton_platino.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton_platino.setText("Platino           $300.000");
        getContentPane().add(jRadioButton_platino, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        jLabel_fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/packages/utilities/images/fondo.png")));
        getContentPane().add(jLabel_fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_cerrar1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JButton_cerrar1ActionPerformed

    private void jButton1_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_atrasActionPerformed
        inicio = new inicioUsuario(empresa, connection, name, user);
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1_atrasActionPerformed

    private void jButton_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_reservaActionPerformed
        ReservaExitosa reservaExitosa = new ReservaExitosa(empresa, connection, name, user, evento);
        reservaExitosa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_reservaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_cerrar1;
    private javax.swing.JLabel UNTIQUETE1;
    private javax.swing.JButton jButton1_atras;
    private javax.swing.JButton jButton_reserva;
    private javax.swing.JLabel jLabel_fondo1;
    private javax.swing.JLabel jLabel_info;
    private javax.swing.JLabel jLabel_reserva;
    private javax.swing.JRadioButton jRadioButton_platino;
    private javax.swing.JRadioButton jRadioButton_preferencial;
    // End of variables declaration//GEN-END:variables
}
