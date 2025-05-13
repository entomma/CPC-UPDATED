package autofile;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
public class login4 extends javax.swing.JFrame {
    public login4() {
        setUndecorated(true); 
        setContentPane(new GradientPanel());
        initComponents();  
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtpass4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtuser4 = new javax.swing.JTextField();
        jSignUp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jtxtpass3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtuser3 = new javax.swing.JTextField();
        jtxtpass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxtuser = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtpass2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtxtuser2 = new javax.swing.JTextField();
        jSignUp1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtpass4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtpass4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtpass4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpass4ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtpass4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 168, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 90, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Username:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 90, 40));

        jtxtuser4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtuser4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtuser4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtuser4ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtuser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 168, 30));

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
        getContentPane().add(jSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, -1, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, -1, -1));

        jtxtpass3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtpass3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtpass3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpass3ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtpass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 168, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Password:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 90, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Username:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 90, 40));

        jtxtuser3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtuser3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtuser3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtuser3ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtuser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 168, 30));

        jtxtpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtpass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpassActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 168, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Student 1");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 160, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Password:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 90, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Username:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 90, 40));

        jtxtuser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtuser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtuserActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 168, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CompLab++");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 160, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Student 3");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 160, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Student 4");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 160, 40));

        jtxtpass2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtpass2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtpass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpass2ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 168, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Student 2");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 160, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Password:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 90, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Username:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 90, 40));

        jtxtuser2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtuser2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtuser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtuser2ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtuser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 168, 30));

        jSignUp1.setText("Back");
        jSignUp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSignUp1.setFocusPainted(false);
        jSignUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignUp1ActionPerformed(evt);
            }
        });
        getContentPane().add(jSignUp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, -1, -1));

        setSize(new java.awt.Dimension(1153, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtpass4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpass4ActionPerformed
        
    }//GEN-LAST:event_jtxtpass4ActionPerformed

    private void jtxtuser4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtuser4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtuser4ActionPerformed

    private void jSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignUpActionPerformed
        register regForm = new register(); 
    
    // 2) Show it
        regForm.setVisible(true);
    
    // 3) (Optional) Close the login form so the user can't go back
        this.dispose();
    }//GEN-LAST:event_jSignUpActionPerformed

    private void jtxtpass3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpass3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtpass3ActionPerformed

    private void jtxtuser3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtuser3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtuser3ActionPerformed

    private void jtxtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtpassActionPerformed

    private void jtxtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtuserActionPerformed

    private void jtxtpass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtpass2ActionPerformed

    private void jtxtuser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtuser2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtuser2ActionPerformed

    private void jSignUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignUp1ActionPerformed
        membercount memform = new membercount();
        memform.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jSignUp1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username1 = jtxtuser.getText().trim();
        String password1 = jtxtpass.getText().trim();
        String username2 = jtxtuser2.getText().trim();
        String password2 = jtxtpass2.getText().trim();
        String username3 = jtxtuser3.getText().trim();
        String password3 = jtxtpass3.getText().trim();
        String username4 = jtxtuser4.getText().trim();
        String password4 = jtxtpass4.getText().trim();

        // Check for empty fields
        if (username1.isEmpty() || password1.isEmpty() ||
            username2.isEmpty() || password2.isEmpty() ||
            username3.isEmpty() || password3.isEmpty() ||
            username4.isEmpty() || password4.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Please fill in all fields for all 4 users.");
            return;
        }

        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/complab", "postgres", "postgres");

            String sql = "SELECT student_id FROM public.student WHERE username = ? AND password = ?";

            // First login
            PreparedStatement pst1 = con.prepareStatement(sql);
            pst1.setString(1, username1);
            pst1.setString(2, password1);
            ResultSet rs1 = pst1.executeQuery();

            // Second login
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.setString(1, username2);
            pst2.setString(2, password2);
            ResultSet rs2 = pst2.executeQuery();

            // Third login
            PreparedStatement pst3 = con.prepareStatement(sql);
            pst3.setString(1, username3);
            pst3.setString(2, password3);
            ResultSet rs3 = pst3.executeQuery();

            // Fourth login
            PreparedStatement pst4 = con.prepareStatement(sql);
            pst4.setString(1, username4);
            pst4.setString(2, password4);
            ResultSet rs4 = pst4.executeQuery();

            if (rs1.next() && rs2.next() && rs3.next() && rs4.next()) {
                String studentId1 = rs1.getString("student_id");
                String studentId2 = rs2.getString("student_id");
                String studentId3 = rs3.getString("student_id");
                String studentId4 = rs4.getString("student_id");

                // Ensure all 4 are unique
                if (studentId1.equals(studentId2) || studentId1.equals(studentId3) || studentId1.equals(studentId4) ||
                    studentId2.equals(studentId3) || studentId2.equals(studentId4) || studentId3.equals(studentId4)) {

                    JOptionPane.showMessageDialog(null, "All 4 users must be different students.");
                } else {
                    JOptionPane.showMessageDialog(null, "All users logged in successfully!");
                    ArrayList<String> studentIds = new ArrayList<>();
                    studentIds.add(studentId1);
                    studentIds.add(studentId2);
                    studentIds.add(studentId3);
                    studentIds.add(studentId4);
                    String loginTime = java.time.LocalDateTime.now().format(
                        java.time.format.DateTimeFormatter.ofPattern("MMMM dd, yyyy - hh:mm a")
                    );
                    mainwindow main = new mainwindow(studentIds, loginTime);
                    main.setVisible(true); // open next form
                    main.setLocationRelativeTo(null);
                    this.dispose(); // close login form
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid login for one or more users.");
            }

            // Close resources
            rs1.close(); rs2.close(); rs3.close(); rs4.close();
            pst1.close(); pst2.close(); pst3.close(); pst4.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jSignUp;
    private javax.swing.JButton jSignUp1;
    private javax.swing.JTextField jtxtpass;
    private javax.swing.JTextField jtxtpass2;
    private javax.swing.JTextField jtxtpass3;
    private javax.swing.JTextField jtxtpass4;
    private javax.swing.JTextField jtxtuser;
    private javax.swing.JTextField jtxtuser2;
    private javax.swing.JTextField jtxtuser3;
    private javax.swing.JTextField jtxtuser4;
    // End of variables declaration//GEN-END:variables
}
