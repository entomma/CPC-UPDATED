package autofile;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;

public class login2 extends javax.swing.JFrame {
    public login2() {
        setUndecorated(true); 
        setContentPane(new GradientPanel());
        initComponents();  
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtpass2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtusername2 = new javax.swing.JTextField();
        jSignUp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jtxtpass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtusername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSignUp1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtpass2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtpass2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtpass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpass2ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 168, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 160, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 90, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Username:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 90, 40));

        jtxtusername2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtusername2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtusername2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtusername2ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtusername2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 168, 30));

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
        getContentPane().add(jSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, -1));

        jtxtpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtpass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpassActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 168, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CompLab++");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 160, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Password:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 90, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Username:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 90, 40));

        jtxtusername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtusername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 168, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Student 2");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 160, 40));

        jSignUp1.setText("Back");
        jSignUp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSignUp1.setFocusPainted(false);
        jSignUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignUp1ActionPerformed(evt);
            }
        });
        getContentPane().add(jSignUp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        setSize(new java.awt.Dimension(1153, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtpass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpass2ActionPerformed
        
    }//GEN-LAST:event_jtxtpass2ActionPerformed

    private void jtxtusername2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtusername2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtusername2ActionPerformed

    private void jSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignUpActionPerformed
        register regForm = new register(); 
    
    // 2) Show it
        regForm.setVisible(true);
    
    // 3) (Optional) Close the login form so the user can't go back
        this.dispose();
    }//GEN-LAST:event_jSignUpActionPerformed

    private void jtxtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtpassActionPerformed

    private void jtxtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtusernameActionPerformed

    private void jSignUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignUp1ActionPerformed
        membercount memform = new membercount();
        memform.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jSignUp1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username1 = jtxtusername.getText().trim();
        String password1 = jtxtpass.getText().trim();
        String username2 = jtxtusername2.getText().trim();
        String password2 = jtxtpass2.getText().trim();

        if (username1.isEmpty() || password1.isEmpty() || username2.isEmpty() || password2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields for both users.");
            return;
        }

        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/complab", "postgres", "postgres");

            String sql = "SELECT student_id FROM public.student WHERE username = ? AND password = ?";
            PreparedStatement pst1 = con.prepareStatement(sql);
            pst1.setString(1, username1);
            pst1.setString(2, password1);
            ResultSet rs1 = pst1.executeQuery();

            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, username2);
            pst2.setString(2, password2);
            ResultSet rs2 = pst2.executeQuery();

            if (rs1.next() && rs2.next()) {
                String studentId1 = rs1.getString("student_id");
                String studentId2 = rs2.getString("student_id");

                if (studentId1.equals(studentId2)) {
                    JOptionPane.showMessageDialog(null, "Both users cannot be the same student.");
                } else {
                    JOptionPane.showMessageDialog(null, "Both users logged in successfully!");
                    this.dispose(); // close login window
                    ArrayList<String> studentIds = new ArrayList<>();
                    studentIds.add(studentId1);
                    studentIds.add(studentId2);
                    String loginTime = java.time.LocalDateTime.now().format(
                        java.time.format.DateTimeFormatter.ofPattern("MMMM dd, yyyy - hh:mm a")
                    );
                    mainwindow main = new mainwindow(studentIds, loginTime);
                    main.setVisible(true); // open next form
                    main.setLocationRelativeTo(null);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid login for one or both users.");
            }

            rs1.close();
            rs2.close();
            pst1.close();
            pst2.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jSignUp;
    private javax.swing.JButton jSignUp1;
    private javax.swing.JTextField jtxtpass;
    private javax.swing.JTextField jtxtpass2;
    private javax.swing.JTextField jtxtusername;
    private javax.swing.JTextField jtxtusername2;
    // End of variables declaration//GEN-END:variables
}
