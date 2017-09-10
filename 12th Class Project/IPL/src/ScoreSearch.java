import java.sql.*;
import javax.swing.JOptionPane;

public class ScoreSearch extends javax.swing.JFrame {

    /** Creates new form ScoreSearch */
    public ScoreSearch() {
        initComponents();
    }

String x,y;
public ScoreSearch(String p,String q)
    {
    x=p;
    y=q;
    initComponents();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
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
        jLabel13 = new javax.swing.JLabel();
        jtfsearch = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Candara", 1, 48));
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Indian Premier League");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel6.setText("Srno");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jtfsrno.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfsrno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel7.setText("Runs");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jtfruns.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfruns, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, 30));

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel8.setText("Wickets");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jtfwickets.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfwickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel9.setText("Century");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jtfhcentury.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfhcentury, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 110, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel10.setText("Half-Century");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jtfbruns.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfbruns, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 110, 30));

        jLabel11.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel11.setText("Best Runs");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        jtfbwickets.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfbwickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 110, 30));

        jLabel12.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel12.setText("Best Wickets");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 160, 40));

        jButton4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 160, 40));

        jButton5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton5.setText("Best Runs");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 170, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 600, 10));

        jtfcentury.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfcentury, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 110, 30));

        jLabel13.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel13.setText("Search from srno");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, -1));

        jtfsearch.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jtfsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfsearchActionPerformed(evt);
            }
        });
        jPanel1.add(jtfsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 190, 30));

        jButton6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton6.setText("SEARCH");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 160, 30));

        jButton7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton7.setText("Max Runs");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, 30));

        jButton8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton8.setText("Worst Runs");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 630, 380));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SEARCH SCORE");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 670, -1));

        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14));
        jButton1.setText("Back to Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, 160, 30));

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
        jtfsearch.setText("");
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
        Statement stmt=null;
        try
       {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+y+"","root",""+x+"");
            String query;
            query="select * from score where highest_runs=(select max(highest_runs) from score)";
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            if(rs.next())
            {
                jtfsrno.setText(rs.getString("srno"));
                jtfruns.setText(""+rs.getInt("runs"));
                jtfwickets.setText(""+rs.getInt("wickets"));
                jtfcentury.setText(""+rs.getInt("century"));
                jtfhcentury.setText(""+rs.getInt("half_century"));
                jtfbruns.setText(""+rs.getInt("highest_runs"));
                jtfbwickets.setText(""+rs.getInt("highest_wickets"));

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sorry !! Record not found");
            }

        } catch(Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jtfsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfsearchActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jtfsearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        MainMenu k=new MainMenu(x,y);
        k.setVisible(true);
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Statement stmt=null;
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+y+"","root",""+x+"");
            String search=(jtfsearch.getText());
            String query;
            query="select * from score where srno="+"'"+search+"'";
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            if(rs.next())
            {
                jtfsrno.setText(rs.getString("srno"));
                jtfruns.setText(""+rs.getInt("runs"));
                jtfwickets.setText(""+rs.getInt("wickets"));
                jtfcentury.setText(""+rs.getInt("century"));
                jtfhcentury.setText(""+rs.getInt("half_century"));
                jtfbruns.setText(""+rs.getInt("highest_runs"));
                jtfbwickets.setText(""+rs.getInt("highest_wickets"));

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sorry !! Record not found");
            }

        } catch(Exception e) {
            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Statement stmt=null;// Statement class is used to create the connectivity statement between java and mysql.
      try
      {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+y+"","root",""+x+"");            
            String query;
            query="select * from score where runs=(select max(runs) from score)";
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            if(rs.next())
            {
                jtfsrno.setText(rs.getString("srno"));
                jtfruns.setText(""+rs.getInt("runs"));
                jtfwickets.setText(""+rs.getInt("wickets"));
                jtfcentury.setText(""+rs.getInt("century"));
                jtfhcentury.setText(""+rs.getInt("half_century"));
                jtfbruns.setText(""+rs.getInt("highest_runs"));
                jtfbwickets.setText(""+rs.getInt("highest_wickets"));

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sorry !! Record not found");
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Statement stmt=null;// Statement class is used to create the connectivity statement between java and mysql.
       try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+y+"","root",""+x+"");
            String query;
            query="select * from score where highest_runs=(select min(highest_runs) from score)";
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            if(rs.next()) {
                jtfsrno.setText(rs.getString("srno"));
                jtfruns.setText(""+rs.getInt("runs"));
                jtfwickets.setText(""+rs.getInt("wickets"));
                jtfcentury.setText(""+rs.getInt("century"));
                jtfhcentury.setText(""+rs.getInt("half_century"));
                jtfbruns.setText(""+rs.getInt("highest_runs"));
                jtfbwickets.setText(""+rs.getInt("highest_wickets"));

            } else {
                JOptionPane.showMessageDialog(null,"Sorry !! Record not found");
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField jtfsearch;
    private javax.swing.JTextField jtfsrno;
    private javax.swing.JTextField jtfwickets;
    // End of variables declaration//GEN-END:variables

}
