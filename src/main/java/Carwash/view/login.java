package Carwash.view;

import Carwash.model.Petugas;
import java.util.ArrayList;

public class login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(login.class.getName());

    private ArrayList<Petugas> daftarPetugas = new ArrayList<>();

    public login() {
        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btnMasuk);

        daftarPetugas.add(new Petugas("P001", "Andi", "petugas01", "12345"));
        daftarPetugas.add(new Petugas("P002", "Andre", "petugas02", "12345"));
        daftarPetugas.add(new Petugas("P003", "Nopal", "petugas03", "12345"));
        daftarPetugas.add(new Petugas("P004", "Rizki", "petugas04", "12345"));
        daftarPetugas.add(new Petugas("P005", "Putra", "petugas05", "12345"));
        daftarPetugas.add(new Petugas("P006", "Farel", "petugas06", "12345"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlKartu = new javax.swing.JPanel();
        lblJudul = new javax.swing.JLabel();
        lblSub = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnMasuk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlKartu.setBackground(new java.awt.Color(255, 255, 255));

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblJudul.setForeground(new java.awt.Color(0, 0, 0));
        lblJudul.setText("Sistem Car Wash");

        lblSub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSub.setForeground(new java.awt.Color(102, 102, 102));
        lblSub.setText("Masuk sebagai petugas");

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(102, 102, 102));
        lblUsername.setText("Username");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(102, 102, 102));
        lblPassword.setText("Password");

        txtUsername.setBackground(new java.awt.Color(255, 255, 255));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.addActionListener(this::txtPasswordActionPerformed);

        btnMasuk.setBackground(new java.awt.Color(0, 0, 0));
        btnMasuk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMasuk.setText("Masuk");
        btnMasuk.addActionListener(this::btnMasukActionPerformed);

        javax.swing.GroupLayout pnlKartuLayout = new javax.swing.GroupLayout(pnlKartu);
        pnlKartu.setLayout(pnlKartuLayout);
        pnlKartuLayout.setHorizontalGroup(
            pnlKartuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKartuLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(pnlKartuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKartuLayout.createSequentialGroup()
                        .addComponent(lblJudul)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKartuLayout.createSequentialGroup()
                        .addComponent(lblSub, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
            .addGroup(pnlKartuLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(pnlKartuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword)
                    .addComponent(btnMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlKartuLayout.setVerticalGroup(
            pnlKartuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKartuLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSub)
                .addGap(77, 77, 77)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlKartu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlKartu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
    btnMasuk.doClick();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Username dan password harus diisi",
                    "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        Petugas petugasMasuk = null;
        for (Petugas p : daftarPetugas) {
            if (p.login(username, password)) {
                petugasMasuk = p;
                break;
            }
        }

        if (petugasMasuk != null) {
            dispose();
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Login berhasil. Selamat datang, " + petugasMasuk.getNama());
            new beranda().setVisible(true);
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Username atau password salah",
                    "Login gagal", javax.swing.JOptionPane.ERROR_MESSAGE);
            txtPassword.setText("");
            txtPassword.requestFocus();
        }
    }//GEN-LAST:event_btnMasukActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMasuk;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlKartu;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

