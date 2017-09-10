import java.sql.*;
import javax.swing.JOptionPane;

public class ScoreEntry extends javax.swing.JFrame {

    /** Creates new form ScoreEntry */
    public ScoreEntry() {
        initComponents();
    }

    String x,y;
public ScoreEntry(String p,String q)
    {
    x=p;
    y=q;
    initComponents();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtfsrno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfruns = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfwickets = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfhcentury = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfbruns = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfbwickets = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jtfcentury = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Candara", 1, 48));
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Indian Premier League");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PLAYER SCORES");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 670, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel6.setText("Srno");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jtfsrno.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfsrno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 150, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel7.setText("Runs");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jtfruns.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfruns, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 150, 30));

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel8.setText("Wickets");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jtfwickets.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfwickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 150, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel9.setText("Century");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jtfhcentury.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfhcentury, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 150, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel10.setText("Half-Century");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jtfbruns.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfbruns, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 150, 30));

        jLabel11.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel11.setText("All time best Runs");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jtfbwickets.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfbwickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 150, 30));

        jLabel12.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel12.setText("All time best Wickets");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 1, 48));
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Indian Premier League");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, -210, -1, -1));

        jButton3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 160, 30));

        jButton4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 160, 70));

        jButton5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton5.setText("SAVE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 160, 70));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 600, 10));

        jtfcentury.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfcentury, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 630, 380));

        jButton2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jButton2.setText("Back to Menu");
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int k=JOptionPane.showConfirmDialog(null,"Give us a chance for your feedback");
if(k==0)
{
 this.setVisible(false);
      Feedback f=new Feedback();
        f.setVisible(true);
}
         if(k==1)
         {
             System.exit(0);
         }

        // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jtfsrno.setText("");
        jtfruns.setText("");
        jtfwickets.setText("");
        jtfcentury.setText("");
        jtfhcentury.setText("");
        jtfbruns.setText("");
        jtfbwickets.setText("");
      
        // TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Statement stmt=null;// Statement class is used to create the connectivity statement between java and mysql.
      try
      {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+y+"","root",""+x+"");
            String srno;
            int runs,wickets,century,hcentury,bruns,bwickets;
            srno=jtfsrno.getText();
            runs=Integer.parseInt(jtfruns.getText());
            wickets=Integer.parseInt(jtfwickets.getText());
            century=Integer.parseInt(jtfcentury.getText());
            hcentury=Integer.parseInt(jtfhcentury.getText());
            bruns=Integer.parseInt(jtfbruns.getText());
            bwickets=Integer.parseInt(jtfbwickets.getText());
            String querry;
            querry="insert into score values("+"'"+srno+"'"+","+runs+","+wickets+","+century+","+hcentury+","+bruns+","+bwickets+")";
            stmt=con.createStatement();
            stmt.executeUpdate(querry);
            JOptionPane.showMessageDialog(null,"record saved");
        } 
      catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Record not save click 'ok' to check");
            JOptionPane.showMessageDialog(null,e);
            
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        MainMenu k=new MainMenu(x,y);
        k.setVisible(true);
     // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtfbruns;
    private javax.swing.JTextField jtfbwickets;
    private javax.swing.JTextField jtfcentury;
    private javax.swing.JTextField jtfhcentury;
    private javax.swing.JTextField jtfruns;
    private javax.swing.JTextField jtfsrno;
    private javax.swing.JTextField jtfwickets;
    // End of variables declaration//GEN-END:variables

}
