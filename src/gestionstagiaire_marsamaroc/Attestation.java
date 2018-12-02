package gestionstagiaire_marsamaroc;

import gestionstagiaire_marsamaroc.InterfaceAdmin;
//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import gestionstagiaire_marsamaroc.Sessions;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
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

public class Attestation extends javax.swing.JFrame {
    
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
    private int indice_vis;
    private Date date = new Date(); 
     
    Connection conn=null;
    Statement st=null;
    ResultSet rs=null;

    public Attestation() {
        initComponents();
    }
    public Attestation(int i,DefaultTableModel dt) {
        initComponents();
        indice_vis=i;
        dtm=dt;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        ImpBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DateLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NomLbl = new javax.swing.JLabel();
        SexeeLbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DirectionLbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DebutLbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        FinLbl = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        InterLbl = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setPreferredSize(new java.awt.Dimension(800, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 700));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 700));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(800, 700));
        jPanel4.setPreferredSize(new java.awt.Dimension(800, 700));

        ImpBtn.setBackground(new java.awt.Color(255, 255, 255));
        ImpBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ImpBtn.setText("Imprimer");
        ImpBtn.setAlignmentY(0.0F);
        ImpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImpBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setText("Casablanca le ");

        DateLbl.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ATTESTATION  DE  STAGE");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 2, 16)); // NOI18N
        jLabel3.setText("Je soussigné Monsieur Tarik HAMANE, Chef de la ");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 2, 16)); // NOI18N
        jLabel4.setText("Division Développement des Ressources Humaines à ");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 3, 16)); // NOI18N
        jLabel5.setText("MARSA MAROC");

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 2, 16)); // NOI18N
        jLabel6.setText(",");

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 2, 16)); // NOI18N
        jLabel7.setText("atteste par la présente que ");

        NomLbl.setFont(new java.awt.Font("Bookman Old Style", 3, 16)); // NOI18N

        SexeeLbl.setFont(new java.awt.Font("Bookman Old Style", 3, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 2, 16)); // NOI18N
        jLabel8.setText("a effectué un stage au sein de la Direction Générale ");

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 3, 16)); // NOI18N
        jLabel9.setText("( Direction ");

        DirectionLbl.setFont(new java.awt.Font("Bookman Old Style", 3, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 3, 16)); // NOI18N
        jLabel10.setText(")");

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 2, 16)); // NOI18N
        jLabel11.setText("et ce du ");

        DebutLbl.setFont(new java.awt.Font("Bookman Old Style", 2, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 2, 16)); // NOI18N
        jLabel12.setText("au");

        FinLbl.setFont(new java.awt.Font("Bookman Old Style", 2, 16)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Bookman Old Style", 2, 18)); // NOI18N
        jLabel13.setText(".");

        jLabel14.setFont(new java.awt.Font("Bookman Old Style", 2, 16)); // NOI18N
        jLabel14.setText("Cette attestation est délivrée à");

        InterLbl.setFont(new java.awt.Font("Bookman Old Style", 2, 16)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Bookman Old Style", 2, 16)); // NOI18N
        jLabel15.setText("pour servir et valoir ce que de droit . ");

        jLabel16.setFont(new java.awt.Font("Bookman Old Style", 3, 14)); // NOI18N
        jLabel16.setText("Le chef de la Division");

        jLabel17.setFont(new java.awt.Font("Bookman Old Style", 3, 14)); // NOI18N
        jLabel17.setText("Développement des Ressources ");

        jLabel18.setFont(new java.awt.Font("Bookman Old Style", 3, 14)); // NOI18N
        jLabel18.setText("Humaines ");

        jLabel19.setFont(new java.awt.Font("Bookman Old Style", 3, 14)); // NOI18N
        jLabel19.setText("Tarik HAMANE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(498, 498, 498)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(jLabel17))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(jLabel16))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(ImpBtn)
                                .addGap(349, 349, 349)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel18))))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SexeeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(NomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(FinLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel13))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(DirectionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DebutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(InterLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SexeeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NomLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DebutLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DirectionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(InterLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(ImpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(FinLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(86, 86, 86))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        try{
         
        // connexion avec base de donnée 
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_stagiaire","root","");
        st = conn.createStatement();
        String dd=null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dd=sdf.format(date);
        DateLbl.setText(dd);
        NomLbl.setText(dtm.getValueAt(indice_vis,1).toString()+"  "+dtm.getValueAt(indice_vis,2).toString() );
        DebutLbl.setText(dtm.getValueAt(indice_vis,17).toString());
        FinLbl.setText(dtm.getValueAt(indice_vis,18).toString());
        
        if(dtm.getValueAt(indice_vis,12).toString().equalsIgnoreCase("DF")){
            DirectionLbl.setText("Finacière");;
        }
        if(dtm.getValueAt(indice_vis,12).toString().equalsIgnoreCase("DRPTM2")){
            DirectionLbl.setText("Réalisation du Projet Tanger Med 2");;
        }
        if(dtm.getValueAt(indice_vis,12).toString().equalsIgnoreCase("DAJ")){
            DirectionLbl.setText("Affaires juridiques");;
        }
        if(dtm.getValueAt(indice_vis,12).toString().equalsIgnoreCase("DA")){
            DirectionLbl.setText("Achats");;
        }
        if(dtm.getValueAt(indice_vis,12).toString().equalsIgnoreCase("DDS")){
            DirectionLbl.setText("Développement et Stratégie");;
        }
        if(dtm.getValueAt(indice_vis,12).toString().equalsIgnoreCase("DPO")){
            DirectionLbl.setText("Performance Opérationnelle");;
        }
        if(dtm.getValueAt(indice_vis,12).toString().equalsIgnoreCase("DAIO")){
            DirectionLbl.setText("Audit Interne et Organisation");;
        }
        if(dtm.getValueAt(indice_vis,12).toString().equalsIgnoreCase("DRH")){
            DirectionLbl.setText("Ressources Humaines");;
        }
        if(dtm.getValueAt(indice_vis,12).toString().equalsIgnoreCase("DSI")){
            DirectionLbl.setText("Système d'Information");;
        }
        
        
        if(dtm.getValueAt(indice_vis,6).toString().equalsIgnoreCase("Masculin")){
            InterLbl.setText("l'intérssé");
            SexeeLbl.setText("MR.");
        }
        else{
            InterLbl.setText("l'intérssée");
            SexeeLbl.setText("Mlle.");
        }
      /*
        NomLbl.setText(dtm.getValueAt(indice_vis,1).toString());
        TelLbl.setText(dtm.getValueAt(indice_vis,3).toString());
        AdrTextArea.setText(dtm.getValueAt(indice_vis,4).toString());
        EmailLbl.setText(dtm.getValueAt(indice_vis,7).toString());
        CINLbl.setText(dtm.getValueAt(indice_vis,5).toString());
        EtabLbl.setText(dtm.getValueAt(indice_vis,8).toString());
        VilleLbl.setText(dtm.getValueAt(indice_vis,9).toString());
        EncadLbl.setText(dtm.getValueAt(indice_vis,14).toString());
        ProfLbl.setText(dtm.getValueAt(indice_vis,10).toString()+" ( "+dtm.getValueAt(indice_vis,11).toString()+" )");
        ThemeTextArea.setText(dtm.getValueAt(indice_vis,16).toString());
        DebutLbl.setText(dtm.getValueAt(indice_vis,17).toString());
        FinLbl.setText(dtm.getValueAt(indice_vis,18).toString());
       
      */
       
    }catch(Exception e){
        System.out.printf("erreur   "+e.getMessage());//getMessage c'est une fonction  pour afficher l'Erreur ou se trouve ?!!!!!
        JOptionPane.showMessageDialog(null, "Aucun stagiaire n'a été séléctionné \n  ");
    }
    }//GEN-LAST:event_formWindowOpened

    private void ImpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImpBtnActionPerformed
        PrinterJob job=PrinterJob.getPrinterJob();
        job.setJobName("imprimer");
        job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf,int pageNum){
                if(pageNum>0){
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2=(Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.24, 0.24);
                jPanel2.paint(g2);
                return Printable.PAGE_EXISTS;
            }
        });
        boolean ok =job.printDialog();
        if(ok){
            try{
                job.print();
            } catch(PrinterException ex){}
        }
    }//GEN-LAST:event_ImpBtnActionPerformed

    private void systemExit(){
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
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
                new Attestation().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateLbl;
    private javax.swing.JLabel DebutLbl;
    private javax.swing.JLabel DirectionLbl;
    private javax.swing.JLabel FinLbl;
    private javax.swing.JButton ImpBtn;
    private javax.swing.JLabel InterLbl;
    private javax.swing.JLabel NomLbl;
    private javax.swing.JLabel SexeeLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
