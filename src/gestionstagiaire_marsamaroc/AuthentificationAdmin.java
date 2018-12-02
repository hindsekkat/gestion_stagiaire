package gestionstagiaire_marsamaroc;

import gestionstagiaire_marsamaroc.Sessions;
import gestionstagiaire_marsamaroc.InterfaceAdmin;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import com.mysql.jdbc.Driver;

public class AuthentificationAdmin extends javax.swing.JFrame {
    
    Connection conn=null;
    Statement st=null;
    ResultSet rs=null;

    public AuthentificationAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelChoisirSession = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        PanelAuthentification = new javax.swing.JPanel();
        LoginLabel = new javax.swing.JLabel();
        LoginText = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        AnnulerButton = new javax.swing.JButton();
        PasswordText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1380, 775));
        setPreferredSize(new java.awt.Dimension(1380, 775));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelChoisirSession.setBackground(new java.awt.Color(153, 153, 153));
        PanelChoisirSession.setMinimumSize(new java.awt.Dimension(1380, 775));
        PanelChoisirSession.setPreferredSize(new java.awt.Dimension(1380, 775));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logo 1.png"))); // NOI18N

        titre.setFont(new java.awt.Font("Vijaya", 1, 60)); // NOI18N
        titre.setText("       Authentification");
        titre.setAlignmentX(5.0F);

        PanelAuthentification.setBackground(new java.awt.Color(102, 102, 102));
        PanelAuthentification.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        LoginLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LoginLabel.setText("Login :");
        LoginLabel.setToolTipText("");

        LoginText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PasswordLabel.setText("Mot de passe :");

        LoginButton.setBackground(new java.awt.Color(102, 102, 102));
        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.setToolTipText("Login");
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        AnnulerButton.setBackground(new java.awt.Color(102, 102, 102));
        AnnulerButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AnnulerButton.setText("Annuler");
        AnnulerButton.setToolTipText("Annuler");
        AnnulerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AnnulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerButtonActionPerformed(evt);
            }
        });

        PasswordText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAuthentificationLayout = new javax.swing.GroupLayout(PanelAuthentification);
        PanelAuthentification.setLayout(PanelAuthentificationLayout);
        PanelAuthentificationLayout.setHorizontalGroup(
            PanelAuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAuthentificationLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelAuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginLabel)
                    .addComponent(PasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelAuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LoginText)
                    .addComponent(PasswordText, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(41, 41, 41))
            .addGroup(PanelAuthentificationLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(AnnulerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        PanelAuthentificationLayout.setVerticalGroup(
            PanelAuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAuthentificationLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(PanelAuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginLabel)
                    .addComponent(LoginText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(PanelAuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(PanelAuthentificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnnulerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout PanelChoisirSessionLayout = new javax.swing.GroupLayout(PanelChoisirSession);
        PanelChoisirSession.setLayout(PanelChoisirSessionLayout);
        PanelChoisirSessionLayout.setHorizontalGroup(
            PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelChoisirSessionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelChoisirSessionLayout.createSequentialGroup()
                .addContainerGap(421, Short.MAX_VALUE)
                .addComponent(PanelAuthentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(386, 386, 386))
        );
        PanelChoisirSessionLayout.setVerticalGroup(
            PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(titre)
                .addGap(29, 29, 29)
                .addComponent(PanelAuthentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        getContentPane().add(PanelChoisirSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AnnulerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerButtonActionPerformed
        //systemExit();
        Sessions sess =new Sessions();
        sess.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_AnnulerButtonActionPerformed

    private void PasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String login=LoginText.getText();
        String password=PasswordText.getText();
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_stagiaire","root","");
            st=conn.createStatement();
            rs=st.executeQuery("select Login,Password from utilisateur where role='administrateur'");
            while(rs.next()){
                if(rs.getString(1).equals(login) && rs.getString(2).equals(password)){
                    //systemExit();
                    InterfaceAdmin interAdmn =new InterfaceAdmin();
                    interAdmn.setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Login ou mot de passe incorrect","Login System",JOptionPane.ERROR_MESSAGE);
                    LoginText.setText("");
                    PasswordText.setText("");
                }
            }
        }
        catch(SQLException ex){
            Logger.getLogger(AuthentificationAdmin.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }//GEN-LAST:event_LoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AuthentificationAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthentificationAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthentificationAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthentificationAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthentificationAdmin().setVisible(true);
            }
        });
    }
    
    private void systemExit(){
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnnulerButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JTextField LoginText;
    private javax.swing.JPanel PanelAuthentification;
    private javax.swing.JPanel PanelChoisirSession;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables

    
    

}
