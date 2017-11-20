package piglatin;

/**
 * 
 * 
 * @author Kunyaruk Katebunlu
 */
public class MainGame extends javax.swing.JFrame {

    /**
     * Creates new form MainGame
     */
    public MainGame() {
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

        helpBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        startBtn = new javax.swing.JButton();
        mainBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Igpay Altinlay [Pig Latin]");
        setBounds(new java.awt.Rectangle(0, 0, 600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 522));
        setResizable(false);
        getContentPane().setLayout(null);

        helpBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/HelpB.png"))); // NOI18N
        helpBtn.setBorderPainted(false);
        helpBtn.setContentAreaFilled(false);
        helpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBtnActionPerformed(evt);
            }
        });
        getContentPane().add(helpBtn);
        helpBtn.setBounds(80, 270, 150, 80);

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/ExB.png"))); // NOI18N
        exitBtn.setBorderPainted(false);
        exitBtn.setContentAreaFilled(false);
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn);
        exitBtn.setBounds(230, 340, 142, 78);

        aboutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/AboutB.png"))); // NOI18N
        aboutBtn.setBorderPainted(false);
        aboutBtn.setContentAreaFilled(false);
        aboutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(aboutBtn);
        aboutBtn.setBounds(370, 280, 160, 70);

        startBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/StartB.png"))); // NOI18N
        startBtn.setBorderPainted(false);
        startBtn.setContentAreaFilled(false);
        startBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });
        getContentPane().add(startBtn);
        startBtn.setBounds(210, 180, 190, 100);

        mainBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/MainBG.png"))); // NOI18N
        getContentPane().add(mainBG);
        mainBG.setBounds(0, 0, 600, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        new PlayerName().setVisible(true);
        dispose();
    }//GEN-LAST:event_startBtnActionPerformed

    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        new GameAbout().setVisible(true);
        dispose();
    }//GEN-LAST:event_aboutBtnActionPerformed

    private void helpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBtnActionPerformed
        new GameHelp().setVisible(true);
        dispose();
    }//GEN-LAST:event_helpBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton helpBtn;
    private javax.swing.JLabel mainBG;
    private javax.swing.JButton startBtn;
    // End of variables declaration//GEN-END:variables
}
