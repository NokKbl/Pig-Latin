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
public class QA_Hard extends javax.swing.JFrame {

    /**
     * Creates new form Hard_No1
     */
    public QA_Hard() {
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

        qHard = new javax.swing.JLabel();
        hardAns = new javax.swing.JTextField();
        nxtBtn = new javax.swing.JButton();
        hrdBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hard Mode");
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 522));
        setResizable(false);
        getContentPane().setLayout(null);

        qHard.setFont(new java.awt.Font("Marker Felt", 0, 36)); // NOI18N
        qHard.setForeground(new java.awt.Color(51, 0, 0));
        qHard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qHard.setText("Phrase / Sentence");
        getContentPane().add(qHard);
        qHard.setBounds(60, 70, 480, 80);

        hardAns.setFont(new java.awt.Font("Marker Felt", 0, 24)); // NOI18N
        hardAns.setForeground(new java.awt.Color(51, 0, 0));
        hardAns.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hardAns.setText("Type your answer here");
        hardAns.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(hardAns);
        hardAns.setBounds(40, 306, 520, 80);

        nxtBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/Next.png"))); // NOI18N
        nxtBtn.setBorderPainted(false);
        nxtBtn.setContentAreaFilled(false);
        nxtBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(nxtBtn);
        nxtBtn.setBounds(480, 420, 100, 60);

        hrdBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/Hard.png"))); // NOI18N
        getContentPane().add(hrdBG);
        hrdBG.setBounds(0, 0, 600, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(QA_Hard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QA_Hard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QA_Hard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QA_Hard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QA_Hard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hardAns;
    private javax.swing.JLabel hrdBG;
    private javax.swing.JButton nxtBtn;
    private javax.swing.JLabel qHard;
    // End of variables declaration//GEN-END:variables
}