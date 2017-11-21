package piglatin;

/**
 *
 * @author nxxkxxk
 */
public class PlayerName extends javax.swing.JFrame {
    static String pName;
    static String playerN;
    /**
     * Creates new form PlayerName
     */
    public PlayerName() {
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

        playerName = new javax.swing.JTextField();
        nxtBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        nmBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enter Name");
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 522));
        setResizable(false);
        getContentPane().setLayout(null);

        playerName.setFont(new java.awt.Font("Marker Felt", 0, 36)); // NOI18N
        playerName.setForeground(new java.awt.Color(51, 0, 0));
        playerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        playerName.setAutoscrolls(false);
        playerName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(playerName);
        playerName.setBounds(140, 270, 320, 70);

        nxtBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/Next.png"))); // NOI18N
        nxtBtn.setBorderPainted(false);
        nxtBtn.setContentAreaFilled(false);
        nxtBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nxtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nxtBtn);
        nxtBtn.setBounds(480, 430, 106, 60);

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/Back.png"))); // NOI18N
        backBtn.setBorderPainted(false);
        backBtn.setContentAreaFilled(false);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnAcitonPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(20, 420, 100, 70);

        nmBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/Name.png"))); // NOI18N
        getContentPane().add(nmBG);
        nmBG.setBounds(0, 0, 600, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnAcitonPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnAcitonPerformed
        this.setVisible(false);
        new MainGame().setVisible(true);
    }//GEN-LAST:event_backBtnAcitonPerformed

    private void nxtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtBtnActionPerformed
        pName = playerName.getText();
        playerN = playerName.getText();
        this.setVisible(false);
        new Level().setVisible(true);
    }//GEN-LAST:event_nxtBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PlayerName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerName().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel nmBG;
    private javax.swing.JButton nxtBtn;
    private javax.swing.JTextField playerName;
    // End of variables declaration//GEN-END:variables
}
