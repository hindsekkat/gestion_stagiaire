package gestionstagiaire_marsamaroc;

//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import gestionstagiaire_marsamaroc.Sessions;
import gestionstagiaire_marsamaroc.InterfaceAdmin;
import gestionstagiaire_marsamaroc.Stagiaires_en_cours;
import gestionstagiaire_marsamaroc.Visualisation;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
//import com.mysql.jdbc.Driver;

public class InterfaceAdmin extends javax.swing.JFrame {
    
    public DefaultTableModel dtm;
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
    private int Validation;
    private int Rejet;
    private String Statut;
    private String Justif;
    
       
    private int i; //indice de deplacement
    
    Connection conn=null;
    Statement st=null;
    Statement st1=null;
    ResultSet rs=null;
    ResultSet rs1=null;
    

    public InterfaceAdmin() {
        initComponents();
        NumText.setEnabled(false);
        MasjRadio.setSelected(false);
        FemjRadio.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SexebtnGrp = new javax.swing.ButtonGroup();
        PanelChoisirSession = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        deconnecterIcon = new javax.swing.JLabel();
        PanelForm = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        NumText = new javax.swing.JTextField();
        NomText = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        PrenomText = new javax.swing.JTextField();
        TelText = new javax.swing.JTextField();
        AdrText = new javax.swing.JTextField();
        CINText = new javax.swing.JTextField();
        EmailText = new javax.swing.JTextField();
        MasjRadio = new javax.swing.JRadioButton();
        FemjRadio = new javax.swing.JRadioButton();
        EtabjComb = new javax.swing.JComboBox<>();
        VillejComb = new javax.swing.JComboBox<>();
        ProfiljComb = new javax.swing.JComboBox<>();
        SpecjComb = new javax.swing.JComboBox<>();
        DirectionjComb = new javax.swing.JComboBox<>();
        DivisionjComb = new javax.swing.JComboBox<>();
        EncadrantText = new javax.swing.JTextField();
        TypeStgjComb = new javax.swing.JComboBox<>();
        ThemeStgText = new javax.swing.JTextField();
        DureeStgText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        ChoisirText = new javax.swing.JTextField();
        ChoisirBtn = new javax.swing.JButton();
        DebutStgText = new javax.swing.JFormattedTextField();
        FinStgText = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        StatutjComb = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        JustifText = new javax.swing.JTextField();
        AjouterBtn = new javax.swing.JButton();
        ModifierBtn = new javax.swing.JButton();
        ActualiserBtn = new javax.swing.JButton();
        ValiderBtn = new javax.swing.JButton();
        RejeterBtn = new javax.swing.JButton();
        AppreciationBtn = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        RechercheComb = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        RechercheText = new javax.swing.JTextField();
        RechercherBtn = new javax.swing.JButton();
        StgCoursBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        affichTable = new javax.swing.JTable();
        PremierBtn = new javax.swing.JButton();
        PrecedentBtn = new javax.swing.JButton();
        SuivantBtn = new javax.swing.JButton();
        DernierBtn = new javax.swing.JButton();
        listeStgBtn = new javax.swing.JButton();
        stgValidBtn = new javax.swing.JButton();
        stgRjtBtn = new javax.swing.JButton();
        StgInstcBtn = new javax.swing.JButton();
        VisualiserBtn = new javax.swing.JButton();
        AttestationBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1380, 775));
        setPreferredSize(new java.awt.Dimension(1380, 775));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelChoisirSession.setBackground(new java.awt.Color(153, 153, 153));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logo 1.png"))); // NOI18N

        deconnecterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/se deconnecter1.png"))); // NOI18N
        deconnecterIcon.setToolTipText("se déconnecter");
        deconnecterIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deconnecterIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deconnecterIconMouseClicked(evt);
            }
        });

        PanelForm.setBackground(new java.awt.Color(153, 153, 153));
        PanelForm.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Spécialité :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Direction :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Division :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Encadrant :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Type stage :");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Theme stage :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Début stage :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Fin stage :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Durée stage :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("N° dossier :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nom :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Prénom :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Téléphone :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Adresse :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("CIN :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("SEXE :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Email :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Etablissement :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Ville :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Profil :");

        NumText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumTextActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Choisir un fichier :");

        MasjRadio.setBackground(new java.awt.Color(153, 153, 153));
        MasjRadio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MasjRadio.setText("Masculin");
        MasjRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasjRadioActionPerformed(evt);
            }
        });

        FemjRadio.setBackground(new java.awt.Color(153, 153, 153));
        FemjRadio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FemjRadio.setText("Feminin");
        FemjRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemjRadioActionPerformed(evt);
            }
        });

        EtabjComb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "UIC", "UIR", "MUNDIAPOLIS", "ESCA", "ESG", "HEM", "UNIVERSITE", "ISIG", "ISG", "EMSI", "ISCAE", "ENCG", "ISTA", "EST", "IGA", "ISGA", "ISEM", "ENSAM", "ENSEM", "EHTP", "IHEES", "HESTIM", "Sherbrooke Academy", "TOULOUSE BUSINESS SCHOOL", "EFA", "FST", "HEC", "AL AKHAWAYN UNIVERSITY", "ENSA", "EMI", "INSEA", "ENSIAS", "ENIM", "ES D'INFORMATION", "INPT", "ECOLE PONT CHAUSSEE", "ECOLE POLYTECHNIQUE", "ECOLE CENTRALE SUPELEC", "UNIVERSITE MONTPELLIER", "UNIVERSITE PERPIGNAN", "UNIVERSITE NORMANDIE", "LYON BUSINESS SCHOOL", "ESITH", "ISTL", "CESA", "ESSEC  BUSINESS SCHOOL", "EDHEC Business School", "SUP DE CO", "UPM" }));

        VillejComb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "Casablanca", "Rabat", "Agadir", "Safi", "Bengrir", "Marrakech", "Essaouira", "Khouribga", "Youssoufia", "Eljadida", "Settat", "Mohammadia", "Kenitra", "Fes", "Benimellal", "Laayoune", "Dakhla", "Ifrane", "Tanger", "Tetouan", "Oujda", "Nador", "Tiznit", "Hoceima", "Meknes", "Errachidia", "Taza", "Taroudant", "Ouarzazat", "Paris", "Lyon", "Toulouse", "Perpignan", "Nice", "Normandie", "Montpellier", "Quebec monréa", "Bruxelle" }));

        ProfiljComb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "1ere annee", "2eme annee", "3eme annee", "4eme annee", "5eme annee", "Master1", "Master2", "Licence", "Bachelor", "Deug", "Technicien", "Technicien Specialise", "MBA", "DEA", "DESS", " " }));

        SpecjComb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "Genie informatique", "Droit", "Eco et gestion", "Gestion", "Comptabilité", "Finance", "Audit contrôle de gestion", "Commerce", "Commerce internationale", "Logistique", "Marketing", "Communication", "GRH", "Genie civil", "Ingenierie", "Reseaux telecom", "Genie industriel", "Statistique", "Actuariat", "Banque assurances", "Ingenierie financiere", "Architecture", "Maintenance", "Mecanique", "Maritime\t", "Transport", "Economie appliquee", "Organisation", "Management\t", "Entrepreneuriat", "Achat", "Methodes", "Gestion de projets", "Qualite", "Electronique" }));

        DirectionjComb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "DRPTM2", "DF", "DAJ", "DA", "DDS", "DPO", "DAIO", "DRH", "DSI", " " }));

        DivisionjComb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "Gestion et Planification Financiere", "Gestion Comptable et Fiscale", "Financiere et Comptable du Siege", "Consolidation et Gestion des Participations", "Controle  Budgetaire", "Evaluation des Performances", "Pilotage Strategique", "Affaires Contractuelles et Gestion des Risques", "affaires conflictuelles", "Corporate et Gouvernance", "Support", "Achats des Frais Generaux", "Achats des Equipements & Maintenance", "Planification Strategique", "Prospection et Partenariats", "Etudes", "Technique ", "Exploitation et Performance Operationnelle", "Activites maritimes", "Qualite,Hygiene,Securite,Surete & Environnement", "Commerciale", "Gestion des Contrats de Concession", "Audit Technique", "Audit Financier,Facturation,GRH ET social", "Organisation", "Developpement des ressources humaines", "Gestion des Remunerations", "Administrative et Relations sociales", "Mutuelle/Couverture Medicale", "Gestion des Centres de Vacances", "Affaires generales", "Relation MOA", "Prohet de Developpement", "Exploitation", "Developpements Specifiques Metier", "Communication", " ", " ", " " }));

        EncadrantText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncadrantTextActionPerformed(evt);
            }
        });

        TypeStgjComb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "Observation", "Application", "Projet Fin d'Etude" }));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ChoisirBtn.setBackground(new java.awt.Color(153, 153, 153));
        ChoisirBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ChoisirBtn.setText("Choisir");
        ChoisirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoisirBtnActionPerformed(evt);
            }
        });

        try {
            DebutStgText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DebutStgText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            FinStgText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FinStgText.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel20.setText("(aaaa-mm-jj)");

        jLabel25.setText("(aaaa-mm-jj)");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Statut :");

        StatutjComb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "recommande", "non recommande" }));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Justif :");

        JustifText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JustifTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFormLayout = new javax.swing.GroupLayout(PanelForm);
        PanelForm.setLayout(PanelFormLayout);
        PanelFormLayout.setHorizontalGroup(
            PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormLayout.createSequentialGroup()
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFormLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(PanelFormLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(10, 10, 10))
                            .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))))
                    .addGroup(PanelFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(33, 33, 33)
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFormLayout.createSequentialGroup()
                        .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelFormLayout.createSequentialGroup()
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFormLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(MasjRadio)
                                .addGap(33, 33, 33)
                                .addComponent(FemjRadio)
                                .addGap(58, 58, 58))
                            .addGroup(PanelFormLayout.createSequentialGroup()
                                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(StatutjComb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NomText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(NumText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(PrenomText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(TelText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(AdrText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(CINText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(ProfiljComb, javax.swing.GroupLayout.Alignment.LEADING, 0, 210, Short.MAX_VALUE)
                                    .addComponent(EtabjComb, javax.swing.GroupLayout.Alignment.LEADING, 0, 210, Short.MAX_VALUE)
                                    .addComponent(VillejComb, javax.swing.GroupLayout.Alignment.LEADING, 0, 210, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelFormLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DureeStgText, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelFormLayout.createSequentialGroup()
                                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ThemeStgText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TypeStgjComb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EncadrantText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelFormLayout.createSequentialGroup()
                                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(FinStgText, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                            .addComponent(DebutStgText))
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel25)))
                                    .addComponent(JustifText, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(PanelFormLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormLayout.createSequentialGroup()
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(57, 57, 57)
                                            .addComponent(DivisionjComb, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PanelFormLayout.createSequentialGroup()
                                            .addComponent(jLabel23)
                                            .addGap(42, 42, 42)
                                            .addComponent(ChoisirBtn))
                                        .addComponent(ChoisirText, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelFormLayout.createSequentialGroup()
                                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(53, 53, 53)
                                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(DirectionjComb, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SpecjComb, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(20, 20, 20))))
        );
        PanelFormLayout.setVerticalGroup(
            PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(JustifText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFormLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(TypeStgjComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(ThemeStgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFormLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelFormLayout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(DureeStgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(SpecjComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(DirectionjComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(DivisionjComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ChoisirBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(FinStgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25))))
                            .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DebutStgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20))))
                    .addComponent(EncadrantText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ChoisirText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(PanelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFormLayout.createSequentialGroup()
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(NumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrenomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(AdrText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(CINText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FemjRadio)
                                .addComponent(MasjRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelFormLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(EtabjComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(VillejComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(ProfiljComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(StatutjComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(PanelFormLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );

        AjouterBtn.setBackground(new java.awt.Color(153, 153, 153));
        AjouterBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AjouterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ajouter.png"))); // NOI18N
        AjouterBtn.setText("Ajouter");
        AjouterBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AjouterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterBtnActionPerformed(evt);
            }
        });

        ModifierBtn.setBackground(new java.awt.Color(153, 153, 153));
        ModifierBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ModifierBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/modifier.png"))); // NOI18N
        ModifierBtn.setText("Modifier");
        ModifierBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModifierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierBtnActionPerformed(evt);
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

        ValiderBtn.setBackground(new java.awt.Color(153, 153, 153));
        ValiderBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ValiderBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/valider.png"))); // NOI18N
        ValiderBtn.setText("Valider");
        ValiderBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ValiderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderBtnActionPerformed(evt);
            }
        });

        RejeterBtn.setBackground(new java.awt.Color(153, 153, 153));
        RejeterBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RejeterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/rejeter.png"))); // NOI18N
        RejeterBtn.setText(" Rejeter");
        RejeterBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RejeterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejeterBtnActionPerformed(evt);
            }
        });

        AppreciationBtn.setBackground(new java.awt.Color(153, 153, 153));
        AppreciationBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AppreciationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/visualiser.png"))); // NOI18N
        AppreciationBtn.setText("Fiche D'appréciation");
        AppreciationBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AppreciationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppreciationBtnActionPerformed(evt);
            }
        });

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

        StgCoursBtn.setBackground(new java.awt.Color(153, 153, 153));
        StgCoursBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        StgCoursBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/direction1.png"))); // NOI18N
        StgCoursBtn.setText("Voir Stagiaires en cours");
        StgCoursBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StgCoursBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StgCoursBtnActionPerformed(evt);
            }
        });

        affichTable.setBackground(new java.awt.Color(255, 255, 0));
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
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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

        PremierBtn.setBackground(new java.awt.Color(153, 153, 153));
        PremierBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PremierBtn.setText("<  Premier");
        PremierBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PremierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PremierBtnActionPerformed(evt);
            }
        });

        PrecedentBtn.setBackground(new java.awt.Color(153, 153, 153));
        PrecedentBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PrecedentBtn.setText("<< Précédent");
        PrecedentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrecedentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecedentBtnActionPerformed(evt);
            }
        });

        SuivantBtn.setBackground(new java.awt.Color(153, 153, 153));
        SuivantBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SuivantBtn.setText(" Suivant >>");
        SuivantBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SuivantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuivantBtnActionPerformed(evt);
            }
        });

        DernierBtn.setBackground(new java.awt.Color(153, 153, 153));
        DernierBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DernierBtn.setText("Dernier >");
        DernierBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DernierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DernierBtnActionPerformed(evt);
            }
        });

        listeStgBtn.setBackground(new java.awt.Color(153, 153, 153));
        listeStgBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        listeStgBtn.setText("Agrandir le tableau");
        listeStgBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listeStgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeStgBtnActionPerformed(evt);
            }
        });

        stgValidBtn.setBackground(new java.awt.Color(153, 153, 153));
        stgValidBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stgValidBtn.setForeground(new java.awt.Color(0, 153, 0));
        stgValidBtn.setText("Liste stagiaires validés");
        stgValidBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stgValidBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stgValidBtnActionPerformed(evt);
            }
        });

        stgRjtBtn.setBackground(new java.awt.Color(153, 153, 153));
        stgRjtBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stgRjtBtn.setForeground(new java.awt.Color(255, 0, 0));
        stgRjtBtn.setText("Liste stagiaires rejetés");
        stgRjtBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stgRjtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stgRjtBtnActionPerformed(evt);
            }
        });

        StgInstcBtn.setBackground(new java.awt.Color(153, 153, 153));
        StgInstcBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        StgInstcBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/direction1.png"))); // NOI18N
        StgInstcBtn.setText("Voir Stagiaires en instance");
        StgInstcBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StgInstcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StgInstcBtnActionPerformed(evt);
            }
        });

        VisualiserBtn.setBackground(new java.awt.Color(153, 153, 153));
        VisualiserBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VisualiserBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/visualiser.png"))); // NOI18N
        VisualiserBtn.setText("Dossier");
        VisualiserBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VisualiserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualiserBtnActionPerformed(evt);
            }
        });

        AttestationBtn.setBackground(new java.awt.Color(153, 153, 153));
        AttestationBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AttestationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/visualiser.png"))); // NOI18N
        AttestationBtn.setText("Attestation de stage");
        AttestationBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AttestationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttestationBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelChoisirSessionLayout = new javax.swing.GroupLayout(PanelChoisirSession);
        PanelChoisirSession.setLayout(PanelChoisirSessionLayout);
        PanelChoisirSessionLayout.setHorizontalGroup(
            PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(PremierBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(PrecedentBtn)
                        .addGap(88, 88, 88)
                        .addComponent(SuivantBtn)
                        .addGap(72, 72, 72)
                        .addComponent(DernierBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(listeStgBtn)
                            .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(logo)
                                    .addComponent(PanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(StgInstcBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(stgValidBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(StgCoursBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(stgRjtBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                                                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel24)
                                                    .addComponent(jLabel22))
                                                .addGap(18, 18, 18)
                                                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(RechercheText, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(RechercheComb, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(RechercherBtn))
                                        .addGap(18, 18, 18)
                                        .addComponent(deconnecterIcon))
                                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                                                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                                                        .addGap(70, 70, 70)
                                                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(AjouterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(ValiderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(VisualiserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(AttestationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                                                        .addGap(51, 51, 51)
                                                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(ActualiserBtn)
                                                            .addComponent(ModifierBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(RejeterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(AppreciationBtn))))
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        PanelChoisirSessionLayout.setVerticalGroup(
            PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RechercheComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RechercheText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RechercherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(deconnecterIcon)))
                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stgValidBtn)
                            .addComponent(stgRjtBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StgCoursBtn)
                            .addComponent(StgInstcBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(listeStgBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AjouterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModifierBtn))
                        .addGap(18, 18, 18)
                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ActualiserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VisualiserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RejeterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ValiderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AppreciationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AttestationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(206, 206, 206))
                    .addGroup(PanelChoisirSessionLayout.createSequentialGroup()
                        .addComponent(PanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(PanelChoisirSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SuivantBtn)
                            .addComponent(PrecedentBtn)
                            .addComponent(PremierBtn)
                            .addComponent(DernierBtn))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(PanelChoisirSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1380, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;
    private void deconnecterIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deconnecterIconMouseClicked
        frame=new JFrame();
        if(JOptionPane.showConfirmDialog(frame,"se déconnecter ?","Déconnexion",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            //systemExit();
            Sessions sess =new Sessions();
            sess.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_deconnecterIconMouseClicked

    private void NumTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumTextActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        try{
         
        // connexion avec base de donnée 
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_stagiaire","root","");
        st = conn.createStatement();
     
        SexebtnGrp.add(MasjRadio);
        SexebtnGrp.add(FemjRadio);
        
      
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
       
       //affichTable.setBackground(Color.yellow);
       
        // afficeher la liste des stagiaires
        AfficherStagiaire();
        // remplir les champs 
        i = 0; //indice de deplacement
        DeplacerStagiaire(i);
    }catch(Exception e){
        System.out.printf("erreur   "+e.getMessage());//getMessage c'est une fonction  pour afficher l'Erreur ou se trouve ?!!!!!
        JOptionPane.showMessageDialog(null, "Erreur de connexion\n  "+ e.getMessage());
    }
    }//GEN-LAST:event_formWindowOpened

    private void ChoisirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoisirBtnActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        ChoisirText.setText(filename);
    }//GEN-LAST:event_ChoisirBtnActionPerformed

    private void affichTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_affichTableMouseClicked
        try{
        i = affichTable.getSelectedRow(); // retourne la ligne selectionnée par l'utilisateur
        DeplacerStagiaire(i);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur de selection\n"+e.getMessage());
    }
    }//GEN-LAST:event_affichTableMouseClicked

    private void EncadrantTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncadrantTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EncadrantTextActionPerformed

    private void ActualiserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualiserBtnActionPerformed
        MasjRadio.setSelected(false);
        FemjRadio.setSelected(false);
        actualiser();
        MasjRadio.setSelected(false);
        FemjRadio.setSelected(false);
    }//GEN-LAST:event_ActualiserBtnActionPerformed

    private void SuivantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuivantBtnActionPerformed
         try{
        i++;
        affichTable.setRowSelectionInterval(i, i);
        DeplacerStagiaire(i);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "il y a aucun élément!\n"+e.getMessage());
    }
    }//GEN-LAST:event_SuivantBtnActionPerformed

    private void DernierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DernierBtnActionPerformed
         try{
        i = dtm.getRowCount() - 1 ; 
        affichTable.setRowSelectionInterval(i, i);
        DeplacerStagiaire(i);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "il y a aucun élément!\n"+e.getMessage());
    }
    }//GEN-LAST:event_DernierBtnActionPerformed

    private void PremierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PremierBtnActionPerformed
        try{
        i = 0;
        affichTable.setRowSelectionInterval(i, i);
        DeplacerStagiaire(i);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "il y a aucun élément!\n"+e.getMessage());}
    }//GEN-LAST:event_PremierBtnActionPerformed

    private void PrecedentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecedentBtnActionPerformed
        try{
        i--;
        affichTable.setRowSelectionInterval(i, i);
        DeplacerStagiaire(i);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "il y a aucun élément!\n"+e.getMessage());
    }
    }//GEN-LAST:event_PrecedentBtnActionPerformed

    private void AjouterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterBtnActionPerformed
        File img=new File(ChoisirText.getText());
        try{
           FileInputStream istm=new FileInputStream(img);
           String sql = "INSERT INTO stagiaire (Nom,Prenom,Telephone,Adresse,CIN,Sexe,Email,Etablissement,Ville,Profil,Specialite,Direction,Division,Encadrant,Type_stage,Theme_stage,Debut_stage,Fin_stage,Duree_stage,Fichier,Statut,Justif)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
           PreparedStatement ps = conn.prepareStatement(sql);
           ps.setString(1, NomText.getText());
           ps.setString(2, PrenomText.getText());
           ps.setString(3, TelText.getText());
           ps.setString(4, AdrText.getText());
           ps.setString(5, CINText.getText());
           ps.setString(6, Sexe);
           ps.setString(7, EmailText.getText());
           ps.setString(8, EtabjComb.getSelectedItem().toString());
           ps.setString(9, VillejComb.getSelectedItem().toString());
           ps.setString(10, ProfiljComb.getSelectedItem().toString());
           ps.setString(11, SpecjComb.getSelectedItem().toString());
           ps.setString(12, DirectionjComb.getSelectedItem().toString());
           ps.setString(13, DivisionjComb.getSelectedItem().toString());
           ps.setString(14, EncadrantText.getText());
           ps.setString(15, TypeStgjComb.getSelectedItem().toString());
           ps.setString(16, ThemeStgText.getText());
           ps.setString(17, DebutStgText.getText());
           ps.setString(18, FinStgText.getText());
           ps.setString(19, DureeStgText.getText());   
           ps.setBinaryStream(20,istm,(int)img.length()); 
           ps.setString(21, StatutjComb.getSelectedItem().toString());
           ps.setString(22, JustifText.getText());
                    
           ps.executeUpdate();
           AfficherStagiaire(); // recharger la liste des stagiaires
           JOptionPane.showMessageDialog(null, "Stagiaire est ajouté avec succès");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur ajouter stagiaire\n Remplir tous les champs!\n"+e.getMessage());
        System.err.println(""+e.getMessage());
    }
    }//GEN-LAST:event_AjouterBtnActionPerformed

    private void MasjRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasjRadioActionPerformed
        Sexe=MasjRadio.getText();
    }//GEN-LAST:event_MasjRadioActionPerformed

    private void FemjRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemjRadioActionPerformed
        Sexe=FemjRadio.getText();
    }//GEN-LAST:event_FemjRadioActionPerformed

    private void ModifierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierBtnActionPerformed
        File img=new File(ChoisirText.getText());  
        try{ 
           FileInputStream istm=new FileInputStream(img);
        // msg de confirmation !
        if (JOptionPane.showConfirmDialog(null, " Confirmez la modification ","Modification ",
                JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION){
           st.executeUpdate("UPDATE stagiaire SET Nom='"+NomText.getText()+ "',Prenom='"+PrenomText.getText()
           +"',Telephone='"+TelText.getText()+ "',Adresse='"+AdrText.getText() 
           +"',CIN='"+CINText.getText()+ "',Sexe='"+Sexe +"',Email='"+EmailText.getText()+ "',Etablissement='"+EtabjComb.getSelectedItem().toString()
           +"',Ville='"+VillejComb.getSelectedItem().toString()+ "',Profil='"+ProfiljComb.getSelectedItem().toString()+ "',Specialite='"+SpecjComb.getSelectedItem().toString()
           +"',Direction='"+DirectionjComb.getSelectedItem().toString()+"',Division='"+DivisionjComb.getSelectedItem().toString()+"',Encadrant='"+EncadrantText.getText()
           +"',Type_stage='"+TypeStgjComb.getSelectedItem().toString()+"',Theme_stage='"+ThemeStgText.getText()+"',Debut_stage='"+DebutStgText.getText()
           +"',Fin_stage='"+FinStgText.getText()+"',Duree_stage='"+DureeStgText.getText()+"',Fichier='"+istm
           +"',Statut='"+StatutjComb.getSelectedItem().toString()+"',Justif='"+JustifText.getText()
           +"' WHERE Num_dossier = "+ NumText.getText());       
         
           AfficherStagiaire(); // recharger la liste des stagiaires
           JOptionPane.showMessageDialog(null, "Stagiaire est modifié avec succès");
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur de modification ! \n Remplir tous les champs!\n"+e.getMessage());
    }
    }//GEN-LAST:event_ModifierBtnActionPerformed

    private void RechercherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercherBtnActionPerformed
        try { 
    dtm.setRowCount(0); //pour vider tableau 
    Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery( "SELECT * FROM stagiaire WHERE "+combo()
                +"  like '%"+RechercheText.getText()+"%'" );
    
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
        }else{
            i = 0;
            DeplacerStagiaire(i);
        }
    
}catch (Exception m){JOptionPane.showMessageDialog(null, "Erreur recherche"+m.getMessage());
System.err.println(m);
}
    }//GEN-LAST:event_RechercherBtnActionPerformed

    private void ValiderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderBtnActionPerformed
        try{ 
        i = affichTable.getSelectedRow(); // retourne la ligne selectionnée par l'utilisateur
        Valider(i);
       // AfficherStagiaire();
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur de selection\n"+e.getMessage());
    }
    }//GEN-LAST:event_ValiderBtnActionPerformed

    private void StgCoursBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StgCoursBtnActionPerformed
        //systemExit();
        Stagiaires_en_cours stgCours = new Stagiaires_en_cours();
        stgCours.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StgCoursBtnActionPerformed

    private void listeStgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeStgBtnActionPerformed
        //systemExit();
        Tous_Stagiaires toustg = new Tous_Stagiaires();
        toustg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listeStgBtnActionPerformed

    private void RejeterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejeterBtnActionPerformed
        try{ 
        i = affichTable.getSelectedRow(); // retourne la ligne selectionnée par l'utilisateur
        Rejeter(i);
        AfficherStagiaire(); 
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur de selection\n"+e.getMessage());
    }
        
    }//GEN-LAST:event_RejeterBtnActionPerformed

    private void stgValidBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stgValidBtnActionPerformed
       // systemExit();
        Stagiaires_valides stgValid = new Stagiaires_valides();
        stgValid.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stgValidBtnActionPerformed

    private void stgRjtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stgRjtBtnActionPerformed
       // systemExit();
        Stagiaires_rejetes stgRjt = new Stagiaires_rejetes();
        stgRjt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stgRjtBtnActionPerformed

    private void AppreciationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppreciationBtnActionPerformed
        try{  
        int i=affichTable.getSelectedRow(); // retourne la ligne selectionnée par l'utilisateur
        systemExit();
        Fiche_appreciation appr =new Fiche_appreciation(i,dtm);
        appr.setVisible(true);
        //this.dispose();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur de visualisation\n"+e.getMessage());
    }
    }//GEN-LAST:event_AppreciationBtnActionPerformed

    private void JustifTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JustifTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JustifTextActionPerformed

    private void StgInstcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StgInstcBtnActionPerformed
        Stagiaires_en_instance stgInstc = new Stagiaires_en_instance();
        stgInstc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StgInstcBtnActionPerformed

    private void VisualiserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualiserBtnActionPerformed
        try{  
        int i=affichTable.getSelectedRow(); // retourne la ligne selectionnée par l'utilisateur
        systemExit();
        Visualisation vis =new Visualisation(i,dtm);
        vis.setVisible(true);
        //this.dispose();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur de visualisation\n"+e.getMessage());
    }
    }//GEN-LAST:event_VisualiserBtnActionPerformed

    private void AttestationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttestationBtnActionPerformed
          try{  
        int i=affichTable.getSelectedRow(); // retourne la ligne selectionnée par l'utilisateur
        systemExit();
        Attestation attes =new Attestation(i,dtm);
        attes.setVisible(true);
        //this.dispose();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur de visualisation\n"+e.getMessage());
    }
    }//GEN-LAST:event_AttestationBtnActionPerformed

    private void systemExit(){
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    }
    
    private void AfficherStagiaire(){
        
       try{
        dtm.setRowCount(0); // vider la liste des stagiaires.
        
        rs = st.executeQuery("Select * From stagiaire");
        
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
        }}catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur dans l'affichage de la liste des stagiaires\n"+e.getMessage());
    }
         }
        
    
   
    
    private void DeplacerStagiaire(int i){
    try{
        
        if (dtm.getRowCount() == 0){ //si tableau est vide
            PrecedentBtn.setEnabled(false);
            SuivantBtn.setEnabled(false);
            PremierBtn.setEnabled(false);
            DernierBtn.setEnabled(false);
            actualiser();
        }else{
            if(i == 0){ //si i est localiser sur le premier enregistrement  
                PrecedentBtn.setEnabled(false);
                PremierBtn.setEnabled(false);
                SuivantBtn.setEnabled(true);
                DernierBtn.setEnabled(true);
                }else if (i == dtm.getRowCount()-1){ //  si i est localisé sur  dernier enregistrement
                    PremierBtn.setEnabled(true);
                    PrecedentBtn.setEnabled(true);
                    SuivantBtn.setEnabled(false);
                    DernierBtn.setEnabled(false);
            }else{
                PrecedentBtn.setEnabled(true);
                SuivantBtn.setEnabled(true);
                PremierBtn.setEnabled(true);
                DernierBtn.setEnabled(true);
            }
            if(dtm.getRowCount() == 1){//si il y a un seul enregistrement, nous avons un seul ligne
                PrecedentBtn.setEnabled(false);
                SuivantBtn.setEnabled(false);
                PremierBtn.setEnabled(false);
                DernierBtn.setEnabled(false);
            }
        }
        
        NumText.setText(dtm.getValueAt(i, 0).toString()); 
        NomText.setText(dtm.getValueAt(i, 1).toString()); // i represente numero d ligne ,et 0 1 .. colonne
        PrenomText.setText(dtm.getValueAt(i, 2).toString()); // lorseque i=1 getValueAt nous retourne le premier ligne si i=2 le ligne ......
        
        TelText.setText(dtm.getValueAt(i, 3).toString());
        AdrText.setText(dtm.getValueAt(i, 4).toString());    
        CINText.setText(dtm.getValueAt(i, 5).toString());
        String sexe = dtm.getValueAt(i, 6).toString();
        if(sexe.equals("Masculin")){
            MasjRadio.setSelected(true);
        }
        else if(sexe.equals("Feminin")){
            FemjRadio.setSelected(true);
        }
        EmailText.setText(dtm.getValueAt(i, 7).toString());
        EtabjComb.setSelectedItem(dtm.getValueAt(i, 8).toString());
        VillejComb.setSelectedItem(dtm.getValueAt(i, 9).toString());
        ProfiljComb.setSelectedItem(dtm.getValueAt(i, 10).toString());
        SpecjComb.setSelectedItem(dtm.getValueAt(i, 11).toString()); 
        DirectionjComb.setSelectedItem(dtm.getValueAt(i, 12).toString()); 
        DivisionjComb.setSelectedItem(dtm.getValueAt(i, 13).toString());
        EncadrantText.setText(dtm.getValueAt(i, 14).toString());
        TypeStgjComb.setSelectedItem(dtm.getValueAt(i, 15).toString());
        ThemeStgText.setText(dtm.getValueAt(i, 16).toString());
        DebutStgText.setText(dtm.getValueAt(i, 17).toString());    
        FinStgText.setText(dtm.getValueAt(i, 18).toString());
        DureeStgText.setText(dtm.getValueAt(i, 19).toString());
        StatutjComb.setSelectedItem(dtm.getValueAt(i, 21).toString()); 
        JustifText.setText(dtm.getValueAt(i, 22).toString()); 
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, " Il y a des champs vides dans le tableau !\n");
    }
}
    
    public void actualiser(){ 
            NumText.setText("");
            NomText.setText("");
            PrenomText.setText("");
            TelText.setText("");
            AdrText.setText("");
            CINText.setText(""); 
            MasjRadio.setSelected(false);
            FemjRadio.setSelected(false);
            EmailText.setText("");
            EtabjComb.setSelectedIndex(0);
            VillejComb.setSelectedIndex(0);
            ProfiljComb.setSelectedIndex(0);
            SpecjComb.setSelectedIndex(0);
            DirectionjComb.setSelectedIndex(0);
            DivisionjComb.setSelectedIndex(0);
            EncadrantText.setText("");
            TypeStgjComb.setSelectedIndex(0);
            ThemeStgText.setText("");
            DebutStgText.setText("");
            FinStgText.setText("");
            DureeStgText.setText(""); 
            RechercheText.setText(""); 
            RechercheComb.setSelectedIndex(0);
            ChoisirText.setText("");
            StatutjComb.setSelectedIndex(0);
            JustifText.setText("");
            AfficherStagiaire();
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

public void Valider(int i){
    try{ 
        // msg de confirmation !
        if (JOptionPane.showConfirmDialog(null, " Confirmez la validation "," Validation ",
                JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION){
            rs = st.executeQuery("Select Direction,Division,Fin_stage From stagiaire where Fin_stage>=now() and Debut_stage<=now() and Validation=1 "); 
            boolean valid=true;
            while(rs.next()){
                if((dtm.getValueAt(i,12).toString().equals(rs.getString("Direction")))){
                    if((dtm.getValueAt(i,13).toString().equals(rs.getString("Division")))){
                        if((dtm.getValueAt(i,17).toString().compareTo(rs.getString("Fin_stage")))<0){
                            valid=false;
                            break;
                        }
                    } 
                }              
            }  
            st.executeUpdate("UPDATE stagiaire SET Validation=1,Rejet=0 WHERE Num_dossier="+ dtm.getValueAt(i, 0).toString());
            AfficherStagiaire();
            if(valid==true){
                JOptionPane.showMessageDialog(null, "Validation est efféctuée avec succès");
            }
            else{
                JOptionPane.showMessageDialog(null, "ATTENTION !\n Vous avez dépassez le quota");
            }
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur de validation !\n"+e.getMessage());
    }
}

public void Rejeter(int i){
    try{ 
        // msg de confirmation !
        if (JOptionPane.showConfirmDialog(null, " Confirmez le rejet "," Rejet ",
                JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION){
    st.executeUpdate("UPDATE stagiaire SET Validation=0,Rejet=1 WHERE Num_dossier="+ dtm.getValueAt(i, 0).toString());
    AfficherStagiaire();
           JOptionPane.showMessageDialog(null, "Rejet est efféctué avec succès");
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erreur de rejet !\n"+e.getMessage());
    }
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
                new InterfaceAdmin().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualiserBtn;
    private javax.swing.JTextField AdrText;
    private javax.swing.JButton AjouterBtn;
    private javax.swing.JButton AppreciationBtn;
    private javax.swing.JButton AttestationBtn;
    private javax.swing.JTextField CINText;
    private javax.swing.JButton ChoisirBtn;
    private javax.swing.JTextField ChoisirText;
    private javax.swing.JFormattedTextField DebutStgText;
    private javax.swing.JButton DernierBtn;
    private javax.swing.JComboBox<String> DirectionjComb;
    private javax.swing.JComboBox<String> DivisionjComb;
    private javax.swing.JTextField DureeStgText;
    private javax.swing.JTextField EmailText;
    private javax.swing.JTextField EncadrantText;
    private javax.swing.JComboBox<String> EtabjComb;
    private javax.swing.JRadioButton FemjRadio;
    private javax.swing.JFormattedTextField FinStgText;
    private javax.swing.JTextField JustifText;
    private javax.swing.JRadioButton MasjRadio;
    private javax.swing.JButton ModifierBtn;
    private javax.swing.JTextField NomText;
    private javax.swing.JTextField NumText;
    private javax.swing.JPanel PanelChoisirSession;
    private javax.swing.JPanel PanelForm;
    private javax.swing.JButton PrecedentBtn;
    private javax.swing.JButton PremierBtn;
    private javax.swing.JTextField PrenomText;
    private javax.swing.JComboBox<String> ProfiljComb;
    private javax.swing.JComboBox<String> RechercheComb;
    private javax.swing.JTextField RechercheText;
    private javax.swing.JButton RechercherBtn;
    private javax.swing.JButton RejeterBtn;
    private javax.swing.ButtonGroup SexebtnGrp;
    private javax.swing.JComboBox<String> SpecjComb;
    private javax.swing.JComboBox<String> StatutjComb;
    private javax.swing.JButton StgCoursBtn;
    private javax.swing.JButton StgInstcBtn;
    private javax.swing.JButton SuivantBtn;
    private javax.swing.JTextField TelText;
    private javax.swing.JTextField ThemeStgText;
    private javax.swing.JComboBox<String> TypeStgjComb;
    private javax.swing.JButton ValiderBtn;
    private javax.swing.JComboBox<String> VillejComb;
    private javax.swing.JButton VisualiserBtn;
    private javax.swing.JTable affichTable;
    private javax.swing.JLabel deconnecterIcon;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton listeStgBtn;
    private javax.swing.JLabel logo;
    private javax.swing.JButton stgRjtBtn;
    private javax.swing.JButton stgValidBtn;
    // End of variables declaration//GEN-END:variables
}
