/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIBRARYMANAGEMENTSYSTEM0_1.Windows;

import LIBRARYMANAGEMENTSYSTEM0_1.Connection.Connections;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Anjana
 */
public class Library_Manegement_System_NewAccount extends javax.swing.JFrame {

    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form Library_Manegement_System_NewAccount
     */
    public Library_Manegement_System_NewAccount() {
        initComponents();
        seticon();
        conn = Connections.java_db();
        Lcompass.setVisible(false);
        this.setResizable(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        ucpass = new javax.swing.JPasswordField();
        upass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Lcompass = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Library Manegement System...");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Create New Account...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 540, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Comform Password :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Liibrary Manegement System...");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 254, -1));

        ucpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ucpassKeyReleased(evt);
            }
        });
        jPanel1.add(ucpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 254, -1));

        upass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                upassKeyReleased(evt);
            }
        });
        jPanel1.add(upass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 254, -1));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 65, -1));

        jButton2.setText("Clear");
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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 65, -1));

        jButton3.setText("Cancel");
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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        Lcompass.setForeground(new java.awt.Color(255, 102, 102));
        Lcompass.setText("incorrect Password..!");
        jPanel1.add(Lcompass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 125, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 340, 10));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/light2.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel20MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel20MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/light2.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel21MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel21MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BG.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Library_Manegement_System_AdminLogin windowshow=new Library_Manegement_System_AdminLogin();
        windowshow.show();
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to create new account?", "New Account Program Message Box",
        JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
        int value0 = USER.UserId;
        String value1 = USER.UserName;
        String UserName=uname.getText();
        String FPassword=upass.getText();
        String ComPassword=ucpass.getText();
        
        //if(FPassword == ComPassword){
        try{
            String sql="insert into users (USERNAME,PASSWORD)"
                    +"values('"+UserName+"',(sha1('"+ComPassword+"')))";
            
            pst=conn.prepareStatement(sql);
            pst.execute();
                        
            JOptionPane.showMessageDialog(this, "Saved Successfull...");
            
            
        
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
                        +"values("+value0+",'"+UserName+"','"+value3+" / "+value2+"','Create New Account...')";
                pst=conn.prepareStatement(sql);
                pst.execute();
            
            }catch(Exception e){
            
                //JOptionPane.showMessageDialog(null, e);
            
            }finally{
                try{
                
                    rs.close();
                    pst.close();
                
                }catch(Exception e){
                    //JOptionPane.showMessageDialog(null, e);
                }
            }
            
        }catch(Exception e){
            
            //JOptionPane.showMessageDialog(null, e);
            
        }finally{
            try{
                uname.setText("");
                upass.setText("");
                ucpass.setText("");
                
                rs.close();
                pst.close();
                
            }catch(Exception e){
                //JOptionPane.showMessageDialog(null, e);
            }
        }
        /*}else{
            Lcompass.setVisible(true);
        }*/
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        uname.setText("");
        upass.setText("");
        ucpass.setText("");
        Lcompass.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void upassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upassKeyReleased
       Lcompass.setVisible(false);
    }//GEN-LAST:event_upassKeyReleased

    private void ucpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ucpassKeyReleased
        /*String P=upass.getText();
        String CP=ucpass.getText();
        if(P!=CP){
            Lcompass.setVisible(true);
        }else{
            Lcompass.setVisible(false);
        }
        */
        Lcompass.setVisible(false);
    }//GEN-LAST:event_ucpassKeyReleased

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            int confirmed = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to create new account?", "New Account Program Message Box",
        JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
        int value0 = USER.UserId;
        String value1 = USER.UserName;
        String UserName=uname.getText();
        String FPassword=upass.getText();
        String ComPassword=ucpass.getText();
        
        //if(FPassword == ComPassword){
        try{
            String sql="insert into users (USERNAME,PASSWORD)"
                    +"values('"+UserName+"',(sha1('"+ComPassword+"')))";
            
            pst=conn.prepareStatement(sql);
            pst.execute();
                        
            JOptionPane.showMessageDialog(this, "Saved Successfull...");
            
            
        
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
                        +"values("+value0+",'"+UserName+"','"+value3+" / "+value2+"','Create New Account...')";
                pst=conn.prepareStatement(sql);
                pst.execute();
            
            }catch(Exception e){
            
                //JOptionPane.showMessageDialog(null, e);
            
            }finally{
                try{
                
                    rs.close();
                    pst.close();
                
                }catch(Exception e){
                    //JOptionPane.showMessageDialog(null, e);
                }
            }
            
        }catch(Exception e){
            
            //JOptionPane.showMessageDialog(null, e);
            
        }finally{
            try{
                uname.setText("");
                upass.setText("");
                ucpass.setText("");
                
                rs.close();
                pst.close();
                
            }catch(Exception e){
                //JOptionPane.showMessageDialog(null, e);
            }
        }
        /*}else{
            Lcompass.setVisible(true);
        }*/
        }
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            uname.setText("");
        upass.setText("");
        ucpass.setText("");
        Lcompass.setVisible(false);
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            Library_Manegement_System_AdminLogin windowshow=new Library_Manegement_System_AdminLogin();
        windowshow.show();
        this.dispose();
        }
    }//GEN-LAST:event_jButton3KeyPressed

    private void jLabel20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MousePressed
        upass.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel20MousePressed

    private void jLabel20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseReleased
        upass.setEchoChar('*');
    }//GEN-LAST:event_jLabel20MouseReleased

    private void jLabel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MousePressed
        ucpass.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel21MousePressed

    private void jLabel21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseReleased
        ucpass.setEchoChar('*');
    }//GEN-LAST:event_jLabel21MouseReleased

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
            java.util.logging.Logger.getLogger(Library_Manegement_System_NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library_Manegement_System_NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library_Manegement_System_NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library_Manegement_System_NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library_Manegement_System_NewAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lcompass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField ucpass;
    private javax.swing.JTextField uname;
    private javax.swing.JPasswordField upass;
    // End of variables declaration//GEN-END:variables

    
    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LibraryMS.png")));
    }

}
