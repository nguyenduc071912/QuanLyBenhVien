/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

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
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jMenu3.setText("Đăng nhập");
        jMenu1.add(jMenu3);

        jMenu4.setText("Đổi mật khẩu");
        jMenu1.add(jMenu4);

        jMenu5.setText("Thoát");
        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        jMenu7.setText("Quản lý thông tin bệnh viện");
        jMenu2.add(jMenu7);

        jMenu8.setText("Đặt lịch khám");
        jMenu2.add(jMenu8);

        jMenu9.setText("Cập nhật kết quả khám");
        jMenu2.add(jMenu9);

        jMenu10.setText("Nhắc lịch hẹn khám");
        jMenu2.add(jMenu10);

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
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnBenhNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBenhNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBenhNhanActionPerformed

    private void btnDatLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatLichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDatLichActionPerformed

    private void btnCapNhatKQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatKQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapNhatKQActionPerformed

    private void btnNhacLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhacLichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhacLichActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHuongDanActionPerformed

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
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
