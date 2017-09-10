import java.sql.*;
import javax.swing.JOptionPane;


public class ScoreUpdate extends javax.swing.JFrame {

    /** Creates new form ScoreUpdate */
    public ScoreUpdate() {
        initComponents();
    }

    String x,y;
public ScoreUpdate(String p,String q)
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
        jLabel13 = new javax.swing.JLabel();
        jtfsearch = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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
        jLabel4.setText("UPDATE SCORE");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 670, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel6.setText("Srno");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jtfsrno.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfsrno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 150, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel7.setText("Runs");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jtfruns.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfruns, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 150, 30));

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel8.setText("Wickets");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jtfwickets.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfwickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 150, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel9.setText("Century");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jtfhcentury.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfhcentury, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 150, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel10.setText("Half-Century");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

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
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 160, 30));

        jButton4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 160, 30));

        jButton5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton5.setText("SEARCH");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 160, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 600, 10));

        jtfcentury.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfcentury, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 150, 30));

        jLabel13.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel13.setText("Search From Srno");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 20, 200, -1));

        jtfsearch.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jtfsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfsearchActionPerformed(evt);
            }
        });
        jPanel1.add(jtfsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 150, 30));

        jButton6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton6.setText("EXIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 160, 30));

        jButton7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton7.setText("Worst Runs");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 160, 30));

        jButton8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton8.setText("Max Runs");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 160, 30));

        jButton9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton9.setText("Best Runs");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 630, 380));

        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14));
        jButton1.setText("Back to Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front 3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    int k=JOptionPane.showConfirmDialog(null,"Are you sure Yes/No");
if(k==0)
{
       Statement stmt=null;// Statement class is used to create the connectivity statement between java and mysql.
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+y+"","root",""+x+"");
            String search=(jtfsearch.getText());
            String srno;
            int runs,wickets,century,hcentury,bruns,bwickets;
              srno=(jtfsrno.getText());
              runs=Integer.parseInt(jtfruns.getText());
              wickets=Integer.parseInt(jtfwickets.getText());
              century=Integer.parseInt(jtfcentury.getText());
              hcentury=Integer.parseInt(jtfhcentury.getText());
              bruns=Integer.parseInt(jtfbruns.getText());
              bwickets=Integer.parseInt(jtfbwickets.getText());

              String querry;
              querry="update score set srno="+"'"+srno+"'"+",runs="+runs+",wickets="+wickets+",century="+century+",half_century="+hcentury+",highest_runs="+bruns+",highest_wickets="+bwickets+" where srno="+"'"+search+"'";
              stmt=con.createStatement();
              stmt.executeUpdate(querry);
            JOptionPane.showMessageDialog(null,"record Updated Successfully");
            {
                  jtfsearch.setText("");
        jtfsrno.setText("");
        jtfruns.setText("");
        jtfwickets.setText("");
        jtfcentury.setText("");
        jtfhcentury.setText("");
        jtfbruns.setText("");
        jtfbwickets.setText("");
                           }
          }
          catch(Exception e)
          {
              System.out.println(e);
          }

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
        Statement stmt=null;// Statement class is used to create the connectivity statement between java and mysql.
       try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+y+"","root",""+x+"");
            String search=(jtfsearch.getText());
            String query;
            query="select * from score where srno="+"'"+search+"'";
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


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jtfsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfsearchActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jtfsearchActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
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


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        MainMenu k=new MainMenu(x,y);
        k.setVisible(true);

        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
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


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Statement stmt=null;// Statement class is used to create the connectivity statement between java and mysql.
       try
       {
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+y+"","root",""+x+"");

            String query;
            query="select * from score where runs=(select max(runs) from score)";
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

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Statement stmt=null;// Statement class is used to create the connectivity statement between java and mysql.
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+y+"","root",""+x+"");

            String query;
            query="select * from score where highest_runs=(select max(highest_runs) from score)";
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


    }//GEN-LAST:event_jButton9ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreUpdate().setVisible(true);
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
    private javax.swing.JButton jButton9;
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
