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


public class dosen extends javax.swing.JFrame {
DefaultTableModel tbldsn;

    public dosen() {
        initComponents();
        String [] judul = {"NAMA","NIP","JENIS_KELAMIN","TANGGAL_LAHIR","AGAMA","ALAMAT","PENGAJAR"};
        tbldsn = new DefaultTableModel(judul,0);
        tabel.setModel(tbldsn);
        tampildata();
        bersih();
    }
     
    private void bersih (){
     nama.setText("");
     nip.setText("");
     lk.setSelected(false);
     pr.setSelected(false);
     tgl.setSelectedItem("Pilih");
     bln.setSelectedItem("Pilih");
     thn.setSelectedItem("Pilih");
     agama.setSelectedItem("Pilih");
     alamat.setText("");
     pengajar.setSelectedItem("Pilih");
    }
    
    public final void tampildata (){
        int row = tabel.getRowCount();
        for(int a=0;a<row;a++){
            tbldsn.removeRow(0);
        }
        try {
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
           ResultSet rs = con.createStatement().executeQuery("SELECT * FROM dosen");
           while(rs.next()){
               String data []={
                   rs.getString(1),
                   rs.getString(2),
                   rs.getString(3),
                   rs.getString(4),
                   rs.getString(5),
                   rs.getString(6),
                   rs.getString(7),
                   };
               tbldsn.addRow(data);
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Connection Error\n"+ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pengajar = new javax.swing.JComboBox<>();
        agama = new javax.swing.JComboBox<>();
        tgl = new javax.swing.JComboBox<>();
        bln = new javax.swing.JComboBox<>();
        thn = new javax.swing.JComboBox<>();
        lk = new javax.swing.JRadioButton();
        pr = new javax.swing.JRadioButton();
        nama = new javax.swing.JTextField();
        nip = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DATA DOSEN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setText("NAMA");

        jLabel3.setText("NIP");

        jLabel4.setText("JENIS KELAMIN");

        jLabel5.setText("TANGGAL LAHIR");

        jLabel6.setText("AGAMA");

        jLabel7.setText("ALAMAT");

        jLabel8.setText("PENGAJAR");

        pengajar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Teknik Informatika", "Teknik Pengolahan Sawit", "Perawatan dan Perbaikan Mesin", "Administrasi Bisnis Internasional" }));

        agama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "ISLAM", "KRISTEN", "KATOLIK", "HINDU", "BUDHA", "KONGHUCU" }));

        tgl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        bln.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        thn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        lk.setBackground(new java.awt.Color(255, 255, 204));
        lk.setText("Laki-laki");

        pr.setBackground(new java.awt.Color(255, 255, 204));
        pr.setText("Perempuan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(thn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lk)
                                        .addGap(18, 18, 18)
                                        .addComponent(pr)))
                                .addGap(0, 56, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(alamat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(pengajar, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nip, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lk)
                    .addComponent(pr))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pengajar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_floppy_285657.png")); // NOI18N
        jMenu1.setText("SIMPAN");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_icon-136-document-edit_314251.png")); // NOI18N
        jMenu2.setText("EDIT");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_basket_1814090.png")); // NOI18N
        jMenu3.setText("HAPUS");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_layout_3855599.png")); // NOI18N
        jMenu4.setText("MENU UTAMA");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_Cancel_1493282.png")); // NOI18N
        jMenu5.setText("KELUAR");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon("C:\\Users\\RIBUT WIBOWO RAHAYU\\Downloads\\iconfinder_basics-11_296822.png")); // NOI18N
        jMenu6.setText("TENTANG");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
String NIP = nip.getText();
String NAMA = nama.getText();
String TANGGAL_LAHIR = tgl.getItemAt(tgl.getSelectedIndex())+
        bln.getItemAt(bln.getSelectedIndex())+
        thn.getItemAt(thn.getSelectedIndex());
String PENGAJAR = pengajar.getItemAt(pengajar.getSelectedIndex());
String AGAMA = agama.getItemAt(agama.getSelectedIndex());
String ALAMAT = alamat.getText();
String JENIS_KELAMIN="";
if(lk.isSelected()){
    JENIS_KELAMIN="Laki laki";
}else{
    JENIS_KELAMIN="Perempuan";
}

try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
        con.createStatement().executeUpdate("update dosen set NAMA='"+NAMA+"',JENIS_KELAMIN='"+JENIS_KELAMIN+"',TANGGAL_LAHIR='"+TANGGAL_LAHIR+"',AGAMA='"+AGAMA+"',ALAMAT='"+ALAMAT+"',PENGAJAR='"+PENGAJAR+"' where NIP='"+NIP+"'");
        tampildata();
        bersih();
        JOptionPane.showMessageDialog(null,"Data Berhasil di Update");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: ");
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
new menuutama().show();
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
String NIP = nip.getText();
String NAMA = nama.getText();
String TANGGAL_LAHIR = tgl.getItemAt(tgl.getSelectedIndex())+
        bln.getItemAt(bln.getSelectedIndex())+
        thn.getItemAt(thn.getSelectedIndex());
String PENGAJAR = pengajar.getItemAt(pengajar.getSelectedIndex());
String AGAMA = agama.getItemAt(agama.getSelectedIndex());
String ALAMAT = alamat.getText();
String JENIS_KELAMIN="";
if(lk.isSelected()){
    JENIS_KELAMIN="Laki laki";
}else{
    JENIS_KELAMIN="Perempuan";
}

try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
        con.createStatement().executeUpdate("INSERT INTO dosen VALUES"+"('"+NAMA+"','"+NIP+"','"+JENIS_KELAMIN+"','"+TANGGAL_LAHIR+"','"+AGAMA+"','"+ALAMAT+"','"+PENGAJAR+"')");
        tampildata();
        bersih();
        JOptionPane.showMessageDialog(null,"Data Berhasil di Tambahkan...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error "+ex);
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
    try {
        if (JOptionPane.showConfirmDialog(null,"Hapus Data?","Information",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE)== JOptionPane.YES_OPTION)
        {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/polkam","root","");
        con.createStatement().executeUpdate("delete from dosen where NIP='"+nip.getText()+"'");
        tampildata();
        JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus...");
        bersih();
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Menghapus Data Gagal!!!");
    }
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
if (JOptionPane.showConfirmDialog(null,"Keluar?","Information",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE)== JOptionPane.YES_OPTION) {
System.exit(0); 
}      // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5MouseClicked

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
int i=tabel.getSelectedRow();
if(i>-1){
    nama.setText(tbldsn.getValueAt(i,0).toString());
    nip.setText(tbldsn.getValueAt(i,1).toString());
    agama.setSelectedItem(tbldsn.getValueAt(i, 4).toString());
    alamat.setText(tbldsn.getValueAt(i, 5).toString());
    pengajar.setSelectedItem(tbldsn.getValueAt(i, 6).toString());
}
    }//GEN-LAST:event_tabelMouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6MouseClicked

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
            java.util.logging.Logger.getLogger(dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agama;
    private javax.swing.JTextField alamat;
    private javax.swing.JComboBox<String> bln;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton lk;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nip;
    private javax.swing.JComboBox<String> pengajar;
    private javax.swing.JRadioButton pr;
    private javax.swing.JTable tabel;
    private javax.swing.JComboBox<String> tgl;
    private javax.swing.JComboBox<String> thn;
    // End of variables declaration//GEN-END:variables
}
