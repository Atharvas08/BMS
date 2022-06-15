/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.sql.*;
import Project.ConnectionProvider;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;

public class billing extends javax.swing.JFrame {

    public int finalTotal = 0;

    /**
     * Creates new form billing
     */
    public billing() {
        initComponents();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        jLabel5.setText(dFormat.format(date));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        jLabel6.setText(dtf.format(now));
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            Statement st1 = con.createStatement();
            ResultSet rs = st.executeQuery("select * from buyer");
            
//            System.out.println("Query Fetched");

            while (rs.next()) {
                jComboBox1.addItem(rs.getString(2));

            }
            ResultSet rs1 = st1.executeQuery("select * from product");
//            System.out.println("Query Fetched");
            while (rs1.next()) {
                jComboBox2.addItem(rs1.getString(2));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing frame.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 6, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Billing ani.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 280, 90));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 6, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Time");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 57, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setText("00-00-00");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(923, 6, -1, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("00:00:00");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(923, 57, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1159, 10));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setText("Buyer Details:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 30));

        jTextField1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 150, -1));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setText("Contact No.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, 30));

        jTextField2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 149, -1));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setText("Email ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, 30));

        jTextField3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 188, -1));

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel11.setText("Address");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, -1, 30));

        jTextField4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 201, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 231, 1153, -1));

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel12.setText("Product Details:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 245, -1, -1));

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel13.setText("Product ID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 293, -1, -1));

        jTextField5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 287, 60, 30));

        jLabel14.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel14.setText("Product Name");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 293, -1, -1));

        jTextField6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 287, 154, -1));

        jLabel15.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel15.setText("Rate");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 293, -1, -1));

        jTextField7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 287, 85, -1));

        jTextField8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 287, 90, -1));

        jLabel16.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel16.setText("Quantity");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 293, -1, -1));

        jLabel17.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel17.setText("Description");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, -1, -1));

        jTextField9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(942, 287, 199, -1));

        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jButton1.setText("ADD");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1061, 324, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 368, 1153, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Rate", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 384, 534, 150));

        jLabel18.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel18.setText("Calculation Details:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 384, -1, -1));

        jLabel19.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel19.setText("Total");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 430, -1, -1));

        jLabel20.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel20.setText("Paid Amount");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, -1, -1));

        jTextField10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 216, -1));

        jTextField11.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 216, -1));

        jButton2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 421, 102, -1));

        jButton3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 469, 102, -1));

        jButton4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 515, 102, -1));

        jLabel23.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel23.setText("Buyer ID");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        jTextField13.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 40, 30));

        jLabel21.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel21.setText("Pending Amount");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, -1, -1));

        jTextField12.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, 220, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Select Buyer-----" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 150, -1));

        jLabel22.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel22.setText("Select Buyer");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 100, -1));

        jLabel24.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel24.setText("Choose Product ");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        jComboBox2.setMaximumRowCount(100);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Choose Product-----" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 180, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing background.png"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String name = jTextField1.getText().trim();
        String bId = jTextField13.getText().trim();
        String contactNo = jTextField2.getText().trim();
        String email = jTextField3.getText().trim();
        String address = jTextField4.getText().trim();
        String pId = jTextField5.getText().trim();
        String pname = jTextField6.getText().trim();
        String rate = jTextField7.getText().trim();
        String quantity = jTextField8.getText().trim();
        String desc = jTextField9.getText().trim();

        String path = "E:\\";
        if (name.equals("") && bId.equals("") && contactNo.equals("") && email.equals("") && address.equals("")) {
            JOptionPane.showMessageDialog(null, "Buyer Details empty.\n\nCannot generate bill");
        } else if (pId.equals("") && pname.equals("") && rate.equals("") && quantity.equals("") && desc.equals("")) {
            JOptionPane.showMessageDialog(null, "Product Details empty.\n\nCannot generate bill");
        } else if (jTextField12.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Amount not paid.\n\nCannot generate bill");
        } else {
            com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
            try {
                PdfWriter.getInstance(doc, new FileOutputStream(path + "" + name + " " + jLabel5.getText() + ".pdf"));
                doc.open();
                Paragraph paragraph1 = new Paragraph("                                                    AUH (Billing Management System)\n                                 Contact Number: (+91) 1234567890\n\n");
                doc.add(paragraph1);
                doc.open();
                Paragraph paragraph2 = new Paragraph("Date & Time: " + jLabel5.getText() + " " + jLabel6.getText() + "\nBuyer Details:\nBuyer ID: " + bId + "\nName: " + name + "\nContact NO: " + contactNo + "\nEmail ID: " + email + "\nAddress: " + address + "\n\n");

                doc.add(paragraph2);

                Paragraph paragraph3 = new Paragraph("\n\n\n\n\n");
                doc.add(paragraph3);
                PdfPTable tbl = new PdfPTable(5);

                tbl.addCell("Name");
                tbl.addCell("Description");
                tbl.addCell("Rate");
                tbl.addCell("Quantity");
                tbl.addCell("Sub Total");
                for (int i = 0; i < jTable1.getRowCount(); i++) {

                    String n = jTable1.getValueAt(i, 0).toString();
                    String d = jTable1.getValueAt(i, 1).toString();
                    String r = jTable1.getValueAt(i, 2).toString();
                    String q = jTable1.getValueAt(i, 3).toString();
                    String s = jTable1.getValueAt(i, 4).toString();

                    tbl.addCell(n);
                    tbl.addCell(d);
                    tbl.addCell(r);
                    tbl.addCell(q);
                    tbl.addCell(s);
                }
                doc.add(tbl);
                Paragraph paragraph4 = new Paragraph("\nTotal:" + jTextField10.getText() + "\nPaid Amount:" + jTextField11.getText() + "\nPending Amount:" + jTextField12.getText() + "\n\nThank You for Visiting !!!\n AUH Enterprises.");
                doc.add(paragraph4);
                JOptionPane.showMessageDialog(null, "Bill Generated");
                setVisible(true);
                new billing().setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            doc.close();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

        String name = jTextField1.getText().trim();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from buyer where name like '" + name + "%' ");
            if (rs.next()) {
                jTextField13.setText(rs.getString(1));
                jTextField1.setText(rs.getString(2));
                jTextField2.setText(rs.getString(3));
                jTextField3.setText(rs.getString(4));
                jTextField4.setText(rs.getString(5));
                jTextField13.setEditable(false);
            } else {
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        String contactNo = jTextField2.getText().trim();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from buyer where contactNo like '" + contactNo + "%' ");
            if (rs.next()) {
                jTextField13.setText(rs.getString(1));
                jTextField1.setText(rs.getString(2));
                jTextField2.setText(rs.getString(3));
                jTextField3.setText(rs.getString(4));
                jTextField4.setText(rs.getString(5));
                jTextField13.setEditable(false);
            } else {
                jTextField1.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField13.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        String pId = jTextField5.getText().trim();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from product where pId ='" + pId + "' ");
            if (rs.next()) {
                jTextField6.setText(rs.getString(2));
                jTextField7.setText(rs.getString(3));
                jTextField8.setText("1");
                jTextField9.setText(rs.getString(4));
            } else {
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String pId = jTextField5.getText().trim();
        String pname = jTextField6.getText().trim();
        int price = Integer.parseInt(jTextField7.getText().trim());
        int quantity = Integer.parseInt(jTextField8.getText().trim());
        String desc = jTextField9.getText().trim();
        try {
            if (price <= 0) {
                JOptionPane.showMessageDialog(null, "Price can't be negative or zero!!");
            } else if (quantity <= 0) {
                JOptionPane.showMessageDialog(null, "Quantity can't be negative or zero!!");
            } else if (pname.equals("") && desc.equals("")) {
                JOptionPane.showMessageDialog(null, "Product Details empty.\n\nCannot generate bill");
            } else {

                int total = price * quantity;
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.addRow(new Object[]{jTextField6.getText(), jTextField9.getText(), price, quantity, total});
                finalTotal = finalTotal + total;
                String finalTotal1 = String.valueOf(finalTotal);
                jTextField10.setText(finalTotal1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Product Details empty.\n\nCannot generate bill");
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:

        String paidAmount = jTextField11.getText().trim();

        int z = Integer.parseInt(paidAmount);
        finalTotal = z - finalTotal;
        if (finalTotal <= 0) {
            JOptionPane.showMessageDialog(null, "Insufficient amount paid");
            jTextField12.setText(null);
        } else {
            String finalTotal1 = String.valueOf(finalTotal);
            jTextField12.setText(finalTotal1);
            jTextField12.setEditable(false);
        }

    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new billing().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
        String bId = jTextField13.getText().trim();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from buyer where bId ='" + bId + "' ");
            if (rs.next()) {

                jTextField1.setText(rs.getString(2));
                jTextField2.setText(rs.getString(3));
                jTextField3.setText(rs.getString(4));
                jTextField4.setText(rs.getString(5));
                jTextField13.setEditable(false);
            } else {
                jTextField1.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField13.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
        String pName = jTextField6.getText().trim();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from product where pName ='" + pName + "' ");
            if (rs.next()) {
                jTextField5.setText(rs.getString(1));
                jTextField7.setText(rs.getString(3));
                jTextField8.setText("1");
                jTextField9.setText(rs.getString(4));
            } else {
                jTextField5.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String name = (String) jComboBox1.getSelectedItem();
            
            ResultSet rs = st.executeQuery("select * from buyer where name like '" + name + "%' ");
            if (rs.next()) {
                jTextField13.setText(rs.getString(1));
                jTextField1.setText(rs.getString(2));
                jTextField2.setText(rs.getString(3));
                jTextField3.setText(rs.getString(4));
                jTextField4.setText(rs.getString(5));
                jTextField13.setEditable(false);
            } else if(name=="") {
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
            }
             else {
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
         try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String name = (String) jComboBox2.getSelectedItem();
            
            ResultSet rs = st.executeQuery("select * from product where pName like '" + name + "%' ");
            if (rs.next()) {
                jTextField5.setText(rs.getString(1));
                jTextField6.setText(rs.getString(2));
                jTextField7.setText(rs.getString(3));
                jTextField8.setText("1");
                jTextField9.setText(rs.getString(4));
                jTextField5.setEditable(false);
            } else if(name=="") {
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
            }
             else {
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(billing.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billing.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billing.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billing.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
