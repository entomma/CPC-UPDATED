package autofile;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;

public class login extends javax.swing.JFrame {
    public login() {
        setUndecorated(true); 
        setContentPane(new GradientPanel());
        initComponents();  
        jlbllogin.setVisible(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtpass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtusername = new javax.swing.JTextField();
        jSignUp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSignUp1 = new javax.swing.JButton();
        jlbllogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtpass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpassActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 168, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CompLab++");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 160, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 90, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Username:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 90, 40));

        jtxtusername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtusername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 168, 30));

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
        getContentPane().add(jSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, -1, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, 70, -1));

        jSignUp1.setText("Back");
        jSignUp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSignUp1.setFocusPainted(false);
        jSignUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignUp1ActionPerformed(evt);
            }
        });
        getContentPane().add(jSignUp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, -1, -1));

        jlbllogin.setForeground(new java.awt.Color(255, 0, 0));
        jlbllogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbllogin.setText("* Invalid username or password.");
        getContentPane().add(jlbllogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 280, -1));

        setSize(new java.awt.Dimension(1153, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpassActionPerformed
        
    }//GEN-LAST:event_jtxtpassActionPerformed

    private void jtxtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtusernameActionPerformed

    private void jSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignUpActionPerformed
        register regForm = new register(); 
        regForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jSignUpActionPerformed

    private void jSignUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignUp1ActionPerformed
        membercount memform = new membercount();
        memform.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jSignUp1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = jtxtusername.getText().trim();
        String password = jtxtpass.getText().trim();

        if (username.isEmpty() || password.isEmpty()) {
            jlbllogin.setText("* Please enter both username and password.");
            jlbllogin.setVisible(true);
            return;
        }

        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/complab", "postgres", "postgres");

            String sql = "SELECT * FROM public.student WHERE username = ? AND password = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String studentId1 = rs.getString("student_id");
                JOptionPane.showMessageDialog(null, "Login successful!");
                Autofile.sendStudentData(studentId1);
                this.dispose(); // Close login window
                ArrayList<String> studentIds = new ArrayList<>();
                    studentIds.add(studentId1);
                    
                    String loginTime = java.time.LocalDateTime.now().format(
                        java.time.format.DateTimeFormatter.ofPattern("MMMM dd, yyyy - hh:mm a")
                    );
                    
                    mainwindow main = new mainwindow(studentIds, loginTime);
                    main.setVisible(true); // open next form
                    main.setLocationRelativeTo(null);
            } else {
                jlbllogin.setText("* Invalid username or password.");
            }

            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jSignUp;
    private javax.swing.JButton jSignUp1;
    private javax.swing.JLabel jlbllogin;
    private javax.swing.JTextField jtxtpass;
    private javax.swing.JTextField jtxtusername;
    // End of variables declaration//GEN-END:variables
}
