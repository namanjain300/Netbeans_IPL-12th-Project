import java.sql.*;
import javax.swing.JOptionPane;
public class RemovePlayer extends javax.swing.JFrame {

      public RemovePlayer() {
        initComponents();
    }
    String x,y;
public RemovePlayer(String p,String q)
    {
    x=p;
    y=q;
    initComponents();
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jtfsearch = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtfsrno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfage = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfsex = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfaddress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfphone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtfcategory = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtfteam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REMOVE PLAYER");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 670, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        jButton4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        jButton5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        jLabel14.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel14.setText("Search from srno or name or address or phone");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jtfsearch.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jtfsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfsearchActionPerformed(evt);
            }
        });
        jPanel1.add(jtfsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 260, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 600, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 600, -1));

        jButton6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jButton6.setText("SEARCH");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel6.setText("Srno");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jtfsrno.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfsrno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 150, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel7.setText("Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jtfname.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 150, 30));

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel8.setText("Age");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jtfage.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 150, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel9.setText("Sex");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jtfsex.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfsex, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 150, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel10.setText("Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jtfaddress.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 150, 30));

        jLabel11.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel11.setText("Phone");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jtfphone.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 150, 30));

        jLabel12.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel12.setText("Category");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jtfcategory.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 150, 30));

        jLabel13.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jLabel13.setText("Team");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jtfteam.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18));
        jPanel1.add(jtfteam, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 630, 390));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 48));
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Indian Premier League");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

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

}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jtfsearch.setText("");
        jtfsrno.setText("");
        jtfname.setText("");
        jtfage.setText("");
        jtfsex.setText("");
        jtfaddress.setText("");
        jtfphone.setText("");
        jtfcategory.setText("");
        jtfteam.setText("");
}//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int k=JOptionPane.showConfirmDialog(null,"Are U sure Yes/No");
        if(k==0)
   {
        Statement stmt=null;// Statement class is used to create the connectivity statement between java and mysql.
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+y+"","root",""+x+"");
            String search=(jtfsearch.getText());
            String query;
            query="delete from player where srno="+"'"+search+"'"+" or name="+"'"+search+"'"+" or address="+"'"+search+"'"+" or phone="+"'"+search+"'";
          stmt=con.createStatement();
          stmt.executeUpdate(query);
           JOptionPane.showMessageDialog(null,"Hurray !! Player record deleted succesfull");
           {
        jtfsearch.setText("");
        jtfsrno.setText("");
        jtfname.setText("");
        jtfage.setText("");
        jtfsex.setText("");
        jtfaddress.setText("");
        jtfphone.setText("");
        jtfcategory.setText("");
        jtfteam.setText("");
           }
        }
             catch(Exception e)
             {
                   System.out.println(e);

             }
    }
        else
        {
            JOptionPane.showMessageDialog(null,"Player record not Deleted");
        }
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jtfsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfsearchActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jtfsearchActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Statement stmt=null;// Statement class is used to create the connectivity statement between java and mysql.
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+y+"","root",""+x+"");
            String search=(jtfsearch.getText());
            String query;
            query="select * from player where srno="+"'"+search+"'"+" or name="+"'"+search+"'"+" or address="+"'"+search+"'"+" or phone="+"'"+search+"'";
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            if(rs.next())
            {
                jtfsrno.setText(rs.getString("srno"));
                jtfname.setText(rs.getString("name"));
                jtfage.setText(rs.getString("age"));
                jtfsex.setText(rs.getString("sex"));
                jtfaddress.setText(rs.getString("address"));
                jtfphone.setText(rs.getString("phone"));
                jtfcategory.setText(rs.getString("category"));
                jtfteam.setText(rs.getString("team"));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Sorry !! Record not found");
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        MainMenu k=new MainMenu(x,y);
        k.setVisible(true);
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemovePlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jtfaddress;
    private javax.swing.JTextField jtfage;
    private javax.swing.JTextField jtfcategory;
    private javax.swing.JTextField jtfname;
    private javax.swing.JTextField jtfphone;
    private javax.swing.JTextField jtfsearch;
    private javax.swing.JTextField jtfsex;
    private javax.swing.JTextField jtfsrno;
    private javax.swing.JTextField jtfteam;
    // End of variables declaration//GEN-END:variables

}
