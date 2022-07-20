/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RIBUT WIBOWO RAHAYU
 */
public class dtnilai extends javax.swing.JFrame {
DefaultTableModel tbldsn;
    /**
     * Creates new form dtnilai
     */
    public dtnilai() {
        initComponents();
        String [] judul = {"NIM","NAMA","IP","SEMESTER","JURUSAN","PRODI"};
        tbldsn = new DefaultTableModel(judul,0);
        tabel.setModel(tbldsn);
        bersih();
        tampildata();
        nim();
    }

    private void bersih(){
        nama.setText("");
        nim.setSelectedItem(">Pilih<");
        ip.setText("");
        semester.setSelectedItem(">Pilih<");
        jurusan.setText("");
        prodi.setText("");
    }
    
    private void tampildata(){
    int row = tabel.getRowCount();
        for(int a=0;a<row;a++){
            tbldsn.removeRow(0);
        }
        try {
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
           ResultSet rs = con.createStatement().executeQuery("SELECT * FROM indexnilai");
           while(rs.next()){
               String data []={
                   rs.getString(1),
                   rs.getString(2),
                   rs.getString(3),
                   rs.getString(4),
                   rs.getString(5),
                   rs.getString(6),
                   };
               tbldsn.addRow(data);
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Connection Error\n"+ex);
        }    
    }
    
    private void nim (){
        try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
           ResultSet rs = con.createStatement().executeQuery("SELECT * FROM mahasiswa");
           while(rs.next()){
               nim.addItem(rs.getString("NIM"));
           }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error :"+ex);
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        ip = new javax.swing.JTextField();
        semester = new javax.swing.JComboBox<>();
        jurusan = new javax.swing.JTextField();
        prodi = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        nim = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        berdasarkan = new javax.swing.JComboBox<>();
        cari = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SISTEM INFORMASI AKADEMIK");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INDEKS PRESTASI KELULUSAN");

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_Cancel_1493282.png")); // NOI18N
        jButton1.setText("Exit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_layout_3855599.png")); // NOI18N
        jButton2.setText("Menu");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("NIM MAHASISWA");

        jLabel4.setText("NAMA MAHASISWA");

        jLabel5.setText("IP TERAKHIR");

        jLabel6.setText("SEMESTER");

        jLabel7.setText("JURUSAN");

        jLabel8.setText("PRODI");

        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">Pilih<", "1", "2", "3", "4", "5", "6", "7", "8" }));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_floppy_285657.png")); // NOI18N
        jButton3.setText("SIMPAN");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_icon-136-document-edit_314251.png")); // NOI18N
        jButton4.setText("EDIT");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_basket_1814090.png")); // NOI18N
        jButton5.setText("HAPUS");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        nim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">Pilih<" }));
        nim.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nimItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prodi, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ip, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nama, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 123, Short.MAX_VALUE)))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(prodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(30, 30, 30))
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "CARI"));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cari Berdasarkan");

        berdasarkan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIM", "NAMA", "IP" }));

        cari.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_search_322497.png")); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(berdasarkan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(berdasarkan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 204, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
String NIM = nim.getItemAt(nim.getSelectedIndex());
String NAMA = nama.getText();
String IP = ip.getText();
String SEMESTER = semester.getItemAt(semester.getSelectedIndex());
String JURUSAN = jurusan.getText();
String PRODI = prodi.getText();

    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
        con.createStatement().executeUpdate("INSERT INTO indexnilai VALUES"+"('"+NIM+"','"+NAMA+"','"+IP+"','"+SEMESTER+"','"+JURUSAN+"','"+PRODI+"')");
        tampildata();
        bersih();
        JOptionPane.showMessageDialog(null,"Data Berhasil di Tambahkan...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error "+ex);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
