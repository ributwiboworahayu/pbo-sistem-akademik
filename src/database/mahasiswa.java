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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RIBUT WIBOWO RAHAYU
 */
public class mahasiswa extends javax.swing.JFrame {
DefaultTableModel tbldsn;
    
    public mahasiswa() {
        initComponents();
        String [] judul = {"NAMA","NIM","JENIS_KELAMIN","JURUSAN","PRODI","ALAMAT","HOBI","AGAMA","HP"};
        tbldsn = new DefaultTableModel(judul,0);
        tabel.setModel(tbldsn);
        bersih ();
        tampildata();
    }

    
    private void bersih(){
       nama.setText("");
       nim.setText("");
       lk.setSelected(false);
       pr.setSelected(false);
       alamat.setText("");
       prodi.setSelectedItem(">Pilih<");
       hobi.setSelectedItem(">Pilih<");
       agama.setSelectedItem(">Pilih<");
       hp.setText("");
    }
    
    public final void tampildata(){
    int row = tabel.getRowCount();
        for(int a=0;a<row;a++){
            tbldsn.removeRow(0);
        }
        try {
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
           ResultSet rs = con.createStatement().executeQuery("SELECT * FROM mahasiswa");
           while(rs.next()){
               String data []={
                   rs.getString(1),
                   rs.getString(2),
                   rs.getString(3),
                   rs.getString(4),
                   rs.getString(5),
                   rs.getString(6),
                   rs.getString(7),
                   rs.getString(8),
                   rs.getString(9),
                   };
               tbldsn.addRow(data);
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Connection Error\n"+ex);
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

        label2 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        nim = new javax.swing.JTextField();
        lk = new javax.swing.JRadioButton();
        pr = new javax.swing.JRadioButton();
        prodi = new javax.swing.JComboBox<>();
        hobi = new javax.swing.JComboBox<>();
        agama = new javax.swing.JComboBox<>();
        alamat = new javax.swing.JTextField();
        hp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jurusan = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        berdasarkan = new javax.swing.JComboBox<>();
        cari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        label2.setText("DATA MAHASISWA");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("NAMA");

        jLabel2.setText("NIM");

        jLabel3.setText("JENIS KELAMIN");

        jLabel5.setText("PRODI");

        jLabel6.setText("ALAMAT");

        jLabel7.setText("HOBI");

        jLabel8.setText("AGAMA");

        jLabel9.setText("NO HP");

        lk.setBackground(new java.awt.Color(204, 255, 255));
        lk.setText("Laki-laki");

        pr.setBackground(new java.awt.Color(204, 255, 255));
        pr.setText("Perempuan");

        prodi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">Pilih<", "Teknik Informatika", "Teknik Pengolahan Sawit", "Perawatan dan Perbaikan Mesin", "Administrasi Bisnis Internasional" }));

