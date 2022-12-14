
package Vista;

import Modelo.LoginDAO;
import Modelo.login;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    login lg = new login();
    LoginDAO login = new LoginDAO();
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtCorreo.setText("");
        txtPass.setText("");
    }
    public void validar(){
        String correo = txtCorreo.getText();
        String pass = String.valueOf(txtPass.getPassword());
        if (!"".equals(correo) || !"".equals(pass)) {
            
            lg = login.log(correo, pass);
            if (lg.getCorreo()!= null && lg.getPass() != null) {
                Sistemabiblioteca sis = new Sistemabiblioteca(lg);
                sis.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Correo o la Contraseña incorrecta");
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnIniciar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 255));
        jLabel3.setText("Biblioteca WS ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 170, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 255));
        jLabel4.setText("Contraseña");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setForeground(new java.awt.Color(18, 30, 49));
        txtCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 51, 255)));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 226, 30));

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setForeground(new java.awt.Color(18, 30, 49));
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 51, 255)));
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 226, 30));

        btnIniciar.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(153, 102, 255));
        btnIniciar.setText("Salir");
        btnIniciar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 255)));
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 100, 34));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 82, 240, 0));

        btnIniciar1.setBackground(new java.awt.Color(102, 51, 255));
        btnIniciar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnIniciar1.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar1.setText("Accerder");
        btnIniciar1.setBorderPainted(false);
        btnIniciar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnIniciar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 110, 34));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/padlock.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 30, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/perfil.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 30, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 255));
        jLabel8.setText("Usuario");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 350));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/HOL.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 460, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar1ActionPerformed
        validar();
    }//GEN-LAST:event_btnIniciar1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnIniciar1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
