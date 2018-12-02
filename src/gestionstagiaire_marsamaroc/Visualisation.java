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

public class Visualisation extends javax.swing.JFrame {
    
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
    
    Connection conn=null;
    Statement st=null;
    ResultSet rs=null;

    public Visualisation() {
        initComponents();
    }
    public Visualisation(int i,DefaultTableModel dt) {
        initComponents();
        indice_vis=i;
        dtm=dt;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AdrTextArea = new javax.swing.JTextArea();
        NomLbl = new javax.swing.JLabel();
        TelLbl = new javax.swing.JLabel();
        EmailLbl = new javax.swing.JLabel();
        CINLbl = new javax.swing.JLabel();
        EtabLbl = new javax.swing.JLabel();
        VilleLbl = new javax.swing.JLabel();
        ProfLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ThemeTextArea = new javax.swing.JTextArea();
        EncadLbl = new javax.swing.JLabel();
        DebutLbl = new javax.swing.JLabel();
        FinLbl = new javax.swing.JLabel();
        ImpBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1380, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1380, 800));
        jPanel2.setPreferredSize(new java.awt.Dimension(1380, 800));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACCUEIL DES STAGIAIRES EXTERNES A MARSA MAROC", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 24))); // NOI18N
        jPanel4.setMinimumSize(new java.awt.Dimension(1380, 775));
        jPanel4.setPreferredSize(new java.awt.Dimension(1380, 775));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel12.setText(" RENSEIGNEMENTS SUR LE STAGIAIRE : ");

        jLabel13.setFont(new java.awt.Font("Garamond", 1, 15)); // NOI18N
        jLabel13.setText("- NOM                                :");

        jLabel14.setFont(new java.awt.Font("Garamond", 1, 15)); // NOI18N
        jLabel14.setText("- TELEPHONE                 :");

        jLabel15.setFont(new java.awt.Font("Garamond", 1, 15)); // NOI18N
        jLabel15.setText("- ADRESSE                         :");

        jLabel16.setFont(new java.awt.Font("Garamond", 1, 15)); // NOI18N
        jLabel16.setText("- E-mail                                :");

        jLabel17.setFont(new java.awt.Font("Garamond", 1, 15)); // NOI18N
        jLabel17.setText("- ETABLISSEMENT          :");

        jLabel18.setFont(new java.awt.Font("Garamond", 1, 15)); // NOI18N
        jLabel18.setText("- CIN                                    :");

        jLabel19.setFont(new java.awt.Font("Garamond", 1, 15)); // NOI18N
        jLabel19.setText("- PROFIL (niveau/option)   :");

        jLabel20.setFont(new java.awt.Font("Garamond", 1, 15)); // NOI18N
        jLabel20.setText("- VILLE                                :");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel21.setText(" ENTITE D’AFFECTATION  : ");

        jLabel24.setFont(new java.awt.Font("Garamond", 1, 15)); // NOI18N
        jLabel24.setText("- ENCADRANT(Nom/Fonction/Division)  :");

        jLabel25.setFont(new java.awt.Font("Garamond", 1, 15)); // NOI18N
        jLabel25.setText("-THEME DU STAGE (TYPE STAGE)        :");

        jLabel23.setFont(new java.awt.Font("Garamond", 1, 15)); // NOI18N
        jLabel23.setText("- PERIODE DU STAGE               :");

        jLabel26.setFont(new java.awt.Font("Garamond", 1, 15)); // NOI18N
        jLabel26.setText("du :");

        jLabel27.setFont(new java.awt.Font("Garamond", 1, 15)); // NOI18N
        jLabel27.setText("au :");

        AdrTextArea.setColumns(20);
        AdrTextArea.setRows(5);
        jScrollPane1.setViewportView(AdrTextArea);

        NomLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TelLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        EmailLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        CINLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        EtabLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        VilleLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ProfLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ThemeTextArea.setColumns(20);
        ThemeTextArea.setRows(5);
        jScrollPane2.setViewportView(ThemeTextArea);

        EncadLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        DebutLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        FinLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ImpBtn.setBackground(new java.awt.Color(255, 255, 255));
        ImpBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ImpBtn.setText("Imprimer");
        ImpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImpBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addGap(283, 283, 283)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(18, 18, 18)
                                                .addComponent(NomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(TelLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jLabel15)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(EmailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addGap(39, 39, 39)
                                                .addComponent(jLabel26))
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel19))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(EncadLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ProfLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                            .addComponent(DebutLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(265, 265, 265)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FinLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(CINLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EtabLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(VilleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ImpBtn)
                        .addGap(290, 290, 290))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel21))
                .addGap(68, 68, 68)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(EncadLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TelLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(ProfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel25)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(EmailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(DebutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(FinLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(CINLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(EtabLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ImpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(VilleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 689, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        try{
         
        // connexion avec base de donnée 
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_stagiaire","root","");
        st = conn.createStatement();
      
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
                new Visualisation().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AdrTextArea;
    private javax.swing.JLabel CINLbl;
    private javax.swing.JLabel DebutLbl;
    private javax.swing.JLabel EmailLbl;
    private javax.swing.JLabel EncadLbl;
    private javax.swing.JLabel EtabLbl;
    private javax.swing.JLabel FinLbl;
    private javax.swing.JButton ImpBtn;
    private javax.swing.JLabel NomLbl;
    private javax.swing.JLabel ProfLbl;
    private javax.swing.JLabel TelLbl;
    private javax.swing.JTextArea ThemeTextArea;
    private javax.swing.JLabel VilleLbl;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
