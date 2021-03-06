/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.packages.view;

import javax.swing.JFrame;
import my.packages.Empresa;
import my.packages.utilities.DBconnection;

/**
 *
 * @author rhino
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    Empresa empresa;
    DBconnection connection;
    JFrame jframe;
    public Registro(Empresa empresa, DBconnection connection, JFrame jframe) {
        initComponents();
        this.empresa = empresa;
        this.connection = connection;
        this.jframe = jframe;
        setLocationRelativeTo(null);
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
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        numid = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        number = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 140, -1));
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 140, -1));
        jPanel1.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, -1));
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 140, -1));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 140, -1));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 140, -1));

        numid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numidActionPerformed(evt);
            }
        });
        jPanel1.add(numid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 140, -1));
        jPanel1.add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 140, -1));
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 140, -1));
        jPanel1.add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 140, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Volver");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 130, 37));

        jButton2.setBackground(new java.awt.Color(102, 255, 51));
        jButton2.setText("Registrarse");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 130, 37));
        jPanel1.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 140, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("Genero");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setText("NumeroID");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setText("Numero");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText("Ciudad");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setText("ID");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setText("Usuario");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setText("Password");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setText("Correo");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setText("Edad");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setText("Nombre");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setText("Apellidos");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 290, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numidActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        if(nombre.getText().equals("")||apellido.getText().equals("")||edad.getText().equals("")||user.getText().equals("")
         ||pass.getText().equals("")||id.getText().equals("")||numid.getText().equals("")||genero.getText().equals("")
         ||correo.getText().equals("")||ciudad.getText().equals("")){
            
            this.jLabel1.setText("Rellene todos los campos.");
        }else{
            String name1 = nombre.getText();
            String name2 = apellido.getText();
            String name3 = edad.getText();
            String name4 = user.getText();
            String name5 = pass.getText();
            String name6 = id.getText();
            String name7 = numid.getText();
            String name8 = genero.getText();
            String name9 = correo.getText();
            String name10 = ciudad.getText();
            String name11 = number.getText();
            boolean b = empresa.addUsuario(name1, name2, Integer.parseInt(name3), name4, name5, name6, Integer.parseInt(name7), name8, name9, name10, Integer.parseInt(name11), 0, 0);
            if(b){
                this.setVisible(false);
                jframe.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        jframe.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField genero;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField number;
    private javax.swing.JTextField numid;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
