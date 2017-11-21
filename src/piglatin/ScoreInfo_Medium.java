package piglatin;

/**
 *
 * @author Kunyaruk Katebunlu
 */
public class ScoreInfo_Medium extends javax.swing.JFrame {

    /**
     * Creates new form ScoreInfo_Medium
     */
    public ScoreInfo_Medium() {
        initComponents();
        playerName.setText(PlayerName.pName);
        String scr = Integer.toString(QA_Medium.score);
        totalScore.setText(scr);
        String c = Integer.toString(QA_Medium.correct);
        correctNo.setText(c);
        String w = Integer.toString(QA_Medium.wrong);
        wrongNo.setText(w);
        if(QA_Medium.score == 500){
            text.setText("B r i l l i a n t !");
        }else if (QA_Medium.score == 450 || QA_Medium.score == 400){
            text.setText("F a n t a s t i c !");
        }else if (QA_Medium.score == 350 || QA_Medium.score == 300){
            text.setText("F a b u l o u s !");
        }else if (QA_Medium.score == 250 || QA_Medium.score == 200){
            text.setText("A w e s o m e !");
        }else {
            text.setText("P r a c t i c e !");
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

        restartBtn = new javax.swing.JButton();
        mainBtn = new javax.swing.JButton();
        newGBtn = new javax.swing.JButton();
        totalScore = new javax.swing.JLabel();
        correctNo = new javax.swing.JLabel();
        wrongNo = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        playerName = new javax.swing.JLabel();
        medBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 522));
        getContentPane().setLayout(null);

        restartBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/Restart.png"))); // NOI18N
        restartBtn.setBorderPainted(false);
        restartBtn.setContentAreaFilled(false);
        restartBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartBtnActionPerformed(evt);
            }
        });
        getContentPane().add(restartBtn);
        restartBtn.setBounds(40, 420, 150, 70);

        mainBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/MainB.png"))); // NOI18N
        mainBtn.setBorderPainted(false);
        mainBtn.setContentAreaFilled(false);
        mainBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mainBtn);
        mainBtn.setBounds(230, 420, 151, 70);

        newGBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/NewGame.png"))); // NOI18N
        newGBtn.setBorderPainted(false);
        newGBtn.setContentAreaFilled(false);
        newGBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newGBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGBtnnewBtnActionPerformed(evt);
            }
        });
        getContentPane().add(newGBtn);
        newGBtn.setBounds(410, 420, 151, 70);

        totalScore.setFont(new java.awt.Font("Marker Felt", 0, 70)); // NOI18N
        totalScore.setForeground(new java.awt.Color(102, 51, 0));
        totalScore.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalScore.setText("500");
        totalScore.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(totalScore);
        totalScore.setBounds(260, 230, 140, 70);

        correctNo.setFont(new java.awt.Font("Marker Felt", 0, 45)); // NOI18N
        correctNo.setForeground(new java.awt.Color(0, 102, 0));
        correctNo.setText("10");
        getContentPane().add(correctNo);
        correctNo.setBounds(190, 140, 70, 50);

        wrongNo.setFont(new java.awt.Font("Marker Felt", 0, 45)); // NOI18N
        wrongNo.setForeground(new java.awt.Color(153, 0, 0));
        wrongNo.setText("10");
        getContentPane().add(wrongNo);
        wrongNo.setBounds(190, 220, 70, 50);

        text.setFont(new java.awt.Font("Marker Felt", 0, 48)); // NOI18N
        text.setForeground(new java.awt.Color(204, 51, 0));
        text.setText("B r i l l i a n t !");
        getContentPane().add(text);
        text.setBounds(200, 310, 330, 80);

        playerName.setFont(new java.awt.Font("Marker Felt", 0, 36)); // NOI18N
        playerName.setForeground(new java.awt.Color(102, 51, 0));
        playerName.setText("Name");
        getContentPane().add(playerName);
        playerName.setBounds(290, 160, 220, 40);

        medBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/sctm.png"))); // NOI18N
        getContentPane().add(medBG);
        medBG.setBounds(0, 0, 600, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void restartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartBtnActionPerformed
        QA_Medium.score = 0;
        QA_Medium.correct = 0;
        QA_Medium.wrong = 0;
        new QA_Medium().setVisible(true);
        dispose();
    }//GEN-LAST:event_restartBtnActionPerformed

    private void mainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBtnActionPerformed
        QA_Medium.score = 0;
        QA_Medium.correct = 0;
        QA_Medium.wrong = 0;
        new MainGame().setVisible(true);
        dispose();
    }//GEN-LAST:event_mainBtnActionPerformed

    private void newGBtnnewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGBtnnewBtnActionPerformed
        QA_Medium.score = 0;
        QA_Medium.correct = 0;
        QA_Medium.wrong = 0;
        new PlayerName().setVisible(true);
        dispose();
    }//GEN-LAST:event_newGBtnnewBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ScoreInfo_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreInfo_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreInfo_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreInfo_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreInfo_Medium().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel correctNo;
    private javax.swing.JButton mainBtn;
    private javax.swing.JLabel medBG;
    private javax.swing.JButton newGBtn;
    private javax.swing.JLabel playerName;
    private javax.swing.JButton restartBtn;
    private javax.swing.JLabel text;
    private javax.swing.JLabel totalScore;
    private javax.swing.JLabel wrongNo;
    // End of variables declaration//GEN-END:variables
}
