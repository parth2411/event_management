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
public class audience extends javax.swing.JFrame {
Connection connect=null;
Statement stm=null;
ResultSet rs=null;
    /**
     * Creates new form audience
     */
    public audience() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        list = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
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
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Lecture_96px.png"))); // NOI18N
        jLabel5.setText("Audience");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        e1.setBackground(new java.awt.Color(36, 47, 65));
        e1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        e1.setForeground(new java.awt.Color(255, 255, 255));
        e1.setText(" Audience List");
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
        jPanel1.add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 170, 40));

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
        jPanel1.add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 210, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 162, 890, 10));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\owner\\Desktop\\icon\\icons8_Long_Arrow_Left_32px_3.png")); // NOI18N
        jLabel16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel16MouseMoved(evt);
            }
        });
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\owner\\Desktop\\icon\\icons8_Delete_32px_3.png")); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, -1, -1));

        jPanel2.setLayout(new java.awt.CardLayout());

        list.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Show ID", "Booking ID", "Audience name", "Gender", "Date Of Birth", "E-mail", "Contact No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        list.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 85, 890, 300));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(36, 47, 65));
        jLabel18.setText("Enter Audience Name:-");
        list.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 30));

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

        update.setBackground(new java.awt.Color(36, 47, 65));
        update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Audience Name:-");
        update.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 34));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        update.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 230, 30));

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
        update.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));
        update.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 220, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Audience Name:-");
        update.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 34));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Booking ID:-");
        update.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 34));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        update.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 220, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Show ID:-");
        update.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 34));
        update.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 220, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Date Of Birth:-");
        update.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 34));
        update.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 220, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" E-mail:-");
        update.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, 34));
        update.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 220, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Edit_Property_48px_1.png"))); // NOI18N
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
        update.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 150, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Delete_Document_48px.png"))); // NOI18N
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
        update.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 150, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Contact No.:-");
        update.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, 34));
        update.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 220, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender:-");
        update.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(36, 47, 65));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        update.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(36, 47, 65));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        update.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        jPanel2.add(update, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void e1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e1MouseMoved
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        e1.setCursor(c);        // TODO add your handling code here:
    }//GEN-LAST:event_e1MouseMoved

    private void e1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e1MouseClicked
        update.setVisible(false);
        list.setVisible(true);
       

        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        while(table.getRowCount()>0)
        {
            table.removeRow(0);
        }
        try
        {
            String q ="Select * from audience;";
            stm = connect.createStatement();
            rs = stm.executeQuery(q);
            while(rs.next())
            {
                int a1 = rs.getInt("show_id");
                String a2 = rs.getString("booking_id");
                String a3 = rs.getString("audience_name");
                String a4 = rs.getString("gender");
                String a5 = rs.getString("dob");
                String a6 = rs.getString("email");
                String a7 = rs.getString("contact_no");
                table.addRow(new Object[]{a1,a2,a3,a4,a5,a6,a7});
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
         // TODO add your handling code here:
    }//GEN-LAST:event_e2MouseClicked

    private void jLabel16MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseMoved

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        second1 obj =new second1();
        obj.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
        {
            jButton3.doClick();
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String key = jTextField7.getText();
        if(key.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Enter Audience Name to search");
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
                String q = "select * from audience where audience_name='"+key+"';";
                stm = connect.createStatement();
                rs = stm.executeQuery(q);
                while(rs.next())
                {

                     int a1 = rs.getInt("show_id");
                String a2 = rs.getString("booking_id");
                String a3 = rs.getString("audience_name");
                String a4 = rs.getString("gender");
                String a5 = rs.getString("dob");
                String a6 = rs.getString("email");
                String a7 = rs.getString("contact_no");
                table.addRow(new Object[]{a1,a2,a3,a4,a5,a6,a7});
                }

            } catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String key = jTextField1.getText();
        if(key.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter Audience Name to be searched !!");
        }
        else
        {
            try
            {
                String q = "Select * from audience where audience_name='"+key+"';";
                stm = connect.createStatement();
                rs = stm.executeQuery(q);
                while(rs.next())
                {
                    jTextField6.setText(rs.getString("Audience_name"));
                    jTextField2.setText(rs.getString("booking_id"));
                    jTextField3.setText(rs.getString("show_id"));
                    jTextField4.setText(rs.getString("dob"));
                    jTextField5.setText(rs.getString("email"));
                    jTextField8.setText(rs.getString("contact_no"));
                }
                jTextField6.setEditable(true);
                jTextField2.setEditable(true);
                jTextField3.setEditable(true);
                jTextField4.setEditable(true);
                jTextField5.setEditable(true);
                jTextField8.setEditable(true);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        jLabel10.setCursor(c);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseMoved

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        String key = jTextField1.getText();
        String a1 = jTextField6.getText();
        String a2 = jTextField2.getText();
        String a3 = jTextField3.getText();
        String a4 = jTextField4.getText();
        String a5 = jTextField5.getText();
        String a6 = jTextField8.getText();
        String gender = null;
        if(jRadioButton1.isSelected())
        {
            gender="Male";
        }
        if(jRadioButton2.isSelected())
        {
            gender="Female";
        }
        try
        {
            String q = "update audience set audience_name='"+a1+"',booking_id='"+a2+"',show_id='"+a3+"',dob='"+a4+"',email='"+a5+"',contact_no='"+a6+"',gender='"+gender+"' where audience_name='"+key+"'";
            stm = connect.createStatement();
            stm.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "Record Updated Successfully !! :) ");
            jTextField1.setText("");
            jTextField6.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField8.setText("");
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseMoved
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        jLabel9.setCursor(c);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseMoved

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        String key = jTextField1.getText();
        try
        {
            String q = "delete from audience where audience_name='"+key+"';";
            stm = connect.createStatement();
            stm.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "Record Deleted Successfully !! :) ");
            jTextField1.setText("");
            jTextField6.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField8.setText("");
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(audience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(audience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(audience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(audience.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new audience().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel list;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
