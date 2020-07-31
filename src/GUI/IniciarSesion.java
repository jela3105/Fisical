/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.ManejoArchivos;
import Clases.Usuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Josué
 */
public class IniciarSesion extends javax.swing.JFrame {

    private ArrayList<Usuarios> listausuarios;
    RegistrarUsuario ru = new RegistrarUsuario();

    public IniciarSesion() {
        initComponents();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 1080, 720);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Usuario");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearC.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 570, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 52)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Bienvenido a FisiCal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 530, 60));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 250, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 200, 40));

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 570, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/button.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoD.jpg"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 560, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        ru.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        ManejoArchivos ma = new ManejoArchivos();
        boolean flag = false;
        if (ma.deserializarUsuario() != null) {
            listausuarios = ma.deserializarUsuario();
            char contra[] = jPasswordField1.getPassword();
            //boolean acceder = false;
            String contrasena = new String(contra);

            for (Usuarios user : listausuarios) {
                if (user.getNombre().equals(jTextField1.getText())
                        && user.getContrasena().equals(contrasena)) {
                    flag=true;
                    MenuPrincipal mu = new MenuPrincipal();
                    mu.setVisible(true);
                    mu.mandarNombreMP(jTextField1.getText());
                    dispose();
                    //System.out.println("Este perfil existe: " + profilo.getNombre());    
                    //} else {
                    //    JOptionPane.showMessageDialog(null, "Usuario y contraseñas no coinciden");
                }

            }if(flag==false){
                 JOptionPane.showMessageDialog(null, "Usuario y contraseña no coinciden");
            }        
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados");
        }

        // ManejoArchivos ma = new ManejoArchivos();
        // boolean acceder = false;
        /*char contra[] = jPasswordField1.getPassword();
        boolean acceder = false;
        String contrasena = new String(contra);
        int t = 0;
        ManejoArchivos ma = new ManejoArchivos();
        

        if (ma.deserializarUsuario() != null) {
            listausuarios = ma.deserializarUsuario();
            int s=listausuarios.size();
            s++;
            if ((contrasena == null) && ((jTextField1.getText()) == null)) {
                JOptionPane.showMessageDialog(null, "Ingrese usuario y contraseña para poder ingresar");
            } else {

                for (int i = 0; i < listausuarios.size(); i++) {
                    if (((listausuarios.get(i).getNombre()).equals(jTextField1.getText())) && ((listausuarios.get(i).getContrasena()).equals(contrasena))) {
                        acceder = true;
                    } else {
                       while((((listausuarios.get(i).getNombre())!=(jTextField1.getText())) && ((listausuarios.get(i).getContrasena()!= contrasena))) && (t<s) ){
                           t++;
                       }
                    }
                }
            }
            if (t == listausuarios.size()) {
                JOptionPane.showMessageDialog(null, "Usuario y contraseñas no coinciden");
            }
            if (acceder == true) {
                MenuPrincipal mu = new MenuPrincipal();
                mu.setVisible(true);
                mu.mandarNombreMP(jTextField1.getText());
                dispose();
            }

        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios ingresados");
        }*/
 /*
        if ((contrasena == null) && ((jTextField1.getText()) == null)) {
            JOptionPane.showMessageDialog(null, "Ingrese usuario y contraseña para poder ingresar");
        } else {
            boolean acceder = false;
            int s = listausuarios.size();
            for (int i = 0; i < s; i++) {
                if (((listausuarios.get(i).getNombre()).equals(jTextField1.getText())) && ((listausuarios.get(i).getContrasena()).equals(contrasena))) {
                    acceder = true;
                }else{
                    t++;
                }
            }
         if(t==listausuarios.size()){
             JOptionPane.showMessageDialog(null, "Usuario y contraseñas no coinciden");
         }
         if(acceder == true){
            MenuPrincipal mu = new MenuPrincipal();
            mu.setVisible(true);
            mu.mandarNombreMP(jTextField1.getText());
            dispose();
         }
        }
                /*ManejoArchivos ma = new ManejoArchivos();
        boolean acceder = false;
        boolean flag = false;

        if (ma.deserializarUsuario() != null) {
            listausuarios = ma.deserializarUsuario();
            flag = true;
        }

        int t = 0;
        int s = listausuarios.size();
        char contra[] = jPasswordField1.getPassword();
        String contrasena = new String(contra);
        for (int i = 0; i < s; i++) {
        if (((listausuarios.get(i).getNombre()).equals(jTextField1.getText())) && ((listausuarios.get(i).getContrasena()).equals(contrasena))) {
              acceder = true;
        } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        //for (int i = 0; i < s; i++) {
        //    while (((listausuarios.get(i).getNombre()).equals(jTextField1.getText())) && ((listausuarios.get(i).getContrasena()).equals(contrasena))) {
        //           t++;
        //    }
        //}
        //if(s==t) {
        //      acceder = true;
        //} else {
        //        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        //}
        }
        if (acceder == true) {
        
        /*for (int i = 0; i < s; i++) {
            while (((listausuarios.get(i).getNombre()) != (jTextField1.getText())) || ((listausuarios.get(i).getContrasena()) != (contrasena))) {
                t++;
            }
        }
        if (t == s) {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        } else {
            acceder = true;
        }

        if (flag == false) {
            JOptionPane.showMessageDialog(null, "No se ha ingresado ningun usuario");
        }

        if (acceder == true) {
            MenuPrincipal mu = new MenuPrincipal();
            mu.setVisible(true);
            mu.mandarNombreMP(jTextField1.getText());
            dispose();
        }
           
         */

    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
