package gestionstagiaire_marsamaroc;

import gestionstagiaire_marsamaroc.AuthentificationAdmin;
import gestionstagiaire_marsamaroc.AuthentificationAssistante;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Sessions extends javax.swing.JFrame {

    public Sessions() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelChoisirSession = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        adminIcon = new javax.swing.JLabel();
        adminLabel = new javax.swing.JLabel();
        assistanteIcon = new javax.swing.JLabel();
        assistanteLabel = new javax.swing.JLabel();
        quitterIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));
        setMinimumSize(new java.awt.Dimension(1380, 775));
        setPreferredSize(new java.awt.Dimension(1380, 775));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelChoisirSession.setBackground(new java.awt.Color(153, 153, 153));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logo 1.png"))); // NOI18N

        titre.setFont(new java.awt.Font("Vijaya", 1, 60)); // NOI18N
        titre.setForeground(new java.awt.Color(51, 51, 51));
        titre.setText("  Choisir le type d'utilisateur");
        titre.setAlignmentX(5.0F);

        adminIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icone_admin.png"))); // NOI18N
        adminIcon.setToolTipText("administrateur");
        adminIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminIconMouseClicked(evt);
            }
        });

        adminLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adminLabel.setText("        Admin Login");

        assistanteIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/assistante_icone.png"))); // NOI18N
        assistanteIcon.setToolTipText("assistante");
        assistanteIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        assistanteIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assistanteIconMouseClicked(evt);
            }
        });

        assistanteLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assistanteLabel.setText("    Assistante Login");

        quitterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/quitter1.png"))); // NOI18N
        quitterIcon.setToolTipText("Quitter");
        quitterIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quitterIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitterIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelChoisirSessionLayout = new javax.swing.GroupLayout(PanelChoisirSession);
        PanelChoisirSession.setLayout(PanelChoisirSessionLayout);
        PanelChoisirSessionLayout.setHorizontalGroup(
            PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quitterIcon)
                .addGap(47, 47, 47))
            .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(adminLabel)
                        .addGap(216, 216, 216)
                        .addComponent(assistanteLabel))
                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                        .addComponent(adminIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(assistanteIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(351, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelChoisirSessionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
        );
        PanelChoisirSessionLayout.setVerticalGroup(
            PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(quitterIcon)))
                .addGap(64, 64, 64)
                .addComponent(titre)
                .addGap(83, 83, 83)
                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                        .addComponent(adminIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                        .addComponent(assistanteIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(assistanteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        getContentPane().add(PanelChoisirSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    
    private void quitterIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitterIconMouseClicked
        frame=new JFrame();
        if(JOptionPane.showConfirmDialog(frame,"voulez vous vraiment quitter ?","Quitter",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_quitterIconMouseClicked

    private void adminIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminIconMouseClicked
        //systemExit();
        AuthentificationAdmin authAdmin =new AuthentificationAdmin();
        authAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminIconMouseClicked

    private void assistanteIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assistanteIconMouseClicked
        //systemExit();
        AuthentificationAssistante authAssis =new AuthentificationAssistante();
        authAssis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_assistanteIconMouseClicked

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
            java.util.logging.Logger.getLogger(Sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sessions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelChoisirSession;
    private javax.swing.JLabel adminIcon;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JLabel assistanteIcon;
    private javax.swing.JLabel assistanteLabel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel quitterIcon;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables

    private void systemExit(){
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    } 
   /* private void systemExit(){
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSED);
    } */
}
