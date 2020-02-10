/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.packages.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import my.packages.Empresa;
import my.packages.utilities.DBconnection;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author rhino
 */
public class init extends JFrame{
    
    private Empresa empresa;
    private DBconnection connection;
    private InicioSesion inicioSesion;
    private Registro registro;
    private SinUsuario sinUsuario;
    
    
    public init(Empresa empresa, DBconnection connection) {
        this.empresa = empresa;
        this.connection = connection;
        sinUsuario = new SinUsuario();
        initComponents();
    }
    
    private void initComponents(){
        JButton_cerrar = new javax.swing.JButton();
        UNTIQUETE = new javax.swing.JLabel();
        Conciertos = new javax.swing.JLabel();
        jLabel_foto1 = new javax.swing.JLabel();
        jLabel_foto2 = new javax.swing.JLabel();
        jLabel_desc1 = new javax.swing.JLabel();
        jLabel_foto3 = new javax.swing.JLabel();
        jLabel_desc2 = new javax.swing.JLabel();
        jLabel_desc3 = new javax.swing.JLabel();
        jButton_comprar = new javax.swing.JButton();
        jButton_comprar1 = new javax.swing.JButton();
        jButton_comprar2 = new javax.swing.JButton();
        jButton_reservar = new javax.swing.JButton();
        jButton_reservar1 = new javax.swing.JButton();
        jButton_reservar2 = new javax.swing.JButton();
        jButton_iniciar = new javax.swing.JButton();
        jButton_crear = new javax.swing.JButton();
        jLabel_fondo = new javax.swing.JLabel();
        
        setSize(1032, 662);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(false);
        getContentPane().setLayout(new AbsoluteLayout());
        
        //Cerrar
        JButton_cerrar.setBackground(new java.awt.Color(255, 0, 0));
        JButton_cerrar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JButton_cerrar.setText("Cerrar");
        JButton_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_cerrarActionPerformed(evt);
            }
        });
        getContentPane().add(JButton_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));
        
        //label unitiquete
        UNTIQUETE.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        UNTIQUETE.setForeground(new java.awt.Color(255, 0, 0));
        UNTIQUETE.setText("UNTIQUETE");
        getContentPane().add(UNTIQUETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 390, 90));
        
        //label Conciertos
        Conciertos.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Conciertos.setText("Conciertos");
        getContentPane().add(Conciertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));
        
        //foto1
        jLabel_foto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon imagen1= new ImageIcon(getClass().getResource("/my/packages/utilities/images/1.JPG"));
        Icon ic1 = new ImageIcon(imagen1.getImage().getScaledInstance(140,140, Image.SCALE_DEFAULT));
        jLabel_foto1.setIcon(ic1);
        jLabel_foto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_foto1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel_foto1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_foto1.setIconTextGap(2);
        getContentPane().add(jLabel_foto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 140, 140));
        
        //foto2
        jLabel_foto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageIcon imagen2= new ImageIcon(getClass().getResource("/my/packages/utilities/images/2.JPG"));
        Icon ic2 = new ImageIcon(imagen2.getImage().getScaledInstance(140,140, Image.SCALE_DEFAULT));
        jLabel_foto2.setIcon(ic2);
        getContentPane().add(jLabel_foto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 140, 140));

        //foto3
        jLabel_foto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImageIcon imagen3= new ImageIcon(getClass().getResource("/my/packages/utilities/images/3.JPG"));
        Icon ic3 = new ImageIcon(imagen3.getImage().getScaledInstance(140,140, Image.SCALE_DEFAULT));
        jLabel_foto3.setIcon(ic3);
        getContentPane().add(jLabel_foto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 140, 140));

        //descripcion1
        jLabel_desc1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel_desc1.setText("<html>Viva la salsa" + "<p>" + "Plaza de toros" + "<p>" + "Diciembre 18");
        getContentPane().add(jLabel_desc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 180, 100));
        
        //descripcion2
        jLabel_desc2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel_desc2.setText("<html> Daddy Yankee" + "<p>" + "Estadio de Envigado" + "<p>" + "4 de Octubre");
        getContentPane().add(jLabel_desc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 170, 100));

        //descripcion3
        jLabel_desc3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel_desc3.setText("<html> Marco Antonio Solis y Paquita la del Barrio"
            + "<p>" + "Movistar Arena" + "<p>" + "7 de Noviembre");
        getContentPane().add(jLabel_desc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 190, 100));

        //comprar1
        jButton_comprar.setBackground(new java.awt.Color(255, 255, 0));
        jButton_comprar.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton_comprar.setText("Comprar");
        jButton_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_comprarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, -1, -1));
        
        //comprar2
        jButton_comprar1.setBackground(new java.awt.Color(255, 255, 0));
        jButton_comprar1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton_comprar1.setText("Comprar");
        jButton_comprar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_comprar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_comprar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, -1, -1));
        
        //comprar3
        jButton_comprar2.setBackground(new java.awt.Color(255, 255, 0));
        jButton_comprar2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton_comprar2.setText("Comprar");
        jButton_comprar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_comprar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_comprar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, -1, -1));
        
        
        //reservar1
        jButton_reservar.setBackground(new java.awt.Color(255, 255, 0));
        jButton_reservar.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton_reservar.setText("Reservar");
        jButton_reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reservarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, -1, -1));

        //reservar2
        jButton_reservar1.setBackground(new java.awt.Color(255, 255, 0));
        jButton_reservar1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton_reservar1.setText("Reservar");
        jButton_reservar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reservar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_reservar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, -1, -1));

        //reservar3
        jButton_reservar2.setBackground(new java.awt.Color(255, 255, 0));
        jButton_reservar2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton_reservar2.setText("Reservar");
        jButton_reservar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reservar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_reservar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, -1, -1));
        
        //iniciar sesion
        jButton_iniciar.setBackground(new java.awt.Color(0, 204, 0));
        jButton_iniciar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_iniciar.setText("Iniciar sesión");
        jButton_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));
        
        //crear sesion
        jButton_crear.setBackground(new java.awt.Color(255, 0, 0));
        jButton_crear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton_crear.setText("Crear sesión");
        jButton_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_crearActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));
        
        //fondo
        jLabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/packages/utilities/images/fondo.png"))); // NOI18N
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 660));

        pack();
        setLocationRelativeTo(null);
    }
    
    private void JButton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        System.exit(0);
    }                                              

    private void jButton_reservar2ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        sinUsuario.setVisible(true);
    }                                                 

    private void jButton_reservarActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        sinUsuario.setVisible(true);
    }                                                

    private void jButton_reservar1ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        sinUsuario.setVisible(true);
    }                                                 

    private void jButton_comprarActionPerformed(java.awt.event.ActionEvent evt) {                                                
        sinUsuario.setVisible(true);
    }                                               

    private void jButton_iniciarActionPerformed(java.awt.event.ActionEvent evt) {                                                
        inicioSesion = new InicioSesion(empresa, connection);
        inicioSesion.setVisible(true);
        this.dispose();
    }                                               

    private void jButton_crearActionPerformed(java.awt.event.ActionEvent evt) {    
        registro = new Registro(empresa, connection, this);
        registro.setVisible(true);
        this.dispose();
//        crearSesion = new CrearSesion(empresa, connection, this);
//        crearSesion.setVisible(true);
    }                                                                                

    private void jButton_comprar1ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        sinUsuario.setVisible(true);
    }                                                

    private void jButton_comprar2ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        sinUsuario.setVisible(true);
    }                                       
    
    
    public static void main(String[] args) {
        Empresa e = new Empresa();
        DBconnection connection = new DBconnection();
        init h = new init(e, connection);
        h.setVisible(true);
    }
    
    
    
    private javax.swing.JLabel Conciertos;
    private javax.swing.JButton JButton_cerrar;
    private javax.swing.JLabel UNTIQUETE;
    private javax.swing.JButton jButton_comprar;
    private javax.swing.JButton jButton_comprar1;
    private javax.swing.JButton jButton_comprar2;
    private javax.swing.JButton jButton_crear;
    private javax.swing.JButton jButton_iniciar;
    private javax.swing.JButton jButton_reservar;
    private javax.swing.JButton jButton_reservar1;
    private javax.swing.JButton jButton_reservar2;
    private javax.swing.JLabel jLabel_desc1;
    private javax.swing.JLabel jLabel_desc2;
    private javax.swing.JLabel jLabel_desc3;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JLabel jLabel_foto1;
    private javax.swing.JLabel jLabel_foto2;
    private javax.swing.JLabel jLabel_foto3;
}
