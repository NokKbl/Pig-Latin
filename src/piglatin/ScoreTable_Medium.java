/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;

/**
 *
 * @author nxxkxxk
 */
public class ScoreTable_Medium extends javax.swing.JFrame {

    /**
     * Creates new form ScoreTable
     */
    public ScoreTable_Medium() {
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

        nameP1 = new javax.swing.JLabel();
        nameP2 = new javax.swing.JLabel();
        nameP3 = new javax.swing.JLabel();
        nameP4 = new javax.swing.JLabel();
        nameP5 = new javax.swing.JLabel();
        scoreP1 = new javax.swing.JLabel();
        scoreP2 = new javax.swing.JLabel();
        scoreP3 = new javax.swing.JLabel();
        scoreP4 = new javax.swing.JLabel();
        scoreP5 = new javax.swing.JLabel();
        restartBtn = new javax.swing.JButton();
        mainBtn = new javax.swing.JButton();
        newGBtn = new javax.swing.JButton();
        scBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Score Table [Medium Lv.]");
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 522));
        setResizable(false);
        getContentPane().setLayout(null);

        nameP1.setFont(new java.awt.Font("Marker Felt", 0, 36)); // NOI18N
        nameP1.setForeground(new java.awt.Color(102, 51, 0));
        nameP1.setText("PlayerName1");
        getContentPane().add(nameP1);
        nameP1.setBounds(150, 170, 260, 40);

        nameP2.setFont(new java.awt.Font("Marker Felt", 0, 36)); // NOI18N
        nameP2.setForeground(new java.awt.Color(102, 51, 0));
        nameP2.setText("PlayerName2");
        getContentPane().add(nameP2);
        nameP2.setBounds(150, 210, 260, 40);

        nameP3.setFont(new java.awt.Font("Marker Felt", 0, 36)); // NOI18N
        nameP3.setForeground(new java.awt.Color(102, 51, 0));
        nameP3.setText("PlayerName3");
        getContentPane().add(nameP3);
        nameP3.setBounds(150, 260, 260, 40);

        nameP4.setFont(new java.awt.Font("Marker Felt", 0, 36)); // NOI18N
        nameP4.setForeground(new java.awt.Color(102, 51, 0));
        nameP4.setText("PlayerName4");
        getContentPane().add(nameP4);
        nameP4.setBounds(150, 300, 260, 40);

        nameP5.setFont(new java.awt.Font("Marker Felt", 0, 36)); // NOI18N
        nameP5.setForeground(new java.awt.Color(102, 51, 0));
        nameP5.setText("PlayerName5");
        getContentPane().add(nameP5);
        nameP5.setBounds(150, 350, 260, 40);

        scoreP1.setFont(new java.awt.Font("Marker Felt", 0, 30)); // NOI18N
        scoreP1.setForeground(new java.awt.Color(102, 51, 0));
        scoreP1.setText("XXXXX");
        getContentPane().add(scoreP1);
        scoreP1.setBounds(450, 170, 90, 40);

        scoreP2.setFont(new java.awt.Font("Marker Felt", 0, 30)); // NOI18N
        scoreP2.setForeground(new java.awt.Color(102, 51, 0));
        scoreP2.setText("XXXXX");
        getContentPane().add(scoreP2);
        scoreP2.setBounds(450, 210, 90, 40);

        scoreP3.setFont(new java.awt.Font("Marker Felt", 0, 30)); // NOI18N
        scoreP3.setForeground(new java.awt.Color(102, 51, 0));
        scoreP3.setText("XXXXX");
        getContentPane().add(scoreP3);
        scoreP3.setBounds(450, 260, 90, 40);

        scoreP4.setFont(new java.awt.Font("Marker Felt", 0, 30)); // NOI18N
        scoreP4.setForeground(new java.awt.Color(102, 51, 0));
        scoreP4.setText("XXXXX");
        getContentPane().add(scoreP4);
        scoreP4.setBounds(450, 300, 90, 40);

        scoreP5.setFont(new java.awt.Font("Marker Felt", 0, 30)); // NOI18N
        scoreP5.setForeground(new java.awt.Color(102, 51, 0));
        scoreP5.setText("XXXXX");
        getContentPane().add(scoreP5);
        scoreP5.setBounds(450, 350, 90, 40);

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
        restartBtn.setBounds(40, 420, 151, 70);

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
                newBtnActionPerformed(evt);
            }
        });
        getContentPane().add(newGBtn);
        newGBtn.setBounds(410, 420, 150, 70);

        scBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/Score.png"))); // NOI18N
        getContentPane().add(scBG);
        scBG.setBounds(0, 0, 600, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void restartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartBtnActionPerformed
        // TODO put code to reset the score of this player in this level to be 0
        new QA_Medium().setVisible(true);
        dispose();
    }//GEN-LAST:event_restartBtnActionPerformed

    private void mainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBtnActionPerformed
        new MainGame().setVisible(true);
        dispose();
    }//GEN-LAST:event_mainBtnActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        new PlayerName().setVisible(true);
        dispose();
    }//GEN-LAST:event_newBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ScoreTable_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreTable_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreTable_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreTable_Medium.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreTable_Medium().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton mainBtn;
    private javax.swing.JLabel nameP1;
    private javax.swing.JLabel nameP2;
    private javax.swing.JLabel nameP3;
    private javax.swing.JLabel nameP4;
    private javax.swing.JLabel nameP5;
    private javax.swing.JButton newGBtn;
    private javax.swing.JButton restartBtn;
    private javax.swing.JLabel scBG;
    private javax.swing.JLabel scoreP1;
    private javax.swing.JLabel scoreP2;
    private javax.swing.JLabel scoreP3;
    private javax.swing.JLabel scoreP4;
    private javax.swing.JLabel scoreP5;
    // End of variables declaration//GEN-END:variables
}