String NIM = nim.getItemAt(nim.getSelectedIndex());
String NAMA = nama.getText();
String IP = ip.getText();
String SEMESTER = semester.getItemAt(semester.getSelectedIndex());
String JURUSAN = jurusan.getText();
String PRODI = prodi.getText();

    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
        con.createStatement().executeUpdate("update indexnilai set NAMA='"+NAMA+"',IP='"+IP+"',SEMESTER='"+SEMESTER+"',JURUSAN='"+JURUSAN+"',PRODI='"+PRODI+"' where NIM='"+NIM+"'");
        tampildata();
        bersih();
        JOptionPane.showMessageDialog(null,"Data Berhasil di Update");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: ");
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
    try {
        if (JOptionPane.showConfirmDialog(null,"Hapus Data?","Information",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE)== JOptionPane.YES_OPTION)
        {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
        con.createStatement().executeUpdate("delete from indexnilai where NIM='"+nim.getItemAt(nim.getSelectedIndex())+"'");
        tampildata();
        JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus...");
        bersih();
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Menghapus Data Gagal!!!");
    }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
new menuutama().show();
this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
if (JOptionPane.showConfirmDialog(null,"Keluar?","Information",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE)== JOptionPane.YES_OPTION) {
    System.exit(0);
}
    }//GEN-LAST:event_jButton1MouseClicked

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
int i=tabel.getSelectedRow();
if(i>-1){
    nim.setSelectedItem(tbldsn.getValueAt(i, 0).toString());
    nama.setText(tbldsn.getValueAt(i, 1).toString());
    ip.setText(tbldsn.getValueAt(i, 2).toString());
    semester.setSelectedItem(tbldsn.getValueAt(i, 3).toString());
    jurusan.setText(tbldsn.getValueAt(i, 4).toString());
    prodi.setText(tbldsn.getValueAt(i, 5).toString());
}
    }//GEN-LAST:event_tabelMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
    if(berdasarkan.getSelectedItem()=="NAMA"){
        int row = tabel.getRowCount();
        for(int a=0;a<row;a++){
            tbldsn.removeRow(0);
        }
        try {
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
           ResultSet rs = con.createStatement().executeQuery("SELECT * FROM indexnilai where NAMA='"+cari.getText()+"'");
           while(rs.next()){
               String data []={
                   rs.getString(1),
                   rs.getString(2),
                   rs.getString(3),
                   rs.getString(4),
                   rs.getString(5),
                   rs.getString(6),
                   };
               tbldsn.addRow(data);
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Connection Error\n"+ex);
        }
      }else if(berdasarkan.getSelectedItem()=="NIM"){
        int row = tabel.getRowCount();
        for(int a=0;a<row;a++){
            tbldsn.removeRow(0);
        }
        try {
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
           ResultSet rs = con.createStatement().executeQuery("SELECT * FROM indexnilai where NIM='"+cari.getText()+"'");
           while(rs.next()){
               String data []={
                   rs.getString(1),
                   rs.getString(2),
                   rs.getString(3),
                   rs.getString(4),
                   rs.getString(5),
                   rs.getString(6),
                   };
               tbldsn.addRow(data);
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Connection Error\n"+ex);
        }
      }else if(berdasarkan.getSelectedItem()=="IP"){
            int row = tabel.getRowCount();
            for(int a=0;a<row;a++){
                tbldsn.removeRow(0);
            }
          try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM indexnilai where IP='"+cari.getText()+"'");
            while (rs.next()){
                String data [] = {
                   rs.getString(1),
                   rs.getString(2),
                   rs.getString(3),
                   rs.getString(4),
                   rs.getString(5),
                   rs.getString(6),
                };
                tbldsn.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(dtnilai.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }//GEN-LAST:event_jButton6MouseClicked

    private void nimItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nimItemStateChanged
try {
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
           ResultSet rs = con.createStatement().executeQuery("SELECT * FROM mahasiswa where NIM='"+nim.getItemAt(nim.getSelectedIndex())+"'");
           while(rs.next()){
               nama.setText(rs.getString("NAMA"));
               jurusan.setText(rs.getString("JURUSAN"));
               prodi.setText(rs.getString("PRODI"));
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Connection Error\n"+ex);
        }
    }//GEN-LAST:event_nimItemStateChanged

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
            java.util.logging.Logger.getLogger(dtnilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dtnilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dtnilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dtnilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dtnilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> berdasarkan;
    private javax.swing.JTextField cari;
    private javax.swing.JTextField ip;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jurusan;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> nim;
    private javax.swing.JTextField prodi;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}