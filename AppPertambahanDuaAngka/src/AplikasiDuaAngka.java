//Nama : Alda Eva Saputri
//NIM  : 1120093000022
//Kelas : 2A Sistem Informasi
 
 //@author AldaEva
public class AplikasiDuaAngka extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiDuaAngka
     */
    public AplikasiDuaAngka() {
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

        PertamaPanel = new javax.swing.JPanel();
        AngkaPertamaLabel = new javax.swing.JLabel();
        InputPertamaText = new javax.swing.JTextField();
        KeduaPanel = new javax.swing.JPanel();
        AngkaKeduaLabel = new javax.swing.JLabel();
        InputKeduaText = new javax.swing.JTextField();
        HasillPanel = new javax.swing.JPanel();
        HasilLabel = new javax.swing.JLabel();
        InputHasilText = new javax.swing.JTextField();
        TambahButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));

        PertamaPanel.setBackground(new java.awt.Color(255, 255, 153));

        AngkaPertamaLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        AngkaPertamaLabel.setText("Angka Pertama");

        javax.swing.GroupLayout PertamaPanelLayout = new javax.swing.GroupLayout(PertamaPanel);
        PertamaPanel.setLayout(PertamaPanelLayout);
        PertamaPanelLayout.setHorizontalGroup(
            PertamaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PertamaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AngkaPertamaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(InputPertamaText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PertamaPanelLayout.setVerticalGroup(
            PertamaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PertamaPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PertamaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AngkaPertamaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputPertamaText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        KeduaPanel.setBackground(new java.awt.Color(255, 153, 153));

        AngkaKeduaLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        AngkaKeduaLabel.setText("Angka Kedua");

        javax.swing.GroupLayout KeduaPanelLayout = new javax.swing.GroupLayout(KeduaPanel);
        KeduaPanel.setLayout(KeduaPanelLayout);
        KeduaPanelLayout.setHorizontalGroup(
            KeduaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KeduaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AngkaKeduaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InputKeduaText, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        KeduaPanelLayout.setVerticalGroup(
            KeduaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KeduaPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(KeduaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputKeduaText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AngkaKeduaLabel))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        HasillPanel.setBackground(new java.awt.Color(204, 102, 255));

        HasilLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        HasilLabel.setText("Hasil");

        javax.swing.GroupLayout HasillPanelLayout = new javax.swing.GroupLayout(HasillPanel);
        HasillPanel.setLayout(HasillPanelLayout);
        HasillPanelLayout.setHorizontalGroup(
            HasillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HasillPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HasilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(InputHasilText, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HasillPanelLayout.setVerticalGroup(
            HasillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HasillPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HasillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InputHasilText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HasilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        TambahButton.setBackground(new java.awt.Color(255, 204, 204));
        TambahButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TambahButton.setText("Tambah");
        TambahButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.pink, java.awt.Color.pink));
        TambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahButtonActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(255, 204, 204));
        ClearButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        CloseButton.setBackground(new java.awt.Color(255, 204, 204));
        CloseButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        CloseButton.setText("Close");
        CloseButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 204), new java.awt.Color(255, 204, 204)));
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(KeduaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PertamaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(HasillPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PertamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(KeduaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HasillPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CloseButton)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahButtonActionPerformed
        double angkapertama = Double.parseDouble(InputPertamaText.getText());
        double angkakedua = Double.parseDouble(InputKeduaText.getText());
        double hasil = angkapertama + angkakedua;
        InputHasilText.setText(hasil + "");
    }//GEN-LAST:event_TambahButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        InputPertamaText.setText("");
        InputKeduaText.setText("");
        InputHasilText.setText("");
        InputPertamaText.requestFocus();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiDuaAngka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AngkaKeduaLabel;
    private javax.swing.JLabel AngkaPertamaLabel;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton CloseButton;
    private javax.swing.JLabel HasilLabel;
    private javax.swing.JPanel HasillPanel;
    private javax.swing.JTextField InputHasilText;
    private javax.swing.JTextField InputKeduaText;
    private javax.swing.JTextField InputPertamaText;
    private javax.swing.JPanel KeduaPanel;
    private javax.swing.JPanel PertamaPanel;
    private javax.swing.JButton TambahButton;
    // End of variables declaration//GEN-END:variables
}
