package gestionstagiaire_marsamaroc;

import gestionstagiaire_marsamaroc.InterfaceAdmin;
//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import gestionstagiaire_marsamaroc.Sessions;
import gestionstagiaire_marsamaroc.InterfaceAdmin;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import static java.time.LocalDate.now;
import java.util.Date;
//import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
//import com.mysql.jdbc.Driver;

public class Stagiaires_en_cours extends javax.swing.JFrame {
    
    private DefaultTableModel dtm;
    private int Num_dossier;
    private String Nom;
    private String Prenom;
    private String Telephone;
    private String Adresse;
    private String CIN;
    private String Sexe;
    private String Email;
    private String Etablissement;
    private String Ville;
    private String Profil;
    private String Specialite;
    private String Direction;
    private String Division;
    private String Encadrant;
    private String Type_stage;
    private String Theme_stage;
    private String Debut_stage;
    private String Fin_stage;
    private String Duree_stage;
    private String Date_saisi;
    private String Heure_saisi;
    private String DateHeure_saisi;
    private String Statut;
    private String Justif;
    
    Connection conn=null;
    Statement st=null;
    ResultSet rs=null;

    public Stagiaires_en_cours() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelChoisirSession = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        RechercheComb = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        RechercheText = new javax.swing.JTextField();
        RechercherBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        affichTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        returnIcon = new javax.swing.JLabel();
        ActualiserBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1380, 775));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelChoisirSession.setBackground(new java.awt.Color(153, 153, 153));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logo 1.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Rechercher par :");

        RechercheComb.setBackground(new java.awt.Color(153, 153, 153));
        RechercheComb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Num_dossier", "Nom", "Etablissement", "Direction", "Validation", "Profil" }));

        jLabel24.setBackground(new java.awt.Color(153, 153, 153));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Donnée à rechercher :");

        RechercherBtn.setBackground(new java.awt.Color(153, 153, 153));
        RechercherBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RechercherBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/rechercher.png"))); // NOI18N
        RechercherBtn.setText("Rechercher");
        RechercherBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RechercherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercherBtnActionPerformed(evt);
            }
        });

        affichTable.setBackground(new java.awt.Color(0, 204, 0));
        affichTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        affichTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Num_dossier", "Nom", "Prenom", "Telephone", "Adresse", "CIN", "Sexe", "Email", "Etablissement", "Ville", "Profil", "Specialite", "Direction", "Division", "Encadrant", "Type_stage", "Theme_stage", "Debut_stage", "Fin_stage", "Duree_stage", "DateHeure_saisi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        affichTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        affichTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        affichTable.getTableHeader().setReorderingAllowed(false);
        affichTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                affichTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(affichTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Stagiaires en cours");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        returnIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/return.png"))); // NOI18N
        returnIcon.setToolTipText("Retour");
        returnIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnIconMouseClicked(evt);
            }
        });

        ActualiserBtn.setBackground(new java.awt.Color(153, 153, 153));
        ActualiserBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ActualiserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/actualiser .png"))); // NOI18N
        ActualiserBtn.setText("Actualiser");
        ActualiserBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActualiserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualiserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelChoisirSessionLayout = new javax.swing.GroupLayout(PanelChoisirSession);
        PanelChoisirSession.setLayout(PanelChoisirSessionLayout);
        PanelChoisirSessionLayout.setHorizontalGroup(
            PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelChoisirSessionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE)
                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelChoisirSessionLayout.createSequentialGroup()
                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(46, 46, 46)
                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RechercheText)
                            .addComponent(RechercheComb, 0, 178, Short.MAX_VALUE)))
                    .addComponent(RechercherBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(172, 172, 172)
                .addComponent(returnIcon)
                .addGap(54, 54, 54))
            .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ActualiserBtn)
                    .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                            .addGap(236, 236, 236)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 64, Short.MAX_VALUE))
        );
        PanelChoisirSessionLayout.setVerticalGroup(
            PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(returnIcon))
                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RechercheComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(RechercheText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RechercherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(ActualiserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        getContentPane().add(PanelChoisirSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1380, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        try{
         
        // connexion avec base de donnée 
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_stagiaire","root","");
        st = conn.createStatement();
      
        dtm = new DefaultTableModel();// dtm c'est un variable pour stocker les element d'un tableau {ligne et colomn}
  
        dtm.addColumn("N°dossier");
        dtm.addColumn("Nom");
        dtm.addColumn("Prenom");
        dtm.addColumn("Telephone");
        dtm.addColumn("Adresse");
        dtm.addColumn("CIN");
        dtm.addColumn("Sexe");
        dtm.addColumn("Email");
        dtm.addColumn("Etablissement");
        dtm.addColumn("Ville");
        dtm.addColumn("Profil");    
        dtm.addColumn("Specialite");
        dtm.addColumn("Direction");
        dtm.addColumn("Division");
        dtm.addColumn("Encadrant");
        dtm.addColumn("Type_stage");
        dtm.addColumn("Theme_stage");
        dtm.addColumn("Debut_stage");
        dtm.addColumn("Fin_stage");
        dtm.addColumn("Duree_stage");
        dtm.addColumn("DateHeure_saisi");
        dtm.addColumn("Statut");
        dtm.addColumn("Justif");
       affichTable.setModel(dtm);
       affichTable.setShowHorizontalLines(true);
       affichTable.setShowVerticalLines(true);
       
        // afficeher la liste des stagiaires
        AfficherStagiaire();
        // remplir les champs 
       
    }catch(Exception e){
        System.out.printf("erreur   "+e.getMessage());//getMessage c'est une fonction  pour afficher l'Erreur ou se trouve ?!!!!!
        JOptionPane.showMessageDialog(null, "Erreur de connexion\n  "+ e.getMessage());
    }
    }//GEN-LAST:event_formWindowOpened

    private void affichTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_affichTableMouseClicked

    }//GEN-LAST:event_affichTableMouseClicked

    private void RechercherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercherBtnActionPerformed
        try { 
    dtm.setRowCount(0); //pour vider tableau 
    Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery( "SELECT * FROM stagiaire WHERE "+combo()
                +"  like '%"+RechercheText.getText()+"%' and Debut_stage<=now() and Fin_stage >= now() and Validation=1 " );
    
     while(rs.next()){
            Num_dossier=rs.getInt("Num_dossier");
            Nom = rs.getString("Nom");
            Prenom = rs.getString("Prenom");
            Telephone = rs.getString("Telephone");
            Adresse =rs.getString("Adresse");
            CIN=rs.getString("CIN");
            Sexe=rs.getString("Sexe");
            Email=rs.getString("Email");
            Etablissement=rs.getString("Etablissement");
            Ville=rs.getString("Ville");
            Profil=rs.getString("Profil");
            Specialite=rs.getString("Specialite");
            Direction=rs.getString("Direction");
            Division=rs.getString("Division");
            Encadrant=rs.getString("Encadrant");
            Type_stage=rs.getString("Type_stage");
            Theme_stage=rs.getString("Theme_stage");
            Debut_stage= rs.getString("Debut_stage");
            Fin_stage= rs.getString("Fin_stage");
            Duree_stage= rs.getString("Duree_stage"); 
            Date_saisi=rs.getDate("DateHeure_saisi").toString();
            Heure_saisi=rs.getTime("DateHeure_saisi").toString();
           DateHeure_saisi=Date_saisi +" "+ Heure_saisi;
           Statut=rs.getString("Statut");
           Justif=rs.getString("Justif");
         
            Object[] stg = {Num_dossier,Nom,Prenom,Telephone,Adresse,CIN,Sexe,Email,Etablissement,Ville,Profil,Specialite,Direction,Division,Encadrant,Type_stage,Theme_stage,Debut_stage,Fin_stage,Duree_stage,DateHeure_saisi,Statut,Justif};
            dtm.addRow(stg);
        }
     
        if (dtm.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Aucun Stagiaire");
            AfficherStagiaire(); // afficehr tout les stgs
        }
    
}catch (Exception m){JOptionPane.showMessageDialog(null, "Erreur recherche"+m.getMessage());
System.err.println(m);
}
    }//GEN-LAST:event_RechercherBtnActionPerformed

    private void returnIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnIconMouseClicked
        //systemExit();
        InterfaceAdmin interAdmn =new InterfaceAdmin();
        interAdmn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnIconMouseClicked

    private void ActualiserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualiserBtnActionPerformed
        AfficherStagiaire();
        RechercheText.setText(""); 
        RechercheComb.setSelectedIndex(0);
    }//GEN-LAST:event_ActualiserBtnActionPerformed

    private void systemExit(){
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    }
    
    private void AfficherStagiaire(){
        
       try{
        dtm.setRowCount(0); // vider la liste des stagiaires.
        
        rs = st.executeQuery("Select * From stagiaire where Debut_stage<=now() and Fin_stage >= now() and Validation=1");
        
        while(rs.next()){
            Num_dossier=rs.getInt("Num_dossier");
            Nom = rs.getString("Nom");
            Prenom = rs.getString("Prenom");
            Telephone = rs.getString("Telephone");
            Adresse =rs.getString("Adresse");
            CIN=rs.getString("CIN");
            Sexe=rs.getString("Sexe");
            Email=rs.getString("Email");
            Etablissement=rs.getString("Etablissement");
            Ville=rs.getString("Ville");
            Profil=rs.getString("Profil");
            Specialite=rs.getString("Specialite");
            Direction=rs.getString("Direction");
            Division=rs.getString("Division");
            Encadrant=rs.getString("Encadrant");
            Type_stage=rs.getString("Type_stage");
            Theme_stage=rs.getString("Theme_stage");
            Debut_stage= rs.getString("Debut_stage");
            Fin_stage= rs.getString("Fin_stage");
            Duree_stage= rs.getString("Duree_stage"); 
            Date_saisi=rs.getDate("DateHeure_saisi").toString();
            Heure_saisi=rs.getTime("DateHeure_saisi").toString();
            DateHeure_saisi=Date_saisi +" "+ Heure_saisi;
            Statut=rs.getString("Statut");
            Justif=rs.getString("Justif");
         
            Object[] stg = {Num_dossier,Nom,Prenom,Telephone,Adresse,CIN,Sexe,Email,Etablissement,Ville,Profil,Specialite,Direction,Division,Encadrant,Type_stage,Theme_stage,Debut_stage,Fin_stage,Duree_stage,DateHeure_saisi,Statut,Justif};
            dtm.addRow(stg);
            
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur dans l'affichage de la liste des stagiaires\n"+e.getMessage());
    }
}
 
String combo(){
    switch(RechercheComb.getSelectedIndex()){ 
        case 0: return "Num_dossier"; 
        case 1: return "Nom";
        case 2: return "Etablissement";
        case 3: return "Direction";
        case 4: return "Validation";
        case 5: return "Profil";
      }
      return "";
}    
  

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
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stagiaires_en_cours().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualiserBtn;
    private javax.swing.JPanel PanelChoisirSession;
    private javax.swing.JComboBox<String> RechercheComb;
    private javax.swing.JTextField RechercheText;
    private javax.swing.JButton RechercherBtn;
    private javax.swing.JTable affichTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel returnIcon;
    // End of variables declaration//GEN-END:variables
}
