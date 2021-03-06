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
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Anjana
 */
public class Library_Manegement_System_Reports_AuditTrails extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    /**
     * Creates new form Library_Manegement_System_Reports_AuditTrails
     */
    public Library_Manegement_System_Reports_AuditTrails() {
        initComponents();
        conn = Connections.java_db();
        loadalldatatable ();
        seticon();
        checkButton.setSelected(true);
        txt_searchR.setText("All");
        jButton3.setEnabled(true);
        jButton2.setEnabled(false);
        this.setResizable(false);
        
    }

    public void loadalldatatable (){
        try{
            
            String sql="Select * from audit_tb";            
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            TableAudit.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }finally{
            try{
                
                rs.close();
                pst.close();
                
            }catch(Exception e){
                
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_searchR = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAudit = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        checkButton = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Library Manegement System...");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User id :");

        txt_searchR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchRKeyReleased(evt);
            }
        });

        jButton1.setText("Cancel");
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

        TableAudit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableAudit);

        jButton2.setText("Generate PDF");
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

        checkButton.setBackground(new java.awt.Color(51, 51, 51));
        checkButton.setForeground(new java.awt.Color(255, 255, 255));
        checkButton.setText("All recodes");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        jButton3.setText("All Data Generate PDF");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_searchR, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(checkButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_searchR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 700, 410));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reports For Audit Trails...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 206, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BG.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Library_Manegement_System_Reports windowshow= new Library_Manegement_System_Reports();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_searchRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchRKeyReleased
        checkButton.setSelected(false);
        String ck=txt_searchR.getText();
        if(ck!="All"){
            jButton3.setEnabled(false);
            jButton2.setEnabled(true);
        }
        try{
            
            String sql="Select * from audit_tb where User_Id=?";            
            
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_searchR.getText());
            rs=pst.executeQuery();
            TableAudit.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }finally{
            try{
                
                rs.close();
                pst.close();
                
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_txt_searchRKeyReleased

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        txt_searchR.setText("All");
        String ck=txt_searchR.getText();
        if(ck!="All"){
            jButton3.setEnabled(true);
            jButton2.setEnabled(false);
        }
        loadalldatatable ();
    }//GEN-LAST:event_checkButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String UID=(String.valueOf(USER.UserId).toString());
        String UNAME=(String.valueOf(USER.UserName).toString());//lab_username
        /*Reports*/
        String value=txt_searchR.getText();
        
        Date currentDate = GregorianCalendar.getInstance().getTime();
        DateFormat df = DateFormat.getDateInstance();
        String datestring = df.format(currentDate);
                    
        Date d = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat ("hh-mm-ss");
        String timestring = sdf.format(d);
        
        
        
        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File("User Id "+value+""+"-Audit Trails"+" "+datestring+" "+timestring+".pdf"));
        int dialogResult=dialog.showSaveDialog(null);
        if(dialogResult==JFileChooser.APPROVE_OPTION){
            String filepath = dialog.getSelectedFile().getPath();
            
            try{
                
                    String sql="Select * from audit_tb where User_Id='"+value+"'";            
            
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                
                    Document myDocument=new Document();
                    PdfWriter myWriter=PdfWriter.getInstance(myDocument, new FileOutputStream(filepath));
                    PdfPTable table=new PdfPTable(5);
                    myDocument.open();
                
                    float[] columnWidths=new float[]{3,3,6,7,7};
                    table.setWidths(columnWidths);
                
                    table.setWidthPercentage(100);
                
                    myDocument.add(new Paragraph("------------Library Manegement System-----------",FontFactory.getFont(FontFactory.TIMES_BOLD,25,Font.BOLD)));
                    myDocument.add(new Paragraph("Login Details...",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                    myDocument.add(new Paragraph(new Date().toString()));
                    myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                
                    table.addCell(new PdfPCell(new Paragraph("Audit_ID",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("User_ID",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("User_Name",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Date_Time",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Status",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                
                    while(rs.next()){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                    }
                    myDocument.add(table);
                    myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                    myDocument.add(new Paragraph("User Id :"+"   "+UID,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.NORMAL)));
                    myDocument.add(new Paragraph("User Name :"+" "+UNAME,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.NORMAL)));
                    myDocument.close();
                    JOptionPane.showMessageDialog(null, "Report was successfully generated");
                
                
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
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String UID=(String.valueOf(USER.UserId).toString());
        String UNAME=(String.valueOf(USER.UserName).toString());//lab_username
        /*All Data Reports*/
        String value=txt_searchR.getText();
        
        Date currentDate = GregorianCalendar.getInstance().getTime();
        DateFormat df = DateFormat.getDateInstance();
        String datestring = df.format(currentDate);
                    
        Date d = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat ("hh-mm-ss");
        String timestring = sdf.format(d);
        
        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File(value+" Details"+"-Audit Trails"+" "+datestring+" "+timestring+".pdf"));
        int dialogResult=dialog.showSaveDialog(null);
        if(dialogResult==JFileChooser.APPROVE_OPTION){
            String filepath = dialog.getSelectedFile().getPath();
            
            try{
                
                    String sql="Select * from audit_tb";            
            
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                
                    Document myDocument=new Document();
                    PdfWriter myWriter=PdfWriter.getInstance(myDocument, new FileOutputStream(filepath));
                    PdfPTable table=new PdfPTable(5);
                    myDocument.open();
                
                    float[] columnWidths=new float[]{3,3,6,7,7};
                    table.setWidths(columnWidths);
                
                    table.setWidthPercentage(100);
                
                    myDocument.add(new Paragraph("------------Library Manegement System-----------",FontFactory.getFont(FontFactory.TIMES_BOLD,25,Font.BOLD)));
                    myDocument.add(new Paragraph("Login Details...",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                    myDocument.add(new Paragraph(new Date().toString()));
                    myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));        
                
                    table.addCell(new PdfPCell(new Paragraph("Audit_ID",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("User_ID",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("User_Name",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Date_Time",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Status",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                
                    while(rs.next()){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                    }
                    myDocument.add(table);
                    myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                    myDocument.add(new Paragraph("User Id :"+"   "+UID,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.NORMAL)));
                    myDocument.add(new Paragraph("User Name :"+" "+UNAME,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.NORMAL)));
                    myDocument.close();
                    JOptionPane.showMessageDialog(null, "Report was successfully generated");
                
                
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
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            String UID=(String.valueOf(USER.UserId).toString());
        String UNAME=(String.valueOf(USER.UserName).toString());//lab_username
        /*Reports*/
        String value=txt_searchR.getText();
        
        Date currentDate = GregorianCalendar.getInstance().getTime();
        DateFormat df = DateFormat.getDateInstance();
        String datestring = df.format(currentDate);
                    
        Date d = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat ("hh-mm-ss");
        String timestring = sdf.format(d);
        
        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File("User Id "+value+""+"-Audit Trails"+" "+datestring+" "+timestring+".pdf"));
        int dialogResult=dialog.showSaveDialog(null);
        if(dialogResult==JFileChooser.APPROVE_OPTION){
            String filepath = dialog.getSelectedFile().getPath();
            
            try{
                
                    String sql="Select * from audit_tb where User_Id='"+value+"'";            
            
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                
                    Document myDocument=new Document();
                    PdfWriter myWriter=PdfWriter.getInstance(myDocument, new FileOutputStream(filepath));
                    PdfPTable table=new PdfPTable(5);
                    myDocument.open();
                
                    float[] columnWidths=new float[]{3,3,6,7,7};
                    table.setWidths(columnWidths);
                
                    table.setWidthPercentage(100);
                
                    myDocument.add(new Paragraph("------------Library Manegement System-----------",FontFactory.getFont(FontFactory.TIMES_BOLD,25,Font.BOLD)));
                    myDocument.add(new Paragraph("Login Details...",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                    myDocument.add(new Paragraph(new Date().toString()));
                    myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                
                    table.addCell(new PdfPCell(new Paragraph("Audit_ID",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("User_ID",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("User_Name",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Date_Time",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Status",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                
                    while(rs.next()){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                    }
                    myDocument.add(table);
                    myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                    myDocument.add(new Paragraph("User Id :"+"   "+UID,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.NORMAL)));
                    myDocument.add(new Paragraph("User Name :"+" "+UNAME,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.NORMAL)));
                    myDocument.close();
                    JOptionPane.showMessageDialog(null, "Report was successfully generated");
                
                
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
        
        
        
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            String UID=(String.valueOf(USER.UserId).toString());
        String UNAME=(String.valueOf(USER.UserName).toString());//lab_username
        /*All Data Reports*/
        String value=txt_searchR.getText();
        
        Date currentDate = GregorianCalendar.getInstance().getTime();
        DateFormat df = DateFormat.getDateInstance();
        String datestring = df.format(currentDate);
                    
        Date d = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat ("hh-mm-ss");
        String timestring = sdf.format(d);
        
        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File(value+" Details"+"-Audit Trails"+" "+datestring+" "+timestring+".pdf"));
        int dialogResult=dialog.showSaveDialog(null);
        if(dialogResult==JFileChooser.APPROVE_OPTION){
            String filepath = dialog.getSelectedFile().getPath();
            
            try{
                
                    String sql="Select * from audit_tb";            
            
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                
                    Document myDocument=new Document();
                    PdfWriter myWriter=PdfWriter.getInstance(myDocument, new FileOutputStream(filepath));
                    PdfPTable table=new PdfPTable(5);
                    myDocument.open();
                
                    float[] columnWidths=new float[]{3,3,6,7,7};
                    table.setWidths(columnWidths);
                
                    table.setWidthPercentage(100);
                
                    myDocument.add(new Paragraph("------------Library Manegement System-----------",FontFactory.getFont(FontFactory.TIMES_BOLD,25,Font.BOLD)));
                    myDocument.add(new Paragraph("Login Details...",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                    myDocument.add(new Paragraph(new Date().toString()));
                    myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));        
                
                    table.addCell(new PdfPCell(new Paragraph("Audit_ID",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("User_ID",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("User_Name",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Date_Time",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Status",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                
                    while(rs.next()){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                    }
                    myDocument.add(table);
                    myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                    myDocument.add(new Paragraph("User Id :"+"   "+UID,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.NORMAL)));
                    myDocument.add(new Paragraph("User Name :"+" "+UNAME,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.NORMAL)));
                    myDocument.close();
                    JOptionPane.showMessageDialog(null, "Report was successfully generated");
                
                
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
        
        }
    }//GEN-LAST:event_jButton3KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            Library_Manegement_System_Reports windowshow= new Library_Manegement_System_Reports();
        windowshow.show();
        this.dispose();
        }
    }//GEN-LAST:event_jButton1KeyPressed

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
            java.util.logging.Logger.getLogger(Library_Manegement_System_Reports_AuditTrails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library_Manegement_System_Reports_AuditTrails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library_Manegement_System_Reports_AuditTrails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library_Manegement_System_Reports_AuditTrails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library_Manegement_System_Reports_AuditTrails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAudit;
    private javax.swing.JCheckBox checkButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txt_searchR;
    // End of variables declaration//GEN-END:variables
private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LibraryMS.png")));
    }
}