        hobi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">Pilih<", "Olahraga", "Membaca", "Memasak", "Menulis", "Menyanyi", "Fotografi", "Menggambar", "Memancing", "Gaming", "Traveling", " " }));

        agama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">Pilih<", "ISLAM", "KRISTEN", "KATOLIK", "HINDU", "BUDHA", "KONGHUCU" }));

        jLabel4.setText("JURUSAN");

        jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">Pilih<", "Informatics Engineering", "Palm Oil Engineering", "Maintenance Engineering", "Internasional Business Administrations" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nama)
                            .addComponent(nim, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lk)
                                .addGap(18, 18, 18)
                                .addComponent(pr)
                                .addGap(0, 90, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hp, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alamat, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(hobi, 0, 122, Short.MAX_VALUE)
                                        .addComponent(agama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(prodi, 0, 123, Short.MAX_VALUE)
                                    .addComponent(jurusan, 0, 1, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lk)
                    .addComponent(pr))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(hobi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "CARI"));

        jLabel10.setText("Cari Berdasarkan");

        berdasarkan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIM", "NAMA", "NO HP" }));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_search_322497.png")); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(berdasarkan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(berdasarkan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_floppy_285657.png")); // NOI18N
        jMenu1.setText("Simpan");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_icon-136-document-edit_314251.png")); // NOI18N
        jMenu2.setText("Edit");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_left_3_4829864.png")); // NOI18N
        jMenu3.setText("Kembali");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_Cancel_1493282.png")); // NOI18N
        jMenu4.setText("Keluar");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_basket_1814090.png")); // NOI18N
        jMenu5.setText("Hapus");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_basics-11_296822.png")); // NOI18N
        jMenu6.setText("Tentang");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
if (JOptionPane.showConfirmDialog(null,"Keluar?","Information",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE)== JOptionPane.YES_OPTION) {
    System.exit(0);
}
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
String NIM = nim.getText();
String NAMA = nama.getText();
String HP = hp.getText();
String JURUSAN = jurusan.getItemAt(jurusan.getSelectedIndex());
String PRODI = prodi.getItemAt(prodi.getSelectedIndex());
String HOBI = hobi.getItemAt(hobi.getSelectedIndex());
String AGAMA = agama.getItemAt(agama.getSelectedIndex());
String ALAMAT = alamat.getText();
String JENIS_KELAMIN="";
if(lk.isSelected()){
    JENIS_KELAMIN="Laki-laki";
}else{
    JENIS_KELAMIN="Perempuan";
}

try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
        con.createStatement().executeUpdate("INSERT INTO mahasiswa VALUES"+"('"+NAMA+"','"+NIM+"','"+JENIS_KELAMIN+"','"+JURUSAN+"','"+PRODI+"','"+ALAMAT+"','"+HOBI+"','"+AGAMA+"','"+HP+"')");
        tampildata();
        bersih();
        JOptionPane.showMessageDialog(null,"Data Berhasil di Tambahkan...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error "+ex);
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    String NIM = nim.getText();
    String NAMA = nama.getText();
    String HP = hp.getText();
    String JURUSAN = jurusan.getItemAt(jurusan.getSelectedIndex());
    String PRODI = prodi.getItemAt(prodi.getSelectedIndex());
    String HOBI = hobi.getItemAt(hobi.getSelectedIndex());
    String AGAMA = agama.getItemAt(agama.getSelectedIndex());
    String ALAMAT = alamat.getText();
    String JENIS_KELAMIN="";
    if(lk.isSelected()){
        JENIS_KELAMIN="Laki-laki";
    }else{
        JENIS_KELAMIN="Perempuan";
    }
        
    try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
        con.createStatement().executeUpdate("update mahasiswa set NAMA='"+NAMA+"',JENIS_KELAMIN='"+JENIS_KELAMIN+"',JURUSAN='"+JURUSAN+"',PRODI='"+PRODI+"',ALAMAT='"+ALAMAT+"',HOBI='"+HOBI+"',AGAMA='"+AGAMA+"',HP='"+HP+"' where NIM='"+NIM+"'");
        tampildata();
        bersih();
        JOptionPane.showMessageDialog(null,"Data Berhasil di Update");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: ");
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
new menuutama().show();
this.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
int i=tabel.getSelectedRow();
if(i>-1){
    nama.setText(tbldsn.getValueAt(i,0).toString());
    nim.setText(tbldsn.getValueAt(i,1).toString());
    jurusan.setSelectedItem(tbldsn.getValueAt(i, 3));
    prodi.setSelectedItem(tbldsn.getValueAt(i,4).toString());
    alamat.setText(tbldsn.getValueAt(i,5).toString());
    hobi.setSelectedItem(tbldsn.getValueAt(i,6).toString());
    agama.setSelectedItem(tbldsn.getValueAt(i,7).toString());
    hp.setText(tbldsn.getValueAt(i,8).toString());

}
    }//GEN-LAST:event_tabelMouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
    try {
        if (JOptionPane.showConfirmDialog(null,"Hapus Data?","Information",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE)== JOptionPane.YES_OPTION)
        {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
        con.createStatement().executeUpdate("delete from mahasiswa where NIM='"+nim.getText()+"'");
        tampildata();
        JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus...");
        bersih();
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Menghapus Data Gagal!!!");
    }
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    if(berdasarkan.getSelectedItem()=="NAMA"){
        int row = tabel.getRowCount();
        for(int a=0;a<row;a++){
            tbldsn.removeRow(0);
        }
        try {
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
           ResultSet rs = con.createStatement().executeQuery("SELECT * FROM mahasiswa where NAMA='"+cari.getText()+"'");
           while(rs.next()){
               String data []={
                   rs.getString(1),
                   rs.getString(2),
                   rs.getString(3),
                   rs.getString(4),
                   rs.getString(5),
                   rs.getString(6),
                   rs.getString(7),
                   rs.getString(8),
                   rs.getString(9),
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
           ResultSet rs = con.createStatement().executeQuery("SELECT * FROM mahasiswa where NIM='"+cari.getText()+"'");
           while(rs.next()){
               String data []={
                   rs.getString(1),
                   rs.getString(2),
                   rs.getString(3),
                   rs.getString(4),
                   rs.getString(5),
                   rs.getString(6),
                   rs.getString(7),
                   rs.getString(8),
                   rs.getString(9),
                   };
               tbldsn.addRow(data);
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Connection Error\n"+ex);
        }
      }else{
              int row = tabel.getRowCount();
        for(int a=0;a<row;a++){
            tbldsn.removeRow(0);
        }
        try {
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
           ResultSet rs = con.createStatement().executeQuery("SELECT * FROM mahasiswa where HP='"+cari.getText()+"'");
           while(rs.next()){
               String data []={
                   rs.getString(1),
                   rs.getString(2),
                   rs.getString(3),
                   rs.getString(4),
                   rs.getString(5),
                   rs.getString(6),
                   rs.getString(7),
                   rs.getString(8),
                   rs.getString(9),
                   };
               tbldsn.addRow(data);
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Connection Error\n"+ex);
        }
      }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agama;
    private javax.swing.JTextField alamat;
    private javax.swing.JComboBox<String> berdasarkan;
    private javax.swing.JTextField cari;
    private javax.swing.JComboBox<String> hobi;
    private javax.swing.JTextField hp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jurusan;
    private java.awt.Label label2;
    private javax.swing.JRadioButton lk;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private javax.swing.JRadioButton pr;
    private javax.swing.JComboBox<String> prodi;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
