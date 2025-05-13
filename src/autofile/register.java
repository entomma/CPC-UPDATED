package autofile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;

public class register extends javax.swing.JFrame {
    private Connection con;
    public register() {
        setUndecorated(true); 
        setContentPane(new GradientPanel());
        initComponents();  
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        jlblusername.setVisible(false);
        jlblfname.setVisible(false);
        jlbllname.setVisible(false);
        jlblusername.setVisible(false);
        jlblstudentid.setVisible(false);
        jlblsection.setVisible(false);
        jlblyear.setVisible(false);
        jlblpass.setVisible(false);
        jlblcpass.setVisible(false);
        try {
            String host = "jdbc:postgresql://localhost:5432/complab"; 
            String user = "postgres";  
            String password = "postgres"; 

            con = DriverManager.getConnection(host, user, password);
            Statement statement = con.createStatement();
            JOptionPane.showMessageDialog(null, "Connection Success");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }
        
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yearLevel = new javax.swing.ButtonGroup();
        section = new javax.swing.ButtonGroup();
        jtxtpass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtusername = new javax.swing.JTextField();
        jSignUp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jtxtcpass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtfname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtlname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtstudentid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        y1 = new javax.swing.JRadioButton();
        y2 = new javax.swing.JRadioButton();
        y3 = new javax.swing.JRadioButton();
        y4 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        sa = new javax.swing.JRadioButton();
        sb = new javax.swing.JRadioButton();
        sc = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jlblcpass = new javax.swing.JLabel();
        jlblfname = new javax.swing.JLabel();
        jlbllname = new javax.swing.JLabel();
        jlblstudentid = new javax.swing.JLabel();
        jlblusername = new javax.swing.JLabel();
        jlblyear = new javax.swing.JLabel();
        jlblsection = new javax.swing.JLabel();
        jlblpass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtpass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpassActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 440, 168, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setText("Register");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 100, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Section:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 90, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Username:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 90, 40));

        jtxtusername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtusername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 168, 30));

        jSignUp.setText("Back");
        jSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSignUp.setFocusPainted(false);
        jSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(jSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 540, -1, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 540, -1, -1));

        jtxtcpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtcpass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtcpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcpassActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtcpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 168, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Confirm Password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 160, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("First Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 120, 40));

        jtxtfname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtfname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtfnameActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 168, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Last Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 120, 40));

        jtxtlname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtlname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtlnameActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 168, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Student ID:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 120, 40));

        jtxtstudentid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtstudentid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtstudentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtstudentidActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtstudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 168, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Password:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, 90, 40));

        yearLevel.add(y1);
        y1.setText("1st");
        y1.setContentAreaFilled(false);
        getContentPane().add(y1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 360, -1, -1));

        yearLevel.add(y2);
        y2.setText("2nd");
        y2.setContentAreaFilled(false);
        getContentPane().add(y2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 360, -1, -1));

        yearLevel.add(y3);
        y3.setText("3rd");
        y3.setContentAreaFilled(false);
        getContentPane().add(y3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 360, -1, -1));

        yearLevel.add(y4);
        y4.setText("4th");
        y4.setContentAreaFilled(false);
        getContentPane().add(y4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Year Level:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 90, 40));

        section.add(sa);
        sa.setText("A");
        sa.setContentAreaFilled(false);
        getContentPane().add(sa, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, -1, -1));

        section.add(sb);
        sb.setText("B");
        sb.setContentAreaFilled(false);
        getContentPane().add(sb, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 400, -1, -1));

        section.add(sc);
        sc.setText("C");
        sc.setContentAreaFilled(false);
        getContentPane().add(sc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 400, -1, -1));

        jLabel10.setText("(if student ID can't be provided use asterisk * )");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 280, -1));

        jlblcpass.setForeground(new java.awt.Color(255, 0, 0));
        jlblcpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblcpass.setText("* Password does not match.");
        getContentPane().add(jlblcpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, 270, -1));

        jlblfname.setForeground(new java.awt.Color(255, 0, 0));
        jlblfname.setText("* First Name is required.");
        getContentPane().add(jlblfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 150, -1));

        jlbllname.setForeground(new java.awt.Color(255, 0, 0));
        jlbllname.setText("* Last Name is required.");
        getContentPane().add(jlbllname, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 150, -1));

        jlblstudentid.setForeground(new java.awt.Color(255, 0, 0));
        jlblstudentid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblstudentid.setText("* Student ID is required.");
        getContentPane().add(jlblstudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 280, -1));

        jlblusername.setForeground(new java.awt.Color(255, 0, 0));
        jlblusername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblusername.setText("* Username is required.");
        getContentPane().add(jlblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 280, -1));

        jlblyear.setForeground(new java.awt.Color(255, 0, 0));
        jlblyear.setText("*Year Level is required.");
        getContentPane().add(jlblyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, 140, -1));

        jlblsection.setForeground(new java.awt.Color(255, 0, 0));
        jlblsection.setText("* Section is required.");
        getContentPane().add(jlblsection, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, 130, -1));

        jlblpass.setForeground(new java.awt.Color(255, 0, 0));
        jlblpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblpass.setText("* Password is required.");
        getContentPane().add(jlblpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, 270, -1));

        setSize(new java.awt.Dimension(1153, 763));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpassActionPerformed
        
    }//GEN-LAST:event_jtxtpassActionPerformed

    private void jtxtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtusernameActionPerformed

    private void jtxtcpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcpassActionPerformed

    private void jtxtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtfnameActionPerformed

    private void jtxtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtlnameActionPerformed

    private void jtxtstudentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtstudentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtstudentidActionPerformed

    private void jSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignUpActionPerformed
        membercount memform = new membercount();
        memform.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jSignUpActionPerformed
    private void clearFields(){
        jtxtusername.setText("");
        jtxtfname.setText("");
        jtxtlname.setText("");
        jtxtpass.setText("");
        jtxtcpass.setText("");
        jtxtstudentid.setText("");
        yearLevel.clearSelection();
        section.clearSelection();  
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean valid = true;

        jlblusername.setVisible(false);
        jlblfname.setVisible(false);
        jlbllname.setVisible(false);
        jlblstudentid.setVisible(false);
        jlblpass.setVisible(false);
        jlblcpass.setVisible(false);
        jlblyear.setVisible(false);
        jlblsection.setVisible(false);

        String username = jtxtusername.getText().trim();
        String fName = jtxtfname.getText().trim();
        String lName = jtxtlname.getText().trim();
        String studentId = jtxtstudentid.getText().trim();
        String password = jtxtpass.getText().trim();
        String cPassword = jtxtcpass.getText().trim();

        if (username.isEmpty()) {
            jlblusername.setText("* Username is required.");
            jlblusername.setVisible(true);
            valid = false;
        } else if (username.length() <= 8) {
            jlblusername.setText("* Username must be at least 8 characters.");
            jlblusername.setVisible(true);
            valid = false;
        } else if (!username.matches(".*\\d.*")) {
            jlblusername.setText("* Username must contain at least one number.");
            jlblusername.setVisible(true);
            valid = false;
        } else {
            jlblusername.setVisible(false);
        }

        if (fName.isEmpty()) {
            jlblfname.setText("* First Name is required.");
            jlblfname.setVisible(true);
            valid = false;
        } else {
            jlblfname.setVisible(false);
        }


        if (lName.isEmpty()) {
            jlbllname.setText("* Last Name is required.");
            jlbllname.setVisible(true);
            valid = false;
        } else {
            jlbllname.setVisible(false);
        }

        if (studentId.isEmpty()) {
            jlblstudentid.setText("* Student ID is required.");
            jlblstudentid.setVisible(true);
            valid = false;
        } else if (studentId.equals("*")) {
            jlblstudentid.setVisible(false); // Valid
        } else if (studentId.matches("\\d{10}")) {
            jlblstudentid.setVisible(false); // Valid
        } else {
            jlblstudentid.setText("* Enter exactly 10 digits or a single (*)");
            jlblstudentid.setVisible(true);
            valid = false;
        }

        if (password.isEmpty()) {
            jlblpass.setText("* Password is required.");
            jlblpass.setVisible(true);
            valid = false;
        } else if (password.length() <= 8) {
            jlblpass.setText("* Password must be at least 8 characters.");
            jlblpass.setVisible(true);
            valid = false;
        } else if (!password.matches(".*\\d.*")) {
            jlblpass.setText("* Password must contain at least one number.");
            jlblpass.setVisible(true);
            valid = false;
        } else {
            jlblpass.setVisible(false);
        }

        if (cPassword.isEmpty() || !password.equals(cPassword)) {
            jlblcpass.setText("* Password does not match.");
            jlblcpass.setVisible(true);
            valid = false;
        } else {
            jlblcpass.setVisible(false);
        }

        if (!y1.isSelected() && !y2.isSelected() && !y3.isSelected() && !y4.isSelected()) {
            jlblyear.setVisible(true);
            valid = false;
        } else {
            jlblyear.setVisible(false);
        }

        if (!sa.isSelected() && !sb.isSelected() && !sc.isSelected()) {
            jlblsection.setVisible(true);
            valid = false;
        } else {
            jlblsection.setVisible(false);
        }
            
        if (valid) {
            try {
                if (con == null) {
                    throw new SQLException("Database connection is null.");
                }

                boolean dbValid = true;
                
                String checkUserQuery = "SELECT 1 FROM public.student WHERE username = ?";
                PreparedStatement checkUserStmt = con.prepareStatement(checkUserQuery);
                checkUserStmt.setString(1, username);
                ResultSet rsUser = checkUserStmt.executeQuery();

                if (rsUser.next()) {
                    jlblusername.setText("* Username already exists.");
                    jlblusername.setVisible(true);
                    dbValid = false;
                }

                String checkIdQuery = "SELECT 1 FROM public.student WHERE student_id = ?";
                PreparedStatement checkIdStmt = con.prepareStatement(checkIdQuery);
                checkIdStmt.setString(1, studentId);
                ResultSet rsId = checkIdStmt.executeQuery();

                if (rsId.next()) {
                    jlblstudentid.setText("* Student ID already exists.");
                    jlblstudentid.setVisible(true);
                    dbValid = false;
                }

                if (!dbValid) {
                    return; 
                }

                String finalStudentId = studentId;
                if (studentId.equals("*")) {
                    // Get the max student_id that is purely numeric and 1 to 5 digits (e.g., 1, 2, 3, ... 99999)
                    String maxIdQuery = "SELECT MAX(CAST(student_id AS INTEGER)) FROM public.student WHERE student_id ~ '^\\d{1,5}$'";
                    PreparedStatement maxIdStmt = con.prepareStatement(maxIdQuery);
                    ResultSet rsMaxId = maxIdStmt.executeQuery();

                    int nextId = 1;
                    if (rsMaxId.next() && rsMaxId.getString(1) != null) {
                        nextId = rsMaxId.getInt(1) + 1;
                    }

                    finalStudentId = String.valueOf(nextId);
                }

                int yearLevel = 0;
                if (y1.isSelected()) yearLevel = 1;
                else if (y2.isSelected()) yearLevel = 2;
                else if (y3.isSelected()) yearLevel = 3;
                else if (y4.isSelected()) yearLevel = 4;

                String section = "";
                if (sa.isSelected()) section = "A";
                else if (sb.isSelected()) section = "B";
                else if (sc.isSelected()) section = "C";

                String insertQuery = "INSERT INTO public.student (username, password, student_id, year_level, section, first_name, last_name) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(insertQuery);

                ps.setString(1, username);
                ps.setString(2, password);
                ps.setString(3, finalStudentId);
                ps.setInt(4, yearLevel);
                ps.setString(5, section);
                ps.setString(6, fName);
                ps.setString(7, lName);

                int rowsInserted = ps.executeUpdate();
                if (rowsInserted > 0) {
                    int choice = JOptionPane.showConfirmDialog(
                        null,
                        "Student registered successfully.\nWould you like to go back?",
                        "Registration Successful",
                        JOptionPane.YES_NO_OPTION
                    );

                    if (choice == JOptionPane.YES_OPTION) {
                        // Go back to membercount.java (assuming it's another JFrame)
                        this.dispose(); // Close current form
                        new membercount().setVisible(true); // Open membercount
                    } else {
                        clearFields();
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                e.printStackTrace();
            }
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jSignUp;
    private javax.swing.JLabel jlblcpass;
    private javax.swing.JLabel jlblfname;
    private javax.swing.JLabel jlbllname;
    private javax.swing.JLabel jlblpass;
    private javax.swing.JLabel jlblsection;
    private javax.swing.JLabel jlblstudentid;
    private javax.swing.JLabel jlblusername;
    private javax.swing.JLabel jlblyear;
    private javax.swing.JTextField jtxtcpass;
    private javax.swing.JTextField jtxtfname;
    private javax.swing.JTextField jtxtlname;
    private javax.swing.JTextField jtxtpass;
    private javax.swing.JTextField jtxtstudentid;
    private javax.swing.JTextField jtxtusername;
    private javax.swing.JRadioButton sa;
    private javax.swing.JRadioButton sb;
    private javax.swing.JRadioButton sc;
    private javax.swing.ButtonGroup section;
    private javax.swing.JRadioButton y1;
    private javax.swing.JRadioButton y2;
    private javax.swing.JRadioButton y3;
    private javax.swing.JRadioButton y4;
    private javax.swing.ButtonGroup yearLevel;
    // End of variables declaration//GEN-END:variables
}
