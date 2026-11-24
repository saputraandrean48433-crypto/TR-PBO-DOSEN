package Carwash.view;
public class beranda extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(beranda.class.getName());

    public beranda() {
    initComponents();
    setLocationRelativeTo(null);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        lblJudul = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblSelamat = new javax.swing.JLabel();
        lblSub = new javax.swing.JLabel();
        btnTransaksi = new javax.swing.JButton();
        btnLayanan = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnRiwayat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblJudul.setForeground(new java.awt.Color(0, 0, 0));
        lblJudul.setText("Sistem Car Wash");

        btnKeluar.setBackground(new java.awt.Color(255, 255, 255));
        btnKeluar.setForeground(new java.awt.Color(153, 153, 153));
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(this::btnKeluarActionPerformed);

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        lblSelamat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSelamat.setForeground(new java.awt.Color(0, 0, 0));
        lblSelamat.setText("Selamat Datang");

        lblSub.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSub.setForeground(new java.awt.Color(51, 51, 51));
        lblSub.setText("Pilih menu untuk melanjutkan ");

        btnTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        btnTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTransaksi.setForeground(new java.awt.Color(0, 0, 0));
        btnTransaksi.setText("Transaksi");
        btnTransaksi.addActionListener(this::btnTransaksiActionPerformed);

        btnLayanan.setBackground(new java.awt.Color(255, 255, 255));
        btnLayanan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLayanan.setForeground(new java.awt.Color(0, 0, 0));
        btnLayanan.setText("Layanan");
        btnLayanan.addActionListener(this::btnLayananActionPerformed);

        btnCustomer.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCustomer.setForeground(new java.awt.Color(0, 0, 0));
        btnCustomer.setText("Customer");
        btnCustomer.addActionListener(this::btnCustomerActionPerformed);

        btnRiwayat.setBackground(new java.awt.Color(255, 255, 255));
        btnRiwayat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRiwayat.setForeground(new java.awt.Color(0, 0, 0));
        btnRiwayat.setText("Riwayat");
        btnRiwayat.addActionListener(this::btnRiwayatActionPerformed);

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKeluar)
                .addGap(16, 16, 16))
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRiwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSub, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSelamat, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJudul)
                    .addComponent(btnKeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(lblSelamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSub)
                .addGap(35, 35, 35)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRiwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(238, 238, 238))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        new customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiActionPerformed
        new transaksi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTransaksiActionPerformed

    private void btnLayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLayananActionPerformed
        bukaHalaman("Layanan", new layanan());
    }//GEN-LAST:event_btnLayananActionPerformed

    private void btnRiwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiwayatActionPerformed
        new riwayat().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRiwayatActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed
        private void bukaHalaman(String judul, javax.swing.JPanel panel) {
        javax.swing.JFrame f = new javax.swing.JFrame(judul);
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        f.add(panel);
        f.setSize(900, 600);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        this.dispose();
    }
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new beranda().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnLayanan;
    private javax.swing.JButton btnRiwayat;
    private javax.swing.JButton btnTransaksi;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblSelamat;
    private javax.swing.JLabel lblSub;
    private javax.swing.JPanel panelHeader;
    // End of variables declaration//GEN-END:variables
}
