/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event1;

import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author owner
 */
public class s4 extends javax.swing.JFrame {
 Connection connect=null;
Statement stm=null;
ResultSet rs=null;
    /**
     * Creates new form s4
     */
    public s4() {
        initComponents();
         connect= mysqlconnect.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        addnew = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        pid = new javax.swing.JTextField();
        psid = new javax.swing.JTextField();
        pc = new javax.swing.JTextField();
        padd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pg = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        list = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new java.awt.CardLayout());

        addnew.setBackground(new java.awt.Color(36, 47, 65));
        addnew.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Performer Name:-");
        addnew.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 34));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" Performer ID:-");
        addnew.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 34));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" Show ID:-");
        addnew.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 34));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Contact Detail:-");
        addnew.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 34));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Address:-");
        addnew.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, 34));
        addnew.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 220, 30));

        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        addnew.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 220, 30));
        addnew.add(psid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 220, 30));
        addnew.add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 220, 30));
        addnew.add(padd, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 220, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\owner\\Desktop\\icon\\icons8_Add_List_96px.png")); // NOI18N
        jLabel1.setText("Add New");
        jLabel1.setToolTipText("");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        addnew.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));
        addnew.add(pg, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 220, 30));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Genre:-");
        addnew.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, 34));

        jPanel2.add(addnew, "card4");

        update.setBackground(new java.awt.Color(36, 47, 65));
        update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Performer Name:-");
        update.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 34));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        update.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 230, 30));

        jButton1.setText("Search");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        update.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));
        update.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 220, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Performer Name:-");
        update.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 34));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Performer ID:-");
        update.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 34));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        update.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 220, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Show ID:-");
        update.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 34));
        update.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 220, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contact Detail:-");
        update.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 34));
        update.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 220, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Address:-");
        update.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 34));
        update.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 220, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\owner\\Desktop\\icon\\icons8_Edit_Property_48px_1.png")); // NOI18N
        jLabel10.setText("Modify");
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel10MouseMoved(evt);
            }
        });
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        update.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 150, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\owner\\Desktop\\icon\\icons8_Delete_Document_48px.png")); // NOI18N
        jLabel9.setText("Delete");
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel9MouseMoved(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        update.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 150, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Genre:-");
        update.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, 34));

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        update.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 220, 30));

        jPanel2.add(update, "card3");

        list.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Performer ID", "Performer Name", "Performer Address", "Show ID", "Contact details", "Genre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        list.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 85, 890, 300));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(36, 47, 65));
        jLabel21.setText("Enter Performer Name:-");
        list.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 30));

        jTextField7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });
        list.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 200, -1));

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        list.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 30));

        jPanel2.add(list, "card4");

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 890, 380));

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\owner\\Desktop\\icon\\icons8_Theatre_Mask_96px.png")); // NOI18N
        jLabel5.setText("Performer");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        e1.setBackground(new java.awt.Color(36, 47, 65));
        e1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        e1.setForeground(new java.awt.Color(255, 255, 255));
        e1.setText("Performer List");
        e1.setOpaque(true);
        e1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                e1MouseMoved(evt);
            }
        });
        e1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e1MouseClicked(evt);
            }
        });
        jPanel1.add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 170, 40));

        e2.setBackground(new java.awt.Color(20, 46, 65));
        e2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        e2.setForeground(new java.awt.Color(255, 255, 255));
        e2.setText("Update Details");
        e2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                e2MouseMoved(evt);
            }
        });
        e2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e2MouseClicked(evt);
            }
        });
        jPanel1.add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 210, 40));

        e3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        e3.setForeground(new java.awt.Color(255, 255, 255));
        e3.setText("Add new Performer");
        e3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                e3MouseMoved(evt);
            }
        });
        e3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e3MouseClicked(evt);
            }
        });
        jPanel1.add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 240, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 162, 890, 10));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\owner\\Desktop\\icon\\icons8_Long_Arrow_Left_32px_3.png")); // NOI18N
        jLabel18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel18MouseMoved(evt);
            }
        });
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\owner\\Desktop\\icon\\icons8_Delete_32px_3.png")); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 180));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        jLabel1.setCursor(c);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseMoved

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        jLabel10.setCursor(c);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseMoved

    private void jLabel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseMoved
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        jLabel9.setCursor(c);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseMoved

    private void e1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e1MouseMoved
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        e1.setCursor(c);        // TODO add your handling code here:
    }//GEN-LAST:event_e1MouseMoved

    private void e1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e1MouseClicked
        update.setVisible(false);
        list.setVisible(true);
        addnew.setVisible(false);
        
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        while(table.getRowCount()>0)
        {
            table.removeRow(0);
        }
        try
        {
            String q ="Select * from performer;";
            stm = connect.createStatement();
            rs = stm.executeQuery(q);
            while(rs.next())
            {
                int a1 = rs.getInt("performer_id");
                String a2 = rs.getString("performer_name");
                String a3 = rs.getString("performer_address");
                int a4 = rs.getInt("show_id");
                int a5 = rs.getInt("contact_details");
                String a6 = rs.getString("genre");
                table.addRow(new Object[]{a1,a2,a3,a4,a5,a6});
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_e1MouseClicked

    private void e2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e2MouseMoved
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        e2.setCursor(c);        // TODO add your handling code here:
    }//GEN-LAST:event_e2MouseMoved

    private void e2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e2MouseClicked
        update.setVisible(true);
        list.setVisible(false);
        addnew.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_e2MouseClicked

    private void e3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e3MouseMoved
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        e3.setCursor(c);
    }//GEN-LAST:event_e3MouseMoved

    private void e3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e3MouseClicked
        update.setVisible(false);
        list.setVisible(false);
        addnew.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_e3MouseClicked

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jLabel18MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseMoved

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        second1 obj =new second1();
        obj.setVisible(true);
          this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
 String key = jTextField1.getText();
    if(key.isEmpty())
    {
        JOptionPane.showMessageDialog(null, "Enter performer Name to be searched !!");
    }
    else
    {
        try
        {
            String q = "Select * from performer where performer_name='"+key+"';";
            stm = connect.createStatement();
            rs = stm.executeQuery(q);
            while(rs.next())
            {
                jTextField6.setText(rs.getString("performer_name"));
                jTextField2.setText(rs.getString("performer_id"));
                jTextField3.setText(rs.getString("show_id"));
                jTextField4.setText(rs.getString("contact_details"));
                jTextField5.setText(rs.getString("performer_address"));
                jTextField12.setText(rs.getString("genre"));
            }
            jTextField6.setEditable(true);
            jTextField2.setEditable(true);
            jTextField3.setEditable(true);
            jTextField4.setEditable(true);
            jTextField5.setEditable(true);
            jTextField12.setEditable(true);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
      String key = jTextField1.getText();
  try
  {
      String q = "delete from performer where performer_name='"+key+"';";
      stm = connect.createStatement();
      stm.executeUpdate(q);
      JOptionPane.showMessageDialog(null, "Record Deleted Successfully !! :) ");
      jTextField1.setText("");
      jTextField6.setText("");
      jTextField2.setText("");
      jTextField3.setText("");
      jTextField4.setText("");
      jTextField5.setText("");
       jTextField12.setText("");
  }
  catch(Exception ex)
  {
      JOptionPane.showMessageDialog(null, ex);
  }             // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
try
{
    String ename1= pname.getText();
    String ename2= pid.getText();
    String ename3= psid.getText();
    String ename4= padd.getText();
    String ename5= pg.getText();
    String ename6= pc.getText();
    String q = "insert into performer(performer_id,show_id,performer_name,contact_details,performer_address,genre) values('"+ename2+"','"+ename3+"','"+ename1+"','"+ename6+"','"+ename4+"','"+ename5+"')";
    stm=connect.createStatement();
    stm.executeUpdate(q);
    JOptionPane.showMessageDialog(null,"Record Addedd Successfully !!");
    //jLabel1.doClick();
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(null, ex);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
  String key = jTextField1.getText();
  String a1 = jTextField6.getText();
  String a2 = jTextField2.getText();
  String a3 = jTextField3.getText();
  String a4 = jTextField4.getText();
  String a5 = jTextField5.getText();
  String a6 = jTextField12.getText();
  try
  {
      String q = "update performer set performer_name='"+a1+"',performer_id='"+a2+"',show_id='"+a3+"',contact_details='"+a4+"',performer_address='"+a5+"',genre='"+a6+"' where performer_name='"+key+"'";
      stm = connect.createStatement();
      stm.executeUpdate(q);
      JOptionPane.showMessageDialog(null, "Record Updated Successfully !! :) ");
      jTextField1.setText("");
      jTextField6.setText("");
      jTextField2.setText("");
      jTextField3.setText("");
      jTextField4.setText("");
      jTextField5.setText("");
      jTextField12.setText("");
  }
  catch(Exception ex)
  {
      JOptionPane.showMessageDialog(null, ex);
  }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String key = jTextField7.getText();
if(key.isEmpty())
{
    JOptionPane.showMessageDialog(null,"Enter Performer Name to search");
}
else
{
    DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
    while(table.getRowCount()>0)
    {
        table.removeRow(0);
        
    }
    try
    {
        String q = "select * from performer where performer_name='"+key+"';";
         stm = connect.createStatement();
            rs = stm.executeQuery(q);
            while(rs.next())
            {
                
                int a1 = rs.getInt("performer_id");
                String a2 = rs.getString("performer_name");
                String a3 = rs.getString("performer_address");
                String a4 = rs.getString("show_id");
                String a5 = rs.getString("contact_details");
                String a6 = rs.getString("genre");
                table.addRow(new Object[]{a1,a2,a3,a4,a5,a6});
            }
        
    } catch (Exception ex) 
    {
        JOptionPane.showMessageDialog(null, ex);
    }
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
if(evt.getKeyChar()==KeyEvent.VK_ENTER)
{
 jButton3.doClick();
}        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyPressed

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
            java.util.logging.Logger.getLogger(s4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(s4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(s4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(s4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new s4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addnew;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel list;
    private javax.swing.JTextField padd;
    private javax.swing.JTextField pc;
    private javax.swing.JTextField pg;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField psid;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
