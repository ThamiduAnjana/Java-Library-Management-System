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
public class Library_Manegement_System_Gest extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    /**
     * Creates new form Library_Manegement_System_Gest
     */
    public Library_Manegement_System_Gest() {
        initComponents();
        conn = Connections.java_db();
        loadalldatatable ();
        seticon();
        loadallbooks.setSelected(true);
        this.setResizable(false);
        CusName.setVisible(false);
        
    }
    public void getcustomername(){
        try{
            int no=1;
            String value=txt_search.getText();
            String sql="select customer_name from customers where customer_id="+value+"";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                String cusname=rs.getString("customer_name");
                Date currentDate = GregorianCalendar.getInstance().getTime();
                DateFormat df = DateFormat.getDateInstance();
                String datestring = df.format(currentDate);
                    
                Date d = new Date ();
                SimpleDateFormat sdf = new SimpleDateFormat ("hh-mm-ss");
                String timestring = sdf.format(d);
        
                JFileChooser dialog=new JFileChooser();
                dialog.setSelectedFile(new File("Customer Id "+value+""+"-Read Books"+" "+datestring+" "+timestring+".pdf"));
                int dialogResult=dialog.showSaveDialog(null);
                if(dialogResult==JFileChooser.APPROVE_OPTION){
                    String filepath = dialog.getSelectedFile().getPath();
            
                    try{
                
                        sql="select K.book_id,B.book_title,K.starting_date,K.due_date,K.issue"
                            +" from books_keeping K "
                            +"join books_tb B on  K.book_id=B.book_id "
                            +"where K.customer_id="+value+"";            
            
                        pst=conn.prepareStatement(sql);
                        rs=pst.executeQuery();
                
                        Document myDocument=new Document();
                        PdfWriter myWriter=PdfWriter.getInstance(myDocument, new FileOutputStream(filepath));
                        PdfPTable table=new PdfPTable(6);
                        myDocument.open();
                
                        float[] columnWidths=new float[]{3,3,9,6,6,5};
                        table.setWidths(columnWidths);
                
                        table.setWidthPercentage(100);
                
                        myDocument.add(new Paragraph("------------Library Manegement System-----------",FontFactory.getFont(FontFactory.TIMES_BOLD,25,Font.BOLD)));
                        myDocument.add(new Paragraph("Login Details...",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                        myDocument.add(new Paragraph(new Date().toString()));
                        myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                        myDocument.add(new Paragraph("Customer ID :- "+value,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD)));
                        myDocument.add(new Paragraph("Customer Name :- "+cusname,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD)));
                        myDocument.add(new Paragraph("    ",FontFactory.getFont(FontFactory.TIMES_BOLD,5,Font.BOLD)));
                        
                        table.addCell(new PdfPCell(new Paragraph("NO",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                        table.addCell(new PdfPCell(new Paragraph("book_id",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                        table.addCell(new PdfPCell(new Paragraph("book_title",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                        table.addCell(new PdfPCell(new Paragraph("starting_date",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                        table.addCell(new PdfPCell(new Paragraph("due_date",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                        table.addCell(new PdfPCell(new Paragraph("issue",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                
                        while(rs.next()){
                            String nos= Integer.toString(no);//to String========================
                            table.addCell(new PdfPCell(new Paragraph(nos,FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                            table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                            table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                            table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                            table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                            table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                            no=Integer.parseInt(nos);//to Integer=======================
                            no=no+1;
                        }
                        myDocument.add(table);
                        myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                        myDocument.add(new Paragraph("  ",FontFactory.getFont(FontFactory.TIMES_BOLD,5,Font.NORMAL)));
                        myDocument.add(new Paragraph("Thank for you...!",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.NORMAL)));
                        myDocument.close();
                        JOptionPane.showMessageDialog(null, "Report was successfully generated");
                
                
                    }catch(Exception e){
                        //JOptionPane.showMessageDialog(null, e);
                        JOptionPane.showMessageDialog(null, "Enter the customer id....");
                    }
                    finally{
                        try{
                            rs.close();
                            pst.close();
                        }catch(Exception e){
                            //JOptionPane.showMessageDialog(null, e);
                        }
                    }
                }
            }
            
        }catch(Exception e){
            //JOptionPane.showMessageDialog(this, e);
        }finally{
            try{
                
                rs.close();
                pst.close();
                
            }catch(Exception e){
                
            }
        }
    }
    
    public void loadalldatatable (){
        try{
            
            String sql="select K.customer_id,K.book_id,B.book_title,K.starting_date,K.due_date,K.issue"
                    +" from books_keeping K "
                    +"join books_tb B on  K.book_id=B.book_id";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            CusgestTableDataShow.setModel(DbUtils.resultSetToTableModel(rs));
            
            
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CusgestTableDataShow = new javax.swing.JTable();
        loadallbooks = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        CusName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Library Manegement System...");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

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

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer id :");

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        CusgestTableDataShow.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(CusgestTableDataShow);

        loadallbooks.setBackground(new java.awt.Color(51, 51, 51));
        loadallbooks.setForeground(new java.awt.Color(255, 255, 255));
        loadallbooks.setText("All Recodes");
        loadallbooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadallbooksActionPerformed(evt);
            }
        });

        jButton2.setText("Genaret PDF");
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

        CusName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CusName.setForeground(new java.awt.Color(102, 255, 51));
        CusName.setText("CusName");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Name :-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CusName)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178)))
                        .addComponent(jButton1)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loadallbooks)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loadallbooks))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CusName)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 780, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login01.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        loadallbooks.setSelected(false);
        String checkcus=txt_search.getText();
        
        try{
            
            String sql="select K.customer_id,K.book_id,B.book_title,K.starting_date,K.due_date,K.issue"
                    +" from books_keeping K "
                    +"join books_tb B on  K.book_id=B.book_id where K.customer_id='"+checkcus+"'";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            CusgestTableDataShow.setModel(DbUtils.resultSetToTableModel(rs));
            try{
            
                sql="select C.customer_name from books_keeping K "
                    +"join customers C on  K.customer_id=C.customer_id where K.customer_id='"+checkcus+"'";
            
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                while(rs.next()){
                    CusName.setText(rs.getString("customer_name"));
                    CusName.setVisible(true);
                }
            
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }finally{
                try{
                
                    rs.close();
                    pst.close();
                
                }catch(Exception e){
                
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }finally{
            try{
                
                rs.close();
                pst.close();
                
            }catch(Exception e){
                
            }
        }
        
    }//GEN-LAST:event_txt_searchKeyReleased

    private void loadallbooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadallbooksActionPerformed
        txt_search.setText(null);
        loadalldatatable ();
    }//GEN-LAST:event_loadallbooksActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Library_Manegement_System_Firstpage WindowShow = new Library_Manegement_System_Firstpage ();
        WindowShow.show();
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*Reports*/
        /*String value=txt_search.getText();
        
        Date currentDate = GregorianCalendar.getInstance().getTime();
        DateFormat df = DateFormat.getDateInstance();
        String datestring = df.format(currentDate);
                    
        Date d = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat ("hh-mm-ss");
        String timestring = sdf.format(d);
        
        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File("Customer Id "+value+""+"-Read Books"+" "+datestring+" "+timestring+".pdf"));
        int dialogResult=dialog.showSaveDialog(null);
        if(dialogResult==JFileChooser.APPROVE_OPTION){
            String filepath = dialog.getSelectedFile().getPath();
            
            try{
                
                    String sql="select K.customer_id,K.book_id,B.book_title,K.starting_date,K.due_date,K.issue"
                        +" from books_keeping K "
                        +"join books_tb B on  K.book_id=B.book_id "
                        +"where K.customer_id="+value+"";            
            
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                
                    Document myDocument=new Document();
                    PdfWriter myWriter=PdfWriter.getInstance(myDocument, new FileOutputStream(filepath));
                    PdfPTable table=new PdfPTable(5);
                    myDocument.open();
                
                    float[] columnWidths=new float[]{3,9,6,6,5};
                    table.setWidths(columnWidths);
                
                    table.setWidthPercentage(100);
                
                    myDocument.add(new Paragraph("------------Library Manegement System-----------",FontFactory.getFont(FontFactory.TIMES_BOLD,25,Font.BOLD)));
                    myDocument.add(new Paragraph("Login Details...",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                    myDocument.add(new Paragraph(new Date().toString()));
                    myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                    myDocument.add(new Paragraph("Customer ID :- "+value,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD)));
                    //myDocument.add(new Paragraph("Customer Name :- "+cusname,FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD)));
                    myDocument.add(new Paragraph("    ",FontFactory.getFont(FontFactory.TIMES_BOLD,5,Font.BOLD)));
                    
                    table.addCell(new PdfPCell(new Paragraph("book_id",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("book_title",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("starting_date",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("due_date",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("issue",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                
                    while(rs.next()){
                        //myDocument.add(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                    
                    }
                    myDocument.add(table);
                    myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                    myDocument.add(new Paragraph("  ",FontFactory.getFont(FontFactory.TIMES_BOLD,5,Font.NORMAL)));
                    myDocument.add(new Paragraph("Thank for you...!",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.NORMAL)));
                    myDocument.close();
                    JOptionPane.showMessageDialog(null, "Report was successfully generated");
                
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                //JOptionPane.showMessageDialog(null, "Enter the customer id....");
            }
            finally{
                try{
                    rs.close();
                    pst.close();
                }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
            }
        }*/
        getcustomername();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        /*Reports*/
        /*String value=txt_search.getText();
        
        Date currentDate = GregorianCalendar.getInstance().getTime();
        DateFormat df = DateFormat.getDateInstance();
        String datestring = df.format(currentDate);
                    
        Date d = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat ("hh-mm-ss");
        String timestring = sdf.format(d);
        
        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File("Customer Id "+value+""+"-Read Books"+" "+datestring+" "+timestring+".pdf"));
        int dialogResult=dialog.showSaveDialog(null);
        if(dialogResult==JFileChooser.APPROVE_OPTION){
            String filepath = dialog.getSelectedFile().getPath();
            
            try{
                
                    /* sql="select C.customer_name from books_keeping K "
                        +"join customers C on  K.customer_id=C.customer_id where K.customer_id='"+value+"'";            
                    
                
                    String sql="select K.customer_id,K.book_id,B.book_title,K.starting_date,K.due_date,K.issue"
                        +" from books_keeping K "
                        +"join books_tb B on  K.book_id=B.book_id "
                        +"where K.customer_id="+value+"";            
            
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                
                    Document myDocument=new Document();
                    PdfWriter myWriter=PdfWriter.getInstance(myDocument, new FileOutputStream(filepath));
                    PdfPTable table=new PdfPTable(6);
                    myDocument.open();
                
                    float[] columnWidths=new float[]{3,3,9,6,6,5};
                    table.setWidths(columnWidths);
                
                    table.setWidthPercentage(100);
                
                    myDocument.add(new Paragraph("------------Library Manegement System-----------",FontFactory.getFont(FontFactory.TIMES_BOLD,25,Font.BOLD)));
                    myDocument.add(new Paragraph("Login Details...",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                    myDocument.add(new Paragraph(new Date().toString()));
                    myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                    myDocument.add(new Paragraph("    ",FontFactory.getFont(FontFactory.TIMES_BOLD,5,Font.BOLD)));
                    
                    
                    table.addCell(new PdfPCell(new Paragraph("customer_id",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("book_id",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("book_title",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("starting_date",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("due_date",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("issue",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.BOLD))));
                
                    while(rs.next()){
                        //myDocument.add(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(6),FontFactory.getFont(FontFactory.TIMES_BOLD,9,Font.NORMAL))));
                    }
                    myDocument.add(table);
                    myDocument.add(new Paragraph("=============================================",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                    myDocument.add(new Paragraph("  ",FontFactory.getFont(FontFactory.TIMES_BOLD,5,Font.NORMAL)));
                    myDocument.add(new Paragraph("Thank for you...!",FontFactory.getFont(FontFactory.TIMES_BOLD,10,Font.NORMAL)));
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
        }*/
        getcustomername();
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        Library_Manegement_System_Firstpage WindowShow = new Library_Manegement_System_Firstpage ();
        WindowShow.show();
        this.hide();
    }//GEN-LAST:event_jButton1KeyPressed

    private void txt_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_BACK_SPACE){
            loadalldatatable ();
            loadallbooks.setSelected(true);
            CusName.setVisible(false);
        }
    }//GEN-LAST:event_txt_searchKeyPressed

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
            java.util.logging.Logger.getLogger(Library_Manegement_System_Gest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library_Manegement_System_Gest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library_Manegement_System_Gest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library_Manegement_System_Gest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library_Manegement_System_Gest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CusName;
    private javax.swing.JTable CusgestTableDataShow;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JCheckBox loadallbooks;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    
    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LibraryMS.png")));
    }
}
