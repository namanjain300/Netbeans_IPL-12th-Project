import java.sql.*;
import javax.swing.JOptionPane;


public class SignUp extends javax.swing.JFrame {

    /** Creates new form SignUp */
    public SignUp() {
        initComponents();
    }
    String x,y;
public SignUp(String a,String b)
    {
    x=a;
    y=b;
    initComponents();
}




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtfun = new javax.swing.JTextField();
        jpwdup = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jpwdup1 = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Candara", 1, 48));
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Indian Premier League");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sign Up");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 670, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel4.setText("PASSWORD");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jtfun.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jtfun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfunActionPerformed(evt);
            }
        });
        jPanel2.add(jtfun, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 210, -1));

        jpwdup.setFont(new java.awt.Font("Century", 1, 18));
        jpwdup.setEchoChar('!');
        jpwdup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpwdupActionPerformed(evt);
            }
        });
        jPanel2.add(jpwdup, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 210, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel6.setText("USERNAME");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jButton3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton3.setText("Sign Up");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jButton4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel5.setText("Re-Enter Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jpwdup1.setFont(new java.awt.Font("Century", 1, 18));
        jpwdup1.setEchoChar('!');
        jpwdup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpwdup1ActionPerformed(evt);
            }
        });
        jPanel2.add(jpwdup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 210, 30));

        jButton5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 460, 250));

        jButton2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14));
        jButton2.setText("Back to Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front 3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfunActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jtfunActionPerformed

    private void jpwdupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpwdupActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jpwdupActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
            Statement stmt=null;// Statement class is used to create the connectivity statement between java and mysql.
            try
            {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+y+"","root",""+x+"");
                String un,pw;
                un=jtfun.getText();
                pw=jpwdup.getText();

                String querry;
                querry="insert into user values("+"'"+un+"'"+","+"'"+pw+"'"+")";
                stmt=con.createStatement();
                stmt.executeUpdate(querry);
                JOptionPane.showMessageDialog(null,"record saved");
                this.setVisible(false);
                login k=new login(x,y);
                k.setVisible(true);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
      

        // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jtfun.setText("");
        jpwdup.setText("");
        jpwdup1.setText("");

        // TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

    private void jpwdup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpwdup1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jpwdup1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);

        // TODO add your handling code here:
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        login k=new login(x,y);
        k.setVisible(true);
        // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jpwdup;
    private javax.swing.JPasswordField jpwdup1;
    private javax.swing.JTextField jtfun;
    // End of variables declaration//GEN-END:variables

}
