package autofile;
import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class membercount extends javax.swing.JFrame {
    public membercount() {
        setUndecorated(true); 
        setContentPane(new GradientPanel());
        initComponents();  
        jRadioButton1.setActionCommand("1");
        jRadioButton3.setActionCommand("2");
        jRadioButton4.setActionCommand("3");
        jRadioButton5.setActionCommand("4");
        jRadioButton6.setActionCommand("5");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usercount = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSignUp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setText("CompLab++");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 250, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Number of student using this computer:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 340, 40));

        jSignUp.setForeground(new java.awt.Color(0, 0, 255));
        jSignUp.setText("Sign Up");
        jSignUp.setBorderPainted(false);
        jSignUp.setContentAreaFilled(false);
        jSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSignUp.setFocusPainted(false);
        jSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(jSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, -1, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, -1, -1));

        usercount.add(jRadioButton1);
        jRadioButton1.setText("1");
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, -1, 20));

        usercount.add(jRadioButton3);
        jRadioButton3.setText("2");
        jRadioButton3.setContentAreaFilled(false);
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, -1, -1));

        usercount.add(jRadioButton4);
        jRadioButton4.setText("3");
        jRadioButton4.setContentAreaFilled(false);
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, -1, -1));

        usercount.add(jRadioButton5);
        jRadioButton5.setText("4");
        jRadioButton5.setContentAreaFilled(false);
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, -1, -1));

        usercount.add(jRadioButton6);
        jRadioButton6.setText("5");
        jRadioButton6.setContentAreaFilled(false);
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        setSize(new java.awt.Dimension(1397, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignUpActionPerformed
        register regForm = new register(); 
        regForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jSignUpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ButtonModel sel = usercount.getSelection(); 
        if (sel == null) {
            JOptionPane.showMessageDialog(this, "Please pick a number first.");
            return;
        }
        String choice = sel.getActionCommand();
        switch(choice){
            case "1":
                login login = new login();
                login.setVisible(true);
                this.dispose();
                break;
            case "2":
                login2 login2 = new login2();
                login2.setVisible(true);
                this.dispose();
                break;
            case "3":
                login3 login3 = new login3();
                login3.setVisible(true);
                this.dispose();
                break;
            case "4":
                login4 login4 = new login4();
                login4.setVisible(true);
                this.dispose();
                break;
            case "5":
                login5 login5 = new login5();
                login5.setVisible(true);
                this.dispose();
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new membercount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JButton jSignUp;
    private javax.swing.ButtonGroup usercount;
    // End of variables declaration//GEN-END:variables
}
