/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIBRARYMANAGEMENTSYSTEM0_1.Windows;

import LIBRARYMANAGEMENTSYSTEM0_1.Connection.Connections;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFileChooser;

/**
 *
 * @author Anjana
 */
public class Library_Manegement_System_Administetor extends javax.swing.JFrame {

    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    boolean PDFsaveCheck;
    /**
     * Creates new form Library_Manegement_System_Administetor
     */
    public Library_Manegement_System_Administetor() {
        initComponents();
        currentdate();
        seticon();
        conn = Connections.java_db();
        lab_userid.setText(String.valueOf(USER.UserId).toString());
        lab_username.setText(String.valueOf(USER.UserName).toString());//lab_username
        Issuedname.setText(String.valueOf(USER.UserName).toString());//Issuedname
        txt_startingdate.setEnabled(false);
        txt_title.setEnabled(false);
        txt_cusname.setEnabled(false);
        this.setResizable(false);
        
    }
    
    
    public void currentdate(){
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        
        //txt_duedate.setText((month+1)+"/"+(day)+"/"+(year));
        txt_startingdate.setText((year)+"/"+(month+1)+"/"+(day));
        //txt_duedate.setText((year)+"/"+(month+1)+"/"+(day+10));
        
        int days=day+10;
        //1
        if((month+1)==1){
            if(days<=31){
                txt_duedate.setText((year)+"/"+(month+1)+"/"+(days));
            }else{
                txt_duedate.setText((year)+"/"+(month+2)+"/"+(days-28));
            }
        }
        //2
        else if((month+1)==2){
            if(days<=28){
                txt_duedate.setText((year)+"/"+(month+1)+"/"+(days));
            }else{
                txt_duedate.setText((year)+"/"+(month+2)+"/"+(days-31));
            }
        }
        //3
        else if((month+1)==3){
            if(days<=31){
                txt_duedate.setText((year)+"/"+(month+1)+"/"+(days));
            }else{
                txt_duedate.setText((year)+"/"+(month+2)+"/"+(days-30));
            }
        }
        //4
        else if((month+1)==4){
            if(days<=30){
                txt_duedate.setText((year)+"/"+(month+1)+"/"+(days));
            }else{
                txt_duedate.setText((year)+"/"+(month+2)+"/"+(days-31));
            }
        }
        //5
        else if((month+1)==5){
            if(days<=31){
                txt_duedate.setText((year)+"/"+(month+1)+"/"+(days));
            }else{
                txt_duedate.setText((year)+"/"+(month+2)+"/"+(days-30));
            }
        }
        //6
        else if((month+1)==6){
            if(days<=30){
                txt_duedate.setText((year)+"/"+(month+1)+"/"+(days));
            }else{
                txt_duedate.setText((year)+"/"+(month+2)+"/"+(days-31));
            }
        }
        //7
        else if((month+1)==7){
            if(days<=31){
                txt_duedate.setText((year)+"/"+(month+1)+"/"+(days));
            }else{
                txt_duedate.setText((year)+"/"+(month+2)+"/"+(days-31));
            }
        }
        //8
        else if((month+1)==8){
            if(days<=31){
                txt_duedate.setText((year)+"/"+(month+1)+"/"+(days));
            }else{
                txt_duedate.setText((year)+"/"+(month+2)+"/"+(days-30));
            }
        }
        //9
        else if((month+1)==9){
            if(days<=30){
                txt_duedate.setText((year)+"/"+(month+1)+"/"+(days));
            }else{
                txt_duedate.setText((year)+"/"+(month+2)+"/"+(days-31));
            }
        }
        //10
        else if((month+1)==10){
            if(days<=31){
                txt_duedate.setText((year)+"/"+(month+1)+"/"+(days));
            }else{
                txt_duedate.setText((year)+"/"+(month+2)+"/"+(days-30));
            }
        }
        //11
        else if((month+1)==11){
            if(days<=30){
                txt_duedate.setText((year)+"/"+(month+1)+"/"+(days));
            }else{
                txt_duedate.setText((year)+"/"+(month+2)+"/"+(days-31));
            }
        }
        //12
        else{
            if(days<=31){
                txt_duedate.setText((year)+"/"+(month+1)+"/"+(days));
            }else{
                txt_duedate.setText((year+1)+"/"+(month-11)+"/"+(days-31));
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

        jLabel1 = new javax.swing.JLabel();
        lab_userid = new javax.swing.JLabel();
        lab_username = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_bookid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_cusid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_startingdate = new javax.swing.JTextField();
        txt_duedate = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_title = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_cusname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Sign_out = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        Issuedname = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Library Manegement System...");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Logged in as :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        lab_userid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lab_userid.setForeground(new java.awt.Color(255, 255, 255));
        lab_userid.setText("userid");
        getContentPane().add(lab_userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        lab_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lab_username.setForeground(new java.awt.Color(255, 255, 255));
        lab_username.setText("username");
        getContentPane().add(lab_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User01.png"))); // NOI18N
        jButton4.setText("Customers");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/books.png"))); // NOI18N
        jButton5.setText("Books");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Database.png"))); // NOI18N
        jButton6.setText("Store");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton6KeyPressed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Setting.png"))); // NOI18N
        jButton7.setText("Setting");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton7KeyPressed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/audit.png"))); // NOI18N
        jButton8.setText("Audit Trail");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton8KeyPressed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Reports001.png"))); // NOI18N
        jButton9.setText("Reports");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton9KeyPressed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/books.png"))); // NOI18N
        jButton10.setText("Accepting Books");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jButton10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton10KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton9)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton10))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton10, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton10, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, 440));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book Id : ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 77, -1, -1));

        txt_bookid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_bookidKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bookidKeyReleased(evt);
            }
        });
        jPanel2.add(txt_bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 74, 387, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer Id : ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 167, -1, -1));

        txt_cusid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cusidKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cusidKeyReleased(evt);
            }
        });
        jPanel2.add(txt_cusid, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 164, 387, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Starting Date :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 255, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Due Date : ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 299, -1, -1));

        txt_startingdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_startingdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_startingdateActionPerformed(evt);
            }
        });
        jPanel2.add(txt_startingdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 252, 387, -1));
        jPanel2.add(txt_duedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 296, 387, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 13, 532, 5));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 334, 69, -1));

        jButton2.setText("PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 334, 69, -1));

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 334, 69, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 375, 540, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 52, 532, 11));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Books Keeping...");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 169, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Titile : ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 122, -1, -1));

        txt_title.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txt_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 119, 387, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name : ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 210, -1, -1));

        txt_cusname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txt_cusname, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 207, 387, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Library Manegement System 0.1");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        Sign_out.setText("Sign out");
        Sign_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sign_outActionPerformed(evt);
            }
        });
        Sign_out.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Sign_outKeyPressed(evt);
            }
        });
        jPanel2.add(Sign_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 180, 10));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 40, 10));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("Issued :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        Issuedname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Issuedname.setForeground(new java.awt.Color(0, 204, 204));
        Issuedname.setText("USERNAME");
        jPanel2.add(Issuedname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("10 days ....");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 60, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 560, 440));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login01.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("File");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jMenu18.setText("Sign out");
        jMenu18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu18MouseClicked(evt);
            }
        });
        jMenu18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu18ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu18);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tools");

        jMenu19.setText("Accepting Books");
        jMenu19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu19MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu19);

        jMenu7.setText("Customers");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu7);

        jMenu8.setText("Books");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu8);

        jMenu9.setText("Store");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu9);

        jMenu16.setText("Reports");
        jMenu16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu16MouseClicked(evt);
            }
        });
        jMenu16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu16ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu16);

        jMenu10.setText("Audit Trail");
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenu10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu10);

        jMenu11.setText("Setting");
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
        });
        jMenu11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu11);

        jMenuBar1.add(jMenu2);

        jMenu12.setText("Repots");

        jMenu13.setText("R Customers");
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });
        jMenu12.add(jMenu13);

        jMenu14.setText("R Books");
        jMenu12.add(jMenu14);

        jMenu15.setText("R Due Books");
        jMenu12.add(jMenu15);

        jMenu17.setText("R Audit Tarail");
        jMenu17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu17MouseClicked(evt);
            }
        });
        jMenu17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu17ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenu17);

        jMenuBar1.add(jMenu12);

        jMenu3.setText("About");

        jMenu4.setText("Help");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu4);

        jMenu5.setText("LMS Version 0.1");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Sign_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sign_outActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to Sign out the program?", "Sign out Program Message Box",
        JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
        Library_Manegement_System_Firstpage windowshow=new Library_Manegement_System_Firstpage();
        windowshow.show();
        this.dispose();
        
        try{
            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String datestring = df.format(currentDate);
                    
            Date d = new Date ();
            SimpleDateFormat sdf = new SimpleDateFormat ("hh:mm:ss");
            String timestring = sdf.format(d);
                    
            int value0 = USER.UserId;
            String value1 = USER.UserName;
            String value2 = timestring;
            String value3 = datestring;
        
            String sql="Insert into audit_tb (User_Id,User_Name,Date,Status)"
                    +"values("+value0+",'"+value1+"','"+value3+" / "+value2+"','Logged Out...')";
            pst=conn.prepareStatement(sql);
            pst.execute();
            this.dispose();
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
        }finally{
            try{
                
                rs.close();
                pst.close();
                
            }catch(Exception e){
                
            }
        }
        }
        
    }//GEN-LAST:event_Sign_outActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Library_Manegement_System_AdminNewCustomers windowshow=new Library_Manegement_System_AdminNewCustomers();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Library_Manegement_System_AuditTrails windowshow= new Library_Manegement_System_AuditTrails();
        windowshow.show();
        this.dispose();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int value0 = USER.UserId;
        String value1 = USER.UserName;
        String BID=txt_bookid.getText();
        String CusID=txt_cusid.getText();
        String StartingDate=txt_startingdate.getText();
        String DueDate=txt_duedate.getText();
        String ac="Issued";
        conn = Connections.java_db();
        try{
            String sql="select * from books_keeping where book_id='"+BID+"' and customer_id='"+CusID+"' and issue='"+ac+"'";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "Already Saved...");
            }else{
                try{
                    sql="insert into books_keeping (customer_id,book_id,starting_date,due_date,issue,issued_user,Accepting_user)"
                        +"values("+CusID+",'"+BID+"','"+StartingDate+"','"+DueDate+"','"+ac+"','"+value1+"','Null')";
            
                    pst=conn.prepareStatement(sql);
                    pst.execute();
            
                    //Update=====
            
                    sql="UPDATE books_tb SET In_Store='Pending' WHERE book_id='"+BID+"'";
            
                    pst=conn.prepareStatement(sql);
                    pst.execute();
            
                    JOptionPane.showMessageDialog(this, "Saved Successfull...");
                    PDFsaveCheck=true;
        
                    try{
                        Date currentDate = GregorianCalendar.getInstance().getTime();
                        DateFormat df = DateFormat.getDateInstance();
                        String datestring = df.format(currentDate);
                    
                        Date d = new Date ();
                        SimpleDateFormat sdf = new SimpleDateFormat ("hh:mm:ss");
                        String timestring = sdf.format(d);
                    
                
                        String value2 = timestring;
                        String value3 = datestring;
        
                        sql="Insert into audit_tb (User_Id,User_Name,Date,Status)"
                            +"values("+value0+",'"+value1+"','"+value3+" / "+value2+"','Book Issued...')";
                        pst=conn.prepareStatement(sql);
                        pst.execute();
            
                    }catch(Exception e){
            
                        JOptionPane.showMessageDialog(null, e);
            
                    }finally{
                            try{
                
                                rs.close();
                                pst.close();
                
                            }catch(Exception e){
                
                            }
                    }
                }catch(Exception e){
            
                    JOptionPane.showMessageDialog(null, e);
            
                }finally{
                    try{
                        rs.close();
                        pst.close();
                
                    }catch(Exception e){
                
                    }
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Library_Manegement_System_EditForSettingAdminLogin windowshow=new Library_Manegement_System_EditForSettingAdminLogin();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Library_Manegement_System_Reports windowshow= new Library_Manegement_System_Reports();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Library_Manegement_System_AdminNewBooks windowshow=new Library_Manegement_System_AdminNewBooks();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenu18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu18ActionPerformed
        Library_Manegement_System_Firstpage windowshow=new Library_Manegement_System_Firstpage();
        windowshow.show();
        this.dispose();
        
        try{
            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String datestring = df.format(currentDate);
                    
            Date d = new Date ();
            SimpleDateFormat sdf = new SimpleDateFormat ("hh:mm:ss");
            String timestring = sdf.format(d);
                    
            int value0 = USER.UserId;
            String value1 = USER.UserName;
            String value2 = timestring;
            String value3 = datestring;
        
            String sql="Insert into audit_tb (User_Id,User_Name,Date,Status)"
                    +"values("+value0+",'"+value1+"','"+value3+" / "+value2+"','Logged Out...')";
            pst=conn.prepareStatement(sql);
            pst.execute();
            this.dispose();
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
        }finally{
            try{
                
                rs.close();
                pst.close();
                
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_jMenu18ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
        
    }//GEN-LAST:event_jMenu8ActionPerformed

    private void jMenu16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu16ActionPerformed
        
    }//GEN-LAST:event_jMenu16ActionPerformed

    private void jMenu10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu10ActionPerformed
        
    }//GEN-LAST:event_jMenu10ActionPerformed

    private void jMenu11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu11ActionPerformed
        
    }//GEN-LAST:event_jMenu11ActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        Library_Manegement_System_AdminNewCustomers windowshow=new Library_Manegement_System_AdminNewCustomers();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        Library_Manegement_System_AdminNewBooks windowshow=new Library_Manegement_System_AdminNewBooks();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu16MouseClicked
        Library_Manegement_System_Reports windowshow= new Library_Manegement_System_Reports();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jMenu16MouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
        Library_Manegement_System_AuditTrails windowshow= new Library_Manegement_System_AuditTrails();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jMenu10MouseClicked

    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked
        Library_Manegement_System_EditForSettingAdminLogin windowshow=new Library_Manegement_System_EditForSettingAdminLogin();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jMenu11MouseClicked

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        Library_Manegement_System_EditForStrockAdminLogin windowshow=new Library_Manegement_System_EditForStrockAdminLogin();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jMenu9MouseClicked
      
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Library_Manegement_System_EditForStrockAdminLogin windowshow=new Library_Manegement_System_EditForStrockAdminLogin();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenu17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu17ActionPerformed
        
    }//GEN-LAST:event_jMenu17ActionPerformed

    private void jMenu17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu17MouseClicked
        Library_Manegement_System_Reports_AuditTrails windowshow= new Library_Manegement_System_Reports_AuditTrails();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jMenu17MouseClicked

    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
        Library_Manegement_System_Reports_Customers windowshow= new Library_Manegement_System_Reports_Customers();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jMenu13MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       txt_bookid.setText("");
       txt_title.setText("");
       txt_cusid.setText("");
       txt_cusname.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_startingdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_startingdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_startingdateActionPerformed

    private void txt_bookidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bookidKeyReleased
        String a=txt_bookid.getText();
        try{
            //books id check
            String sql="select book_id from books_tb where book_id="+a+"";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                //books
                sql="select book_title from books_tb where book_id="+a+"";
            
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
            
                while(rs.next()){
                    txt_title.setText(rs.getString("book_title"));
                }
            }else{
                txt_bookid.setText("");
                txt_title.setText("");
                JOptionPane.showMessageDialog(null,"Invalid book id...");
            }
            
        }catch(Exception e){
            
            
            
        }finally{
            try{
                
                rs.close();
                pst.close();
                
            }catch(Exception e){
                
            }
        }
        
        
    }//GEN-LAST:event_txt_bookidKeyReleased

    private void txt_cusidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cusidKeyReleased
        
            String a=txt_cusid.getText();
            try{
                //customer check
                String sql="select customer_id from customers where customer_id="+a+"";
            
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                if(rs.next()){
                    //customer
                    sql="select customer_name from customers where customer_id="+a+"";
            
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
            
                    while(rs.next()){
                        txt_cusname.setText(rs.getString("customer_name"));
                    }
                }else{
                    txt_cusid.setText("");
                    JOptionPane.showMessageDialog(null,"Invalid customer id...");
                }
                
            
            
            
        }catch(Exception e){
            
            
            
        }finally{
            try{
                
                rs.close();
                pst.close();
                
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_txt_cusidKeyReleased

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Library_Manegement_System_AcceptingBooks windowshow=new Library_Manegement_System_AcceptingBooks();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jMenu19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu19MouseClicked
        Library_Manegement_System_AcceptingBooks windowshow=new Library_Manegement_System_AcceptingBooks();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jMenu19MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        if (Desktop.isDesktopSupported()) {
            try {
                /*==============computer name==============
                String sql="Select * from detailsofcomputer where ID='1'";            
            
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
            
                String computername=rs.getString("Computer_Name");
                
                rs.close();
                pst.close();
                -------------------------------------------*/
                File myFile = new File("C:\\Users\\Anjana\\Documents\\Library Management System\\AboutOfLibraryManagementSystem.pdf");
                Desktop.getDesktop().open(myFile);
                
            } catch (Exception e) {
                // no application registered for PDFs
                JOptionPane.showMessageDialog(null, "Check the location of 'AboutOfLibraryManagementSystem.pdf'"
                        +"-(C:\\Users\\LMSPc\\Documents\\Library Management System\\)");
            }
        }
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        if (Desktop.isDesktopSupported()) {
            try {
                /*==============computer name==============
                String sql="Select * from detailsofcomputer where ID='1'";            
            
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
            
                String computername=rs.getString("Computer_Name");
                
                rs.close();
                pst.close();
                -------------------------------------------*/
                File myFile = new File("C:\\Users\\Anjana\\Documents\\Library Management System\\HelpOfLibraryManagementSystem.pdf");
                Desktop.getDesktop().open(myFile);
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Check the location of 'HelpOfLibraryManagementSystem.pdf'"
                    +"-(C:\\Users\\LMSPc\\Documents\\Library Management System\\)");
        }
        }
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu18MouseClicked
        Library_Manegement_System_Firstpage windowshow=new Library_Manegement_System_Firstpage();
        windowshow.show();
        this.dispose();
        
        try{
            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String datestring = df.format(currentDate);
                    
            Date d = new Date ();
            SimpleDateFormat sdf = new SimpleDateFormat ("hh:mm:ss");
            String timestring = sdf.format(d);
                    
            int value0 = USER.UserId;
            String value1 = USER.UserName;
            String value2 = timestring;
            String value3 = datestring;
        
            String sql="Insert into audit_tb (User_Id,User_Name,Date,Status)"
                    +"values("+value0+",'"+value1+"','"+value3+" / "+value2+"','Logged Out...')";
            pst=conn.prepareStatement(sql);
            pst.execute();
            this.dispose();
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
        }finally{
            try{
                
                rs.close();
                pst.close();
                
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_jMenu18MouseClicked

    private void jButton10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton10KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            Library_Manegement_System_AcceptingBooks windowshow=new Library_Manegement_System_AcceptingBooks();
            windowshow.show();
            this.dispose();
        }
    }//GEN-LAST:event_jButton10KeyPressed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            Library_Manegement_System_AdminNewCustomers windowshow=new Library_Manegement_System_AdminNewCustomers();
        windowshow.show();
        this.dispose();
        }
    }//GEN-LAST:event_jButton4KeyPressed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            Library_Manegement_System_AdminNewBooks windowshow=new Library_Manegement_System_AdminNewBooks();
        windowshow.show();
        this.dispose();
        }
    }//GEN-LAST:event_jButton5KeyPressed

    private void jButton6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton6KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            Library_Manegement_System_EditForStrockAdminLogin windowshow=new Library_Manegement_System_EditForStrockAdminLogin();
            windowshow.show();
            this.dispose();
        }
    }//GEN-LAST:event_jButton6KeyPressed

    private void jButton9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton9KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            Library_Manegement_System_Reports windowshow= new Library_Manegement_System_Reports();
        windowshow.show();
        this.dispose();
        }
    }//GEN-LAST:event_jButton9KeyPressed

    private void jButton8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton8KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
             Library_Manegement_System_AuditTrails windowshow= new Library_Manegement_System_AuditTrails();
        windowshow.show();
        this.dispose();
        }
    }//GEN-LAST:event_jButton8KeyPressed

    private void jButton7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton7KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            Library_Manegement_System_EditForSettingAdminLogin windowshow=new Library_Manegement_System_EditForSettingAdminLogin();
        windowshow.show();
        this.dispose();
        }
    }//GEN-LAST:event_jButton7KeyPressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            txt_bookid.setText("");
            txt_title.setText("");
            txt_cusid.setText("");
            txt_cusname.setText("");
        }
    }//GEN-LAST:event_jButton3KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            int value0 = USER.UserId;
        String value1 = USER.UserName;
        String BID=txt_bookid.getText();
        String CusID=txt_cusid.getText();
        String StartingDate=txt_startingdate.getText();
        String DueDate=txt_duedate.getText();
        String ac="Issued";
        conn = Connections.java_db();
        try{
            String sql="select * from books_keeping where book_id='"+BID+"' and customer_id='"+CusID+"' and issue='"+ac+"'";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "Already Saved...");
            }else{
                try{
                    sql="insert into books_keeping (customer_id,book_id,starting_date,due_date,issue,issued_user)"
                        +"values("+CusID+",'"+BID+"','"+StartingDate+"','"+DueDate+"','"+ac+"','"+value1+"')";
            
                    pst=conn.prepareStatement(sql);
                    pst.execute();
            
                    //Update=====
            
                    sql="UPDATE books_tb SET In_Store='Pending' WHERE book_id='"+BID+"'";
            
                    pst=conn.prepareStatement(sql);
                    pst.execute();
            
                    JOptionPane.showMessageDialog(this, "Saved Successfull...");
                    PDFsaveCheck=true;
        
                    try{
                        Date currentDate = GregorianCalendar.getInstance().getTime();
                        DateFormat df = DateFormat.getDateInstance();
                        String datestring = df.format(currentDate);
                    
                        Date d = new Date ();
                        SimpleDateFormat sdf = new SimpleDateFormat ("hh:mm:ss");
                        String timestring = sdf.format(d);
                    
                
                        String value2 = timestring;
                        String value3 = datestring;
        
                        sql="Insert into audit_tb (User_Id,User_Name,Date,Status)"
                            +"values("+value0+",'"+value1+"','"+value3+" / "+value2+"','Book Issued...')";
                        pst=conn.prepareStatement(sql);
                        pst.execute();
            
                    }catch(Exception e){
            
                        JOptionPane.showMessageDialog(null, e);
            
                    }finally{
                            try{
                
                                rs.close();
                                pst.close();
                
                            }catch(Exception e){
                
                            }
                    }
                }catch(Exception e){
            
                    JOptionPane.showMessageDialog(null, e);
            
                }finally{
                    try{
                        rs.close();
                        pst.close();
                
                    }catch(Exception e){
                
                    }
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            //PDFsaveCheck=true;
        if(PDFsaveCheck==true){
            // Issue PDF==================
        String UID=(String.valueOf(USER.UserId).toString());
        String UNAME=(String.valueOf(USER.UserName).toString());//lab_username

        String value=txt_bookid.getText();
        String value1=txt_title.getText();
        String value2=txt_cusid.getText();
        String value3=txt_cusname.getText();
        String value4=txt_startingdate.getText();
        String value5=txt_duedate.getText();

        Date currentDate = GregorianCalendar.getInstance().getTime();
        DateFormat df = DateFormat.getDateInstance();
        String datestring = df.format(currentDate);

        Date d = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat ("hh-mm-ss");
        String timestring = sdf.format(d);

        /*Reports*/

        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File("Keeping-Book Details"+"-Book id="+value+" "+datestring+" "+timestring+".pdf"));
        int dialogResult=dialog.showSaveDialog(null);
        if(dialogResult==JFileChooser.APPROVE_OPTION){
            String filepath = dialog.getSelectedFile().getPath();

            try{
                Document myDocument=new Document();
                PdfWriter myWriter=PdfWriter.getInstance(myDocument, new FileOutputStream(filepath));
                PdfPTable table=new PdfPTable(7);
                myDocument.open();

                myDocument.add(new Paragraph("------------Library Manegement System-----------",FontFactory.getFont(FontFactory.TIMES_BOLD,25,Font.BOLD)));
                myDocument.add(new Paragraph("Keeping Details...",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                //PDF Body===============
                myDocument.add(new Paragraph("01). Book Id................:- "+value,FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.NORMAL)));
                myDocument.add(new Paragraph("02). Book Titel............:- "+value1,FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.NORMAL)));
                myDocument.add(new Paragraph("03). Customer Id........:- "+value2,FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.NORMAL)));
                myDocument.add(new Paragraph("04). Customer Name..:- "+value3,FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.NORMAL)));
                myDocument.add(new Paragraph("05). Starting Date.......:- "+value4,FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.NORMAL)));
                myDocument.add(new Paragraph("06). Due Date..............:- "+value5,FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.NORMAL)));
                /*=======================*/
                myDocument.add(table);
                myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                myDocument.add(new Paragraph("User Id :"+"   "+UID,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.NORMAL)));
                myDocument.add(new Paragraph("User Name :"+" "+UNAME,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.NORMAL)));
                myDocument.close();
                JOptionPane.showMessageDialog(null, "Report was successfully generated");
                txt_bookid.setText("");
                txt_title.setText("");
                txt_cusid.setText("");
                txt_cusname.setText("");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            finally{
                try{
                    rs.close();
                    pst.close();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }

        }
        
        }else{
            JOptionPane.showMessageDialog(null, "Please After the save you can genarate pdf...");
        }
        
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void Sign_outKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Sign_outKeyPressed
        int confirmed = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to Sign out the program?", "Sign out Program Message Box",
        JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            Library_Manegement_System_Firstpage windowshow=new Library_Manegement_System_Firstpage();
        windowshow.show();
        this.dispose();
        
        try{
            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String datestring = df.format(currentDate);
                    
            Date d = new Date ();
            SimpleDateFormat sdf = new SimpleDateFormat ("hh:mm:ss");
            String timestring = sdf.format(d);
                    
            int value0 = USER.UserId;
            String value1 = USER.UserName;
            String value2 = timestring;
            String value3 = datestring;
        
            String sql="Insert into audit_tb (User_Id,User_Name,Date,Status)"
                    +"values("+value0+",'"+value1+"','"+value3+" / "+value2+"','Logged Out...')";
            pst=conn.prepareStatement(sql);
            pst.execute();
            this.dispose();
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
        }finally{
            try{
                
                rs.close();
                pst.close();
                
            }catch(Exception e){
                
            }
        }
        }
        }
    }//GEN-LAST:event_Sign_outKeyPressed

    private void txt_bookidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bookidKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_BACK_SPACE){
            txt_title.setText("");
        }
    }//GEN-LAST:event_txt_bookidKeyPressed

    private void txt_cusidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cusidKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_BACK_SPACE){
            txt_cusname.setText("");
        }
    }//GEN-LAST:event_txt_cusidKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //PDFsaveCheck=true;
        if(PDFsaveCheck==true){
            // Issue PDF==================
        String UID=(String.valueOf(USER.UserId).toString());
        String UNAME=(String.valueOf(USER.UserName).toString());//lab_username

        String value=txt_bookid.getText();
        String value1=txt_title.getText();
        String value2=txt_cusid.getText();
        String value3=txt_cusname.getText();
        String value4=txt_startingdate.getText();
        String value5=txt_duedate.getText();

        Date currentDate = GregorianCalendar.getInstance().getTime();
        DateFormat df = DateFormat.getDateInstance();
        String datestring = df.format(currentDate);

        Date d = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat ("hh-mm-ss");
        String timestring = sdf.format(d);

        /*Reports*/

        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File("Keeping-Book Details"+"-Book id="+value+" "+datestring+" "+timestring+".pdf"));
        int dialogResult=dialog.showSaveDialog(null);
        if(dialogResult==JFileChooser.APPROVE_OPTION){
            String filepath = dialog.getSelectedFile().getPath();

            try{
                Document myDocument=new Document();
                PdfWriter myWriter=PdfWriter.getInstance(myDocument, new FileOutputStream(filepath));
                PdfPTable table=new PdfPTable(7);
                myDocument.open();

                myDocument.add(new Paragraph("------------Library Manegement System-----------",FontFactory.getFont(FontFactory.TIMES_BOLD,25,Font.BOLD)));
                myDocument.add(new Paragraph("Keeping Details...",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                //PDF Body===============
                myDocument.add(new Paragraph("01). Book Id................:- "+value,FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.NORMAL)));
                myDocument.add(new Paragraph("02). Book Titel............:- "+value1,FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.NORMAL)));
                myDocument.add(new Paragraph("03). Customer Id........:- "+value2,FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.NORMAL)));
                myDocument.add(new Paragraph("04). Customer Name..:- "+value3,FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.NORMAL)));
                myDocument.add(new Paragraph("05). Starting Date.......:- "+value4,FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.NORMAL)));
                myDocument.add(new Paragraph("06). Due Date..............:- "+value5,FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.NORMAL)));
                /*=======================*/
                myDocument.add(table);
                myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                myDocument.add(new Paragraph("User Id :"+"   "+UID,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.NORMAL)));
                myDocument.add(new Paragraph("User Name :"+" "+UNAME,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.NORMAL)));
                myDocument.close();
                JOptionPane.showMessageDialog(null, "Report was successfully generated");
                txt_bookid.setText("");
                txt_title.setText("");
                txt_cusid.setText("");
                txt_cusname.setText("");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            finally{
                try{
                    rs.close();
                    pst.close();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }

        }
        
        }else{
            JOptionPane.showMessageDialog(null, "Please After the save you can genarate pdf...");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Library_Manegement_System_Administetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library_Manegement_System_Administetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library_Manegement_System_Administetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library_Manegement_System_Administetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library_Manegement_System_Administetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Issuedname;
    private javax.swing.JButton Sign_out;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lab_userid;
    private javax.swing.JLabel lab_username;
    private javax.swing.JTextField txt_bookid;
    private javax.swing.JTextField txt_cusid;
    private javax.swing.JTextField txt_cusname;
    private javax.swing.JTextField txt_duedate;
    private javax.swing.JTextField txt_startingdate;
    private javax.swing.JTextField txt_title;
    // End of variables declaration//GEN-END:variables

    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LibraryMS.png")));
    }
    
}
