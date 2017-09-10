import java.sql.*;
import javax.swing.JOptionPane;

public class tablecreation extends javax.swing.JFrame {

    public tablecreation() {

        initComponents();
    }

   static String password()  
    {
       String pwd;
        pwd=JOptionPane.showInputDialog(null,"Enter your mysql password");
        return(pwd);
    }
   static String database()  
   {
       String db;
       db=JOptionPane.showInputDialog(null,"Enter a database name \nNote :- which is not in your sql");
       return(db);
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Candara", 1, 48));
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Indian Premier League");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jButton5.setFont(new java.awt.Font("Lucida Calligraphy", 1, 50));
        jButton5.setText("Setup");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 230, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front 3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String k1=password();        
        String k2=database();

        Statement stmt=null; // Statement class is used to create the connectivity statement between java and mysql.
       
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root",""+k1+"");

            String querry,querry1,querry2,querry3,querry4;
            querry="create database "+k2;
            querry1="use "+k2;
            querry2="create table player(srno varchar(20) primary key,name varchar(20) unique key,age varchar(3),sex varchar(6),address varchar(50) unique key,phone varchar(12) unique key,category varchar(10),team varchar(20))";
            querry3="create table score(srno varchar(10) primary key,runs integer,wickets integer,century integer,half_century integer,highest_runs integer,highest_wickets integer)";
            querry4="create table user(username varchar(40),password varchar(20),primary key(username,password))";
            stmt=con.createStatement();
            stmt.executeUpdate(querry);
            stmt.executeUpdate(querry1);
            stmt.executeUpdate(querry2);
            stmt.executeUpdate(querry3);
            stmt.executeUpdate(querry4);
           
            JOptionPane.showMessageDialog(null,"Welcome to my project");

            this.setVisible(false);
        login k=new login(k1,k2);
        k.setVisible(true);

        } catch(Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton5ActionPerformed



   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablecreation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
