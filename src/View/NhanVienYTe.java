/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NhanVienYTe extends javax.swing.JFrame {

    /**
     * Creates new form NhanVienYTe
     */
    public NhanVienYTe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnDangNhap = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnBenhNhan = new javax.swing.JButton();
        btnDatLich = new javax.swing.JButton();
        btnCapNhatKQ = new javax.swing.JButton();
        btnNhacLich = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nhân Viên Y Tế");

        jToolBar1.setRollover(true);

        btnDangNhap.setText("Đăng xuất");
        btnDangNhap.setFocusable(false);
        btnDangNhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangNhap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangNhap);

        btnThoat.setText("Thoát");
        btnThoat.setFocusable(false);
        btnThoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThoat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnThoat);

        btnBenhNhan.setText("Bệnh nhân");
        btnBenhNhan.setFocusable(false);
        btnBenhNhan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBenhNhan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBenhNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBenhNhanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBenhNhan);

        btnDatLich.setText("Đặt lịch");
        btnDatLich.setFocusable(false);
        btnDatLich.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDatLich.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDatLich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatLichActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDatLich);

        btnCapNhatKQ.setText("Cập nhật kết quả");
        btnCapNhatKQ.setFocusable(false);
        btnCapNhatKQ.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCapNhatKQ.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCapNhatKQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatKQActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCapNhatKQ);

        btnNhacLich.setText("Nhắc lịch");
        btnNhacLich.setFocusable(false);
        btnNhacLich.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhacLich.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNhacLich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhacLichActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNhacLich);

        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.setFocusable(false);
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHuongDan);

        jMenu1.setText("Hệ thống");

        jMenuItem1.setText("Đăng xuất ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Đổi mật khẩu");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Thoát");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        jMenuItem4.setText("Quản lý thông tin bệnh viện");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Đặt lịch khám");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Cập nhật kết quả khám");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Nhắc lịch hẹn khám");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Trợ giúp");

        jMenu11.setText("Hướng dẫn sử dụng");
        jMenu6.add(jMenu11);

        jMenu12.setText("Giới thiệu");
        jMenu6.add(jMenu12);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 402, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất?","Thông báo",JOptionPane.YES_NO_CANCEL_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            DangNhap dn = new DangNhap();
            dn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnBenhNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBenhNhanActionPerformed
        // TODO add your handling code here:
        QuanLyThongTinBenhNhan qlttbn = new QuanLyThongTinBenhNhan();
        qlttbn.setVisible(true);
    }//GEN-LAST:event_btnBenhNhanActionPerformed

    private void btnDatLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatLichActionPerformed
        // TODO add your handling code here:
        DatLichKham dlk = new DatLichKham();
        dlk.setVisible(true);
    }//GEN-LAST:event_btnDatLichActionPerformed

    private void btnCapNhatKQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatKQActionPerformed
        // TODO add your handling code here:
        CapNhatketQuaKham cnkqk = new CapNhatketQuaKham();
        cnkqk.setVisible(true);
    }//GEN-LAST:event_btnCapNhatKQActionPerformed

    private void btnNhacLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhacLichActionPerformed
        // TODO add your handling code here:
        NhacLichHenKham nlhk = new NhacLichHenKham();
        nlhk.setVisible(true);
    }//GEN-LAST:event_btnNhacLichActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất?","Thông báo",JOptionPane.YES_NO_CANCEL_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            DangNhap dn = new DangNhap();
            dn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        DoiMatKhau dmk = new DoiMatKhau();
        dmk.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Ban co muon thoat ?", "Thoat", JOptionPane.YES_NO_CANCEL_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        QuanLyThongTinBenhNhan qlttbn = new QuanLyThongTinBenhNhan();
        qlttbn.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        DatLichKham dlk = new DatLichKham();
        dlk.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        CapNhatketQuaKham cnkqk = new CapNhatketQuaKham();
        cnkqk.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        NhacLichHenKham nlhk = new NhacLichHenKham();
        nlhk.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(NhanVienYTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienYTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienYTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienYTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienYTe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBenhNhan;
    private javax.swing.JButton btnCapNhatKQ;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnDatLich;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnNhacLich;
    private javax.swing.JButton btnThoat;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
