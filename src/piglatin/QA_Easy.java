package piglatin;

/**
 * Get, split and show questions and choices in easy level,
 * get input answer from players then check answer, count correct/wrong
 * problem and count score.
 * 
 * @author Kunyaruk Katebunlu
 */
public class QA_Easy extends javax.swing.JFrame {

    static int clicked = 0;
    static private String[] qEasy;
    static private String[] qE = new String[10];
    static private String[] a = new String[10];
    static private String[] b = new String[10];
    static private String[] c = new String[10];
    static private String[] d = new String[10];
    static private String[] ans = new String[10];
    static String inAns;
    static int score = 0;
    static boolean check;
    static int correct = 0;
    static int wrong = 0;

    /**
     * Creates new form Easy_QA
     */
    public QA_Easy() {
        initComponents();
        Question.setQEasy();
        qEasy = Question.getQEasy();
        qSplit(qEasy);
        setQandChoices();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        qEZ = new javax.swing.JLabel();
        choiceA = new javax.swing.JLabel();
        choiceB = new javax.swing.JLabel();
        choiceC = new javax.swing.JLabel();
        choiceD = new javax.swing.JLabel();
        ezAns = new javax.swing.JTextField();
        nxtBtn = new javax.swing.JButton();
        ezBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Easy Mode");
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 522));
        setResizable(false);
        getContentPane().setLayout(null);

        qEZ.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        qEZ.setForeground(new java.awt.Color(51, 0, 0));
        qEZ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qEZ.setText("word");
        getContentPane().add(qEZ);
        qEZ.setBounds(210, 70, 180, 50);

        choiceA.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        choiceA.setForeground(new java.awt.Color(51, 0, 0));
        choiceA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        choiceA.setText("choice1");
        choiceA.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(choiceA);
        choiceA.setBounds(170, 200, 140, 50);

        choiceB.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        choiceB.setForeground(new java.awt.Color(51, 0, 0));
        choiceB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        choiceB.setText("choice2");
        choiceB.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(choiceB);
        choiceB.setBounds(360, 200, 150, 50);

        choiceC.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        choiceC.setForeground(new java.awt.Color(51, 0, 0));
        choiceC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        choiceC.setText("choice3");
        choiceC.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(choiceC);
        choiceC.setBounds(170, 260, 140, 50);

        choiceD.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        choiceD.setForeground(new java.awt.Color(51, 0, 0));
        choiceD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        choiceD.setText("choice4");
        choiceD.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(choiceD);
        choiceD.setBounds(360, 260, 150, 50);

        ezAns.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        ezAns.setForeground(new java.awt.Color(51, 0, 0));
        ezAns.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ezAns.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(ezAns);
        ezAns.setBounds(360, 366, 100, 50);

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
        nxtBtn.setBounds(490, 430, 90, 60);

        ezBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectSource/Easy.png"))); // NOI18N
        getContentPane().add(ezBG);
        ezBG.setBounds(0, 0, 600, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Split question and choices and keep in array for each type.
     * 
     * @param qEasy is array of easy problem set.
     */
    static private void qSplit(String[] qEasy) {
        for (int i = 0; i < qEasy.length; i++) {
            String[] array = qEasy[i].trim().split("; ");
            qE[i] = array[0];
            a[i] = array[1];
            b[i] = array[2];
            c[i] = array[3];
            d[i] = array[4];
            ans[i] = array[5];
        }
    }

    /**
     * Set question and choices text to show in each jLabel.
     */
    private void setQandChoices(){
        qEZ.setText(qE[clicked]);
        choiceA.setText(a[clicked]);
        choiceB.setText(b[clicked]);
        choiceC.setText(c[clicked]);
        choiceD.setText(d[clicked]);
    }
    
    /**
     * Check answer, calculate score and count correct/wrong problems amount.
     */
    private void checkAnsEasy() {
        setQandChoices();
        inAns = ezAns.getText();
        check = CheckAndCount.checkA(ans[clicked], inAns);
        correct = CheckAndCount.countCorrect(check, correct);
        wrong = 10 - correct;
        score = CheckAndCount.scoreEasy(check, score);
    }

    /**
     * Count clicked number and check case to show question and choices in each
     * index, if no match case then open score info for easy level frame 
     * and close this frame.
     */
    private void nxtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtBtnActionPerformed
        clicked++;
        inAns = ezAns.getText();
        check = CheckAndCount.checkA(ans[clicked - 1], inAns);
        correct = CheckAndCount.countCorrect(check, correct);
        wrong = 10 - correct;
        score = CheckAndCount.scoreEasy(check, score);
        ezAns.setText("");
        switch (clicked) {
            case 1:
                checkAnsEasy();
                break;
            case 2:
                checkAnsEasy();
                break;
            case 3:
                checkAnsEasy();
                break;
            case 4:
                checkAnsEasy();
                break;
            case 5:
                checkAnsEasy();
            case 6:
                checkAnsEasy();
                break;
            case 7:
                checkAnsEasy();
                break;
            case 8:
                checkAnsEasy();
                break;
            case 9:
                checkAnsEasy();
                break;
            default:
                clicked = 0;
                new ScoreInfo_Easy().setVisible(true);
                dispose();
        }
        
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
            java.util.logging.Logger.getLogger(QA_Easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QA_Easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QA_Easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QA_Easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QA_Easy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel choiceA;
    private javax.swing.JLabel choiceB;
    private javax.swing.JLabel choiceC;
    private javax.swing.JLabel choiceD;
    private javax.swing.JTextField ezAns;
    private javax.swing.JLabel ezBG;
    private javax.swing.JButton nxtBtn;
    private javax.swing.JLabel qEZ;
    // End of variables declaration//GEN-END:variables
}
